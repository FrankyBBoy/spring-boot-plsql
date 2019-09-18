package com.example.queryplsql.intervenant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IntervenantService {

    @Autowired
    IntervenantDao intervenantDao;

    public Optional<Intervenant> getIntervenant(int id) {
        return this.intervenantDao.findById(id);
    }
}
