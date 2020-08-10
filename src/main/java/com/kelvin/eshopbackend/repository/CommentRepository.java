package com.kelvin.eshopbackend.repository;

import com.kelvin.eshopbackend.entity.Comment;
import org.springframework.stereotype.Repository;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:39
 * @description:
 */
@Repository
public interface CommentRepository extends BaseRepository<Comment,String> {
}
