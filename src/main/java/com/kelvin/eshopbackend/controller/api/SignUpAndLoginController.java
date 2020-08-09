package com.kelvin.eshopbackend.controller.api;

import com.kelvin.eshopbackend.common.exception.BizException;
import com.kelvin.eshopbackend.common.http.RestResult;
import com.kelvin.eshopbackend.dto.LoginDto;
import com.kelvin.eshopbackend.service.UserService;
import com.kelvin.eshopbackend.seucurity.JwtUtil;
import com.kelvin.eshopbackend.seucurity.SecUserDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 21:37
 * @description: 注册登录接口
 */
@RestController
@Slf4j
public class SignUpAndLoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Resource(name = "myUserDetailService")
    private UserDetailsService userDetailsService;

    @PostMapping("login")
    public RestResult login(@RequestBody LoginDto loginDto) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginDto.getUsername(),loginDto.getPassword())
            );
        }catch (BadCredentialsException e){
            throw new Exception("Incorrect username or password",e);
        }

        SecUserDetails userDetails = (SecUserDetails) userDetailsService.loadUserByUsername(loginDto.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);
      return RestResult.success(jwt,"登录成功！");
    }
    @GetMapping("/abc")
    public RestResult login(){

        //throw new BizException("登录错误！");
        return RestResult.success();
    }

}
