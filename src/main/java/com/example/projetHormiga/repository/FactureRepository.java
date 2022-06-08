package com.example.projetHormiga.repository;

import com.example.projetHormiga.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface FactureRepository extends JpaRepository<Facture,Long> {

    @Query("select sum(u.nbrPoint) from Facture u where u.fournisseur.id=:id")
    public int TotalPointByFournisseur(@Param("id") Long id);
    @Query("select sum(u.Total) from Facture u where u.fournisseur.id=:id")
    public int PirxtotalByFournisseur(@Param("id") Long id);
    @Query("select count(u.Total) from Facture u where u.fournisseur.id=:id")
    public int nbrFactureByFournisseur(@Param("id") Long id);
    @Query("select count(u.nbrPoint) from Facture u where u.fournisseur.id=:id and u.typeFactures=:type")
    public int nbrPtByFournisseurByType(@Param("id") Long id,String type);
    @Query("select sum(u.nbrPoint) from Facture u where u.fournisseur.id=:id and u.typeFactures=:type")
    public int TotalPtByFournisseurByType(@Param("id") Long id,String type);
}
