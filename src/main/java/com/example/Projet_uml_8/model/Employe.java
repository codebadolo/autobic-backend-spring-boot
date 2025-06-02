package com.example.Projet_uml_8.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Employe extends Personne {
    @Temporal(TemporalType.DATE)
    private Date dateEntree;
    private String categorie;
    private String qualification;

    @ManyToOne
    @JoinColumn(name = "departement_id")
    private Departement departement;
    // Getters, setters, constructeurs
}
