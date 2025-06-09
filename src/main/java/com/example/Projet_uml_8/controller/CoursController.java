package com.example.Projet_uml_8.controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Projet_uml_8.model.Cours;
import com.example.Projet_uml_8.service.CoursService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional; // <-- AJOUTE CETTE LIGNE
import java.util.List;
import com.example.Projet_uml_8.model.Cours;
import com.example.Projet_uml_8.repository.CoursRepository;
@RestController
@RequestMapping("/api/cours")
@CrossOrigin(origins = "http://localhost:3000") // Ajoute cette ligne
public class CoursController {

    private final CoursService coursService;
    @Autowired
    private CoursRepository coursRepository;
    public CoursController(CoursService coursService) {
        this.coursService = coursService;
    }

    @GetMapping
    public List<Cours> getAllCours() {
        return coursService.getAllCours();
    }
    @PutMapping("/{reference}")
    public ResponseEntity<Cours> updateCours(@PathVariable String reference, @RequestBody Cours updated) {
        Optional<Cours> coursOpt = coursRepository.findById(reference);
        if (coursOpt.isPresent()) {
            updated.setReference(reference);
            Cours saved = coursRepository.save(updated);
            return ResponseEntity.ok(saved);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Cours createCours(@RequestBody Cours cours) {
        return coursService.saveCours(cours);
    }

    @DeleteMapping("/{reference}")
    public ResponseEntity<Void> deleteCours(@PathVariable String reference) {
        coursService.deleteCours(reference);
        return ResponseEntity.noContent().build();
    }
}
