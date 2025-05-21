/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.models.Guardias;
import com.transmetro.repositories.GuardiasRepository;
import com.transmetro.services.GuardiasSvc;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class GuardiasSvcImpl implements GuardiasSvc {

    @Autowired
    private GuardiasRepository guardiasRepository;

    @Override
    public List<Guardias> obtenerTodos() {
        return guardiasRepository.findAll();
    }

    @Override
    public Optional<Guardias> obtenerPorId(Integer id) {
        return guardiasRepository.findById(id);
    }

    @Override
    public Guardias crear(Guardias guardia) {
        return guardiasRepository.save(guardia);
    }

    @Override
    public Optional<Guardias> actualizar(Integer id, Guardias datos) {
        return guardiasRepository.findById(id).map(g -> {
            g.setNombreCompleto(datos.getNombreCompleto());
            g.setIdAcceso(datos.getIdAcceso());
            g.setTurno(datos.getTurno());
            return guardiasRepository.save(g);
        });
    }

    @Override
    public boolean eliminar(Integer id) {
        if (guardiasRepository.existsById(id)) {
            guardiasRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
