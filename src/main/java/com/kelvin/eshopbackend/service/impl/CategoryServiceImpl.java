package com.kelvin.eshopbackend.service.impl;

import com.kelvin.eshopbackend.entity.Category;
import com.kelvin.eshopbackend.repository.CategoryRepository;
import com.kelvin.eshopbackend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
