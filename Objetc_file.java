
package clase_obj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Objetc {
    public static void main(String[] args) {
        // guardarObjeto();
        Persona personaCargada = cargarObjeto();
        System.out.println("Objeto cargado: " + personaCargada);
    }

    private static void guardarObjeto() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("persona.ser"))) {
            Persona persona = new Persona("Juan", 25);
            
            /**
             * Escribir el objeto en el archivo
             */
            outputStream.writeObject(persona);
            
            System.out.println("Objeto guardado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static Persona cargarObjeto() {
        Persona persona = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("persona.ser"))) {
            /**
             * Leer el objeto desde el archivo
             */
            persona = (Persona) inputStream.readObject();
            
            System.out.println("Objeto cargado exitosamente.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return persona;
    }
}




/*
 * Persona
 */
package clase_obj;

import java.io.*;

// Clase que implementa Serializable
class Persona implements Serializable {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }
}
