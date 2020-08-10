package com.kelvin.eshopbackend.vo.goods;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:32
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "用户评论" ,description = "")
public class CommentVo {
    private String avatar;
    private String username;
    private int star;
    private Date commentTime;
    private String cotent;
    private List<String> images;


}
