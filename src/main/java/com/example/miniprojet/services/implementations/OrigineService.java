package com.example.miniprojet.services.implementations;

import com.example.miniprojet.entities.Origine;
import com.example.miniprojet.exceptions.ResourceNotFoundException;
import com.example.miniprojet.repositories.OrigineRepository;
import com.example.miniprojet.services.interfaces.IOrigineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrigineService implements IOrigineService {

    OrigineRepository origineRepository;


    @Autowired
    public  OrigineService(OrigineRepository origineRepository){
        this.origineRepository = origineRepository;

    }


    @Override
    public List<Origine> findAll(){
        return origineRepository.findAll();
    }

    @Override
    public Origine findById(Long Id) {
        return origineRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("Origine","Id",Id));
    }

    @Override
    public Origine save(Origine origine) {
        return origineRepository.save(origine);
    }

    @Override
    public void deleteById(Long Id) {
        origineRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("Origine","Id",Id));
        origineRepository.deleteById(Id);
    }
}
