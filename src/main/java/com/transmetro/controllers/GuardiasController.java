/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.controllers;

import com.transmetro.models.Guardias;
import com.transmetro.services.GuardiasSvc;
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
@RequestMapping("/guardias")
@CrossOrigin(origins = "*")
public class GuardiasController {

    @Autowired
    private GuardiasSvc guardiasSvc;

    @GetMapping
    public List<Guardias> obtenerTodos() {
        return guardiasSvc.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Guardias> obtenerPorId(@PathVariable Integer id) {
        return guardiasSvc.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Guardias> crear(@RequestBody Guardias guardia) {
        return ResponseEntity.ok(guardiasSvc.crear(guardia));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Guardias> actualizar(@PathVariable Integer id, @RequestBody Guardias datos) {
        return guardiasSvc.actualizar(id, datos)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id) {
        return guardiasSvc.eliminar(id) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
