package com.example.Projet_uml_8.service;

import com.example.Projet_uml_8.model.DemandeFormation;
import com.example.Projet_uml_8.repository.DemandeFormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemandeFormationService {

    @Autowired
    private DemandeFormationRepository demandeFormationRepository;

    public List<DemandeFormation> findAll() {
        return demandeFormationRepository.findAll();
    }

    public List<DemandeFormation> findByEmployeMatricule(String matricule) {
        return demandeFormationRepository.findByEmployeMatricule(matricule);
    }


    public DemandeFormation save(DemandeFormation demande) {
        return demandeFormationRepository.save(demande);
    }

    public DemandeFormation updateStatut(Integer id, String statut) {
        Optional<DemandeFormation> optional = demandeFormationRepository.findById(id);
        if (optional.isPresent()) {
            DemandeFormation demande = optional.get();
            demande.setStatut(statut);
            return demandeFormationRepository.save(demande);
        }
        throw new RuntimeException("Demande non trouvée");
    }
}
