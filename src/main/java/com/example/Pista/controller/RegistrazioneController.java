package com.example.Pista.controller;

import com.example.Pista.model.Pilota;
import com.example.Pista.model.Utente;
import com.example.Pista.service.UtenteService;

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
@RequestMapping ("/registrazione")
public class RegistrazioneController
{
    @Autowired
    UtenteService utenteService;
    @GetMapping
    public String getPage(Model model) {
        Utente utente = new Utente();
        model.addAttribute("utente" , utente);
        return "registrazione";
    }
    //--------REGISTRAZIONE---------
    @PostMapping
    public String formManager (
            @Valid @ModelAttribute("utente") Utente utente,
            BindingResult result,
            Model model)
    {
        if(result.hasErrors())
            return "registrazione";
        if(!utenteService.controlloUsername(utente.getProfilo().getUsername()))
        {
            model.addAttribute("error", "Username già utilizzato");
            return "registrazione";
        }
        if (!utenteService.controlloEmail(utente.getProfilo().getEmail())){
            model.addAttribute("errormail", "Email già utilizzata");
            return "registrazione";
        }
        utenteService.registraUtente(utente);
        return "redirect:/login";
    }
}
