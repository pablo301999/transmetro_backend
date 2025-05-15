/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.controllers;

import com.transmetro.commons.CommonController;
import com.transmetro.models.EstacionesLineas;
import com.transmetro.services.EstacionesLineasSvc;
import com.transmetro.validator.EstacionesLineasValidator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pablo
 */
@RequestMapping("/estaciones-lineas")
@RestController
public class EstacionesLineasController extends CommonController<EstacionesLineas, EstacionesLineasSvc, EstacionesLineasValidator> {
    
}
