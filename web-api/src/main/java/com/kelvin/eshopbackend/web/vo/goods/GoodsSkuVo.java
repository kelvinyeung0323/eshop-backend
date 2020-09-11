package com.kelvin.eshopbackend.web.vo.goods;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:20
 * @description:
 */
//@Schema(description = "商品信息")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsSkuVo {

    //@Schema(description = "商品规格ID")
    private String goodsSkuId;
    //@Schema(description = "商品ID")
    private String goodsId;

    //@Schema(description = "标题")
    private String title;
    //@Schema(description = "价格")
    private String price;
    //@Schema(description = "图片")
    private List<String> images;
    //@Schema(description = "商品介绍图片")
    private String intro;

    //@Schema(description = "参数规格")
    private String specs;

    //@Schema(description = "常见问题")
    private String questions;


}
