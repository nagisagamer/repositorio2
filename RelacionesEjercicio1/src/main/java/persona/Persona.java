/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

import Perro.Perro.Perro;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private String apellido;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, int edad, int dni, String apellido, Perro perro) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.apellido = apellido;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", apellido=" + apellido + ", perro=" + perro + '}';
    }
    
    
}
