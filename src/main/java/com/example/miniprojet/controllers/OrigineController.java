package com.example.miniprojet.controllers;

import com.example.miniprojet.entities.Origine;
import com.example.miniprojet.services.interfaces.IOrigineService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/origine")
public class OrigineController {

    private final IOrigineService origineService;

    public OrigineController(IOrigineService origineService) {
        this.origineService = origineService;
    }

    @GetMapping({"","/"})
    public List<Origine> getOrigines(){
        return origineService.findAll();
    }

    @GetMapping("/{id}")
    public Origine getOrigine(@PathVariable Long id){
        return origineService.findById(id);
    }

    @PostMapping({"","/"})
    public Origine addOrigine(@RequestBody Origine origine){
        return origineService.save(origine);
    }

    @DeleteMapping("/{id}")
    public void deleteOrigine(@PathVariable Long id){
        origineService.deleteById(id);
    }
}
