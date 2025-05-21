/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.controllers;

import com.transmetro.models.Distancias;
import com.transmetro.services.DistanciasSvc;
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
@RequestMapping("/distancias")
@CrossOrigin(origins = "*")
public class DistanciasController {

    @Autowired
    private DistanciasSvc distanciasSvc;

    @GetMapping
    public List<Distancias> obtenerTodas() {
        return distanciasSvc.obtenerTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Distancias> obtenerPorId(@PathVariable Integer id) {
        return distanciasSvc.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Distancias> crear(@RequestBody Distancias distancia) {
        return ResponseEntity.ok(distanciasSvc.crear(distancia));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Distancias> actualizar(@PathVariable Integer id, @RequestBody Distancias datos) {
        return distanciasSvc.actualizar(id, datos)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id) {
        return distanciasSvc.eliminar(id) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
