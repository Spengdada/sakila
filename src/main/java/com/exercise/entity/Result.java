package com.exercise.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    @author: rasa
    @date:2024/10/17下午2:02
*/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result <T>{
    private Integer code;
    private String message;
    private Object data;

    public static <E> Result success(E data) {
        return new Result(0, "操作成功", data);
    }

    public static Result error(String message) {
        return new Result(1, message, null);
    }

    public static Result success() {
        return new Result(0, "操作成功", null);
    }
}
