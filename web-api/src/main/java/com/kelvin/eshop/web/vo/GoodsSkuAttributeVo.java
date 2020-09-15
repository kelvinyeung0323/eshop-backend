package com.kelvin.eshop.web.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsSkuAttributeVo {
    private String goodsId;
    private String goodsSkuId;

    private List<Item> attrs;
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Item{
        private String attrCode;
        private String itemCode;
    }
}
