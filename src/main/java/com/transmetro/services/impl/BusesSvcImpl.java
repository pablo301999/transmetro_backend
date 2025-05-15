/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.commons.CommonSvcImpl;
import com.transmetro.models.Buses;
import com.transmetro.repositories.BusesRepository;
import com.transmetro.services.BusesSvc;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class BusesSvcImpl extends CommonSvcImpl<Buses, BusesRepository> implements BusesSvc {
    
}
