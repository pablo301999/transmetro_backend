/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.controllers;

import com.transmetro.commons.CommonController;
import com.transmetro.models.Estaciones;
import com.transmetro.services.EstacionesSvc;
import com.transmetro.validator.EstacionesValidator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pablo
 */
@RequestMapping("/estaciones")
@RestController
public class EstacionesController extends CommonController<Estaciones, EstacionesSvc, EstacionesValidator> {
    
}
