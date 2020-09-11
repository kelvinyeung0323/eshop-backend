package com.kelvin.eshopbackend.web.vo.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/11 10:42
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdsVo {

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
