package com.example.Projet_uml_8.model;

import jakarta.persistence.*;

@Entity
public class EtatBudgetMensuel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBudget;
    private Integer totalHeuresMainOeuvre;
    private Integer coutMainOeuvre;
    private Integer totalHeuresCours;
    private Integer coutCours;
    private Integer totalDepartement;
    // Getters, setters, constructeurs
}
