package com.example.projetHormiga.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Data
@Entity
public class SuperAdmin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String password;

    @OneToMany(mappedBy = "superAdmin")
    private Set<Fournisseur> fournisseurs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Fournisseur> getFournisseurs() {
        return fournisseurs;
    }

    public void setFournisseurs(Set<Fournisseur> fournisseurs) {
        this.fournisseurs = fournisseurs;
    }
}
