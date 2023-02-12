/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.adrian.prueba.aop;

import dam.adrianoliva.prueba.aop.dao.ClienteDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Adrian
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
        ClienteDAO clienteDAO = contexto.getBean("clienteDAO", ClienteDAO.class);
        clienteDAO.insertaCliente();
        contexto.close();
        
    }
    
}
