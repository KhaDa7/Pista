package com.example.Pista.service;

import com.example.Pista.dao.AutoDao;
import com.example.Pista.dao.PagamentoDao;
import com.example.Pista.dao.PilotaDao;
import com.example.Pista.dao.PrenotazioneDao;
import com.example.Pista.model.Prenotazione;
import com.example.Pista.model.Utente;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class PrenotazioneServiceImpl implements PrenotazioneService {
    @Autowired
    PrenotazioneDao prenotazioneDao;
    @Autowired
    AutoDao autoDao;
    @Autowired
    PagamentoDao pagamentoDao;
    @Autowired
    PilotaDao pilotaDao;

    @Override
    public void inviaPrenotazione(HttpSession session, int idAuto, String data, int idPagamento) {
        Utente utente = (Utente) session.getAttribute("utente");
        if(utente != null){
            Prenotazione prenotazione = new Prenotazione();
            prenotazione.setUtente(utente);
            prenotazione.setDataCorsa(LocalDate.parse(data));
            prenotazione.setDataOraPagamento(LocalDateTime.now());
            prenotazione.setAuto(autoDao.findById(idAuto).get());
            prenotazione.setPilota(pilotaDao.findById(1L).get());
            prenotazione.setPagamento(pagamentoDao.findById(idPagamento).get());
            prenotazioneDao.save(prenotazione);
        }
    }
}
