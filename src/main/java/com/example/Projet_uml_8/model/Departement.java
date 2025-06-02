package com.example.Projet_uml_8.model;

import jakarta.persistence.*;

@Entity
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDept;
    private String nomDept;
    private String responsable;
    // Getters, setters, constructeurs
}
