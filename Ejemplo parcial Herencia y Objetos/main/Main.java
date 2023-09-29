
package main;

import model.Estudiante;
import model.Persona;
import service.Service;

public class Main {
    
    public static void main(String[] args) {
        
        Service db = new Service();
        
        System.out.println("***********************");
        System.out.println("Registrando los datos");
        System.out.println("de estudiante Nuevo.");
        System.out.println("***********************");
        
        
        db.guardarEstudiante(
                "1",
                "Jordan",
                "Minota",
                "10611223344");
        
        db.guardarEstudiante(
                "2",
                "Camilo",
                "Martinez",
            "123123123");
        
        db.guardarEstudiante(
                "3",
                "Camila",
                "Perez",
            "09392932939");
        
        // METODO PARA LISTAR LOS ESTUDIANTES
        // System.out.println("***********************");
        // System.out.println("Listado de Estudiantes");
        // System.out.println("***********************");
        // db.listarEstudiantes();
        
        // METODO PARA BUSCAR UN ESTUDIANTES
        db.buscarEstudiante("pepe");
        
        
    }
    
}
