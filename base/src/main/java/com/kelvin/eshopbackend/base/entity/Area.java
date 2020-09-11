package com.kelvin.eshopbackend.base.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:34
 * @description:
 */
@Data
@Entity
@Table(name = "area")
public class Area {

    @Column(length = 32)
    @Id
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    private String id;
    private Integer lvl;
    @Column(length = 64)
    private String name;
    @ManyToOne(targetEntity = Area.class,fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Area parentArea;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "parentArea")
    private List<Area> child;
}
