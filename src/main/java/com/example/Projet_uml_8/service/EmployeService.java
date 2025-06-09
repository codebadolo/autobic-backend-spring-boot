package com.example.Projet_uml_8.service;

import com.example.Projet_uml_8.model.Employe;
import com.example.Projet_uml_8.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeService {
    @Autowired
    private EmployeRepository employeRepository;

    public List<Employe> findAll() {
        return employeRepository.findAll();
    }

    public Optional<Employe> findById(String matricule) {
        return employeRepository.findById(matricule);
    }

    public Employe save(Employe employe) {
        return employeRepository.save(employe);
    }

    public void delete(String matricule) {
        employeRepository.deleteById(matricule);
    }
}
