package com.aakritiwebfinal.repository;

import com.aakritiwebfinal.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
