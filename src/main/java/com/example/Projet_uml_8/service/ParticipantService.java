package com.example.Projet_uml_8.service;

import com.example.Projet_uml_8.model.Participant;
import com.example.Projet_uml_8.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    public List<Participant> findAll() {
        return participantRepository.findAll();
    }

    public Optional<Participant> findById(Integer idParticipant) {
        return participantRepository.findById(idParticipant);
    }

    public List<Participant> findBySessionIdSession(Integer idSession) {
        return participantRepository.findBySessionIdSession(idSession);
    }

    public List<Participant> findByEmployeMatricule(String matricule) {
        return participantRepository.findByEmployeMatricule(matricule);
    }

    public Participant save(Participant participant) {
        return participantRepository.save(participant);
    }

    public void delete(Integer idParticipant) {
        participantRepository.deleteById(idParticipant);
    }
}
