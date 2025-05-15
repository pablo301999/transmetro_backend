/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.commons.CommonSvcImpl;
import com.transmetro.models.Guardias;
import com.transmetro.repositories.GuardiasRepository;
import com.transmetro.services.GuardiasSvc;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class GuardiasSvcImpl extends CommonSvcImpl<Guardias, GuardiasRepository> implements GuardiasSvc {
    
}
