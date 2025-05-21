/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.controllers;

import com.transmetro.models.EstacionesLineas;
import com.transmetro.services.EstacionesLineasSvc;
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
@RequestMapping("/estaciones-lineas")
@CrossOrigin(origins = "*")
public class EstacionesLineasController {

    @Autowired
    private EstacionesLineasSvc estacionesLineasSvc;

    @GetMapping
    public List<EstacionesLineas> obtenerTodas() {
        return estacionesLineasSvc.obtenerTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstacionesLineas> obtenerPorId(@PathVariable Integer id) {
        return estacionesLineasSvc.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/linea/{idLinea}")
    public List<EstacionesLineas> obtenerPorLinea(@PathVariable Integer idLinea) {
        return estacionesLineasSvc.obtenerPorLinea(idLinea);
    }

    @PostMapping
    public ResponseEntity<EstacionesLineas> crear(@RequestBody EstacionesLineas relacion) {
        return ResponseEntity.ok(estacionesLineasSvc.crear(relacion));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstacionesLineas> actualizar(@PathVariable Integer id, @RequestBody EstacionesLineas datos) {
        return estacionesLineasSvc.actualizar(id, datos)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id) {
        return estacionesLineasSvc.eliminar(id) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
