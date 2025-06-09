package com.example.Projet_uml_8.repository;
import java.util.Optional;
import com.example.Projet_uml_8.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    boolean existsByUsername(String username);
    Optional<Utilisateur> findByUsername(String username);
}
