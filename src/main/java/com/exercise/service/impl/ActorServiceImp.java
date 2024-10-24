package com.exercise.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exercise.entity.Actor;
import com.exercise.entity.PageVO;
import com.exercise.mapper.ActorMapper;

import com.exercise.service.ActorService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/*
    @author: rasa
    @date:2024/10/23上午9:48
*/
@Service
public class ActorServiceImp implements ActorService {


    @Resource
    private ActorMapper actorMapper;



    @Override
    public Actor getById(Integer id) {
        return actorMapper.selectById(id);
    }

    @Override
    public int insertOne(Actor actor) {
        return actorMapper.insert(actor);
    }

    @Override
    public void updateOne(Actor actor) {
        actorMapper.updateById(actor);
    }

    @Override
    public PageVO<Actor> list(Integer pageNum, Integer pageSize) {
        Page<Actor> page = Page.of(pageNum, pageSize);

//      调用mapper
        Page<Actor> actors = actorMapper.selectPage(page, new LambdaQueryWrapper<>());
        PageVO<Actor> pageVO = new PageVO<>();
        // 取出page中的记录，即根据分页信息查询到的学生信息
        pageVO.setList(actors.getRecords());
        // 总条数
        pageVO.setTotal(actors.getTotal());
        return pageVO;
    }

}
