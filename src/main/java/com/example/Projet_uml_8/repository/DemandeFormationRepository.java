package com.example.Projet_uml_8.repository;

import com.example.Projet_uml_8.model.DemandeFormation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DemandeFormationRepository extends JpaRepository<DemandeFormation, Integer> {
    List<DemandeFormation> findByEmployeMatricule(String matricule);
}
