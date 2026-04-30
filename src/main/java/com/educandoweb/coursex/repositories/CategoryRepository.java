package com.educandoweb.coursex.repositories;

import com.educandoweb.coursex.entities.Category;
import com.educandoweb.coursex.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
