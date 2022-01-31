package com.example.projetHormiga.service;

import com.example.projetHormiga.entities.Facture;
import com.example.projetHormiga.entities.Fournisseur;
import com.example.projetHormiga.entities.User;
import com.example.projetHormiga.repository.FactureRepository;
import com.example.projetHormiga.repository.FournisseurRepository;
import com.example.projetHormiga.repository.UserRepository;
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
    UserRepository userRepository;

    @Override
    @Transactional
    public void ajouterFacture(Facture facture, Long idFournisseur, Long idUser ) {
        Fournisseur fournisseur = fournisseurRepository.findById(idFournisseur).orElse(null);
        User user = userRepository.findById(idUser).orElse(null);
        factureRepository.save(facture);
        facture.setFournisseur(fournisseur);
        facture.setUser(user);

    }

    @Override
    public void modifierFacture(Facture facture) {
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
    public List <Facture> afficherFacturebyFournisseur(Long idFournisseur) {
         List<Facture> f = factureRepository.afficherFacturebyFournisseur(idFournisseur);
        return f;
    }
}
