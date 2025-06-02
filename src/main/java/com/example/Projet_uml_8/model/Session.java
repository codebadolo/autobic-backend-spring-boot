package com.example.Projet_uml_8.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSession;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    private Integer nbPlacesMax;
    private Integer nbHeuresCours;

    @ManyToOne
    @JoinColumn(name = "cours_reference")
    private Cours cours;

    @OneToMany(mappedBy = "session")
    private List<Participant> participants;
    // Getters, setters, constructeurs
}
