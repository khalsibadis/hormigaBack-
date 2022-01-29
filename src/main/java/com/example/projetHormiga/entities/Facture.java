package com.example.projetHormiga.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
public class Facture {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String TypeFacture;
    private String EtatPayement;
    private int nbrPoint;
    private int Total;

    @ManyToOne
    @JsonIgnore
    private Fournisseur fournisseur;

    @ManyToOne()
    @JsonIgnore
    private User user;

    public int getNbrPoint() {
        return nbrPoint;
    }

    public void setNbrPoint(int nbrPoint) {
        this.nbrPoint = nbrPoint;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeFacture() {
        return TypeFacture;
    }

    public void setTypeFacture(String typeFacture) {
        TypeFacture = typeFacture;
    }

    public String getEtatPayement() {
        return EtatPayement;
    }

    public void setEtatPayement(String etatPayement) {
        EtatPayement = etatPayement;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
