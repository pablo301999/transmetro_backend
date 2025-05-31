/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services;

import com.transmetro.models.Pilotos;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Pablo
 */
public interface PilotosSvc {

    List<Pilotos> obtenerTodos();

    Optional<Pilotos> obtenerPorId(Long id);

    Pilotos crear(Pilotos piloto);

    Optional<Pilotos> actualizar(Long id, Pilotos datos);

    boolean eliminar(Long id);
}
