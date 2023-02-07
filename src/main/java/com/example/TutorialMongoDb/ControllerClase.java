/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TutorialMongoDb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author capea
 */
@CrossOrigin(origins = "http://localhost:8080") //Sirve para habilitar el intercambio de recursos de origen cruzado
@RestController //Se usa para definir un controlador 
@RequestMapping("/clases")
public class ControllerClase {
    @Autowired
    RepositorioClase repositorio;
    
    @GetMapping("/devolverClases")
    public ResponseEntity<List<Clase>> getListaClases(){
        try {
            List<Clase> listaClases = repositorio.findAll();
            
            if(listaClases.isEmpty()){
                return new ResponseEntity(HttpStatus.NO_CONTENT);
            }
            
            return ResponseEntity.ok().body(listaClases);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
            
        }
       
    }
    
    @PostMapping("/addClase")
    public ResponseEntity<Clase> addClase(@RequestBody Clase c){
        System.out.println(c);
        try {
            repositorio.save(c);
            
            return ResponseEntity.ok().body(c);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
         
    }
    
    
    
}
