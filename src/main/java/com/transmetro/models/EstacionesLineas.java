/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 *
 * @author Pablo
 */
@Entity
@Table(name = "estaciones_lineas", schema = "transmetro")
public class EstacionesLineas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estacion_linea")
    private Long idEstacionLinea;

    @Column(name = "id_linea", nullable = false)
    private Long idLinea;

    @Column(name = "id_estacion", nullable = false)
    private Long idEstacion;

    @Column(nullable = false)
    private Integer orden;

    public Long getIdEstacionLinea() {
        return idEstacionLinea;
    }

    public void setIdEstacionLinea(Long idEstacionLinea) {
        this.idEstacionLinea = idEstacionLinea;
    }

    public Long getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(Long idLinea) {
        this.idLinea = idLinea;
    }

    public Long getIdEstacion() {
        return idEstacion;
    }

    public void setIdEstacion(Long idEstacion) {
        this.idEstacion = idEstacion;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
    
    
}