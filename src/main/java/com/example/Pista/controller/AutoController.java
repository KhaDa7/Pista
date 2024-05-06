package com.example.Pista.controller;

import com.example.Pista.model.Auto;
import com.example.Pista.model.Utente;
import com.example.Pista.service.AutoService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auto")
public class AutoController {

    @Autowired
    private AutoService autoService;

    @GetMapping
    public String getPage(Model model, HttpSession session) {
        Utente utente = (Utente) session.getAttribute("utente");
        model.addAttribute("utente", utente);
        Auto auto = (Auto) session.getAttribute("auto");
        model.addAttribute("auto", auto);
        model.addAttribute("listaAuto", autoService.getListaAuto(session));
        if(session.getAttribute("utente") != null) {
            model.addAttribute("loggedIn", true);
        }else{
            model.addAttribute("loggedIn", false);
        }
        return "auto";
    }
}
