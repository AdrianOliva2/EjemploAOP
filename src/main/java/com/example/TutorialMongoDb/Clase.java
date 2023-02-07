/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TutorialMongoDb;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author capea
 */
@Document(collection = "clases")
public class Clase {
    private String id;
    private String nombre;
    @DBRef
    private Persona profesor;

    public Clase(String nombre, Persona profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getProfesor() {
        return profesor;
    }

    public void setProfesor(Persona profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Clase{" + "id=" + id + ", nombre=" + nombre + ", profesor=" + profesor + '}';
    }
    
    
    
}
