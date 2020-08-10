package com.kelvin.eshopbackend.service;

import com.kelvin.eshopbackend.entity.SpecialColumn;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 14:14
 * @description:
 */
public interface SpecialColumnService {


    List<SpecialColumn> getValidSpecailColumns();
}
