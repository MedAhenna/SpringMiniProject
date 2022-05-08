package com.example.miniprojet.repositories;

import com.example.miniprojet.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {

}
