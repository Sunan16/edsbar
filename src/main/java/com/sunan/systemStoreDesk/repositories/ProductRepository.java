package com.sunan.systemStoreDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunan.systemStoreDesk.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
