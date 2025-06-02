package com.example.Projet_uml_8.model;

import jakarta.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class Personne {
    @Id
    private String matricule;
    private String nom;
    private String prenom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String sexe;
    // Getters, setters, constructeurs
}
