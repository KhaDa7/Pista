package com.example.Pista.service;

import com.example.Pista.model.Utente;
import jakarta.servlet.http.HttpSession;

public interface UtenteService
{
    void registraUtente (Utente utente);
    boolean controlloUsername(String username);
    boolean loginUtente (String username, String password, HttpSession session);
    boolean controlloEmail (String email);
}
