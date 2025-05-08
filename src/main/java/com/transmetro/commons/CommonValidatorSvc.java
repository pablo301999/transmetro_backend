/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.commons;

/**
 *
 * @author Pablo
 */
public interface CommonValidatorSvc<E> {
    
    public E validate(E e);
}
