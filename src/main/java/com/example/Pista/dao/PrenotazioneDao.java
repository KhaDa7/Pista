package com.example.Pista.dao;

import com.example.Pista.model.Prenotazione;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;

public interface PrenotazioneDao extends CrudRepository<Prenotazione, Integer> {
    Prenotazione findByDataCorsa(LocalDate dataCorsa);
}
