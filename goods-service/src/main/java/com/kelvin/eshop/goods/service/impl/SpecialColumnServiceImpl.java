package com.kelvin.eshop.goods.service.impl;

import com.kelvin.eshop.goods.entity.SpecialColumn;
import com.kelvin.eshop.goods.repository.SpecialColumnRepository;
import com.kelvin.eshop.goods.service.SpecialColumnService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 14:14
 * @description: 专栏服务
 */
@DubboService(protocol = "dubbo")
public class SpecialColumnServiceImpl implements SpecialColumnService {


    @Autowired
    private SpecialColumnRepository specialColumnRepository;

    @Override
    public List<SpecialColumn> getValidSpecailColumns() {
        return specialColumnRepository.getValidSpecailColumns();
    }
}
