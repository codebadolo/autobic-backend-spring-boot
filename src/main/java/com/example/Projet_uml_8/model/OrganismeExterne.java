package com.example.Projet_uml_8.model;

import jakarta.persistence.*;

@Entity
public class OrganismeExterne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrganisme;
    private String raisonSociale;
    private String adresse;
    private String autresContacts;
    // Getters, setters, constructeurs
}
