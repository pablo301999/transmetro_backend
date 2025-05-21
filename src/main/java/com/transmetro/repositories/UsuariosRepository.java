/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.repositories;

import com.transmetro.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pablo
 */
@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

    boolean existsByCorreo(String correo);

    boolean existsByNumeroEmpleado(String numeroEmpleado);

}

