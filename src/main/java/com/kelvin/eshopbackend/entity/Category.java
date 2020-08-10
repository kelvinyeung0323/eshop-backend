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
    @Column(length = 32)
    private String id;

    /**
     * 如果是一级类目，点banner可以跳转到指定页面
     * **/
    @Column(length = 255)
    private String url;

    @Column(length = 32)
    private String code;

    @Column()
    private String icon;

    @Column(length = 64)
    private String name;

    //排序
    private int seq;

    //层级
    private int lvl;

    //@Column(columnDefinition = "bit(1) default 0")
    private Boolean enabled;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Category parent;

    @OneToMany(mappedBy = "parent",fetch = FetchType.LAZY)
    private List<Category> subCategories;

}
