package com.example.Pista.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/prenotazioni"})
public class PrenotazioniController {
    @Autowired
    private PrenotazioneService prenotazioneService;
    @Autowired
    UtenteService utenteService;

    public PrenotazioniController() {
    }

    @GetMapping
    public String getPage(Model model, HttpSession session, @RequestParam(name = "error",required = false) String error) {
        Utente utente = (Utente)session.getAttribute("utente");
        Pilota pilota = (Pilota)session.getAttribute("pilota");
        if (utente == null) {
            return "redirect:/login";
        } else {
            model.addAttribute("error", error);
            model.addAttribute("pilota", pilota);
            model.addAttribute("utente", utente);
            Prenotazione prenotazione = new Prenotazione();
            model.addAttribute("prenotazione", prenotazione);
            return "prenotazioni";
        }
    }

    @PostMapping
    public String inviaPage(@ModelAttribute("prenotazione") Prenotazione prenotazione, @RequestParam("auto") int idAuto, @RequestParam("dataCorsa") String data, @RequestParam("pilota") int idPilota, @RequestParam("pagamento") int idPagamento, HttpSession session, Model model) {
        if (!this.prenotazioneService.controlloPrenotazione(LocalDate.parse(data))) {
            return "redirect:/prenotazioni?error";
        } else {
            this.prenotazioneService.inviaPrenotazione(session, idAuto, data, idPilota, idPagamento);
            return "redirect:/riservatautente";

        }
    }

}
