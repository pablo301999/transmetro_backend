/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services;

import com.transmetro.models.Distancias;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Pablo
 */
public interface DistanciasSvc {

    List<Distancias> obtenerTodas();

    Optional<Distancias> obtenerPorId(Integer id);

    Distancias crear(Distancias distancia);

    Optional<Distancias> actualizar(Integer id, Distancias datos);

    boolean eliminar(Integer id);
}
