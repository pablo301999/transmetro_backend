/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.commons.CommonSvcImpl;
import com.transmetro.models.Distancias;
import com.transmetro.repositories.DistanciasRepository;
import com.transmetro.services.DistanciasSvc;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class DistanciasSvcImpl extends CommonSvcImpl<Distancias, DistanciasRepository> implements DistanciasSvc {
    
}
