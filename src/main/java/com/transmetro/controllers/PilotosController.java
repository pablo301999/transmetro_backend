/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.controllers;

import com.transmetro.models.Pilotos;
import com.transmetro.services.PilotosSvc;
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
@RequestMapping("/pilotos")
@CrossOrigin(origins = "*")
public class PilotosController {

    @Autowired
    private PilotosSvc pilotosSvc;

    @GetMapping
    public List<Pilotos> obtenerTodos() {
        return pilotosSvc.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pilotos> obtenerPorId(@PathVariable Long id) {
        return pilotosSvc.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Pilotos> crear(@RequestBody Pilotos piloto) {
        return ResponseEntity.ok(pilotosSvc.crear(piloto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pilotos> actualizar(@PathVariable Long id, @RequestBody Pilotos datos) {
        return pilotosSvc.actualizar(id, datos)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        return pilotosSvc.eliminar(id) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
