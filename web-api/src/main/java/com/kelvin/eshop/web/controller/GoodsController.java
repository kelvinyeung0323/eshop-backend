package com.kelvin.eshop.web.controller;


import com.kelvin.eshop.goods.entity.Comment;
import com.kelvin.eshop.goods.entity.GoodsAttribute;
import com.kelvin.eshop.goods.entity.GoodsSku;
import com.kelvin.eshop.goods.service.CommentService;
import com.kelvin.eshop.goods.service.GoodsService;
import com.kelvin.eshop.web.base.http.RestResult;
import com.kelvin.eshop.web.vo.*;
import com.kelvin.eshopbackend.base.dto.CommentQueryDto;
import com.kelvin.eshopbackend.base.util.DozerUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:17
 * @description:
 */
@Tag(name = "获取商品信息")
@RestController
@RequestMapping("api")
public class GoodsController {

    //dubbo服务注入
    @DubboReference
    private CommentService commentService;


    @DubboReference
    private GoodsService goodsService;

    @Operation(summary = "获取商口信息", description = "")
    @GetMapping("goods")
    public RestResult<GoodsSkuVo> getGoods(@RequestParam(value = "skuId") String goodsSkuId,
                                           @RequestParam(value = "goodsId") String goodsId,
                                           @RequestParam(value = "atts") String attrs) {
        GoodsSku goodsSku = goodsService.getGoodsByAttribute(goodsId, goodsSkuId, attrs);
        GoodsSkuVo vo = new GoodsSkuVo();
        vo.setGoodsId(goodsSku.getGoods().getId());
        vo.setGoodsSkuId(goodsSku.getId());
        vo.setPrice(goodsSku.getPrice());
        vo.setTitle(goodsSku.getTitle());
        if (StringUtils.isNotBlank(goodsSku.getBannerImages())) {
            vo.setImages(Arrays.asList(goodsSku.getBannerImages().split(",")));
        }
        vo.setIntro(goodsSku.getGoods().getIntro());
        vo.setSpecs(goodsSku.getSpecs());
        vo.setQuestions(goodsSku.getGoods().getQuestions());
        return RestResult.success(vo);
    }


    @Operation(summary = "获取商品属性信息", description = "")
    @GetMapping("goods/attrs")
    public RestResult<List<GoodsAttributeVo>> getGoodsAttribute(@RequestParam("goodsId") String goodsId) {
        List<GoodsAttribute> attributes = goodsService.getGoodsAttribute(goodsId);
        if(CollectionUtils.isEmpty(attributes)){
            return RestResult.success(new ArrayList<>());
        }
        attributes.stream().map((a)->{
            GoodsAttributeVo vo = new GoodsAttributeVo();
            vo.setId(a.getId());
            vo.setGoodsId(a.getGoods().getId());
            vo.setCode(a.getCode());
            vo.setName(a.getName());
            List<GoodsAttributeVo.Item> items=  DozerUtil.mapList(a.getItems(),GoodsAttributeVo.Item.class);
            vo.setItems(items);
            return vo;
        }).collect(Collectors.toList());

        //TODO:
        return RestResult.success();
    }

    @Operation(summary = "获取商品属性组合信息", description = "")
    @GetMapping("goods/sku/attrs")
    public RestResult<List<GoodsSkuAttributeVo>> getGoodSkuAttributes(@RequestParam("goodsId") String goodsId) {
        List<GoodsSku> goodsSkus = goodsService.getGoodsSkusByGoodsId(goodsId);

        if (!CollectionUtils.isEmpty(goodsSkus)) {
            return RestResult.success(new ArrayList<>());
        }
        List<GoodsSkuAttributeVo> vos = goodsSkus.stream().map((g) -> {
            GoodsSkuAttributeVo vo = new GoodsSkuAttributeVo();
            vo.setGoodsId(g.getGoods().getId());
            vo.setGoodsSkuId(g.getId());

            List<GoodsSkuAttributeVo.Item> items = new ArrayList<>();
            if (StringUtils.isNotBlank(g.getAttribues())) {
                for (String s : g.getAttribues().split(",")) {
                    String[] keyVal = s.split(":");
                    if (keyVal.length == 2) {
                        items.add(new GoodsSkuAttributeVo.Item(keyVal[0], keyVal[1]));
                    }
                }
            }
            vo.setAttrs(items);
            return vo;
        })
                .collect(Collectors.toList());
        return RestResult.success(vos);
    }

    @Operation(summary = "商品评论", description = "")
    @GetMapping("goods/comment")
    public RestResult<List<CommentVo>> getGoodsComment(CommentQueryDto dto) {
        Page<Comment> commentPage = commentService.getComments(dto);
        if (CollectionUtils.isEmpty(commentPage.getContent())) {
            return RestResult.page(new ArrayList<>(), commentPage.getSize(), commentPage.getNumber(), commentPage.getTotalElements(), commentPage.getTotalPages());
        }
        List<CommentVo> vos = commentPage.getContent().stream().map((c) -> {

            CommentVo vo = new CommentVo();
//            vo.setAvatar(c.getUser().getAvatar());
            vo.setStar(c.getStar());
            vo.setCommentTime(c.getCommentTime());
            vo.setCotent(c.getContent());
//            vo.setUsername(c.getUser().getUsername());
            String str = c.getImages();
            if (StringUtils.isNotBlank(str)) {
                List<String> images = Arrays.asList(str.split(","));
                vo.setImages(images);
            }
            return vo;

        }).collect(Collectors.toList());

        return RestResult.page(vos, commentPage.getSize(), commentPage.getNumber(), commentPage.getTotalElements(), commentPage.getTotalPages());
    }

    @Operation(summary = "商品评论", description = "")
    @GetMapping("goods/comment/summary")
    public RestResult<CommetSummaryVo> commentSummary(String goodsId) {
        CommetSummaryVo vo = new CommetSummaryVo(123, "99%");
        return RestResult.success();
    }
}
