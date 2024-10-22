package com.exercise.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/*
    @author: rasa
    @date:2024/10/17上午10:52
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @TableId(type = IdType.AUTO)//自增长
    private Integer customerId;

    private Integer storeId;

    private String firstName;

    private String lastName;

    private String email;

    private Integer addressId;

    private Integer active;

    private Date createDate;

    private Date lastUpdate;

}
