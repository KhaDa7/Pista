package com.example.Pista.service;

import com.example.Pista.dao.AutoDao;
import com.example.Pista.dao.PilotaDao;
import com.example.Pista.model.Auto;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Auto getAutoById(int id) {
        Optional<Auto> optionalAuto = autoDao.findById(id);
        if(optionalAuto.isPresent()){
            return optionalAuto.get();
        }
        return null;
    }
}
