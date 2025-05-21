/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.models.Distancias;
import com.transmetro.repositories.DistanciasRepository;
import com.transmetro.services.DistanciasSvc;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class DistanciasSvcImpl implements DistanciasSvc {

    @Autowired
    private DistanciasRepository distanciasRepository;

    @Override
    public List<Distancias> obtenerTodas() {
        return distanciasRepository.findAll();
    }

    @Override
    public Optional<Distancias> obtenerPorId(Integer id) {
        return distanciasRepository.findById(id);
    }

    @Override
    public Distancias crear(Distancias distancia) {
        return distanciasRepository.save(distancia);
    }

    @Override
    public Optional<Distancias> actualizar(Integer id, Distancias datos) {
        return distanciasRepository.findById(id).map(d -> {
            d.setIdEstacionOrigen(datos.getIdEstacionOrigen());
            d.setIdEstacionDestino(datos.getIdEstacionDestino());
            d.setDistanciaKm(datos.getDistanciaKm());
            return distanciasRepository.save(d);
        });
    }

    @Override
    public boolean eliminar(Integer id) {
        if (distanciasRepository.existsById(id)) {
            distanciasRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
