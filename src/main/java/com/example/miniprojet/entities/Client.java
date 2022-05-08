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
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String address;
    private Integer telephone;

    public Client(String nom, String prenom, String email, String password, String address, Integer telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.address = address;
        this.telephone = telephone;
    }
}
