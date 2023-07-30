/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcioneseje1;

/**
 *
 * @author Usuario
 */
public class Persona {
     private int edad;

    public Persona() {
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void esMayorDeEdad() {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
}
}
