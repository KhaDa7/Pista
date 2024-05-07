package com.example.Pista.controller;

import com.example.Pista.model.Utente;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String getPage(@RequestParam(name = "back", required = false) String back, HttpSession session, Model model) {
        model.addAttribute("back", back);
        Utente utente = (Utente) session.getAttribute("utente");
        model.addAttribute("utente", utente);
        if(session.getAttribute("utente") != null) {
            model.addAttribute("loggedIn", true);
        }else{
            model.addAttribute("loggedIn", false);
        }
        return "home";
    }
}