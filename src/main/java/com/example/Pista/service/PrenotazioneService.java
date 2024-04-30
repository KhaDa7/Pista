package com.example.Pista.service;

import jakarta.servlet.http.HttpSession;

public interface PrenotazioneService {
    void inviaPrenotazione(HttpSession session, int idAuto, String data, int idPagamento);
}
