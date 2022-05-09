package com.example.miniprojet.services.implementations;

import com.example.miniprojet.entities.SecteurActivite;
import com.example.miniprojet.exceptions.ResourceNotFoundException;

import com.example.miniprojet.repositories.SecteurActiviteRepository;
import com.example.miniprojet.services.interfaces.ISecteurActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecteurActiviteService implements ISecteurActiviteService {

    SecteurActiviteRepository secteurActiviteRepository;


    @Autowired
    public  SecteurActiviteService(SecteurActiviteRepository secteurActiviteRepository){
        this.secteurActiviteRepository = secteurActiviteRepository;

    }


    @Override
    public List<SecteurActivite> findAll(){
        return secteurActiviteRepository.findAll();
    }

    @Override
    public SecteurActivite findById(Long Id) {
        return secteurActiviteRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("SecteurActivite","Id",Id));
    }

    @Override
    public SecteurActivite save(SecteurActivite secteurActivite) {
        return secteurActiviteRepository.save(secteurActivite);
    }

    @Override
    public void deleteById(Long Id) {
        secteurActiviteRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("SecteurActivite","Id",Id));
        secteurActiviteRepository.deleteById(Id);
    }

}
