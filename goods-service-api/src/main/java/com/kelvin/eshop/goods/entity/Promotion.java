package com.kelvin.eshop.goods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:35
 * @description: 促销优惠
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Promotion {

    private String id;
    private String title;
    private Date startTime;
    private Date endTime;
    private Boolean enabled;

}
