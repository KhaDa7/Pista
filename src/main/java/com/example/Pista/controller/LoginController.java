package com.example.Pista.controller;

import com.example.Pista.service.UtenteService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping ("/login")
public class LoginController
{
    @Autowired
    private UtenteService utenteService;

    @GetMapping
    public String getPage(HttpSession session,
                          @RequestParam (name="error", required = false) String error,
                          Model model)
    {
        if(session.getAttribute("utente") != null)
            return "redirect:/";
        model.addAttribute("error", error);
        return "login";
    }

    @PostMapping
    public String formManager (
            @RequestParam ("username") String username,
            @RequestParam ("password") String password,
            HttpSession session)
    {
        if(!utenteService.loginUtente(username, password, session))
            return "redirect:/login?error";
        return "redirect:/";
    }

}
