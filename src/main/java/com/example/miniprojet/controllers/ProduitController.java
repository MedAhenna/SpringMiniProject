package com.example.miniprojet.controllers;

import com.example.miniprojet.dto.ProduitDTO;
import com.example.miniprojet.entities.Produit;
import com.example.miniprojet.services.interfaces.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProduitController {

    private final IProduitService produitService;

    @Autowired
    public ProduitController(IProduitService produitService){
        this.produitService = produitService;
    }

    @GetMapping("/products")
    public List<Produit> getProducts(){
        return produitService.findAll();
    }

    @GetMapping("/coopertaive/{id}/products")
    public List<Produit> getProductsByCooperative(@PathVariable Long id){
        return null;
    }

    @GetMapping("/categorie/{id}/products")
    public List<Produit> getProductsByCategorie(@PathVariable Long id){
        return null;
    }

    @GetMapping("/product/{id}")
    public Produit getProduct(@PathVariable Long id){
        return produitService.findById(id);
    }

    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable Long id){
        produitService.deleteById(id);
        return String.format("Product with Id : %s is deleted! ", id);
    }

    @PostMapping("/product/create")
    public Produit createProduct(@RequestBody Produit produit){

        return produitService.save(produit);
    }

    @PutMapping("/product/{id}")
    public Produit updateProduct(@PathVariable Long id, @RequestBody Produit produit){
        return  produitService.updateProduct(produit, id);
    }

    @PostMapping("/productcat")
    public Produit productCat(@RequestBody ProduitDTO productDto) {
        System.out.println(productDto.getProductId());
        System.out.println(productDto.getCategoryId());
        return produitService.updateProductCat(productDto.getProductId(),productDto.getCategoryId());
    }
}

