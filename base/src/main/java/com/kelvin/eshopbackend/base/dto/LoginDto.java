package com.kelvin.eshopbackend.base.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 21:42
 * @description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {


    @NotBlank
    private String username;

    private String password;
}
