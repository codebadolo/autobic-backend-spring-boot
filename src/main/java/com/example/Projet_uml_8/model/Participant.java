package com.example.Projet_uml_8.model;

import jakarta.persistence.*;

@Entity
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idParticipant;

    private String statutParticipation; // ex. INSCRIT, ABANDON, TERMINE

    @ManyToOne
    @JoinColumn(name = "matricule")
    private Employe employe;

    @ManyToOne
    @JoinColumn(name = "idSession")
    private Session session;

    // === GETTERS & SETTERS ===

    public Integer getIdParticipant() {
        return idParticipant;
    }

    public void setIdParticipant(Integer idParticipant) {
        this.idParticipant = idParticipant;
    }

    public String getStatutParticipation() {
        return statutParticipation;
    }

    public void setStatutParticipation(String statutParticipation) {
        this.statutParticipation = statutParticipation;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
