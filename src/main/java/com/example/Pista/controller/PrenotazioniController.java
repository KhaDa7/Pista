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
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping ("/prenotazioni")
public class PrenotazioniController
{
    @Autowired
    private PrenotazioneService prenotazioneService;

    @Autowired
    UtenteService utenteService;

    @GetMapping
    public String getPage (Model model, HttpSession session) {
        Utente utente = (Utente) session.getAttribute("utente");
        if(utente == null){
            return "redirect:/login";
        }
        model.addAttribute("utente", utente);
        Prenotazione prenotazione = new Prenotazione();
        model.addAttribute("prenotazione", prenotazione);
        return "prenotazioni";
    }

    @PostMapping
    public String inviaPage (@RequestParam("auto") int idAuto,@RequestParam("dataCorsa") String data,@RequestParam("pagamento") int idPagamento, HttpSession session) {
        prenotazioneService.inviaPrenotazione(session,idAuto,data,idPagamento);
        return "redirect:/riservatautente?send";
    }
}
