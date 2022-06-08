package com.example.projetHormiga.service;

import com.example.projetHormiga.entities.Fournisseur;
import com.example.projetHormiga.entities.TypeFactures;
import com.example.projetHormiga.repository.FournisseurRepository;
import com.example.projetHormiga.repository.TypeFactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TypeFactureServiceImpl implements ITypeFacture {
    @Autowired
    TypeFactureRepository typeFactureRepository;
    @Autowired
    FournisseurRepository fournisseurRepository;
    @Override
    public void AddTypeFacture(TypeFactures typeFactures,Long idF) {
        typeFactureRepository.save(typeFactures);
        Fournisseur fournisseur =fournisseurRepository.findById(idF).orElse(null);
        typeFactures.setFournisseur(fournisseur);

    }

    @Override
    public void SupprimerTypeFacture(Long id) {
        typeFactureRepository.deleteById(id);
    }

    @Override
    public void UpdateTypeFacture(TypeFactures typeFactures) {
        typeFactureRepository.save(typeFactures);
    }

    @Override
    public List<TypeFactures> AfficherListeTypeFacture() {
        return typeFactureRepository.findAll();
    }

    @Override
    public List<TypeFactures> AfficherListeTypeFactureByUser(Long IdF) {
        return typeFactureRepository.AfficherListeTypeFactureByUser(IdF);
    }
}
