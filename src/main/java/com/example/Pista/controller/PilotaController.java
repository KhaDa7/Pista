package com.example.Pista.controller;

import com.example.Pista.model.Pilota;
import com.example.Pista.service.PilotaService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/piloti")
public class PilotaController {

    @Autowired
    PilotaService pilotaService;

    @GetMapping
    public String getPage(Model model, HttpSession session) {
        Pilota pilota =(Pilota) session.getAttribute("pilota");
        model.addAttribute("pilota", pilota);
        model.addAttribute("piloti", pilotaService.getListaPiloti(session));
        return "piloti";
    }
}
