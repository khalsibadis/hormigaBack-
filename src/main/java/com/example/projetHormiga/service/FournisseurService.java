package com.example.projetHormiga.service;

import com.example.projetHormiga.entities.Fournisseur;

public interface FournisseurService {
    public void addFournisseur(Fournisseur fournisseur);
    void supprimerFournisseur(Long id);
    public void updateFrounisseur(Fournisseur fournisseur);
    public void afficherListe();
    public void afficherFournisseurById(Long id);
}
