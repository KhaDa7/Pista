package com.example.Pista.controller;

import com.example.Pista.model.Pilota;
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

import java.time.LocalDate;

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
        Pilota pilota = (Pilota) session.getAttribute("pilota");
        if(utente == null){
            return "redirect:/login";
        }
        session.setAttribute("utente", utente);
        model.addAttribute("pilota", pilota);
        model.addAttribute("utente", utente);
        Prenotazione prenotazione = new Prenotazione();
        model.addAttribute("prenotazione", prenotazione);
        return "prenotazioni";
    }

    @PostMapping
    public String inviaPage (@ModelAttribute("prenotazione") Prenotazione prenotazione,
                             @RequestParam("auto") int idAuto,
                             @RequestParam("dataCorsa") String data,
                             @RequestParam("pilota") int idPilota,
                             @RequestParam("pagamento") int idPagamento,
                             HttpSession session,BindingResult result,
                             Model model) {
        prenotazioneService.inviaPrenotazione(session,idAuto,data,idPilota,idPagamento);
        if(result.hasErrors())
            return "prenotazioni";
        if(!prenotazioneService.controlloPrenotazione(prenotazione.getDataCorsa()))
        {
            model.addAttribute("error", "Data già prenotata");
            return "prenotazioni";
        }

        prenotazioneService.registraPrenotazione(prenotazione);
        return "redirect:/riservatautente";
    }

}
