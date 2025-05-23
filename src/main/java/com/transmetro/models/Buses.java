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
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Pablo
 */
@Entity
@Table(name = "buses", schema = "transmetro")
public class Buses implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bus")
    private Long idBus;

    @Column(name = "numero_bus", nullable = false, unique = true, length = 10)
    private String numeroBus;

    @Column(name = "capacidad", nullable = false)
    private Integer capacidad;

    @Column(name = "id_linea", nullable = false)
    private Integer idLinea;

    @Column(name = "id_parqueo", nullable = false)
    private Integer idParqueo;

    @Column(name = "activo", nullable = false)
    private Boolean activo = true;

    public Long getIdBus() {
        return idBus;
    }

    public void setIdBus(Long idBus) {
        this.idBus = idBus;
    }

    public String getNumeroBus() {
        return numeroBus;
    }

    public void setNumeroBus(String numeroBus) {
        this.numeroBus = numeroBus;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Integer getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(Integer idLinea) {
        this.idLinea = idLinea;
    }

    public Integer getIdParqueo() {
        return idParqueo;
    }

    public void setIdParqueo(Integer idParqueo) {
        this.idParqueo = idParqueo;
    }

}
