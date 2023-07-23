package com.aakritiwebfinal.repository;

import com.aakritiwebfinal.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
