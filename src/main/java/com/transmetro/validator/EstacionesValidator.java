/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.validator;

import com.transmetro.commons.CommonValidatorSvc;
import com.transmetro.models.Estaciones;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Pablo
 */
@Component("EstacionesValidator")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class EstacionesValidator implements CommonValidatorSvc<Estaciones> {
    
    @Override
    public Estaciones validate(Estaciones e){
        return e;
    }
    
}
