package com.kelvin.eshopbackend.user.service.impl;

import com.kelvin.eshopbackend.base.common.exception.BizException;
import com.kelvin.eshopbackend.base.entity.User;
import com.kelvin.eshopbackend.base.service.UserService;
import com.kelvin.eshopbackend.user.repository.UserRepository;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 18:29
 * @description:
 */
@Service(protocol = "rest")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User findUserByName(String username) {
        return userRepository.findOneByUsername(username).get();
    }

    @Override
    public User saveUser(User user) {
        if(StringUtils.isBlank(user.getId())){
           Optional<User> optional =  userRepository.findOneByUsername(user.getUsername());
           if(optional.isPresent()){
               throw new BizException("用户已存在，请使用其它名称");
           }
        }
        return userRepository.save(user);
    }


}
