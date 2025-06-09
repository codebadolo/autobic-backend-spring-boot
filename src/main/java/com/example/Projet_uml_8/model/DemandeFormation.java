package com.example.Projet_uml_8.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class DemandeFormation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDemande;

    @Temporal(TemporalType.DATE)
    private Date dateDemande;

    @Temporal(TemporalType.DATE)
    private Date dateSouhaiteeDebut;

    private Integer dureeJours;

    private String observations;

    private String statut; // EN_ATTENTE, VALIDEE, REFUSEE

    @ManyToOne
    @JoinColumn(name = "matricule")
    private Employe employe;

    // Constructeur par défaut requis par JPA
    public DemandeFormation() {}

    // Constructeur avec paramètres (sans idDemande car généré)
    public DemandeFormation(Date dateDemande, Date dateSouhaiteeDebut, Integer dureeJours, String observations, String statut, Employe employe) {
        this.dateDemande = dateDemande;
        this.dateSouhaiteeDebut = dateSouhaiteeDebut;
        this.dureeJours = dureeJours;
        this.observations = observations;
        this.statut = statut;
        this.employe = employe;
    }

    // Getters et setters complets

    public Integer getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(Integer idDemande) {
        this.idDemande = idDemande;
    }

    public Date getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(Date dateDemande) {
        this.dateDemande = dateDemande;
    }

    public Date getDateSouhaiteeDebut() {
        return dateSouhaiteeDebut;
    }

    public void setDateSouhaiteeDebut(Date dateSouhaiteeDebut) {
        this.dateSouhaiteeDebut = dateSouhaiteeDebut;
    }

    public Integer getDureeJours() {
        return dureeJours;
    }

    public void setDureeJours(Integer dureeJours) {
        this.dureeJours = dureeJours;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}
