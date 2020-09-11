package com.kelvin.eshopbackend.goodsservice.service.impl;

import com.kelvin.eshopbackend.base.entity.Category;
import com.kelvin.eshopbackend.base.service.CategoryService;
import com.kelvin.eshopbackend.goodsservice.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:00
 * @description:
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getCategoryByParentId(String parentId) {
        return categoryRepository.findAllByParentId(parentId);

    }
}
