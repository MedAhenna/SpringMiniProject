package com.example.miniprojet.controllers;

import com.example.miniprojet.entities.Produit;
import com.example.miniprojet.services.interfaces.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.example.miniprojet.services.implementations.ProduitService;

@RestController
@RequestMapping("/produit")
public class ProduitController {

    private final IProduitService produitService;

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

    @DeleteMapping("{id}")
    public String deleteProduct(@PathVariable Long id){
        produitService.deleteById(id);
        return String.format("Product with Id : %s is deleted! ", id);
    }

    @PostMapping({"","/"})
    public Produit createProduct(@RequestBody Produit produit){
        return produitService.save(produit);
    }

    @PutMapping("/{id}")
    public Produit updateProduct(@PathVariable Long id, @RequestBody Produit produit){
        return  produitService.updateProduct(produit, id);
    }
}
