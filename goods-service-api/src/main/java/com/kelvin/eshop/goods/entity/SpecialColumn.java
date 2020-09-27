package com.kelvin.eshop.goods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 13:53
 * @description: 专栏
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpecialColumn {

    private String id;
    private String title;
    private String banner;
    private Date startTime;
    private Date endTime;
    private Boolean enabled;
    private List<GoodsSku> goodsSkus;


}
