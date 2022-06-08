package com.example.projetHormiga.controller;

import com.example.projetHormiga.entities.TypeFactures;
import com.example.projetHormiga.service.ITypeFacture;
import com.example.projetHormiga.service.TypeFactureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = ("*"))
@RestController
@RequestMapping("TypeFacture")
public class TypeFactureController {
@Autowired
    ITypeFacture iTypeFacture;
@PostMapping("Post/{idf}")
    public void AddTypeFacture(@RequestBody TypeFactures typeFactures,@PathVariable("idf") Long idF) {
        iTypeFacture.AddTypeFacture(typeFactures,idF);
    }
@DeleteMapping("Delete/{id}")
    public void SupprimerTypeFacture(@PathVariable("id") Long id) {
    iTypeFacture.SupprimerTypeFacture(id);
    }
    @PutMapping("Put")
    public void UpdateTypeFacture(TypeFactures typeFactures) {
    iTypeFacture.UpdateTypeFacture(typeFactures);
    }
    @GetMapping("GetAll")
    public List<TypeFactures> AfficherListeTypeFacture() {
        return iTypeFacture.AfficherListeTypeFacture();
    }
    @GetMapping("Get/{IdF}")
    public List<TypeFactures> AfficherListeTypeFactureByUser( @PathVariable("IdF") Long IdF) {
        return iTypeFacture.AfficherListeTypeFactureByUser(IdF);
    }




    }
