package com.example.Pista.controller;

import com.example.Pista.model.Utente;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chisiamo")
public class ChiSiamoController {
    @GetMapping
    public String getPage(HttpSession session, Model model) {
        Utente utente = (Utente) session.getAttribute("utente");
        model.addAttribute("utente", utente);
        if(session.getAttribute("utente") != null) {
            model.addAttribute("loggedIn", true);
        }else{
            model.addAttribute("loggedIn", false);
        }
        return "chisiamo";
    }
}
