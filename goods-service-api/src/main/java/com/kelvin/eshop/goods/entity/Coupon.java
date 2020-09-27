package com.kelvin.eshop.goods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:32
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {

    private String id;
    private Date endDate;
    private Date startDate;
    private String scope;
    private String title;
}
