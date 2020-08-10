package com.kelvin.eshopbackend.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:32
 * @description:
 */
@Data
@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    @Column(length = 32)
    private String id;

    /**星级**/
    private int star;
    @Temporal(TemporalType.TIMESTAMP)
    private Date commentTime;

    @Column(length = 255)
    private String content;

    @OneToOne(fetch = FetchType.LAZY)
    private Goods goods;

    @OneToOne(fetch = FetchType.LAZY)
    private Order order;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    @Column(length = 1200)
    private String images;

}
