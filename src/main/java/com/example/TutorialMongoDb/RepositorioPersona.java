/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TutorialMongoDb;

import java.util.List;
import com.example.TutorialMongoDb.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author capea
 */

//Debemos incorporar un repositorio por cada collection que tengamos para trabajar con ella. Esos métodos no pueden tener cualquier nombre sino que deben tener una notación especial
@Repository
public interface RepositorioPersona extends MongoRepository<Persona, String>{
    List<Persona> findByApellido(String apellido);
    
    List<Persona> findByNombreLike(String nombre);
}