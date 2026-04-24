package com.educandoweb.coursex.repositories;

import com.educandoweb.coursex.entities.Order;
import com.educandoweb.coursex.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
