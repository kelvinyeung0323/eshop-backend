package com.kelvin.eshopbackend.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
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
@Entity
@Table(name =  "special_column")
public class SpecialColumn {
    @Id
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    @Column(length = 32)
    private String id;
    @Column(length = 128)
    private String title;
    private String banner;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    //@Column(columnDefinition = "bit(1) default 0")
    private Boolean enabled;
    @OneToMany()
    private List<GoodsSku> goodsSkus;





}
