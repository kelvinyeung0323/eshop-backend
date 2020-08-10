package com.kelvin.eshopbackend.entity;

import com.kelvin.eshopbackend.common.bean.JpaConverterJson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:33
 * @description:
 */
@Data
@Entity
@Table(name = "goods_attribute")

public class GoodsAttribute {

    @Id
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    @Column(length = 32)
    private String id;
    @Column(length = 32)
    private String code;
    @Column(length = 32)
    private String  name;
    /**
     * 使用json保存
     */
    @Column(columnDefinition = "json")
    @Convert(converter = JpaConverterJson.class)
    private List<Item> items;

    @ManyToOne(targetEntity = Goods.class,fetch = FetchType.LAZY)
    private Goods goods;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private class Item{
        private String code;
        private String name;
    }

}
