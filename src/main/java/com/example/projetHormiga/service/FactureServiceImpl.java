package com.example.projetHormiga.service;

import com.example.projetHormiga.entities.Facture;
import com.example.projetHormiga.entities.Fournisseur;
import com.example.projetHormiga.entities.TypeFactures;
import com.example.projetHormiga.repository.FactureRepository;
import com.example.projetHormiga.repository.FournisseurRepository;
import com.example.projetHormiga.repository.TypeFactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FactureServiceImpl implements FactureService {
    @Autowired
    FactureRepository factureRepository;
    @Autowired
    FournisseurRepository fournisseurRepository;
    @Autowired
    TypeFactureRepository typeFactureRepository;



    @Override
    @Transactional
    public void ajouterFacture(Facture facture, Long idFournisseur,Long idType ) {
        Fournisseur fournisseur = fournisseurRepository.findById(idFournisseur).orElse(null);
        TypeFactures typeFactures= typeFactureRepository.findById(idType).orElse(null);
        factureRepository.save(facture);

        facture.setTypeFactures(typeFactures);
        facture.setFournisseur(fournisseur);
        facture.setTotal(facture.getTypeFactures().getPrixPt()*facture.getNbrPoint());
    }

    @Override
    @Transactional
    public void modifierFacture(Facture facture,Long idType ) {
        TypeFactures typeFactures= typeFactureRepository.findById(idType).orElse(null);

        facture.setTypeFactures(typeFactures);
        facture.setTotal(facture.getTypeFactures().getPrixPt()*facture.getNbrPoint());
        factureRepository.save(facture);

    }

    @Override
    public void supprimerFacture(Long id) {
        factureRepository.deleteById(id);
    }

    @Override
    public List<Facture> factures(Facture facture) {
        List<Facture>  a = factureRepository.findAll();
        return a;
    }

    @Override
    public void afficherListe() {
        factureRepository.findAll();
    }

    @Override
    public Facture afficherFacturebyId(Long idFacture) {

        return factureRepository.findById(idFacture).orElse(null);
    }

    @Override
    public int NbrPointByFournisseur(Long id) {

        return factureRepository.TotalPointByFournisseur(id);
    }

    @Override
    public int PirxtotalByFournisseur(Long id) {
        return factureRepository.PirxtotalByFournisseur(id);
    }

    @Override
    public int nbrFactureByFournisseur(Long id) {
        return factureRepository.nbrFactureByFournisseur(id);
    }

    @Override
    public int nbrPtByFournisseurByType(Long id, String type) {
        return factureRepository.nbrPtByFournisseurByType(id, type);
    }

    @Override
    public int TotalPtByFournisseurByType(Long id, String type) {
        return factureRepository.TotalPtByFournisseurByType(id, type);
    }

}
