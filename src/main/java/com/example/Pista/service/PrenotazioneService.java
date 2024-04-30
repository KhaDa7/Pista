package com.example.Pista.service;

import com.example.Pista.model.Prenotazione;
import jakarta.servlet.http.HttpSession;

import java.time.LocalDate;

public interface PrenotazioneService {
    void inviaPrenotazione(HttpSession session, int idAuto, String data,int idPilota, int idPagamento);
    boolean controlloPrenotazione(LocalDate data);
    void registraPrenotazione(Prenotazione prenotazione);
}
