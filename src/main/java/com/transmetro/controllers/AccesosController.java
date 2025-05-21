/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.controllers;

import com.transmetro.models.Accesos;
import com.transmetro.services.AccesosSvc;
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
@RequestMapping("/accesos")
@CrossOrigin(origins = "*")
public class AccesosController {

    @Autowired
    private AccesosSvc accesosSvc;

    @GetMapping
    public List<Accesos> obtenerTodos() {
        return accesosSvc.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Accesos> obtenerPorId(@PathVariable Integer id) {
        return accesosSvc.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Accesos> crear(@RequestBody Accesos acceso) {
        return ResponseEntity.ok(accesosSvc.crear(acceso));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Accesos> actualizar(@PathVariable Integer id, @RequestBody Accesos datos) {
        return accesosSvc.actualizar(id, datos)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id) {
        return accesosSvc.eliminar(id) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
