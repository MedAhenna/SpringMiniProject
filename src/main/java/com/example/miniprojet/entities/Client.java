package com.example.miniprojet.entities;



import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Client extends Utilisateur{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;


    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
