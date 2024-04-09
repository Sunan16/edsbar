package com.sunan.systemStoreDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunan.systemStoreDesk.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
