package com.example.miniprojet.controllers;

import com.example.miniprojet.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.example.miniprojet.services.ProduitService;

@RestController
@RequestMapping("/produit")
public class ProduitController {

    private final ProduitService produitService;

    @Autowired
    public ProduitController(ProduitService produitService){
        this.produitService = produitService;
    }

    @GetMapping({"","/"})
    public List<Produit> getProducts(){
        return produitService.findAll();
    }

    @GetMapping("/{id}")
    public Produit getProduct(@PathVariable Long id){
        return produitService.findById(id);
    }

    @PostMapping({"","/"})
    public Produit createProduct(@RequestBody Produit produit){
        return produitService.save(produit);
    }


}
