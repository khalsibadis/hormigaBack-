package com.example.projetHormiga.service;

import com.example.projetHormiga.entities.Facture;
import com.example.projetHormiga.entities.Fournisseur;
import com.example.projetHormiga.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurServiceImpl implements FournisseurService {
    @Autowired
    FournisseurRepository fournisseurRepository;

    @Override
    public void addFournisseur(Fournisseur fournisseur) {
        fournisseurRepository.save(fournisseur);
    }

    @Override
    public void supprimerFournisseur(Long id) {
        fournisseurRepository.deleteById(id);
    }

    @Override
    public void updateFrounisseur(Fournisseur fournisseur) {
        fournisseurRepository.save(fournisseur);

    }

    @Override
    public List<Fournisseur> afficherListe() {
        return fournisseurRepository.findAll();
    }

    @Override
    public List<Fournisseur> afficherListeFournisseur() {
        return fournisseurRepository.afficherListeFournisseur();
    }

    @Override
    public List<Fournisseur> afficherListeClient() {
        return fournisseurRepository.afficherListeClient();
    }

    @Override
    public Fournisseur afficherFournisseurById(Long id) {
        Fournisseur fournisseur=fournisseurRepository.findById(id).orElse(null);
        return fournisseur;
    }

    @Override
    public List<Facture> afficherFactureCreditbyFournisseur(Long idFournisseur) {
        return fournisseurRepository.afficherFactureCreditbyFournisseur(idFournisseur);
    }
    @Override
    public List<Facture> afficherFacturebyFournisseur(Long idFournisseur) {
        return fournisseurRepository.afficherFacturebyFournisseur(idFournisseur);
    }

}
