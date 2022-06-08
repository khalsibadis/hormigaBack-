package com.example.projetHormiga.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
public class Facture implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
   // private String TypeFacture;
    private String EtatPayement;
    private int nbrPoint;
    private int Total;
    @ManyToOne ()
    private TypeFactures typeFactures;

    @ManyToOne()
    private Fournisseur fournisseur;

    private String user;

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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setTypeFactures(TypeFactures typeFactures) {
        this.typeFactures = typeFactures;
    }
}
