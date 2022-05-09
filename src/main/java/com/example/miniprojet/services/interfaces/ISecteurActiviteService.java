package com.example.miniprojet.services.interfaces;

import com.example.miniprojet.entities.SecteurActivite;

import java.util.List;

public interface ISecteurActiviteService {
    List<SecteurActivite> findAll();
    SecteurActivite findById(Long Id);
    SecteurActivite save(SecteurActivite secteurActivite);
    void deleteById(Long Id);
}
