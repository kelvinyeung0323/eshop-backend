package com.kelvin.eshop.goods.service.impl;

import com.kelvin.eshop.goods.entity.Category;
import com.kelvin.eshop.goods.repository.CategoryRepository;
import com.kelvin.eshop.goods.service.CategoryService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:00
 * @description:
 */
@DubboService(protocol = "dubbo")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getCategoryByParentId(String parentId) {
        return categoryRepository.findAllByParentId(parentId);

    }
}
