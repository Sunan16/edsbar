package com.sunan.systemStoreDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunan.systemStoreDesk.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
