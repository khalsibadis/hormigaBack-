package com.example.projetHormiga.repository;

import com.example.projetHormiga.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface FactureRepository extends JpaRepository<Facture,Long> {


    @Query("select u from Facture u join u.fournisseur d where d.id=:id ")
    List <Facture> afficherFacturebyFournisseur(@Param("id") Long idFournisseur);
}
