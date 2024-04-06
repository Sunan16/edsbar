package com.sunan.systemStoreDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunan.systemStoreDesk.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
