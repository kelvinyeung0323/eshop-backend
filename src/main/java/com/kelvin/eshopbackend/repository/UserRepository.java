package com.kelvin.eshopbackend.repository;

import com.kelvin.eshopbackend.entity.User;
import org.springframework.data.domain.Example;

import java.util.Optional;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 1:15
 * @description:
 */
public interface UserRepository extends BaseRepository<User,String> {

    Optional<User> findOneByUsername(String username);
}
