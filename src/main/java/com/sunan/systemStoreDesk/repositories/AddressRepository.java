package com.sunan.systemStoreDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunan.systemStoreDesk.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
