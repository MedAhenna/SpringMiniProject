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
public class Cooperative {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String adresse;
    private Integer telephone;
    private String status;


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
