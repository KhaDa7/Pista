package com.example.Pista.service;

import com.example.Pista.model.Utente;

public interface UtenteService
{
    void registraUtente (Utente utente);
    boolean controlloUsername(String username);
}
