package com.example.Projet_uml_8.repository;

import com.example.Projet_uml_8.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
    // Lister tous les participants d'une session
    List<Participant> findBySessionIdSession(Integer idSession);

    // Lister tous les participants d'un employé
    List<Participant> findByEmployeMatricule(String matricule);
}
