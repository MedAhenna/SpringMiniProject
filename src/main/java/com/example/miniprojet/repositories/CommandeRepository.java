package com.example.miniprojet.repositories;

import com.example.miniprojet.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
