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
@Table(name = "pilotos", schema = "transmetro")
public class Pilotos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_piloto")
    private Long idPiloto;

    @Column(name = "nombre_completo", nullable = false, length = 100)
    private String nombreCompleto;

    private String direccion;
    private String telefono;
    private String email;
    private String historialEducativo;

    public Long getIdPiloto() {
        return idPiloto;
    }

    public void setIdPiloto(Long idPiloto) {
        this.idPiloto = idPiloto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHistorialEducativo() {
        return historialEducativo;
    }

    public void setHistorialEducativo(String historialEducativo) {
        this.historialEducativo = historialEducativo;
    }

}
