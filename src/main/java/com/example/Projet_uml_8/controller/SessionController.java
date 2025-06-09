package com.example.Projet_uml_8.controller;

import com.example.Projet_uml_8.model.Session;
import com.example.Projet_uml_8.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sessions")
@CrossOrigin(origins = "http://localhost:3000") // adapte selon ton frontend
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping
    public List<Session> getAll() {
        return sessionService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Session> getOne(@PathVariable Integer id) {
        return sessionService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Session create(@RequestBody Session session) {
        return sessionService.save(session);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Session> update(@PathVariable Integer id, @RequestBody Session session) {
        return sessionService.findById(id)
                .map(existing -> {
                    session.setIdSession(id);
                    return ResponseEntity.ok(sessionService.save(session));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        sessionService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
