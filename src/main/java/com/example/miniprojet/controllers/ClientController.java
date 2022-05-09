package com.example.miniprojet.controllers;

import com.example.miniprojet.entities.Client;
import com.example.miniprojet.services.implementations.ClientService;
import com.example.miniprojet.services.interfaces.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Register")
public class ClientController {
    private final IClientService clientService;

    @Autowired
    public ClientController(IClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping({"","/"})
    public Client createclient(@RequestBody Client client){
        return clientService.saveClient(client);
    }
}
