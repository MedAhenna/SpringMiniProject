package com.example.miniprojet.services.interfaces;

import com.example.miniprojet.entities.Cooperative;

import java.util.List;

public interface ICooperativeService {
    List<Cooperative> findAll();
    Cooperative findById(Long Id);
    Cooperative save(Cooperative cooperative);
    void deleteById(Long Id);
    Cooperative updateCooperative(Cooperative cooperative, Long Id);
}
