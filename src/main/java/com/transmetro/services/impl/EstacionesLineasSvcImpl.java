/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.models.EstacionesLineas;
import com.transmetro.repositories.EstacionesLineasRepository;
import com.transmetro.services.EstacionesLineasSvc;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class EstacionesLineasSvcImpl implements EstacionesLineasSvc {

    @Autowired
    private EstacionesLineasRepository estacionesLineasRepository;

    @Override
    public List<EstacionesLineas> obtenerTodas() {
        return estacionesLineasRepository.findAll();
    }

    @Override
    public Optional<EstacionesLineas> obtenerPorId(Long id) {
        return estacionesLineasRepository.findById(id);
    }

    @Override
    public EstacionesLineas crear(EstacionesLineas relacion) {
        return estacionesLineasRepository.save(relacion);
    }

    @Override
    public Optional<EstacionesLineas> actualizar(Long id, EstacionesLineas datos) {
        return estacionesLineasRepository.findById(id).map(r -> {
            r.setIdEstacion(datos.getIdEstacion());
            r.setIdLinea(datos.getIdLinea());
            r.setOrden(datos.getOrden());
            return estacionesLineasRepository.save(r);
        });
    }

    @Override
    public boolean eliminar(Long id) {
        if (estacionesLineasRepository.existsById(id)) {
            estacionesLineasRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<EstacionesLineas> obtenerPorLinea(Integer idLinea) {
        return estacionesLineasRepository.findByIdLinea(idLinea);
    }
}
