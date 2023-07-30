/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej07poo;

import entidad.persona;
import service.personaService;

/**
 *
 * @author Usuario
 */
public class EJ07poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        personaService service = new personaService();
persona p1 = service.crearPersona();
service.edad(p1);
service.sexo(p1);

int resultadoIMC = service.calcularIMC(p1);
switch (resultadoIMC) {
    case -1:
        System.out.println("La persona está por debajo de su peso ideal.");
        break;
    case 0:
        System.out.println("La persona está en su peso ideal.");
        break;
    default:
        System.out.println("La persona tiene sobrepeso.");
        break;
}
}
}
   
