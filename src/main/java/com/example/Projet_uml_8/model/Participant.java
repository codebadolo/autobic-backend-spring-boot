package com.example.Projet_uml_8.model;

import jakarta.persistence.*;

@Entity
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idParticipant;
    private String statutParticipation; // ex: INSCRIT, ABANDON, TERMINE

    @ManyToOne
    @JoinColumn(name = "personne_matricule")
    private Employe employe;

    @ManyToOne
    @JoinColumn(name = "session_id")
    private Session session;
    // Getters, setters, constructeurs
}
