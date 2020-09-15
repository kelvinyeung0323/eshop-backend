package com.kelvin.eshop.web.base.http;

import com.kelvin.eshopbackend.base.common.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.handler.DispatcherServletWebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.web.error.ErrorAttributeOptions.Include;
/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 21:06
 * @description:
 */
@ControllerAdvice()
@Slf4j
public class GlobalExceptionHandler {
    //private static ErrorAttributeOptions errorAttributeOptions;
    //
    //{
    //   errorAttributeOptions =   ErrorAttributeOptions.of(Include.MESSAGE);
    //}


    @Autowired
    private DefaultErrorAttributes errorAttributes;
    //@ExceptionHandler(Exception.class)
    //@ResponseBody
    //public RestResult handleException(Exception e){
    //    return new RestResult();
    //}

    @ExceptionHandler({BizException.class})
    @ResponseBody
    public RestResult handleException(HttpServletRequest request, HttpServletResponse response, BizException e) throws IOException {

        RestResult result = new RestResult<>();
        result.setPath(request.getServletPath());
        result.setStatus(e.getStatus().value());
        result.setTimestamp(new Date());
        result.setError(e.getStatus().getReasonPhrase());
        result.setMessage(e.getMessage());
        //设置response状态
        response.setStatus(response.getStatus());
        //\Map<String,Object> map =  errorAttributes.getErrorAttributes(new DispatcherServletWebRequest(request,response) ,errorAttributeOptions );
        //response.sendError(HttpStatus.BAD_REQUEST.value(),e.getMessage());
        return result;
    }
}
