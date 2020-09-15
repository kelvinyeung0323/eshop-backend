package com.kelvin.eshop.web.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentVo {
    private String avatar;
    private String username;
    private int star;
    private Date commentTime;
    private String cotent;
    private List<String> images;

}
