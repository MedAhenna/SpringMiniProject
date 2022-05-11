package com.example.miniprojet.controllers;

import com.example.miniprojet.entities.Categorie;
import com.example.miniprojet.repositories.CategorieRepository;
import com.example.miniprojet.services.interfaces.ICategorieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class CategorieController {

    private final ICategorieService categorieService;

    public CategorieController(ICategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @GetMapping("/categories")
    public List<Categorie> getCategories(){
        return categorieService.findAll();
    }

    @GetMapping("/category/{id}")
    public Categorie getCategory(@PathVariable Long id){
        return categorieService.findById(id);
    }

    @PostMapping("/category/save")
    public Categorie addCategory(@RequestBody Categorie category){
        return categorieService.save(category);
    }

    @DeleteMapping("/category/{id}")
    public void deleteCategory(@PathVariable Long id){
        categorieService.deleteById(id);
    }
}
