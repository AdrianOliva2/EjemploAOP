/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TutorialMongoDb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author capea
 */
@Repository
public interface RepositorioClase extends MongoRepository<Clase, String>{
    Clase findOneByProfesor(Persona p);
    
    Clase findOneByProfesorId(String id);
    
    
}
