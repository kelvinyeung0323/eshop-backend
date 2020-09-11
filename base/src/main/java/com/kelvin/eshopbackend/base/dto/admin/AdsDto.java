package com.kelvin.eshopbackend.base.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/11 10:27
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdsDto {


    private String id;
    private String position;
    private String image;
    private String url;
    private String title;
    private Date startTime;
    private Date endTime;
    //@Column(columnDefinition = "bit(1) default 0")
    private Boolean enabled;

    private Date createTime;


}
