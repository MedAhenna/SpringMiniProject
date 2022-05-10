package com.example.miniprojet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Date DateCreated;
    private Integer Qty;

    @Transient
    private Long produitID;

    @ManyToOne
    private Produit produit;

    @Transient
    private Long statusID;

    @ManyToOne
    private Status status = new Status(1L,"pending");


    @Transient
    private Long clientID;

    @ManyToOne
    private Client client;

    @OneToOne
    private InformationDeLivraison informations;
    public Commande(Date dateCreated, Integer qty) {
        DateCreated = dateCreated;
        Qty = qty;
    }
}
