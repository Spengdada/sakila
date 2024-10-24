package com.exercise.controller;

import com.exercise.entity.Film;
import com.exercise.entity.Result;
import com.exercise.service.FilmService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
    @author: rasa
    @date:2024/10/21上午9:20
*/
@RestController
@Slf4j
@RequestMapping("film")
public class FilmController {
    @Resource
    private FilmService filmService;

    @GetMapping("/findAll")
    public Result getAllFilms() {
        return Result.success(filmService.selectAllFilm());
    }

    @GetMapping("{id}")
    public Result getFilmById(@PathVariable int id) {
        return Result.success(filmService.selectById(id));
    }

    @PostMapping("/insert")
    public Result addFilm(@RequestBody Film film) {
        filmService.addFilm(film);
        return Result.success();
    }

    @PutMapping("/update")
    public Result updateFilm(@RequestBody Film film) {
        filmService.updateFilm(film);
        return Result.success();
    }

}
