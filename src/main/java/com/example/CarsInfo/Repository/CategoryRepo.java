package com.example.CarsInfo.Repository;

import com.example.CarsInfo.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category , Long> {
}
