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
@Table(name = "guardias", schema = "transmetro")
public class Guardias implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_guardia")
    private Long idGuardia;

    @Column(name = "nombre_completo", nullable = false, length = 100)
    private String nombreCompleto;

    private String turno;

    @Column(name = "id_acceso",nullable = false)
    private Integer idAcceso;

    public Long getIdGuardia() {
        return idGuardia;
    }

    public void setIdGuardia(Long idGuardia) {
        this.idGuardia = idGuardia;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Integer getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(Integer idAcceso) {
        this.idAcceso = idAcceso;
    }

    
}
