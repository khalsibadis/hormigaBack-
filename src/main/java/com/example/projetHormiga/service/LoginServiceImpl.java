package com.example.projetHormiga.service;

import com.example.projetHormiga.entities.Fournisseur;
import com.example.projetHormiga.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoginServiceImpl implements ILoginService {
    @Autowired
    FournisseurRepository fournisseurRepository;

    @Override
    public Fournisseur auth(String userName, String pass) {
        Fournisseur fournisseurs=fournisseurRepository.LoginByUserName(userName);
        //for (Fournisseur fournisseur:fournisseurs){
        System.out.println(pass==fournisseurs.getPassword()+"tttttttttttttttttt");
        System.out.println(pass+"tttttttttttttttttt");
        System.out.println(fournisseurs.getPassword()+"tttttttttttttttttt");


        if ( pass.equals(fournisseurs.getPassword())){
            System.out.println(fournisseurs.getId()+fournisseurs.getUserName()+"tttttttttttttttttt");

            return fournisseurs;
        }
        //}
        return null;
    }
}
