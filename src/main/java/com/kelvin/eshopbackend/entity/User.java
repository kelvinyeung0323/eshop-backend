package com.kelvin.eshopbackend.entity;

import com.kelvin.eshopbackend.enums.Gender;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:35
 * @description:
 */

@Data
@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    private String  id;

    @Column(length = 255)
    private String avatar;

    private Date birthday;

    private Gender gender;

    @Column(length = 64)
    private String nickName;
    @Column(length = 128)
    private String password;
    @Column(length = 64)
    private String username;


}
