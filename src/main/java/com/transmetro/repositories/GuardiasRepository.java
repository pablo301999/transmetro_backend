/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.repositories;

import com.transmetro.models.Guardias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pablo
 */
@Repository
public interface GuardiasRepository extends CrudRepository<Guardias, Object> {
    
}
