package com.kelvin.eshopbackend.base.service;

import com.kelvin.eshopbackend.base.entity.SpecialColumn;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 14:14
 * @description:
 */
public interface SpecialColumnService {


    List<SpecialColumn> getValidSpecailColumns();
}
