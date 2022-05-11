package com.example.miniprojet.entities;


import com.sun.istack.NotNull;
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
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String email;

    @NotNull()
    private String password;
    private String username;

    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;

    public Utilisateur(String email, String password, String username) {
        this.email = email;
        this.password = password;
        this.username = username;
    }
}
