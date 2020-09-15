package com.kelvin.eshop.web.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsSkuVo {

    private String goodsSkuId;
    private String goodsId;

    private String title;
    private String price;
    private List<String> images;
    private String intro;

    private String specs;

    private String questions;

}
