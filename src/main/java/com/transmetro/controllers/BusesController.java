/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.controllers;

import com.transmetro.commons.CommonController;
import com.transmetro.models.Buses;
import com.transmetro.services.BusesSvc;
import com.transmetro.validator.BusesValidator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pablo
 */
@RequestMapping("/buses")
@RestController
public class BusesController extends CommonController<Buses, BusesSvc, BusesValidator> {
    
}
