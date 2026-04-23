package com.educandoweb.coursex.config;

import com.educandoweb.coursex.entities.User;
import com.educandoweb.coursex.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test") // Essa classe só roda quando o perfil ativo for "test"
public class TestConfig implements CommandLineRunner {

    // CommandLineRunner: executa esse código automaticamente quando a aplicação iniciar

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "97777777", "123456");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
