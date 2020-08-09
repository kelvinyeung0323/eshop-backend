package com.kelvin.eshopbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 21:42
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {
    private String username;
    private String password;
}
