/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

public class Main {

    public static void main(String[] args) {        
        
        Animal perro = new Perro("Pastor Aleman", "Firulais", "5", "Omnivoro");
        perro.sonidoAnimal();
        
        Animal gato = new Gato("Gato Aleman", "Juan", "2", "Omnivoro");
        gato.sonidoAnimal();
    }
    
}
