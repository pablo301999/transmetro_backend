/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.validator;

import com.transmetro.commons.CommonValidatorSvc;
import com.transmetro.models.Buses;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Pablo
 */
@Component("BusesValidator")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class BusesValidator implements CommonValidatorSvc<Buses> {
    
    @Override
    public Buses validate(Buses e){
        return e;
    }
}
