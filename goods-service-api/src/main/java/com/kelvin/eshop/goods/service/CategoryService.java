package com.kelvin.eshop.goods.service;



import com.kelvin.eshop.goods.entity.Category;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:00
 * @description:
 */
public interface CategoryService {
    List<Category> getCategoryByParentId(String parentId);
}
