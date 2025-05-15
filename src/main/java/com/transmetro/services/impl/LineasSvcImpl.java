/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.services.impl;

import com.transmetro.commons.CommonSvcImpl;
import com.transmetro.models.Lineas;
import com.transmetro.repositories.LineasRepository;
import com.transmetro.services.LineasSvc;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class LineasSvcImpl extends CommonSvcImpl<Lineas, LineasRepository> implements LineasSvc {
    
}
