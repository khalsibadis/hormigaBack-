package com.example.projetHormiga.service;

import com.example.projetHormiga.entities.Facture;
import com.example.projetHormiga.entities.User;

import java.util.List;

public interface UserService {
    public List<Facture> FACTURE_LIST(Long Id);
    public void addUser(User user);


}
