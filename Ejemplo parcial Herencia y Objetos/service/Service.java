package service;

import java.util.ArrayList;
import java.util.LinkedList;
import model.Estudiante;

public class Service {
    
    public LinkedList<Estudiante> objEstudiante =
            new LinkedList<Estudiante>();

    public Service() {}
    
    public void guardarEstudiante(
            String codigo,
            String nombre,
            String apellido,
            String documento) {
        
        Estudiante nuevoEstudiante = new Estudiante(
                codigo,
                nombre,
                apellido,
                documento);
        
        this.objEstudiante.add(nuevoEstudiante);
        System.out.println("Estudiante Guardado");
    }
    
    public void listarEstudiantes(){        
        for (Estudiante estudiante : objEstudiante) {
            System.out.println("---------");
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Apellido: " + estudiante.getApellido());
            System.out.println("Documento: " + estudiante.getDocumento());
            
        }
    }
    
    public void buscarEstudiante(String nombreSolicitado){
        boolean flag = false;
        String datoLocalizado = "";
        
        for (Estudiante estudiante : objEstudiante) {
            if (estudiante.getNombre().equalsIgnoreCase(nombreSolicitado)) {
                flag = true;
                datoLocalizado += ("\n ---------");
                datoLocalizado += ("\n Nombre: " + estudiante.getNombre());
                datoLocalizado += ("\n Apellido: " + estudiante.getApellido());
                datoLocalizado += ("\n Documento: " + estudiante.getDocumento());

            }
        }
        
        if (flag) {
            System.out.println("Datos encontrados.");
            System.out.println(datoLocalizado);
        } else {
            System.out.println("No se encontradon datos");
        }
    }
}
