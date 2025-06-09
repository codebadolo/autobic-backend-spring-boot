package com.example.Projet_uml_8.service;

import com.example.Projet_uml_8.model.Departement;
import com.example.Projet_uml_8.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartementService {
    @Autowired
    private DepartementRepository departementRepository;

    public List<Departement> findAll() {
        return departementRepository.findAll();
    }

    public Optional<Departement> findById(Integer id) {
        return departementRepository.findById(id);
    }

    public Departement save(Departement dep) {
        return departementRepository.save(dep);
    }

    public void delete(Integer id) {
        departementRepository.deleteById(id);
    }
}
