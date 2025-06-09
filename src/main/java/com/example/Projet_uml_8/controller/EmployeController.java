package com.example.Projet_uml_8.controller;

import com.example.Projet_uml_8.model.Employe;
import com.example.Projet_uml_8.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/employes")
@CrossOrigin(origins = "http://localhost:3000") // Autorise le front React en local
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    // Récupérer tous les employés
    @GetMapping
    public ResponseEntity<List<Employe>> getAll() {
        List<Employe> employes = employeService.findAll();
        return ResponseEntity.ok(employes);
    }

    // Récupérer un employé par matricule
    @GetMapping("/{matricule}")
    public ResponseEntity<Employe> getOne(@PathVariable String matricule) {
        return employeService.findById(matricule)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Créer un nouvel employé
    @PostMapping
    public ResponseEntity<Employe> create(@RequestBody Employe employe) {
        if (employe.getMatricule() == null || employe.getMatricule().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        // Vérifier si matricule existe déjà
        if (employeService.findById(employe.getMatricule()).isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        Employe saved = employeService.save(employe);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // Mettre à jour un employé existant
    @PutMapping("/{matricule}")
    public ResponseEntity<Employe> update(@PathVariable String matricule, @RequestBody Employe employe) {
        return employeService.findById(matricule)
                .map(existing -> {
                    employe.setMatricule(matricule); // S'assurer que la clé reste la même
                    Employe updated = employeService.save(employe);
                    return ResponseEntity.ok(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Supprimer un employé
    @DeleteMapping("/{matricule}")
    public ResponseEntity<Void> delete(@PathVariable String matricule) {
        if (!employeService.findById(matricule).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        employeService.delete(matricule);
        return ResponseEntity.noContent().build();
    }
}
