/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author jordanminota
 */
public abstract class Animal {
    
    private String nombre, edad, tipo_alimnetacion ;

    public Animal(String nombre, String edad, String tipo_alimnetacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo_alimnetacion = tipo_alimnetacion;
    }
    
    public abstract void sonidoAnimal();
    
}
