package com.kelvin.eshopbackend.goodsservice.service.impl;

import com.kelvin.eshopbackend.base.dto.CommentQueryDto;
import com.kelvin.eshopbackend.base.entity.Comment;
import com.kelvin.eshopbackend.base.service.CommentService;
import com.kelvin.eshopbackend.goodsservice.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.apache.dubbo.config.annotation.Service;

import javax.persistence.criteria.*;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 16:04
 * @description:
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Page<Comment> getComments(CommentQueryDto dto) {


        Specification<Comment> spec = new Specification<Comment>() {
            @Override
            public Predicate toPredicate(Root<Comment> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {

                Path<Object> goodsId = root.get("goodsId");
                Path<Object> images = root.get("images");
                Path<Number> star = root.get("star");

                Predicate p1 = cb.equal(goodsId, dto.getGoodsId());
                Predicate p2 = null;

                if ("追评".equals(dto.getTag())) {
                    //TODO:
                } else if ("有图".equals(dto.getTag())) {
                    p2 = cb.isNotNull(images);
                } else if ("好评".equals(dto.getTag())) {
                    p2 = cb.ge(star, 4);
                }


                return cb.and(p1, p2);
            }
        };

        //排序
        Sort sort = null;
        if ("最新".equals(dto.getTag())) {
            sort = Sort.by(Sort.Direction.DESC, "commentTime");
        }
        PageRequest pageRequest = PageRequest.of(dto.getPageNum(), dto.getPageSize(), sort);

        return commentRepository.findAll(spec, pageRequest);
    }
}
