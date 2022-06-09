package com.example.projetHormiga.service;

import com.example.projetHormiga.entities.TypeFactures;

import java.util.List;

public interface ITypeFacture {
    public void AddTypeFacture(TypeFactures typeFactures,Long idF);
    void SupprimerTypeFacture(Long id);
    public void UpdateTypeFacture(TypeFactures typeFactures);
    public List<TypeFactures> AfficherListeTypeFacture();
    public List<TypeFactures> AfficherListeTypeFactureByUser(Long IdF);
    public TypeFactures GetTypeFactureById(Long idType);

}
