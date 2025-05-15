/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.controllers;

import com.transmetro.commons.CommonController;
import com.transmetro.models.Distancias;
import com.transmetro.services.DistanciasSvc;
import com.transmetro.validator.DistanciasValidator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pablo
 */
@RequestMapping("/distancias")
@RestController
public class DistanciasController extends CommonController<Distancias, DistanciasSvc, DistanciasValidator> {
    
}
