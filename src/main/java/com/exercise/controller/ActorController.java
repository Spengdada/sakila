package com.exercise.controller;

import com.exercise.entity.Actor;
import com.exercise.entity.Result;
import com.exercise.service.ActorService;
import com.github.pagehelper.PageInfo;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;


/*
    @author: rasa
    @date:2024/10/23上午9:46
*/
@RestController
@Slf4j
@RequestMapping("actor")
public class ActorController {
    @Resource
    private ActorService actorService;

    @GetMapping("{id}")
    public Result getActorById(@PathVariable Integer id) {
        log.info("getActorById, id: {}", id);
        return Result.success(actorService.getById(id));
    }

    @PostMapping("/insert")
    public Result insertActor(Actor actor) {
        log.info("insertActor, actor: {}", actor);
        return Result.success(actorService.insertOne(actor));
    }

    @PostMapping("/update")
    public Result updateActor(Actor actor) {
        log.info("updateActor, actor: {}", actor);
        actorService.updateOne(actor);
        return Result.success();
    }

    @GetMapping("/list")
    public Result<PageInfo<Actor>> list(
           @RequestParam(defaultValue = "1") Integer pageNum,
           @RequestParam(defaultValue = "10") Integer pageSize
    ){
        log.info("list, pageNum: {}, pageSize: {}", pageNum, pageSize);
        return Result.success(actorService.list(pageNum, pageSize));
    }





}
