package com.sunan.systemStoreDesk.repositories;

import com.sunan.systemStoreDesk.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}