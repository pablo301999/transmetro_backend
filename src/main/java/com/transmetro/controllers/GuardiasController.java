/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.controllers;

import com.transmetro.commons.CommonController;
import com.transmetro.models.Guardias;
import com.transmetro.services.GuardiasSvc;
import com.transmetro.validator.GuardiasValidator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pablo
 */
@RequestMapping("/guardias")
@RestController
public class GuardiasController extends CommonController<Guardias, GuardiasSvc, GuardiasValidator> {
    
}
