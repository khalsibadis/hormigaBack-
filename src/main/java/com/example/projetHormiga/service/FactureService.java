package com.example.projetHormiga.service;

import com.example.projetHormiga.entities.Facture;
import com.example.projetHormiga.entities.Fournisseur;

import java.util.List;

public interface FactureService {
    public void ajouterFacture(Facture facture, Long idFournisseur, Long idUser);

    public void modifierFacture(Facture facture);

    void supprimerFacture(Long id);

    List<Facture> factures(Facture facture) ;

    void afficherListe();

    void afficherFacturebyId(Long idFacture);

}