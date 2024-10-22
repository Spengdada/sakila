package com.exercise.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.exercise.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

/*
    @author: rasa
    @date:2024/10/17上午10:57
*/
@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {
}
