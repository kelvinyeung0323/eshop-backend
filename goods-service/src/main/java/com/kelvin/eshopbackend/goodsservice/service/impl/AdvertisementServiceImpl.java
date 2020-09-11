package com.kelvin.eshopbackend.goodsservice.service.impl;

import com.kelvin.eshopbackend.base.dto.admin.AdsQueryDto;
import com.kelvin.eshopbackend.base.entity.Advertisement;
import com.kelvin.eshopbackend.base.service.AdvertisementService;
import com.kelvin.eshopbackend.goodsservice.repository.AdvertisementRepository;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 12:20
 * @description:
 */
@Service
public class AdvertisementServiceImpl implements AdvertisementService {

    @Autowired
    private AdvertisementRepository advertisementRepository;

    @Override
    public Page<Advertisement> queryAdvertisement(AdsQueryDto adsQueryDto) {
        return null;
    }

    @Override
    public Advertisement saveAdvertisement(Advertisement advertisement) {
        return null;
    }

    @Override
    public List<Advertisement> deleteAdvertisement(List<String> ids) {
        return null;
    }

    @Override
    public List<Advertisement> findValidAdvertisementByPosition(String position) {
        return advertisementRepository.findValidAdvertisementByPosition(position);
    }
}
