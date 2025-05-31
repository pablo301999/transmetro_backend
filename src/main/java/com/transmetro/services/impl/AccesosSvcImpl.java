/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.models.Accesos;
import com.transmetro.repositories.AccesosRepository;
import com.transmetro.services.AccesosSvc;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class AccesosSvcImpl implements AccesosSvc {

    @Autowired
    private AccesosRepository accesosRepository;

    @Override
    public List<Accesos> obtenerTodos() {
        return accesosRepository.findAll();
    }

    @Override
    public Optional<Accesos> obtenerPorId(Long id) {
        return accesosRepository.findById(id);
    }

    @Override
    public Accesos crear(Accesos acceso) {
        return accesosRepository.save(acceso);
    }

    @Override
    public Optional<Accesos> actualizar(Long id, Accesos datos) {
        return accesosRepository.findById(id).map(a -> {
            a.setIdEstacion(datos.getIdEstacion());
            a.setDescripcion(datos.getDescripcion());
            a.setEstado(datos.getEstado());
            return accesosRepository.save(a);
        });
    }

    @Override
    public boolean eliminar(Long id) {
        if (accesosRepository.existsById(id)) {
            accesosRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
