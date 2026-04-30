package com.educandoweb.coursex.repositories;

import com.educandoweb.coursex.entities.Category;
import com.educandoweb.coursex.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
