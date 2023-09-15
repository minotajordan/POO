/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author jordanminota
 */
public class Gato extends Animal {
    
    String raza;

    public Gato(String raza, String nombre, String edad, String tipo_alimnetacion) {
        super(nombre, edad, tipo_alimnetacion);
        this.raza = raza;
    }
    
    public void sonidoAnimal() {
        System.out.println("Miauuu");
    }
    
}
