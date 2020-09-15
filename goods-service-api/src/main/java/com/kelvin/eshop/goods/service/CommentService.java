package com.kelvin.eshop.goods.service;

import com.kelvin.eshop.goods.entity.Comment;
import com.kelvin.eshopbackend.base.dto.CommentQueryDto;
import org.springframework.data.domain.Page;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:40
 * @description:
 */

public interface CommentService {

    //分页
    Page<Comment> getComments(CommentQueryDto dto);


}
