package com.example.miniprojet.services.implementations;

import com.example.miniprojet.entities.MatierePremiere;
import com.example.miniprojet.exceptions.ResourceNotFoundException;
import com.example.miniprojet.repositories.MatierePremiereRepository;
import com.example.miniprojet.services.interfaces.IMatierePremiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatierePremiereService implements IMatierePremiereService {

    MatierePremiereRepository matierePremiereRepository;


    @Autowired
    public  MatierePremiereService(MatierePremiereRepository matierePremiereRepository){
        this.matierePremiereRepository = matierePremiereRepository;

    }


    @Override
    public List<MatierePremiere> findAll(){
        return matierePremiereRepository.findAll();
    }

    @Override
    public MatierePremiere findById(Long Id) {
        return matierePremiereRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("MatierePremiere","Id",Id));
    }

    @Override
    public MatierePremiere save(MatierePremiere matierePremiere) {
        return matierePremiereRepository.save(matierePremiere);
    }

    @Override
    public void deleteById(Long Id) {
        matierePremiereRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("MatierePremiere","Id",Id));
        matierePremiereRepository.deleteById(Id);
    }
}
