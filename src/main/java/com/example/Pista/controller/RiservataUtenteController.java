package com.example.Pista.controller;

import com.example.Pista.model.Prenotazione;
import com.example.Pista.model.Utente;
import jakarta.servlet.http.HttpSession;
import jdk.jfr.Registered;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/riservatautente")
public class RiservataUtenteController {
    @GetMapping
    public String getPage(
            HttpSession session,
            Model model,
            @RequestParam(name = "send", required = false) String send)
    {
        if(session.getAttribute("utente") == null)
            return "redirect:/login";
        Utente utente = (Utente) session.getAttribute("utente");
        Prenotazione prenotazione = (Prenotazione) session.getAttribute("prenotazione");
        model.addAttribute("prenotazione", prenotazione);
        model.addAttribute("utente",utente);
        model.addAttribute("send" , send);
        return "riservatautente";
    }

    @GetMapping("/logout")
    public String logoutUtente(HttpSession session)
    {
        // session.invalidate();
        session.removeAttribute("utente");
        return "redirect:/";
    }
}
