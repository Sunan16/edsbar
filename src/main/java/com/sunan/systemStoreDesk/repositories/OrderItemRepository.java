package com.sunan.systemStoreDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunan.systemStoreDesk.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
