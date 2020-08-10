package com.kelvin.eshopbackend.service;

import com.kelvin.eshopbackend.entity.Advertisement;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 12:20
 * @description:
 */
public interface AdvertisementService {

    List<Advertisement> findValidAdvertisementByPosition(String position);

}
