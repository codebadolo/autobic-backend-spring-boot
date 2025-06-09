package com.example.Projet_uml_8.config;

import com.example.Projet_uml_8.model.Cours;
import com.example.Projet_uml_8.repository.CoursRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitCoursData {

    @Bean
    CommandLineRunner initCours(CoursRepository coursRepository) {
        return args -> {
            coursRepository.save(new Cours("K128", "Conception des systèmes d'information", "INFORMATIQUE", 5, 400000, "ILBOUDO SA", "Ouagadougou"));
            coursRepository.save(new Cours("K327", "Principes de la méthode UML", "INFORMATIQUE", 3, 350000, "ESTA SA", "Ouagadougou"));
            coursRepository.save(new Cours("S327", "Système d'exploitation UNIX", "INFORMATIQUE", 3, 500000, "ESTA SA", "Ouagadougou"));
            coursRepository.save(new Cours("K500", "Réseaux informatiques avancés", "INFORMATIQUE", 4, 420000, "ILBOUDO SA", "Ouagadougou"));
            coursRepository.save(new Cours("E101", "Électronique de puissance", "ELECTRONIQUE", 5, 380000, "STÉ ABCD", "Ouagadougou"));
            coursRepository.save(new Cours("A201", "Asservissements industriels", "AUTOMATISMES", 6, 450000, "STÉ ABCD", "Ouagadougou"));
            coursRepository.save(new Cours("P111", "Programmation Python", "INFORMATIQUE", 4, 360000, "ESTA SA", "Ouagadougou"));
            coursRepository.save(new Cours("P112", "Programmation Java", "INFORMATIQUE", 4, 370000, "ESTA SA", "Ouagadougou"));
            coursRepository.save(new Cours("P113", "Programmation C++", "INFORMATIQUE", 4, 375000, "ILBOUDO SA", "Ouagadougou"));
            coursRepository.save(new Cours("S400", "Sécurité des réseaux", "INFORMATIQUE", 3, 390000, "ESTA SA", "Ouagadougou"));
            coursRepository.save(new Cours("G101", "Gestion de projet", "MANAGEMENT", 5, 410000, "STÉ ABCD", "Ouagadougou"));
            coursRepository.save(new Cours("G102", "Gestion d’équipe", "MANAGEMENT", 3, 340000, "STÉ ABCD", "Ouagadougou"));
            coursRepository.save(new Cours("D101", "Droit du travail", "JURIDIQUE", 2, 250000, "ILBOUDO SA", "Ouagadougou"));
            coursRepository.save(new Cours("D102", "Droit des contrats", "JURIDIQUE", 2, 260000, "ILBOUDO SA", "Ouagadougou"));
            coursRepository.save(new Cours("F101", "Formation sécurité incendie", "SÉCURITÉ", 2, 230000, "ESTA SA", "Ouagadougou"));
            coursRepository.save(new Cours("F102", "Formation premiers secours", "SÉCURITÉ", 2, 235000, "ESTA SA", "Ouagadougou"));
            coursRepository.save(new Cours("L101", "Logistique et transport", "LOGISTIQUE", 4, 320000, "STÉ ABCD", "Ouagadougou"));
            coursRepository.save(new Cours("L102", "Gestion des stocks", "LOGISTIQUE", 3, 310000, "STÉ ABCD", "Ouagadougou"));
            coursRepository.save(new Cours("T101", "Techniques de vente", "COMMERCIAL", 3, 330000, "ILBOUDO SA", "Ouagadougou"));
            coursRepository.save(new Cours("T102", "Relation client", "COMMERCIAL", 3, 335000, "ILBOUDO SA", "Ouagadougou"));
            coursRepository.save(new Cours("M101", "Maintenance industrielle", "MAINTENANCE", 5, 420000, "ESTA SA", "Ouagadougou"));
            coursRepository.save(new Cours("M102", "Maintenance informatique", "MAINTENANCE", 4, 415000, "ESTA SA", "Ouagadougou"));
            coursRepository.save(new Cours("Q101", "Qualité et certification", "QUALITÉ", 3, 360000, "STÉ ABCD", "Ouagadougou"));
            coursRepository.save(new Cours("Q102", "Audit interne", "QUALITÉ", 2, 355000, "STÉ ABCD", "Ouagadougou"));
            coursRepository.save(new Cours("E201", "Électricité industrielle", "ELECTRICITÉ", 4, 400000, "ILBOUDO SA", "Ouagadougou"));
            coursRepository.save(new Cours("E202", "Électricité bâtiment", "ELECTRICITÉ", 3, 390000, "ILBOUDO SA", "Ouagadougou"));
            coursRepository.save(new Cours("A202", "Automates programmables", "AUTOMATISMES", 5, 460000, "STÉ ABCD", "Ouagadougou"));
            coursRepository.save(new Cours("A203", "Robotique industrielle", "AUTOMATISMES", 4, 470000, "STÉ ABCD", "Ouagadougou"));
            coursRepository.save(new Cours("S500", "Sécurité informatique", "INFORMATIQUE", 3, 395000, "ESTA SA", "Ouagadougou"));
            coursRepository.save(new Cours("S501", "Cyberdéfense", "INFORMATIQUE", 3, 398000, "ESTA SA", "Ouagadougou"));
            coursRepository.save(new Cours("G103", "Gestion du temps", "MANAGEMENT", 2, 300000, "STÉ ABCD", "Ouagadougou"));
        };
    }
}
