package com.example.Projet_uml_8.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFacture;
    @Temporal(TemporalType.DATE)
    private Date dateEmission;
    private Integer montantTotal;
    private String typeEnvoi; // PAR_SESSION, PAR_MOIS, etc.
    private String details;

    @ManyToOne
    @JoinColumn(name = "organisme_id")
    private OrganismeExterne organismeExterne;
    // Getters, setters, constructeurs
}
