package com.kelvin.eshop.web.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsAttributeVo {
    private String id;
    private String goodsId;
    private String code;
    private String  name;
    private List<Item> items;
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Item{
        private String code;
        private String name;
    }
}
