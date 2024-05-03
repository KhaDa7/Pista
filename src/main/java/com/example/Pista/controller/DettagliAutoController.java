package com.example.Pista.controller;

import com.example.Pista.model.Auto;
import com.example.Pista.service.AutoService;
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
    public String getPage(@RequestParam("id") int id, Model model) {
        Auto auto = autoService.getAutoById(id);
        model.addAttribute("auto", auto);
        return "dettagliauto";
    }
}
