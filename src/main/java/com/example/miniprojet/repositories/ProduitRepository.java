package com.example.miniprojet.repositories;

import com.example.miniprojet.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    List<Produit> findAllByCooperativeID(Long Id);
    List<Produit> findAllByCategorieID(Long Id);
}
