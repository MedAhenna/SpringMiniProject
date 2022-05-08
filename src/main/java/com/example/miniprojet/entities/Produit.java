package com.example.miniprojet.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private float prix;
    private String description;
    private Integer qty_dispo;
    private Integer min_order;
    @ManyToOne
    @JsonIgnore
    private Categorie category;

    public Produit(String nom, float prix, String description, Integer qty_Dispo, Integer min_order) {
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.qty_dispo = qty_Dispo;
        this.min_order = min_order;
    }

}
