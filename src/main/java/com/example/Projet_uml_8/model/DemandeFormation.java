package com.example.Projet_uml_8.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class DemandeFormation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDemande;
    @Temporal(TemporalType.DATE)
    private Date dateDemande;
    @Temporal(TemporalType.DATE)
    private Date dateSouhaiteeDebut;
    private Integer dureeJours;
    private String observations;
    private String statut; // EN_ATTENTE, VALIDEE, REFUSEE

    @ManyToOne
    @JoinColumn(name = "employe_matricule")
    private Employe employe;
    // Getters, setters, constructeurs
}
