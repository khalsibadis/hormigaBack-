package com.example.projetHormiga.repository;

import com.example.projetHormiga.entities.TypeFactures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeFactureRepository extends JpaRepository<TypeFactures,Long> {
    @Query("select t from TypeFactures t where t.fournisseur.id=:id")
    List<TypeFactures> AfficherListeTypeFactureByUser(@Param("id") Long id) ;

}
