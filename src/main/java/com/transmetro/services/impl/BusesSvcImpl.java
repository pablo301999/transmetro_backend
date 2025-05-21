/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.models.Buses;
import com.transmetro.repositories.BusesRepository;
import com.transmetro.services.BusesSvc;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class BusesSvcImpl implements BusesSvc {

    @Autowired
    private BusesRepository busesRepository;

    @Override
    public List<Buses> obtenerTodos() {
        return busesRepository.findAll();
    }

    @Override
    public Optional<Buses> obtenerPorId(Integer id) {
        return busesRepository.findById(id);
    }

    @Override
    public Buses crear(Buses bus) {
        return busesRepository.save(bus);
    }

    @Override
    public Optional<Buses> actualizar(Integer id, Buses datos) {
        return busesRepository.findById(id).map(b -> {
            b.setNumeroBus(datos.getNumeroBus());
            b.setCapacidad(datos.getCapacidad());
            b.setIdLinea(datos.getIdLinea());
            b.setIdParqueo(datos.getIdParqueo());
            b.setActivo(datos.getActivo());
            return busesRepository.save(b);
        });
    }

    @Override
    public boolean eliminar(Integer id) {
        if (busesRepository.existsById(id)) {
            busesRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
