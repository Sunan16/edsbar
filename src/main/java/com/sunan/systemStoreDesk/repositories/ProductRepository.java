package com.sunan.systemStoreDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunan.systemStoreDesk.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{}
