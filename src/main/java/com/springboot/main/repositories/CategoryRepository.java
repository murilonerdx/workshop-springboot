package com.springboot.main.repositories;

import com.springboot.main.entities.Order;
import com.springboot.main.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
