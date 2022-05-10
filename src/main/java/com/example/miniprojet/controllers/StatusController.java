package com.example.miniprojet.controllers;


import com.example.miniprojet.entities.Status;
import com.example.miniprojet.services.interfaces.IStatusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {

    private final IStatusService statusService;

    public StatusController(IStatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping({"","/"})
    public List<Status> getStatus(){
        return statusService.findAll();
    }

    @GetMapping("/{id}")
    public Status getStatus(@PathVariable Long id){
        return statusService.findById(id);
    }

    @PostMapping({"","/"})
    public Status addStatus(@RequestBody Status status){
        return statusService.save(status);
    }

    @DeleteMapping("/{id}")
    public void deleteStatus(@PathVariable Long id){
        statusService.deleteById(id);
    }

}
