/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.commons.CommonSvcImpl;
import com.transmetro.models.Pilotos;
import com.transmetro.repositories.PilotosRepository;
import com.transmetro.services.PilotosSvc;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class PilotosSvcImpl extends CommonSvcImpl<Pilotos, PilotosRepository> implements PilotosSvc {
    
}
