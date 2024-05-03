package com.example.Pista.service;

import com.example.Pista.dao.PilotaDao;
import com.example.Pista.model.Pilota;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PilotaServiceImpl implements PilotaService {
    @Autowired
    PilotaDao pilotaDao;

    @Override
    public List<Pilota> getListaPiloti(HttpSession session) {
        return (List<Pilota>) pilotaDao.findAll();
    }

    @Override
    public Pilota getPilotaById(int id) {
        Optional<Pilota> optionalPilota = pilotaDao.findById(id);
        if(optionalPilota.isPresent()){
            return optionalPilota.get();
        }
        return null;
    }
}
