package com.kelvin.eshopbackend.web.vo.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 14:53
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryVo {
    private String id;
    private String title;
    private String icon;
}
