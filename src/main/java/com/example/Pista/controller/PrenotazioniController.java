package com.example.Pista.controller;

import com.example.Pista.model.Prenotazione;
import com.example.Pista.model.Utente;
import com.example.Pista.service.PrenotazioneService;
import com.example.Pista.service.UtenteService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/prenotazioni")
public class PrenotazioniController
{
    @Autowired
    private PrenotazioneService prenotazioneService;

    @Autowired
    UtenteService utenteService;

    @GetMapping
    public String getPage (Model model) {
        Prenotazione prenotazione = new Prenotazione();
        model.addAttribute("prenotazione", prenotazione);
        return "prenotazione";
    }

    @PostMapping ("/invia")
    public String inviaPage (HttpSession session ) {
        prenotazioneService.inviaPrenotazione(session);
        return "redirect:/riservatautente?send";
    }
}