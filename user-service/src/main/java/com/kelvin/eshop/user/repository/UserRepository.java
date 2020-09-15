package com.kelvin.eshop.user.repository;

import com.kelvin.eshopbackend.base.repository.BaseRepository;
import com.kelvin.eshop.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 1:15
 * @description:
 */
@Repository
public interface UserRepository extends BaseRepository<User,String> {

    Optional<User> findOneByUsername(String username);
}
