package com.example.miniprojet.controllers;

import com.example.miniprojet.dto.UserRoleDTO;
import com.example.miniprojet.entities.*;
import com.example.miniprojet.services.interfaces.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UtilisateurController {

    private final IUtilisateurService utilisateurService;

    @Autowired
    public UtilisateurController(IUtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping("/users")
    List<Utilisateur> getUsers(){
        return utilisateurService.findAll();
    }

    @GetMapping("/user/{id}")
    Utilisateur getUser(@PathVariable Long id){
        return utilisateurService.findById(id);
    }

    @PostMapping("/role/save")
    Role saveRole(@RequestBody Role role){
        return utilisateurService.saveRole(role);
    }

    @PostMapping("/role/addtouser")
    Utilisateur addRoleToUser(@RequestBody UserRoleDTO userRolDto){
        return utilisateurService.addRoleToUser(userRolDto.getUsername(), userRolDto.getRoleName());
    }

    @PostMapping("/admin/save")
    Utilisateur addAdmin(@RequestBody Administrateur admin){
        return utilisateurService.saveUser(admin);
    }

    @PostMapping("/client/save")
    Utilisateur addClient(@RequestBody Client client){
        return utilisateurService.saveUser(client);
    }

    @PostMapping("/cooperative/save")
    Utilisateur addCooperative(@RequestBody Cooperative cooperative){
        return utilisateurService.saveUser(cooperative);
    }

}
