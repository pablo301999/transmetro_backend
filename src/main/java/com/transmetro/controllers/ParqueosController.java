/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.controllers;

import com.transmetro.models.Parqueos;
import com.transmetro.services.ParqueosSvc;
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
@RequestMapping("/parqueos")
@CrossOrigin(origins = "*")
public class ParqueosController {

    @Autowired
    private ParqueosSvc parqueosSvc;

    @GetMapping
    public List<Parqueos> obtenerTodos() {
        return parqueosSvc.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Parqueos> obtenerPorId(@PathVariable Long id) {
        return parqueosSvc.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Parqueos> crear(@RequestBody Parqueos parqueo) {
        return ResponseEntity.ok(parqueosSvc.crear(parqueo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Parqueos> actualizar(@PathVariable Long id, @RequestBody Parqueos datos) {
        return parqueosSvc.actualizar(id, datos)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        return parqueosSvc.eliminar(id) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
