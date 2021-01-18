package com.springboot.main.repositories;

import com.springboot.main.entities.OrderItem;
import com.springboot.main.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
