package com.kelvin.eshopbackend.base.dto;

import lombok.Data;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 16:00
 * @description:
 */
@Data
public class CommentQueryDto extends PageDto{
    private String goodsId;
    private String tag;
}
