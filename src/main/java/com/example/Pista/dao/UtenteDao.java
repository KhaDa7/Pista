package com.example.Pista.dao;

import com.example.Pista.model.Utente;
import org.springframework.data.repository.CrudRepository;

public interface UtenteDao extends CrudRepository <Utente, Integer> {
    Utente findByProfiloUsername(String username);
    Utente findByProfiloUsernameAndProfiloPassword(String username, String password);
}
