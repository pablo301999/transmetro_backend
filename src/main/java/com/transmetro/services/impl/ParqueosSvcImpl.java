/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.models.Parqueos;
import com.transmetro.repositories.ParqueosRepository;
import com.transmetro.services.ParqueosSvc;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class ParqueosSvcImpl implements ParqueosSvc {

    @Autowired
    private ParqueosRepository parqueosRepository;

    @Override
    public List<Parqueos> obtenerTodos() {
        return parqueosRepository.findAll();
    }

    @Override
    public Optional<Parqueos> obtenerPorId(Integer id) {
        return parqueosRepository.findById(id);
    }

    @Override
    public Parqueos crear(Parqueos parqueo) {
        return parqueosRepository.save(parqueo);
    }

    @Override
    public Optional<Parqueos> actualizar(Integer id, Parqueos datos) {
        return parqueosRepository.findById(id).map(p -> {
            p.setCodigo(datos.getCodigo());
            p.setUbicacion(datos.getUbicacion());
            p.setOcupado(datos.getOcupado());
            return parqueosRepository.save(p);
        });
    }

    @Override
    public boolean eliminar(Integer id) {
        if (parqueosRepository.existsById(id)) {
            parqueosRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
