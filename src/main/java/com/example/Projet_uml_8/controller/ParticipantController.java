package com.example.Projet_uml_8.controller;

import com.example.Projet_uml_8.model.Participant;
import com.example.Projet_uml_8.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/participants")
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @GetMapping
    public List<Participant> getAllParticipants() {
        return participantService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Participant> getParticipant(@PathVariable Integer id) {
        return participantService.findById(id);
    }

    // Lister les participants d'une session
    @GetMapping("/session/{idSession}")
    public List<Participant> getParticipantsBySession(@PathVariable Integer idSession) {
        return participantService.findBySessionIdSession(idSession);
    }

    // Lister les participations d'un employé
    @GetMapping("/employe/{matricule}")
    public List<Participant> getParticipantsByEmploye(@PathVariable String matricule) {
        return participantService.findByEmployeMatricule(matricule);
    }

    @PostMapping
    public Participant createParticipant(@RequestBody Participant participant) {
        return participantService.save(participant);
    }

    @PutMapping("/{id}")
    public Participant updateParticipant(@PathVariable Integer id, @RequestBody Participant participant) {
        participant.setIdParticipant(id);
        return participantService.save(participant);
    }

    @DeleteMapping("/{id}")
    public void deleteParticipant(@PathVariable Integer id) {
        participantService.delete(id);
    }
}
