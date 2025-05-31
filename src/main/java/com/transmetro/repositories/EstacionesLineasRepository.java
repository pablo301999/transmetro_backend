/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmetro.repositories;

import com.transmetro.models.EstacionesLineas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pablo
 */
@Repository
public interface EstacionesLineasRepository extends JpaRepository<EstacionesLineas, Long> {

    List<EstacionesLineas> findByIdLinea(Integer idLinea);
}
