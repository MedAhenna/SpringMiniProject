package com.example.miniprojet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cooperative extends Utilisateur{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String adresse;
    private Integer telephone;
    private String status;


    @OneToMany
    List<Produit> produitList = new ArrayList<Produit>();

    @ManyToOne
    @JsonIgnore
    private SecteurActivite secteurActivite;

    @ManyToOne
    @JsonIgnore
    private Region region;

    public Cooperative(String nom, String adresse, Integer telephone, String status) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.status = status;
    }
}
