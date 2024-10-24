package com.exercise.service;

import com.exercise.entity.Film;

import java.util.List;

/*
    @author: rasa
    @date:2024/10/21上午9:10
*/
public interface FilmService {
     void addFilm(Film film);

     void updateFilm(Film film);

     List<Film> selectAllFilm();

     Film selectById(int id);
}
