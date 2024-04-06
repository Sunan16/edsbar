package com.sunan.systemStoreDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunan.systemStoreDesk.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
    
}
