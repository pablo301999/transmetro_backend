/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.commons.CommonSvcImpl;
import com.transmetro.models.Estaciones;
import com.transmetro.repositories.EstacionesRepository;
import com.transmetro.services.EstacionesSvc;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class EstacionesSvcImpl extends CommonSvcImpl<Estaciones, EstacionesRepository> implements EstacionesSvc {
    
}
