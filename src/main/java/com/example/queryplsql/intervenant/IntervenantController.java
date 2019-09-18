package com.example.queryplsql.intervenant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("intervenant")
public class IntervenantController {

    @Autowired
    IntervenantService intervenantService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Intervenant> getIntervenant(@PathVariable String id)
    {
        int francisId = Integer.parseInt(id);
        return intervenantService.getIntervenant(francisId);
    }
}
