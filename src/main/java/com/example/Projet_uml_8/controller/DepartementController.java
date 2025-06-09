package com.example.Projet_uml_8.controller;

import com.example.Projet_uml_8.model.Departement;
import com.example.Projet_uml_8.service.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/departements")
@CrossOrigin(origins = "http://localhost:3000")
public class DepartementController {
    @Autowired
    private DepartementService departementService;

    @GetMapping
    public List<Departement> getAll() {
        return departementService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Departement> getOne(@PathVariable Integer id) {
        return departementService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Departement create(@RequestBody Departement dep) {
        return departementService.save(dep);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Departement> update(@PathVariable Integer id, @RequestBody Departement dep) {
        return departementService.findById(id)
                .map(existing -> {
                    dep.setIdDept(id);
                    return ResponseEntity.ok(departementService.save(dep));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        departementService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
