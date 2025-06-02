package com.example.Projet_uml_8.controller;

import com.example.Projet_uml_8.model.Cours;
import com.example.Projet_uml_8.service.CoursService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cours")
public class CoursController {

    private final CoursService coursService;

    public CoursController(CoursService coursService) {
        this.coursService = coursService;
    }

    @GetMapping
    public List<Cours> getAllCours() {
        return coursService.getAllCours();
    }

    @GetMapping("/{reference}")
    public ResponseEntity<Cours> getCours(@PathVariable String reference) {
        return coursService.getCours(reference)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
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
