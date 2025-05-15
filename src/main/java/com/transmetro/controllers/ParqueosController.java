/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.controllers;

import com.transmetro.commons.CommonController;
import com.transmetro.models.Parqueos;
import com.transmetro.services.ParqueosSvc;
import com.transmetro.validator.ParqueosValidator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pablo
 */
@RequestMapping("/parqueos")
@RestController
public class ParqueosController extends CommonController<Parqueos, ParqueosSvc, ParqueosValidator> {
    
}
