package com.example.projetHormiga.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
public class TypeFactures implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private int prixPt;
    @OneToMany(mappedBy = "typeFactures")
    @JsonIgnore
    private Set<Facture> factures;
    @ManyToOne
    @JsonIgnore
    private Fournisseur fournisseur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrixPt() {
        return prixPt;
    }

    public void setPrixPt(int prixPt) {
        this.prixPt = prixPt;
    }

    public Set<Facture> getFactures() {
        return factures;
    }

    public void setFactures(Set<Facture> factures) {
        this.factures = factures;
    }
}
