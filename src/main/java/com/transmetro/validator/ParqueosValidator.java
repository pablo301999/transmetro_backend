/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.validator;

import com.transmetro.commons.CommonValidatorSvc;
import com.transmetro.models.Parqueos;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Pablo
 */
@Component("ParqueosValidator")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ParqueosValidator implements CommonValidatorSvc<Parqueos> {
    
    @Override
    public Parqueos validate(Parqueos e){
        return e;
    }
    
}
