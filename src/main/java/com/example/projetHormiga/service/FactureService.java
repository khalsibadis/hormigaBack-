package com.example.projetHormiga.service;

import com.example.projetHormiga.entities.Facture;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FactureService {
    public void ajouterFacture(Facture facture, Long idFournisseur,Long idType);

    public void modifierFacture(Facture facture,Long idT);

    void supprimerFacture(Long id);

    List<Facture> factures(Facture facture) ;

    void afficherListe();

    Facture afficherFacturebyId( Long idFacture);

    int NbrPointByFournisseur( Long id);

    public int PirxtotalByFournisseur( Long id);

    public int nbrFactureByFournisseur( Long id);

    public int nbrPtByFournisseurByType( Long id,String type);

    public int TotalPtByFournisseurByType( Long id,String type);



}
