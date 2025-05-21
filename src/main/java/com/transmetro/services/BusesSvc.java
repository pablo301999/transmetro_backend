/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services;

import com.transmetro.models.Buses;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Pablo
 */
public interface BusesSvc {

    List<Buses> obtenerTodos();

    Optional<Buses> obtenerPorId(Integer id);

    Buses crear(Buses bus);

    Optional<Buses> actualizar(Integer id, Buses datos);

    boolean eliminar(Integer id);
}
