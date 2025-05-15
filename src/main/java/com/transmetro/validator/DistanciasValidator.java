/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.validator;

import com.transmetro.commons.CommonValidatorSvc;
import com.transmetro.models.Distancias;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Pablo
 */
@Component("DistanciasValidator")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class DistanciasValidator implements CommonValidatorSvc<Distancias> {
    
    @Override
    public Distancias validate(Distancias e){
        return e;
    }
   
}
