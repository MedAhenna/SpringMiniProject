package com.example.miniprojet.controllers;

import com.example.miniprojet.entities.Client;
import com.example.miniprojet.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Register")
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping({"","/"})
    public Client createclient(@RequestBody Client client){
        return clientService.saveClient(client);
    }
}
