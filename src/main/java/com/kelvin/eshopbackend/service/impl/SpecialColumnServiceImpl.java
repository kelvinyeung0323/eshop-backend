package com.kelvin.eshopbackend.service.impl;

import com.kelvin.eshopbackend.entity.SpecialColumn;
import com.kelvin.eshopbackend.repository.SpecialColumnRepository;
import com.kelvin.eshopbackend.service.SpecialColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
