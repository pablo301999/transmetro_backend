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
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.postgresql.util.PSQLException;

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
    public Optional<Distancias> obtenerPorId(Long id) {
        return distanciasRepository.findById(id);
    }

    @Override
    public Distancias crear(Distancias distancia) {
        try {
            Distancias guardado = distanciasRepository.save(distancia);
            distanciasRepository.flush();
            return guardado;
        } catch (Exception e) {
            Throwable causa = findRootCause(e);

            if (causa instanceof PSQLException) {
                String mensaje = causa.getMessage();
                if (mensaje.contains("distancias_id_estacion_origen_fkey")) {
                    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "La estación de origen no existe");
                } else if (mensaje.contains("distancias_id_estacion_destino_fkey")) {
                    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "La estación de destino no existe");
                } else {
                    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Estación de origen o destino inválida");
                }
            }

            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error al guardar la distancia");
        }
    }

    private Throwable findRootCause(Throwable ex) {
        Throwable result = ex;
        while (result.getCause() != null) {
            result = result.getCause();
        }
        return result;
    }

    @Override
    public Optional<Distancias> actualizar(Long id, Distancias datos) {
        return distanciasRepository.findById(id).map(d -> {
            try {
                d.setIdEstacionOrigen(datos.getIdEstacionOrigen());
                d.setIdEstacionDestino(datos.getIdEstacionDestino());
                d.setDistanciaKm(datos.getDistanciaKm());
                Distancias actualizado = distanciasRepository.save(d);
                distanciasRepository.flush();

                return actualizado;
            } catch (Exception e) {
                Throwable causa = findRootCause(e);
                if (causa instanceof PSQLException) {
                    String mensaje = causa.getMessage();
                    if (mensaje.contains("distancias_id_estacion_origen_fkey")) {
                        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "La estación de origen no existe");
                    } else if (mensaje.contains("distancias_id_estacion_destino_fkey")) {
                        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "La estación de destino no existe");
                    } else {
                        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Estación de origen o destino inválida");
                    }
                }

                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error al actualizar la distancia");
            }
        });
    }

    @Override
    public boolean eliminar(Long id) {
        if (distanciasRepository.existsById(id)) {
            distanciasRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
