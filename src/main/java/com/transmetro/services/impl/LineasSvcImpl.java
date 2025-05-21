/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.models.Lineas;
import com.transmetro.repositories.LineasRepository;
import com.transmetro.services.LineasSvc;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class LineasSvcImpl implements LineasSvc {

    @Autowired
    private LineasRepository lineasRepository;

    @Override
    public List<Lineas> obtenerTodas() {
        return lineasRepository.findAll();
    }

    @Override
    public Optional<Lineas> obtenerPorId(Integer id) {
        return lineasRepository.findById(id);
    }

    @Override
    public Lineas crear(Lineas linea) {
        return lineasRepository.save(linea);
    }

    @Override
    public Optional<Lineas> actualizar(Integer id, Lineas datos) {
        return lineasRepository.findById(id).map(l -> {
            l.setNombre(datos.getNombre());
            l.setZonaOrigen(datos.getZonaOrigen());
            l.setColorHex(datos.getColorHex());
            l.setEstado(datos.getEstado());
            return lineasRepository.save(l);
        });
    }

    @Override
    public boolean eliminar(Integer id) {
        if (lineasRepository.existsById(id)) {
            lineasRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
