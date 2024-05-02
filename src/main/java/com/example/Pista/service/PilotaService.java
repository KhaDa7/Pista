package com.example.Pista.service;

import com.example.Pista.model.Pilota;
import jakarta.servlet.http.HttpSession;

import java.util.List;

public interface PilotaService {
    List<Pilota> getListaPiloti(HttpSession session);
}
