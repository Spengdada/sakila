package com.exercise.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.exercise.entity.Film;
import com.exercise.mapper.FilmMapper;
import com.exercise.service.FilmService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/*
    @author: rasa
    @date:2024/10/21上午9:10
*/
@Service
public class FilmServiceImp implements FilmService {

    @Resource
    private FilmMapper filmMapper;

    @Override
    public void addFilm(Film film) {
        filmMapper.insert(film);
    }

    @Override
    public void updateFilm(Film film) {
        filmMapper.updateById(film);
    }

    @Override
    public List<Film> selectAllFilm() {
        return filmMapper.selectList(null);
    }

    @Override
    public Film selectById(int id) {
        return filmMapper.selectById(id);
    }
}
