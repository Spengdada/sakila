package com.exercise.service;

import com.exercise.entity.Customer;

import java.util.List;

/*
    @author: rasa
    @date:2024/10/17上午10:59
*/
public interface CustomerService {
    Customer getById(Integer id);

    List<Customer> findAll();

    void insertOne(Customer customer);

    void updateOne(Customer customer);


}
