package com.example.miniprojet.services.implementations;

import com.example.miniprojet.entities.Client;
import com.example.miniprojet.repositories.ClientRepository;
import com.example.miniprojet.services.interfaces.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements IClientService {

    ClientRepository clientRepository;
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }
}
