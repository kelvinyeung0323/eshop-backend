package com.kelvin.eshopbackend.web.controller.admin;

import com.kelvin.eshopbackend.base.entity.Advertisement;
import com.kelvin.eshopbackend.base.service.AdvertisementService;
import com.kelvin.eshopbackend.base.util.DozerUtil;
import com.kelvin.eshopbackend.base.dto.admin.AdsDto;
import com.kelvin.eshopbackend.base.dto.admin.AdsQueryDto;
import com.kelvin.eshopbackend.web.http.RestResult;
import com.kelvin.eshopbackend.web.vo.admin.AdsVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/11 10:17
 * @description:
 */
@Tag(name = "广告位管理")
@RestController("admin")
public class AdvertisementAdminController {

    @Autowired
    private AdvertisementService advertisementService;

    @GetMapping("advertisement")
    public RestResult<List<AdsVo>> queryAds(AdsQueryDto adsQueryDto){
        Page<Advertisement> p = advertisementService.queryAdvertisement(adsQueryDto);
        if(CollectionUtils.isEmpty(p.getContent())){
            return RestResult.page(new ArrayList<>(),p.getSize(),p.getNumber(),p.getTotalElements(),p.getTotalPages());
        }
       List<AdsVo> vos= DozerUtil.mapList(p.getContent(),AdsVo.class);

        return RestResult.success();
    }



    @PostMapping("advertisement")
    public RestResult saveAds(AdsDto adsDto){
        Advertisement advertisement = DozerUtil.map(adsDto, Advertisement.class);
        advertisementService.saveAdvertisement(advertisement);
        return RestResult.success();
    }

    @DeleteMapping("advertisement")
    public RestResult deleteAds(List<String> ids){

        return null;
    }
}
