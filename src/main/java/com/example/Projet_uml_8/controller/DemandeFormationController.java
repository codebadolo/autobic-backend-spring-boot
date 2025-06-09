package com.example.Projet_uml_8.controller;

import com.example.Projet_uml_8.model.DemandeFormation;
import com.example.Projet_uml_8.service.DemandeFormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/demandes")
public class DemandeFormationController {

    @Autowired
    private DemandeFormationService demandeFormationService;

    // Déposer une demande (accessible à EMPLOYE)
    @PreAuthorize("hasRole('EMPLOYE')")
    @PostMapping
    public DemandeFormation createDemande(@RequestBody DemandeFormation demande) {
        demande.setStatut("EN_ATTENTE");
        return demandeFormationService.save(demande);
    }

    // Voir ses demandes (accessible à EMPLOYE)
    @PreAuthorize("hasRole('EMPLOYE')")
    @GetMapping("/employe/{matricule}")
    public List<DemandeFormation> getDemandesByEmploye(@PathVariable String matricule) {
        return demandeFormationService.findByEmployeMatricule(matricule);
    }

    // Voir toutes les demandes (Responsable, Directeur)
    @PreAuthorize("hasAnyRole('RESPONSABLE','DIRECTEUR')")
    @GetMapping
    public List<DemandeFormation> getAllDemandes() {
        return demandeFormationService.findAll();
    }

    // Valider/refuser une demande (Directeur)
    @PreAuthorize("hasRole('DIRECTEUR')")
    @PutMapping("/{id}/statut")
    public DemandeFormation updateStatut(@PathVariable Integer id, @RequestParam String statut) {
        return demandeFormationService.updateStatut(id, statut);
    }
}
