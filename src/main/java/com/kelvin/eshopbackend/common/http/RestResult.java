package com.kelvin.eshopbackend.common.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.http.HttpStatus;

import java.util.Date;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 18:29
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestResult<T> {


    private int status;
    private String message;
    private T data;
    private String error;
    private Date timestamp;
    private String path;

    private RestResult(int status,String message,T data){
        this.status = status;
        this.message = message;
        this.data = data;
    }
    /*******************************/
    public static <R> RestResult<R>  success(){
        return new RestResult<>(200,null,null);
    }
    public static <R>  RestResult<R> success(R data){
        return new RestResult<>(200,null,data);
    }

    public static <R> RestResult<R> success(R data,String message){
        return new RestResult<>(200,null,data);
    }

    public static <R> RestResult fail(){
        return new RestResult(400,null,null);
    }

}
