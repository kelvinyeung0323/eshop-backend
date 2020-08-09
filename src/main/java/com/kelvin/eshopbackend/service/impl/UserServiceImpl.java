package com.kelvin.eshopbackend.service.impl;

import com.kelvin.eshopbackend.entity.User;
import com.kelvin.eshopbackend.repository.UserRepository;
import com.kelvin.eshopbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 18:29
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User findUserByName(String username) {
        return userRepository.findOneByUsername(username).get();
    }
}
