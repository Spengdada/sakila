package com.exercise.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.exercise.entity.Film;
import org.apache.ibatis.annotations.Mapper;

/*
    @author: rasa
    @date:2024/10/21上午9:10
*/
@Mapper
public interface FilmMapper extends BaseMapper<Film> {
}
