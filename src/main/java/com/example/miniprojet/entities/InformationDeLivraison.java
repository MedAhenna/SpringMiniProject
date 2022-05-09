package com.example.miniprojet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InformationDeLivraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String address;
    private Integer telephone;



    public InformationDeLivraison(String nom, String prenom, String address, Integer telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.address = address;
        this.telephone = telephone;
    }
}
