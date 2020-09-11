package com.kelvin.eshopbackend.base.service;

import com.kelvin.eshopbackend.base.entity.Category;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:00
 * @description:
 */
public interface CategoryService {
    List<Category> getCategoryByParentId(String parentId);
}
