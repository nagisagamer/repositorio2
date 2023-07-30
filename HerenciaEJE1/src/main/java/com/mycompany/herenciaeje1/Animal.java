/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaeje1;

/**
 *
 * @author Usuario
 */
public class Animal {
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    // Se cambia el nombre del método a "alimentarse" en lugar de "alimentarse"
    public void alimentarse() {
        System.out.println("El animal se alimenta de " + alimento);
    }
}
