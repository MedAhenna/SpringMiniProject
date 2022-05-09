package com.example.miniprojet.controllers;

import com.example.miniprojet.entities.Administrateur;
import com.example.miniprojet.services.interfaces.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdministrateurController {

    private final IAdminService adminService;

    @Autowired
    public AdministrateurController(IAdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/{id}")
    Administrateur getAdmin(@PathVariable Long id){
        return  adminService.getById(id);
    }

    @PostMapping({"","/"})
    Administrateur addAdmin(@RequestBody Administrateur admin){
        return adminService.save(admin);
    }

    @GetMapping
    List<Administrateur> getAll(){
        return adminService.findAll();
    }
}
