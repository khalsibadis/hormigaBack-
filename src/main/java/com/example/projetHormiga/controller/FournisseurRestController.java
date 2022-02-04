package com.example.projetHormiga.controller;

import com.example.projetHormiga.entities.Facture;
import com.example.projetHormiga.entities.Fournisseur;
import com.example.projetHormiga.service.AdminService;
import com.example.projetHormiga.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
    @RestController
    @RequestMapping("Fournisseur")
public class FournisseurRestController {
    @Autowired
    AdminService adminService;
    @Autowired
    FournisseurService fournisseurService;

    @PostMapping("/ajout")
    public void addFournisseur(@RequestBody Fournisseur fournisseur) {
        fournisseurService.addFournisseur(fournisseur);
    }

    @DeleteMapping("/delete/{id}")
    public void supprimerFournisseur(@PathVariable("id") Long id) {
        fournisseurService.supprimerFournisseur(id);
    }

    @PutMapping("/update")
    public void updateFrounisseur(@RequestBody Fournisseur fournisseur) {
        fournisseurService.updateFrounisseur(fournisseur);
    }

    @GetMapping("/List")
    @ResponseBody
    public List<Fournisseur> afficherListe() {
        return fournisseurService.afficherListe();
    }

    @GetMapping("/affichierFactureByFournisseur/{id}")
    @ResponseBody
    public List<Facture> afficherFacturebyFournisseur(@PathVariable("id") Long idFournisseur) {
        return fournisseurService.afficherFacturebyFournisseur(idFournisseur);

    }
}