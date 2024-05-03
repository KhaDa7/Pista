package com.example.Pista.controller;

import com.example.Pista.model.Pilota;
import com.example.Pista.service.PilotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dettaglipilota")
public class DettagliPilotaController {

    @Autowired
    PilotaService pilotaService;

    @GetMapping
    public String getPage(@RequestParam("id") int id, Model model) {
        Pilota pilota = pilotaService.getPilotaById(id);
        model.addAttribute("pilota", pilota);
        return "dettaglipilota";
    }
}
