/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services;

import com.transmetro.models.Guardias;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Pablo
 */
public interface GuardiasSvc {

    List<Guardias> obtenerTodos();

    Optional<Guardias> obtenerPorId(Long id);

    Guardias crear(Guardias guardia);

    Optional<Guardias> actualizar(Long id, Guardias datos);

    boolean eliminar(Long id);
}
