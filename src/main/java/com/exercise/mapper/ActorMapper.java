package com.exercise.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.exercise.entity.Actor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
    @author: rasa
    @date:2024/10/23上午9:49
*/
@Mapper
public interface ActorMapper extends BaseMapper<Actor> {

}
