package com.educandoweb.coursex.services;

import com.educandoweb.coursex.entities.Product;
import com.educandoweb.coursex.entities.User;
import com.educandoweb.coursex.repositories.ProductRepository;
import com.educandoweb.coursex.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
