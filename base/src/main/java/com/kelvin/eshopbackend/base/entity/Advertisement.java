package com.kelvin.eshopbackend.base.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

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
@Entity
@Table(name = "advertisement")
public class Advertisement {

    @Id
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    @Column(length = 32)
    private String id;
    @Column(length = 32)
    private String position;
    private String image;
    private String url;
    @Column(length = 128)
    private String title;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    //@Column(columnDefinition = "bit(1) default 0")
    private Boolean enabled;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

}
