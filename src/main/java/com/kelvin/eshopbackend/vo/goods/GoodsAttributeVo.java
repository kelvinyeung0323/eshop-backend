package com.kelvin.eshopbackend.vo.goods;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:25
 * @description:
 */
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
