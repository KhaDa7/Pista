package com.example.Pista.service;

import com.example.Pista.dao.UtenteDao;
import com.example.Pista.model.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteServiceImpl implements UtenteService
{
    @Autowired
    private UtenteDao utenteDao;
    @Override
    public void registraUtente(Utente utente)
    {
        utenteDao.save(utente);

    }

    @Override
    public boolean controlloUsername(String username)
    {
        if (utenteDao.findByProfiloUsername(username) == null) {
            return true;
        }
        return false;
    }
}

