/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.repositories;

import com.transmetro.models.Buses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pablo
 */
@Repository
public interface BusesRepository extends CrudRepository<Buses, Object> {
    
}
