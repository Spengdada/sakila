package com.exercise.service.impl;

import com.exercise.entity.Customer;
import com.exercise.mapper.CustomerMapper;
import com.exercise.service.CustomerService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/*
    @author: rasa
    @date:2024/10/17上午10:59
*/
@Service
public class CustomerServiceImp implements CustomerService {

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public Customer getById(Integer id) {
        return customerMapper.selectById(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerMapper.selectList(null);
    }

    @Override
    public void insertOne(Customer customer) {
        customerMapper.insert(customer);
    }

    @Override
    public void updateOne(Customer customer) {
        customerMapper.updateById(customer);
    }


}
