package com.example.Projet_uml_8.repository;

import com.example.Projet_uml_8.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, String> {}
