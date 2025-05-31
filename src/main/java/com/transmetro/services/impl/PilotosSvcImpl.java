/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.models.Pilotos;
import com.transmetro.repositories.PilotosRepository;
import com.transmetro.services.PilotosSvc;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class PilotosSvcImpl implements PilotosSvc {

    @Autowired
    private PilotosRepository pilotosRepository;

    @Override
    public List<Pilotos> obtenerTodos() {
        return pilotosRepository.findAll();
    }

    @Override
    public Optional<Pilotos> obtenerPorId(Long id) {
        return pilotosRepository.findById(id);
    }

    @Override
    public Pilotos crear(Pilotos piloto) {
        return pilotosRepository.save(piloto);
    }

    @Override
    public Optional<Pilotos> actualizar(Long id, Pilotos datos) {
        return pilotosRepository.findById(id).map(p -> {
            p.setNombre(datos.getNombre());
            p.setApellido(datos.getApellido());
            p.setTelefono(datos.getTelefono());
            p.setLicencia(datos.getLicencia());
            return pilotosRepository.save(p);
        });
    }

    @Override
    public boolean eliminar(Long id) {
        if (pilotosRepository.existsById(id)) {
            pilotosRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
