package com.example.miniprojet.services.interfaces;

import com.example.miniprojet.entities.Region;

import java.util.List;

public interface IRegionService {
    List<Region> findAll();
    Region findById(Long Id);
    Region save(Region region);
    void deleteById(Long Id);
}
