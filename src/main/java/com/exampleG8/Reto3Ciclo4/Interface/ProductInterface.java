/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exampleG8.Reto3Ciclo4.Interface;

import com.exampleG8.Reto3Ciclo4.Model.Clothe;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author raque
 */
public interface ProductInterface extends MongoRepository<Clothe, String> {
    
}
