package com.example.miniprojet.controllers;

import com.example.miniprojet.entities.Categorie;
import com.example.miniprojet.repositories.CategorieRepository;
import com.example.miniprojet.services.interfaces.ICategorieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/categorie")
public class CategorieController {

    private final ICategorieService categorieService;

    public CategorieController(ICategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @GetMapping({"","/"})
    public List<Categorie> getCategories(){
        return categorieService.findAll();
    }

    @GetMapping("/{id}")
    public Categorie getCategory(@PathVariable Long id){
        return categorieService.findById(id);
    }

    @PostMapping({"","/"})
    public Categorie addCategory(@RequestBody Categorie category){
        return categorieService.save(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
        categorieService.deleteById(id);
    }
}
