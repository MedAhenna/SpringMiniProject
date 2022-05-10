package com.example.miniprojet.services.interfaces;

import com.example.miniprojet.entities.Status;

import java.util.List;

public interface IStatusService {
    List<Status> findAll();
    Status findById(Long Id);
    Status save(Status status);
    void deleteById(Long Id);
}
