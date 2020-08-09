package com.kelvin.eshopbackend.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:32
 * @description:
 */
@Data
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    private String id;


    private String bannerAction;
    private String bannerDesc;
    private String bannerImg;

    @Column(length = 32)
    private String code;

    @Column()
    private String icon;

    @Column(length = 64)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Category parent;

    @OneToMany(mappedBy = "parent",fetch = FetchType.LAZY)
    private List<Category> subCategories;

}
