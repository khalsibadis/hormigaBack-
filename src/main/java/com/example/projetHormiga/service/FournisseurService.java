package com.example.projetHormiga.service;

import com.example.projetHormiga.entities.Facture;
import com.example.projetHormiga.entities.Fournisseur;

import java.util.List;

public interface FournisseurService {
    public void addFournisseur(Fournisseur fournisseur);
    void supprimerFournisseur(Long id);
    public void updateFrounisseur(Fournisseur fournisseur);
    public List<Fournisseur> afficherListe();
    public void afficherFournisseurById(Long id);
    public List <Facture> afficherFacturebyFournisseur(Long idFournisseur) ;

    }
