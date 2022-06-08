package com.example.projetHormiga.controller;

import com.example.projetHormiga.entities.Facture;
import com.example.projetHormiga.entities.Fournisseur;
import com.example.projetHormiga.service.FactureService;
import com.example.projetHormiga.service.FournisseurService;
import com.example.projetHormiga.service.LoginServiceImpl;
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
    @Autowired
    LoginServiceImpl loginService;

    @PostMapping("/ajouterFacture/{idFournisseur}/{idType}")
    //@RequestMapping(value = "/ajouterFacture/{idFournisseur}", method = RequestMethod.POST)
    public void ajouterFacture(@RequestBody Facture facture, @PathVariable("idFournisseur") Long idFournisseur,@PathVariable("idType") Long idType) {
        factureService.ajouterFacture(facture, idFournisseur,idType);
    }

    @PutMapping("/modifierFacture/{id}")
    public void modifierFacture(@RequestBody Facture facture,@PathVariable("id") Long idT) {
        factureService.modifierFacture(facture,idT);
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

    @GetMapping("/Login/{User}/{pass}")
    public Fournisseur auth(@PathVariable("User") String userName , @PathVariable("pass") String pass){
        return loginService.auth(userName, pass);
    }


    @GetMapping("afficherFacture/{idFacture}")
    @ResponseBody
    public Facture afficherFacturebyId(@PathVariable("idFacture") Long idFacture) {
        return factureService.afficherFacturebyId(idFacture);
    }
    @GetMapping("/nbrPoint/{id}")
    @ResponseBody
    public int NbrPointByFournisseur(@PathVariable("id") Long id){
        return factureService.NbrPointByFournisseur(id);
    }

    @GetMapping("/PirxtotalByFournisseur/{id}")
    @ResponseBody
    public int PirxtotalByFournisseur(@PathVariable("id") Long id){

        return factureService.PirxtotalByFournisseur(id);
    }
    @GetMapping("/nbrFactureByFournisseur/{id}")
    @ResponseBody
    public int nbrFactureByFournisseur(@PathVariable("id") Long id){

        return factureService.nbrFactureByFournisseur(id);
    }

    @GetMapping("/nbrPtByFournisseurByType/{id}/{type}")
    @ResponseBody
    public int nbrPtByFournisseurByType(@PathVariable("id") Long id,@PathVariable("type") String type){

        return factureService.nbrPtByFournisseurByType(id, type);
    }
    @GetMapping("/TotalPtByFournisseurByType/{id}/{type}")
    @ResponseBody
    public int TotalPtByFournisseurByType(@PathVariable("id") Long id,@PathVariable("type")String type){

        return factureService.TotalPtByFournisseurByType(id, type);
    }
}
