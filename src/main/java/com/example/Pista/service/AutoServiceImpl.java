package com.example.Pista.service;

import com.example.Pista.dao.AutoDao;
import com.example.Pista.dao.PilotaDao;
import com.example.Pista.model.Auto;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoServiceImpl implements AutoService {
    @Autowired
    private AutoDao autoDao;
    @Autowired
    private PilotaDao pilotaDao;

    @Override
    public List<Auto> getListaAuto(HttpSession session) {
        return (List<Auto>) autoDao.findAll();
    }
}
