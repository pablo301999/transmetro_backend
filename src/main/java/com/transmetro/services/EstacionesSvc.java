/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services;

import com.transmetro.models.Estaciones;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Pablo
 */
public interface EstacionesSvc {

    List<Estaciones> obtenerTodas();

    Optional<Estaciones> obtenerPorId(Long id);

    Estaciones crear(Estaciones estacion);

    Optional<Estaciones> actualizar(Long id, Estaciones datos);

    boolean eliminar(Long id);
}
