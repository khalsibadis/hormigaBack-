package com.example.projetHormiga.repository;

import com.example.projetHormiga.entities.Facture;
import com.example.projetHormiga.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select e.factures from User e where e.Id=:id")
    public List<Facture> FACTURE_LIST(@Param("id") Long Id);

}
