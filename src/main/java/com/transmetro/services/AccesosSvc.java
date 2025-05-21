/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services;

import com.transmetro.models.Accesos;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Pablo
 */
public interface AccesosSvc {

    List<Accesos> obtenerTodos();

    Optional<Accesos> obtenerPorId(Integer id);

    Accesos crear(Accesos acceso);

    Optional<Accesos> actualizar(Integer id, Accesos datos);

    boolean eliminar(Integer id);
}
