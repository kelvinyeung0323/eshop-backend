package com.kelvin.eshopbackend.seucurity;

import com.kelvin.eshopbackend.entity.User;
import com.kelvin.eshopbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 0:20
 * @description:
 */
@Component
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findUserByName(username);
        return new SecUserDetails(user.getUsername(), user.getPassword(), new ArrayList<>());

    }
}
