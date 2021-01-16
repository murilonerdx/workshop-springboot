package com.springboot.main.repositories;

import com.springboot.main.entities.Category;
import com.springboot.main.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
