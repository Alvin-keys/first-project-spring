package com.educandoweb.coursex.services;

import com.educandoweb.coursex.entities.User;
import com.educandoweb.coursex.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired // não usamos 'new', é o Spring que injeta
    private UserRepository repository; // o Userservice utiliza a UserRepository

    // chamará metodos do repository

    public List<User> findAll(){
        return repository.findAll(); // metodo herdado de JpaRepository
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

}
