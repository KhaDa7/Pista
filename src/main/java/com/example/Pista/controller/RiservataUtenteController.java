package com.example.Pista.controller;

import com.example.Pista.model.Auto;
import com.example.Pista.model.Pilota;
import com.example.Pista.model.Prenotazione;
import com.example.Pista.model.Utente;
import com.example.Pista.service.PrenotazioneService;
import jakarta.servlet.http.HttpSession;
import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/riservatautente")
public class RiservataUtenteController {

    @Autowired
    PrenotazioneService prenotazioneService;

    @GetMapping
    public String getPage(
            HttpSession session,
            Model model,
            @RequestParam(name = "send", required = false) String send)
    {
        if(session.getAttribute("utente") == null)
            return "redirect:/login";
        Utente utente = (Utente) session.getAttribute("utente");
        int idUtente = utente.getId();
        Prenotazione prenotazione = (Prenotazione) session.getAttribute("prenotazione");
        List<Prenotazione> listaPrenotazioni = prenotazioneService.getListaPrenotazioniById(session, idUtente);
        Auto auto = (Auto) session.getAttribute("auto");
        Pilota pilota =(Pilota) session.getAttribute("pilota");
        model.addAttribute("pilota", pilota);
        model.addAttribute("auto", auto);
        model.addAttribute("prenotazione", prenotazione);
        model.addAttribute("lista", listaPrenotazioni);
        model.addAttribute("utente",utente);
        model.addAttribute("send" , send);
        return "riservatautente";
    }

    @GetMapping("/logout")
    public String logoutUtente(HttpSession session, Model model)
    {
        // session.invalidate();
        session.removeAttribute("utente");
        return "redirect:/?back";
    }

    @GetMapping("/elimina")
    public String eliminaPrenotazione(@RequestParam("id") int id, HttpSession session){
        prenotazioneService.rimuoviPrenotazioneDaLista(id, session);
        return "redirect:/riservatautente";
    }
}