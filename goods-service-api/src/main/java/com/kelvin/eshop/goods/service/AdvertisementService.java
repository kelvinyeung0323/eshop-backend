package com.kelvin.eshop.goods.service;

import com.kelvin.eshop.goods.entity.Advertisement;
import com.kelvin.eshopbackend.base.dto.admin.AdsQueryDto;

import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 12:20
 * @description:
 */
public interface AdvertisementService {

    Page<Advertisement> queryAdvertisement(AdsQueryDto adsQueryDto);
    Advertisement saveAdvertisement(Advertisement advertisement);
    List<Advertisement> deleteAdvertisement(List<String> ids);
    List<Advertisement> findValidAdvertisementByPosition(String position);

}
