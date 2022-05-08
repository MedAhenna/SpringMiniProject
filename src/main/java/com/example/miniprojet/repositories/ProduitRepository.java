package com.example.miniprojet.repositories;

import com.example.miniprojet.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {

}
