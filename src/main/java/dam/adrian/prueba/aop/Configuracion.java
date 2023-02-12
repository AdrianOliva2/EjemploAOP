/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.adrian.prueba.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author Adrian
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("dam.adrianoliva.prueba.aop.dao")
public class Configuracion {
    
}
