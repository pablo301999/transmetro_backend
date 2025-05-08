/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.repositories;

import com.transmetro.models.Empleado;
import com.transmetro.projections.ObtenerDpiUsuarioProjection;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Pablo
 */
@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Object> {

    Empleado findByUsuario(String username);

    Empleado findByDpi(String dpi);

    @Query(value = "select e.dpi from control_turnos.empleado e where usuario = :usuario",
            nativeQuery = true)
    @Transactional
    ObtenerDpiUsuarioProjection obtenerDpiUsuario(@Param("usuario") String usuario); 
}
