package com.example.Projet_uml_8.service;

import com.example.Projet_uml_8.model.Cours;
import com.example.Projet_uml_8.repository.CoursRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursService {
    private final CoursRepository coursRepository;

    public CoursService(CoursRepository coursRepository) {
        this.coursRepository = coursRepository;
    }

    public List<Cours> getAllCours() {
        return coursRepository.findAll();
    }

    public Optional<Cours> getCours(String reference) {
        return coursRepository.findById(reference);
    }

    public Cours saveCours(Cours cours) {
        return coursRepository.save(cours);
    }

    public void deleteCours(String reference) {
        coursRepository.deleteById(reference);
    }
}
