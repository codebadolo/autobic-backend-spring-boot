package com.example.Projet_uml_8.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "cours")
public class Cours {
    @Id
    @Column(name = "reference", nullable = false, unique = true)
    private String reference;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "domaine")
    private String domaine;

    @Column(name = "nombre_jours")
    private Integer nombreJours;

    @Column(name = "prix_par_participant")
    private Integer prixParParticipant;

    @Column(name = "organisme")
    private String organisme;

    @Column(name = "lieu")
    private String lieu;

    // --- Constructeurs ---
    public Cours() {}

    public Cours(String reference, String libelle, String domaine, Integer nombreJours,
                 Integer prixParParticipant, String organisme, String lieu) {
        this.reference = reference;
        this.libelle = libelle;
        this.domaine = domaine;
        this.nombreJours = nombreJours;
        this.prixParParticipant = prixParParticipant;
        this.organisme = organisme;
        this.lieu = lieu;
    }

    // --- Getters et Setters ---
    public String getReference() { return reference; }
    public void setReference(String reference) { this.reference = reference; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }

    public String getDomaine() { return domaine; }
    public void setDomaine(String domaine) { this.domaine = domaine; }

    public Integer getNombreJours() { return nombreJours; }
    public void setNombreJours(Integer nombreJours) { this.nombreJours = nombreJours; }

    public Integer getPrixParParticipant() { return prixParParticipant; }
    public void setPrixParParticipant(Integer prixParParticipant) { this.prixParParticipant = prixParParticipant; }

    public String getOrganisme() { return organisme; }
    public void setOrganisme(String organisme) { this.organisme = organisme; }

    public String getLieu() { return lieu; }
    public void setLieu(String lieu) { this.lieu = lieu; }
}
