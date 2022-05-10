package com.example.miniprojet.services.implementations;

import com.example.miniprojet.entities.Status;
import com.example.miniprojet.exceptions.ResourceNotFoundException;
import com.example.miniprojet.repositories.StatusRepository;
import com.example.miniprojet.services.interfaces.IStatusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService implements IStatusService {

    private final StatusRepository statusRepository;

    public StatusService(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    @Override
    public List<Status> findAll(){
        return  statusRepository.findAll();
    }

    @Override
    public Status findById(Long Id) {
        return statusRepository.findById(Id).orElseThrow(
                ()-> new ResourceNotFoundException("Status","Id",Id)
        );
    }

    @Override
    public Status save(Status status) {
        return statusRepository.save(status);
    }

    @Override
    public void deleteById(Long Id) {
        statusRepository.findById(Id).orElseThrow(
                ()-> new ResourceNotFoundException("Status","Id",Id)
        );
        statusRepository.deleteById(Id);
    }
}
