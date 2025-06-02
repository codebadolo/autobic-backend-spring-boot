package com.example.Projet_uml_8.model;

import jakarta.persistence.*;

@Entity
public class LigneBudget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLigne;
    private String nomParticipant;
    private String designationStage;
    private Integer nbHeures;
    private Integer coutCours;
    private String mois;
    // Getters, setters, constructeurs
}
