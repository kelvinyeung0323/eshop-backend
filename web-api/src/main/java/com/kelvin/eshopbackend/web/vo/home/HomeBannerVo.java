package com.kelvin.eshopbackend.web.vo.home;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 11:33
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomeBannerVo {
    private String id;
    private String title;
    private String image;
    private String url;
}
