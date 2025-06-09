package com.example.Projet_uml_8.controller;

import com.example.Projet_uml_8.model.Utilisateur;
import com.example.Projet_uml_8.model.Role;
import com.example.Projet_uml_8.repository.UtilisateurRepository;
import com.example.Projet_uml_8.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    // DTO pour l'inscription
    public static class RegisterRequest {
        public String username;
        public String password;
        public String role;
    }

    // DTO pour la connexion
    public static class LoginRequest {
        public String username;
        public String password;
    }

    // DTO pour la réponse login
    public static class AuthResponse {
        public String token;
        public String role;
        public AuthResponse(String token, String role) {
            this.token = token;
            this.role = role;
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        if (utilisateurRepository.existsByUsername(request.username)) {
            return ResponseEntity.badRequest().body("Ce nom d'utilisateur existe déjà.");
        }
        Utilisateur user = new Utilisateur();
        user.setUsername(request.username);
        user.setPassword(passwordEncoder.encode(request.password));
        try {
            user.setRole(Role.valueOf(request.role.toUpperCase()));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Le rôle fourni est invalide.");
        }
        utilisateurRepository.save(user);
        return ResponseEntity.ok("Inscription réussie !");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        Optional<Utilisateur> userOpt = utilisateurRepository.findByUsername(request.username);
        if (userOpt.isEmpty() || !passwordEncoder.matches(request.password, userOpt.get().getPassword())) {
            return ResponseEntity.status(401).body("Identifiants invalides");
        }
        Utilisateur user = userOpt.get();
        String token = jwtUtil.generateToken(user.getUsername(), user.getRole().name());
        return ResponseEntity.ok(new AuthResponse(token, user.getRole().name()));
    }
}
