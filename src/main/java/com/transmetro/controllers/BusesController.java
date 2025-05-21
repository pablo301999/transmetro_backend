/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.controllers;

import com.transmetro.models.Buses;
import com.transmetro.services.BusesSvc;
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
@RequestMapping("/buses")
@CrossOrigin(origins = "*")
public class BusesController {

    @Autowired
    private BusesSvc busesSvc;

    @GetMapping
    public List<Buses> obtenerTodos() {
        return busesSvc.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Buses> obtenerPorId(@PathVariable Integer id) {
        return busesSvc.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Buses> crear(@RequestBody Buses bus) {
        return ResponseEntity.ok(busesSvc.crear(bus));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Buses> actualizar(@PathVariable Integer id, @RequestBody Buses datos) {
        return busesSvc.actualizar(id, datos)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id) {
        return busesSvc.eliminar(id) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
