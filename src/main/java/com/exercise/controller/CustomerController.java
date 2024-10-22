package com.exercise.controller;

import com.exercise.entity.Customer;
import com.exercise.entity.Result;
import com.exercise.service.CustomerService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
    @author: rasa
    @date:2024/10/17上午11:00
*/
@RestController
@Slf4j
@RequestMapping("customer")
public class CustomerController {
    @Resource
    private CustomerService customerService;

    @GetMapping("{id}")
    public Result queryById(@PathVariable Integer id) {
        return Result.success(customerService.getById(id));
    }

    @GetMapping("/findall")
    public Result queryAll() {
        return Result.success(customerService.findAll());
    }

    @PostMapping("/insert")
    public Result insert(@RequestBody Customer customer) {
        log.info("insert customer: {}", customer);
        customerService.insertOne(customer);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Customer customer) {
        log.info("update customer: {}", customer);
        customerService.updateOne(customer);
        return Result.success();
    }



}
