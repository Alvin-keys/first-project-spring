package com.educandoweb.coursex.repositories;

import com.educandoweb.coursex.entities.OrderItem;
import com.educandoweb.coursex.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
