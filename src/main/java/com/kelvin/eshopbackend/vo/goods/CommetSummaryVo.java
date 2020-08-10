package com.kelvin.eshopbackend.vo.goods;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 17:06
 * @description:
 */
@Schema(name = "商品评论摘要信息")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommetSummaryVo {
    @Schema(description = "评论数")
    private int count;

    @Schema(description = "评分")
    private String score;
}
