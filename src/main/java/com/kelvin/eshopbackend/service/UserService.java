package com.kelvin.eshopbackend.service;

import com.kelvin.eshopbackend.entity.User;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 18:28
 * @description:
 */
public interface UserService {

    User findUserByName(String username);
}
