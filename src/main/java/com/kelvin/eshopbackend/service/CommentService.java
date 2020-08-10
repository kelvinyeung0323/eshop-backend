package com.kelvin.eshopbackend.service;

import com.kelvin.eshopbackend.dto.CommentQueryDto;
import com.kelvin.eshopbackend.entity.Comment;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:40
 * @description:
 */

public interface CommentService {

    //分页
    Page<Comment> getComments(CommentQueryDto dto);


}
