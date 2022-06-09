package com.example.projetHormiga.service;

import com.example.projetHormiga.entities.Facture;
import com.example.projetHormiga.entities.Fournisseur;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FournisseurService {
    public void addFournisseur(Fournisseur fournisseur);
    void supprimerFournisseur(Long id);
    public void updateFrounisseur(Fournisseur fournisseur);
    public List<Fournisseur> afficherListe();
    public List<Fournisseur> afficherListeFournisseur();
    public List<Fournisseur> afficherListeClient();
    public Fournisseur afficherFournisseurById(Long id);
    public List <Facture> afficherFacturebyFournisseur(Long idFournisseur) ;
    public List <Facture> afficherFactureCreditbyFournisseur(Long idFournisseur) ;

    }
