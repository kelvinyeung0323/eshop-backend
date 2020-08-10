package com.kelvin.eshopbackend.service.impl;

import com.kelvin.eshopbackend.entity.Advertisement;
import com.kelvin.eshopbackend.repository.AdvertisementRepository;
import com.kelvin.eshopbackend.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

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
    public List<Advertisement> findValidAdvertisementByPosition(String position) {
        return advertisementRepository.findValidAdvertisementByPosition(position);
    }
}
