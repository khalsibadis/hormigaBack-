package com.example.projetHormiga.repository;

import com.example.projetHormiga.entities.Facture;
import com.example.projetHormiga.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {

    //@Query("select u.factures from Fournisseur u join u.factures f where u.id=:id and f.EtatPayement='Non' ")
   // List<Facture> afficherFacturebyFournisseur(@Param("id") Long idFournisseur);

    @Query("select u from Facture u  where u.fournisseur.id=:id and u.EtatPayement='Non' ")
    List<Facture> afficherFactureCreditbyFournisseur(@Param("id") Long idFournisseur);

    @Query("select u from Facture u  where u.fournisseur.id=:id ")
    List<Facture> afficherFacturebyFournisseur(@Param("id") Long idFournisseur);

    @Query("select u from Fournisseur u where u.role='FOURNISSEUR'")
    public List<Fournisseur> afficherListeFournisseur();

    @Query("select u from Fournisseur u where u.role='CLIENT'")
    public List<Fournisseur> afficherListeClient();

    @Query("select u from Fournisseur u where u.UserName=:user")
    public Fournisseur LoginByUserName(@Param("user")String user);
}
