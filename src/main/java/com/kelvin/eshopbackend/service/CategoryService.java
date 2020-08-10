package com.kelvin.eshopbackend.service;

import com.kelvin.eshopbackend.entity.Category;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:00
 * @description:
 */
public interface CategoryService {
    List<Category> getCategoryByParentId(String parentId);
}
