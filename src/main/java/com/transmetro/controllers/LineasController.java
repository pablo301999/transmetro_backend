/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.controllers;

import com.transmetro.commons.CommonController;
import com.transmetro.models.Lineas;
import com.transmetro.services.LineasSvc;
import com.transmetro.validator.LineasValidator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pablo
 */
@RequestMapping("/lineas")
@RestController
public class LineasController extends CommonController<Lineas, LineasSvc, LineasValidator> {
    
}
