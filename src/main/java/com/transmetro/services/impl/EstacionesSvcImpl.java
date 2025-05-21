/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.models.Estaciones;
import com.transmetro.repositories.EstacionesRepository;
import com.transmetro.services.EstacionesSvc;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class EstacionesSvcImpl implements EstacionesSvc {

    @Autowired
    private EstacionesRepository estacionesRepository;

    @Override
    public List<Estaciones> obtenerTodas() {
        return estacionesRepository.findAll();
    }

    @Override
    public Optional<Estaciones> obtenerPorId(Integer id) {
        return estacionesRepository.findById(id);
    }

    @Override
    public Estaciones crear(Estaciones estacion) {
        return estacionesRepository.save(estacion);
    }

    @Override
    public Optional<Estaciones> actualizar(Integer id, Estaciones datos) {
        return estacionesRepository.findById(id).map(e -> {
            e.setNombre(datos.getNombre());
            e.setUbicacion(datos.getUbicacion());
            e.setMunicipalidad(datos.getMunicipalidad());
            e.setActiva(datos.getActiva());
            return estacionesRepository.save(e);
        });
    }

    @Override
    public boolean eliminar(Integer id) {
        if (estacionesRepository.existsById(id)) {
            estacionesRepository.deleteById(id);
            return true;
        }
        return false;
    }
}