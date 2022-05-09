package com.example.miniprojet.services.implementations;

import com.example.miniprojet.entities.Region;
import com.example.miniprojet.exceptions.ResourceNotFoundException;

import com.example.miniprojet.repositories.RegionRepository;
import com.example.miniprojet.services.interfaces.IRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService implements IRegionService {

    RegionRepository regionRepository;


    @Autowired
    public  RegionService(RegionRepository regionRepository){
        this.regionRepository = regionRepository;

    }


    @Override
    public List<Region> findAll(){
        return regionRepository.findAll();
    }

    @Override
    public Region findById(Long Id) {
        return regionRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("Region","Id",Id));
    }

    @Override
    public Region save(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public void deleteById(Long Id) {
        regionRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("Region","Id",Id));
        regionRepository.deleteById(Id);
    }

}
