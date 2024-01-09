package com.sunan.systemStoreDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunan.systemStoreDesk.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
