package com.example.Pista.service;

import com.example.Pista.dao.UtenteDao;
import com.example.Pista.model.Utente;
import jakarta.servlet.http.HttpSession;
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


    @Override
    public boolean loginUtente(String username, String password, HttpSession session) {
        Utente utente = utenteDao.findByProfiloUsernameAndProfiloPassword(username, password);
                if (utente != null)
                {
                    session.setAttribute("utente", utente);
                    return true;
                }
        return false;
    }
}

