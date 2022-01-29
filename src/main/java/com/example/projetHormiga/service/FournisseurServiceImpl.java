package com.example.projetHormiga.service;

import com.example.projetHormiga.entities.Fournisseur;
import com.example.projetHormiga.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void afficherFournisseurById(Long id) {
        Fournisseur fournisseur=fournisseurRepository.findById(id).orElse(null);
    }
}
