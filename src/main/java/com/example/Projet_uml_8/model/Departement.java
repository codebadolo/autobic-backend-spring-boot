package com.example.Projet_uml_8.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idDept"
)
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDept;
    private String nomDept;
    private String responsable;

    @OneToMany(mappedBy = "departement")
    private List<Employe> employes;

    // getters/setters
    public Integer getIdDept() { return idDept; }
    public void setIdDept(Integer idDept) { this.idDept = idDept; }
    public String getNomDept() { return nomDept; }
    public void setNomDept(String nomDept) { this.nomDept = nomDept; }
    public String getResponsable() { return responsable; }
    public void setResponsable(String responsable) { this.responsable = responsable; }
    public List<Employe> getEmployes() { return employes; }
    public void setEmployes(List<Employe> employes) { this.employes = employes; }
}
