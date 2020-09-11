package com.kelvin.eshopbackend.web.vo.goods;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 17:58
 * @description:
 */
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
