package com.kelvin.eshopbackend.controller.api;

import com.kelvin.eshopbackend.common.http.RestResult;
import com.kelvin.eshopbackend.entity.Advertisement;
import com.kelvin.eshopbackend.entity.SpecialColumn;
import com.kelvin.eshopbackend.service.AdvertisementService;
import com.kelvin.eshopbackend.service.SpecialColumnService;
import com.kelvin.eshopbackend.util.DozerUtil;
import com.kelvin.eshopbackend.vo.GoodsVo;
import com.kelvin.eshopbackend.vo.home.FlashSalesVo;
import com.kelvin.eshopbackend.vo.home.HomeBannerVo;
import com.kelvin.eshopbackend.vo.home.SpecialColumnVo;
import io.jsonwebtoken.lang.Collections;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 12:18
 * @description:
 */
@Tag(name = "首页接口")
@RestController("api/home")
public class HomeController {

    @Autowired
    private AdvertisementService advertisementService;

    @Autowired
    private SpecialColumnService specialColumnService;
    @Operation(summary = "获取首页banner", description = "获取首页banner列表",security = { @SecurityRequirement(name = "bearer-key") })
    @GetMapping("banners")
    public RestResult<List<HomeBannerVo>> homeBanners() {
        List<Advertisement> advertisements = advertisementService.findValidAdvertisementByPosition("homebanner");
        List<HomeBannerVo> homeBannerVos = DozerUtil.mapList(advertisements, HomeBannerVo.class);
        return RestResult.success(homeBannerVos);
    }


    @Operation(summary = "获取专栏信息", description = "")
    @GetMapping("specialcolumns")
    public RestResult<List<SpecialColumnVo>> specialColumn() {
        List<SpecialColumn> specialColumns = specialColumnService.getValidSpecailColumns();
        if (Collections.isEmpty(specialColumns)) {
            return RestResult.success(new ArrayList<>());
        }
        List<SpecialColumnVo> vos = specialColumns.stream().map((s) -> {
            SpecialColumnVo vo = new SpecialColumnVo();
            vo.setTitle(s.getTitle());
            vo.setBanner(s.getBanner());
            vo.setStartTime(vo.getStartTime());
            vo.setEndTime(vo.getEndTime());
            if (Collections.isEmpty(s.getGoodsSkus())) {
                vo.setGoods(new ArrayList<>());
            } else {
                vo.setGoods(s.getGoodsSkus().stream().map((g) -> {
                    String img = null;
                    if (StringUtils.isNotBlank(g.getBannerImages())) {
                        img = g.getBannerImages().split(",")[0];
                    }
                    SpecialColumnVo.GoodsVo goods = new SpecialColumnVo.GoodsVo(g.getId(), g.getTitle(), img, g.getPrice());

                    return goods;
                }).collect(Collectors.toList()));
            }

            return vo;
        }).collect(Collectors.toList());
        return RestResult.success(vos);
    }


    @Operation(summary = "获取限时抢购信息",description = "")
    @GetMapping("flashsales")
    public RestResult<FlashSalesVo> flashSales(){
        //TODO:
        return RestResult.success();
    }


    @Operation(summary = "获取推荐商口",description = "")
    public RestResult<GoodsVo> recommend(){

        //TODO:
        return RestResult.success();
    }

}
