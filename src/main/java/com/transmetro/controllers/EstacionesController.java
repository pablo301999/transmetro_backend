/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.controllers;

import com.transmetro.models.Estaciones;
import com.transmetro.services.EstacionesSvc;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pablo
 */
@RestController
@RequestMapping("/estaciones")
@CrossOrigin(origins = "*")
public class EstacionesController {

    @Autowired
    private EstacionesSvc estacionesSvc;

    @GetMapping
    public List<Estaciones> obtenerTodas() {
        return estacionesSvc.obtenerTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estaciones> obtenerPorId(@PathVariable Long id) {
        return estacionesSvc.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Estaciones> crear(@RequestBody Estaciones estacion) {
        return ResponseEntity.ok(estacionesSvc.crear(estacion));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estaciones> actualizar(@PathVariable Long id, @RequestBody Estaciones datos) {
        return estacionesSvc.actualizar(id, datos)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        return estacionesSvc.eliminar(id) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
