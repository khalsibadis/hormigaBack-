package com.example.projetHormiga.service;

import com.example.projetHormiga.entities.Fournisseur;

public interface ILoginService  {
    public Fournisseur auth(String userName , String pass);
}
