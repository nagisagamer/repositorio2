/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class personaService {
    
Scanner sc = new Scanner(System.in);

public persona crearPersona (){
    persona p1 = new persona();
    System.out.println("ingrese el nombre de la persona para comenzar a crearla:");
    p1.setNombre(sc.next());
    
    System.out.println("Ingrese el peso de la persona:");
        p1.setPeso(sc.nextDouble());

    System.out.println("Ingrese la altura de la persona:");
    p1.setAltura(sc.nextDouble());

    return p1;
    
}
    
public void edad (persona p1){
    System.out.println("ingrese la edad:");
    p1.setEdad(sc.nextInt());
    if (p1.getEdad()<=0 && p1.getEdad()>=110) {
        System.out.println("La edad que ha ingresado no es valida");
        
}
    
}

public void sexo(persona p1){
    System.out.println("Ingrese el género de la persona (M o F):");
    p1.setSexo(sc.next());

    switch (p1.getSexo()) {
        case "F":
            System.out.println("El género de la persona es femenino.");
            break;
        case "M":
            System.out.println("El género de la persona es masculino.");
            break;
        default:
            System.out.println("caracter invalido, ingrese M para masculino y F para femenino");
            break;
    }
 
}
 
//public int calcularIMC(persona p1) {
public int calcularIMC(persona p1) {
    double imc = p1.getPeso() / (p1.getAltura() * p1.getAltura());

    if (imc < 20) {
        return -1; // por debajo del peso ideal
    } else if (imc >= 20 && imc <= 25) {
        return 0; // peso ideal
    } else {
        return 1; // sobrepeso
    }
}
    }



