package com.example.projetHormiga.controller;

import com.example.projetHormiga.entities.Facture;
import com.example.projetHormiga.service.FactureService;
import com.example.projetHormiga.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("Facture")
public class FactureRestController {
    @Autowired
    FournisseurService fournisseurService;
    @Autowired
    FactureService factureService;

    @PostMapping("/ajouterFacture/{idFournisseur}")
    public void ajouterFacture(@RequestBody Facture facture, @PathVariable("idFournisseur") Long idFournisseur) {
        factureService.ajouterFacture(facture, idFournisseur);
    }

    @PutMapping("/modifierFacture")
    public void modifierFacture(@RequestBody Facture facture) {
        factureService.modifierFacture(facture);
    }

    @DeleteMapping("/supprimerFacture/{id}")
    public void supprimerFacture(@PathVariable("id") Long id) {
        factureService.supprimerFacture(id);
    }


    @GetMapping("/AfficherList")
    @ResponseBody
    public List<Facture> factures(Facture facture) {
        return factureService.factures(facture);
    }


    @GetMapping("afficherFacture/{idFacture}")
    @ResponseBody
    public Facture afficherFacturebyId(@PathVariable("idFacture") Long idFacture) {
        return factureService.afficherFacturebyId(idFacture);
    }

}
