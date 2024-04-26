package com.example.Pista.dao;

import com.example.Pista.model.Auto;
import org.springframework.data.repository.CrudRepository;

public interface AutoDao extends CrudRepository <Auto, Integer> {
}
