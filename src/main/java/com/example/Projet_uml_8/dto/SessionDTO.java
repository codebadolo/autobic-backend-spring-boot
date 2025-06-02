package com.example.Projet_uml_8.dto;

import java.util.Date;

public class SessionDTO {
    private Integer idSession;
    private Date dateDebut;
    private Date dateFin;
    private Integer nbPlacesMax;
    private Integer nbHeuresCours;
    private String coursReference; // ou CoursDTO cours;
}
