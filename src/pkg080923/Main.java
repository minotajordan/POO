package pkg080923;

import excercise.Persona;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int limitObjet = 3;
        Persona[] arrayPerson = new Persona[limitObjet];

        Scanner scan = new Scanner(System.in);
        
        // Instancia // Generar ciclo para guardar estos datos en los limite que el programa defina ingresando todo por teclado
        System.out.println("Ingrese los valores de Nombre - Documento - Ciudad");
        
        arrayPerson[0] = new Persona(scan.nextLine(), scan.nextLine(), scan.nextLine());
        
        for (int i = 0; i < limitObjet; i++) {
            System.out.println("N: " + arrayPerson[i].getName());
            System.out.println("D: " + arrayPerson[i].getDocument());
            System.out.println("C: " + arrayPerson[i].getCountry());
            System.out.println("-----");
        }

        /*
        for (Persona persona : arrayPerson) {
            System.out.println("N: " + persona.getName());
            System.out.println("D: " + persona.getDocument());
            System.out.println("C: " + persona.getCountry());
            System.out.println("-----");
        }
        */
        
    }

}
