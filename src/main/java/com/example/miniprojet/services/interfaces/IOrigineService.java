package com.example.miniprojet.services.interfaces;

import com.example.miniprojet.entities.Origine;

import java.util.List;

public interface IOrigineService {
    List<Origine> findAll();
    Origine findById(Long Id);
    Origine save(Origine origine);
    void deleteById(Long Id);
}
