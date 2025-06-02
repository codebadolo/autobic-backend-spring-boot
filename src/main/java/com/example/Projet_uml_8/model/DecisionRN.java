package com.example.Projet_uml_8.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class DecisionRN {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String avisRH;
    private String avisDF;
    @Temporal(TemporalType.DATE)
    private Date dateDecision;
    private Boolean accepte;

    @OneToOne
    @JoinColumn(name = "demande_id")
    private DemandeFormation demandeFormation;
    // Getters, setters, constructeurs
}
