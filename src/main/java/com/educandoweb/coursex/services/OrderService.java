package com.educandoweb.coursex.services;

import com.educandoweb.coursex.entities.Order;
import com.educandoweb.coursex.entities.User;
import com.educandoweb.coursex.repositories.OrderRepository;
import com.educandoweb.coursex.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
