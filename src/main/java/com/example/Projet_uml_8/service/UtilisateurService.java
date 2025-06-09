package com.example.Projet_uml_8.service;

import com.example.Projet_uml_8.model.Utilisateur;
import com.example.Projet_uml_8.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<Utilisateur> findAll() {
        return utilisateurRepository.findAll();
    }

    public Optional<Utilisateur> findByUsername(String username) {
        return utilisateurRepository.findByUsername(username);
    }

    public Utilisateur save(Utilisateur utilisateur) {
        // On encode le mot de passe uniquement s'il est non vide
        if (utilisateur.getPassword() != null && !utilisateur.getPassword().isEmpty()) {
            utilisateur.setPassword(passwordEncoder.encode(utilisateur.getPassword()));
        }
        return utilisateurRepository.save(utilisateur);
    }

    public void delete(Long id) {
        utilisateurRepository.deleteById(id);
    }
}
