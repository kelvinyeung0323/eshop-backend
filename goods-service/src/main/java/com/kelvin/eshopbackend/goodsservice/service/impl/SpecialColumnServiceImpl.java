package com.kelvin.eshopbackend.goodsservice.service.impl;

import com.kelvin.eshopbackend.base.entity.SpecialColumn;
import com.kelvin.eshopbackend.base.service.SpecialColumnService;
import com.kelvin.eshopbackend.goodsservice.repository.SpecialColumnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 14:14
 * @description: 专栏服务
 */
@Service
public class SpecialColumnServiceImpl implements SpecialColumnService {


    @Autowired
    private SpecialColumnRepository specialColumnRepository;

    @Override
    public List<SpecialColumn> getValidSpecailColumns() {
        return specialColumnRepository.getValidSpecailColumns();
    }
}
