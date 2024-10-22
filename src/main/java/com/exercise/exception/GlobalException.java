package com.exercise.exception;

import com.exercise.entity.Result;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
    @author: rasa
    @date:2024/10/17下午5:01
*/
@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(Exception.class)
    public Result exception(Exception ex){
        ex.printStackTrace();
        return Result.error(StringUtils.hasLength(ex.getMessage())? ex.getMessage(): "操作失败");
    }
}
