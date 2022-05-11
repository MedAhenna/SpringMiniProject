package com.example.miniprojet.controllers;


import com.example.miniprojet.entities.Status;
import com.example.miniprojet.services.interfaces.IStatusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StatusController {

    private final IStatusService statusService;

    public StatusController(IStatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping("/allstatus")
    public List<Status> getStatus(){
        return statusService.findAll();
    }

    @GetMapping("/status/{id}")
    public Status getStatus(@PathVariable Long id){
        return statusService.findById(id);
    }

    @PostMapping("/status/save")
    public Status addStatus(@RequestBody Status status){
        return statusService.save(status);
    }

    @DeleteMapping("/status/{id}")
    public void deleteStatus(@PathVariable Long id){
        statusService.deleteById(id);
    }

}
