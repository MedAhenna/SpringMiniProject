package com.example.miniprojet.services.implementations;

import com.example.miniprojet.entities.Cooperative;
import com.example.miniprojet.exceptions.ResourceNotFoundException;
import com.example.miniprojet.repositories.CooperativeRepository;
import com.example.miniprojet.services.interfaces.ICooperativeService;
import com.example.miniprojet.utils.isNullOrEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CooperativeService implements ICooperativeService {
    CooperativeRepository cooperativeRepository;


    @Autowired
    public  CooperativeService(CooperativeRepository cooperativeRepository){
        this.cooperativeRepository = cooperativeRepository;

    }

    @Override
    public List<Cooperative> findAll(){
        return cooperativeRepository.findAll();
    }

    @Override
    public Cooperative findById(Long Id) {
        return cooperativeRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("Cooperative","Id",Id));
    }

    @Override
    public Cooperative save(Cooperative cooperative) {
        return cooperativeRepository.save(cooperative);
    }

    @Override
    public void deleteById(Long Id) {
        cooperativeRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("Cooperative","Id",Id));
        cooperativeRepository.deleteById(Id);
    }

    @Override
    public Cooperative updateCooperative(Cooperative cooperative, Long Id) {
        Cooperative existCooperative = cooperativeRepository.findById(Id).orElseThrow(
                ()-> new ResourceNotFoundException("Cooperative","Id",Id)
        );
        existCooperative.setNom(isNullOrEmpty.check(cooperative.getNom()) ? cooperative.getNom() : existCooperative.getNom());
        existCooperative.setAdresse(isNullOrEmpty.check(cooperative.getAdresse()) ? cooperative.getAdresse() : existCooperative.getAdresse());
        existCooperative.setTelephone(isNullOrEmpty.check(cooperative.getTelephone()) ? cooperative.getTelephone() : existCooperative.getTelephone());
        existCooperative.setStatus(isNullOrEmpty.check(cooperative.getStatus()) ? cooperative.getStatus() : existCooperative.getStatus());

        cooperativeRepository.save(existCooperative);
        return existCooperative;
    }
}
