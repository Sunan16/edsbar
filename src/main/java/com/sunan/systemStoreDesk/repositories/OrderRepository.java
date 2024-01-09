package com.sunan.systemStoreDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunan.systemStoreDesk.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
