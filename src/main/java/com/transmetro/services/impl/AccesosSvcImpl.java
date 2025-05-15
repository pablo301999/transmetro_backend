/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.commons.CommonSvcImpl;
import com.transmetro.models.Accesos;
import com.transmetro.repositories.AccesosRepository;
import com.transmetro.services.AccesosSvc;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class AccesosSvcImpl extends CommonSvcImpl<Accesos, AccesosRepository> implements AccesosSvc {
    
}
