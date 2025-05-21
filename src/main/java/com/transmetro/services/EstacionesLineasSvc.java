/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services;

import com.transmetro.models.EstacionesLineas;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Pablo
 */
public interface EstacionesLineasSvc {

    List<EstacionesLineas> obtenerTodas();

    Optional<EstacionesLineas> obtenerPorId(Integer id);

    EstacionesLineas crear(EstacionesLineas relacion);

    Optional<EstacionesLineas> actualizar(Integer id, EstacionesLineas datos);

    boolean eliminar(Integer id);

    List<EstacionesLineas> obtenerPorLinea(Integer idLinea);
}
