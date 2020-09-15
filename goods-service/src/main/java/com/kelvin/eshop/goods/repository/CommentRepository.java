package com.kelvin.eshop.goods.repository;


import com.kelvin.eshop.goods.entity.Comment;
import com.kelvin.eshopbackend.base.repository.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:39
 * @description:
 */
@Repository
public interface CommentRepository extends BaseRepository<Comment,String> {
}
