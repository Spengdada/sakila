package com.exercise.service;

import com.exercise.entity.Actor;

import com.exercise.entity.PageVO;
import com.github.pagehelper.PageInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface ActorService {
    Actor getById(Integer id);
    
    int insertOne(Actor actor);

    void updateOne(Actor actor);

    PageVO<Actor> list(Integer pageNum, Integer pageSize);

}
