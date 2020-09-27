package com.kelvin.eshop.goods.entity;

import com.kelvin.eshopbackend.base.common.bean.JpaConverterJson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:33
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsAttribute {

    private String id;
    private String code;
    private String  name;
    private List<Item> items;
    private Goods goods;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Item{
        private String code;
        private String name;
    }

}
