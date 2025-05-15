/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.commons.CommonSvcImpl;
import com.transmetro.models.Parqueos;
import com.transmetro.repositories.ParqueosRepository;
import com.transmetro.services.ParqueosSvc;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class ParqueosSvcImpl extends CommonSvcImpl<Parqueos, ParqueosRepository> implements ParqueosSvc {
    
}
