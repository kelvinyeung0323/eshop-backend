package com.kelvin.eshop.goods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 11:40
 * @description: 广千
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Advertisement {
    private String id;
    private String position;
    private String image;
    private String url;
    private String title;
    private Date startTime;
    private Date endTime;
    private Boolean enabled;
    private Date createTime;
}
