package com.example.Pista.service;

import com.example.Pista.model.Auto;
import jakarta.servlet.http.HttpSession;

import java.util.List;

public interface AutoService {
    List<Auto> getListaAuto(HttpSession session);
}
