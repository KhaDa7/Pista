package com.example.Pista.service;

import com.example.Pista.model.Prenotazione;
import jakarta.servlet.http.HttpSession;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneService {
    void inviaPrenotazione(HttpSession session, int idAuto, String data,int idPilota, int idPagamento);
    boolean controlloPrenotazione(LocalDate data);
    List<Prenotazione> getListaPrenotazioni(HttpSession session);
    void rimuoviPrenotazioneDaLista(int idPrenotazione, HttpSession session);
}
