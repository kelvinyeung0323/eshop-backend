package com.kelvin.eshopbackend.vo.home;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

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
