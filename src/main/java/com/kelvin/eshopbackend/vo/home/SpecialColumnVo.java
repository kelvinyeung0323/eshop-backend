package com.kelvin.eshopbackend.vo.home;

import com.kelvin.eshopbackend.entity.Goods;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 14:07
 * @description:
 */
@Data
public class SpecialColumnVo {

    private String title;
    private String banner;
    private Date startTime;
    private Date endTime;

    private List<GoodsVo> goods;

    @Data
    @AllArgsConstructor
    public static class GoodsVo {
        private String id;
        private String title;
        private String image;
        private String price;
    }

}

