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
//Los repositorios nos ofrecen métodos para realizar operaciones CRUD en la base de datos
@Repository
public interface RepositorioPersona extends MongoRepository<Persona, String>{ //Persona es el tipo de dato que el repositorio maneja //String es el tipo de dato del id que el repositorio maneja
    List<Persona> findByApellido(String apellido);
    
    List<Persona> findByNombreLike(String nombre);
    
    Persona findOneByNombre(String nombre);
}
