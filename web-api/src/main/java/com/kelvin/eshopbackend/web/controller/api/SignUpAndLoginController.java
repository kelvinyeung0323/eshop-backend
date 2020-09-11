package com.kelvin.eshopbackend.web.controller.api;

import com.kelvin.eshopbackend.base.entity.User;
import com.kelvin.eshopbackend.base.service.UserService;
import com.kelvin.eshopbackend.base.dto.LoginDto;
import com.kelvin.eshopbackend.base.dto.SignupDto;
import com.kelvin.eshopbackend.web.http.RestResult;
import com.kelvin.eshopbackend.web.seucurity.JwtUtil;
import com.kelvin.eshopbackend.web.seucurity.SecUserDetails;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 21:37
 * @description: 注册登录接口
 */
@Tag(name = "注册登录接口")
@RestController
@Slf4j
public class SignUpAndLoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Resource(name = "myUserDetailService")
    private UserDetailsService userDetailsService;
    @Autowired
    private UserService userService;

    @Operation(summary = "登录接口",description = "",responses = {})
    @PostMapping("login")
    public RestResult login(@RequestBody @Validated LoginDto loginDto) throws Exception {
        //try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginDto.getUsername(),loginDto.getPassword())
            );
        //}catch (BadCredentialsException e){
        //    //throw new Exception("Incorrect username or password",e);
        //    return RestResult.fail(403,"用户名或密码错误","Bad credentials");
        //}

        SecUserDetails userDetails = (SecUserDetails) userDetailsService.loadUserByUsername(loginDto.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);
      return RestResult.success(jwt,"登录成功！");
    }


    @Operation(summary = "注册接口",description = "")
    @PostMapping("singup")
    public RestResult sigup(@Validated @RequestBody SignupDto sigupDto){

        User user = new User();
        user.setUsername(sigupDto.getUsername());
        user.setPassword(passwordEncoder.encode(sigupDto.getPassword()));

        userService.saveUser(user);
        return RestResult.success();
    }

}
