package com.kelvin.eshopbackend.web.controller.api;

import com.kelvin.eshopbackend.base.entity.Category;
import com.kelvin.eshopbackend.base.service.CategoryService;
import com.kelvin.eshopbackend.web.http.RestResult;
import com.kelvin.eshopbackend.web.vo.category.CategoryVo;
import io.jsonwebtoken.lang.Collections;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 14:51
 * @description:
 */
@Tag(name = "类目接口")
@RestController("api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Operation(summary = "获取类目信息",description = "获取1级类目不需传参，获取下级类目传父类目ID")
    @GetMapping("")
    public RestResult<List<CategoryVo>> categories(@RequestParam(value = "parentId",required = false) String parentId){

        List<Category> categories =categoryService.getCategoryByParentId(parentId);
        if(Collections.isEmpty(categories)){
            return RestResult.success(new ArrayList<>());
        }
        List<CategoryVo> categoryVos = categories.stream().map((e)->{
            CategoryVo vo = new CategoryVo(e.getId(),e.getName(),e.getIcon());
            return vo;
        }).collect(Collectors.toList());

        return RestResult.success(categoryVos);
    }



}
