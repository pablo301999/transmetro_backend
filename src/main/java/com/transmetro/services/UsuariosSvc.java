/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services;

import com.transmetro.models.Usuarios;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Pablo
 */
public interface UsuariosSvc {

    Usuarios crearUsuario(Usuarios usuario);

    Optional<Usuarios> buscarPorId(Long id);

    List<Usuarios> listar();

    void eliminar(Long id);

    Usuarios actualizar(Long id, Usuarios datos);
}
