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
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dettagliauto")
public class DettagliAutoController {

    @Autowired
    AutoService autoService;

    @GetMapping
    public String getPage(@RequestParam("id") int id, Model model, HttpSession session) {
        Utente utente = (Utente) session.getAttribute("utente");
        model.addAttribute("utente", utente);
        Auto auto = autoService.getAutoById(id);
        model.addAttribute("auto", auto);
        if(session.getAttribute("utente") != null) {
            model.addAttribute("loggedIn", true);
        }else{
            model.addAttribute("loggedIn", false);
        }
        return "dettagliauto";
    }
}
