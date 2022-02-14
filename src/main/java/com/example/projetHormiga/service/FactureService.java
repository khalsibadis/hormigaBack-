package com.example.projetHormiga.service;

import com.example.projetHormiga.entities.Facture;

import java.util.List;

public interface FactureService {
    public void ajouterFacture(Facture facture, Long idFournisseur);

    public void modifierFacture(Facture facture);

    void supprimerFacture(Long id);

    List<Facture> factures(Facture facture) ;

    void afficherListe();

    Facture afficherFacturebyId(Long idFacture);



}
