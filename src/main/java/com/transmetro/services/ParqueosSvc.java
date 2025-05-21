/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services;

import com.transmetro.models.Parqueos;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Pablo
 */
public interface ParqueosSvc {

    List<Parqueos> obtenerTodos();

    Optional<Parqueos> obtenerPorId(Integer id);

    Parqueos crear(Parqueos parqueo);

    Optional<Parqueos> actualizar(Integer id, Parqueos datos);

    boolean eliminar(Integer id);
}
