package com.example.miniprojet.services.interfaces;

import com.example.miniprojet.entities.Administrateur;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import java.util.List;

public interface IAdminService {
    Administrateur save(Administrateur admin);
    List<Administrateur> findAll();
    Administrateur getById(Long Id);
}

