/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services;

import com.transmetro.models.Lineas;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Pablo
 */
public interface LineasSvc {
    List<Lineas> obtenerTodas();
    Optional<Lineas> obtenerPorId(Integer id);
    Lineas crear(Lineas linea);
    Optional<Lineas> actualizar(Integer id, Lineas datos);
    boolean eliminar(Integer id);
}
