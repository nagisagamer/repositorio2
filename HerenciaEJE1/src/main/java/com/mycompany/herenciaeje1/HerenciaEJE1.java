/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herenciaeje1;

import com.mycompany.herenciaeje1.Animal;

/**
 *
 * @author Usuario
 */
public class HerenciaEJE1 {

    public static void main(String[] args) {
        
       /* Animal animal = new Animal( "samy","Carnivoro", 15, "Doberman" );*/
        // Declaración y llamada para el objeto Perro
        Perro perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.alimentarse();

        // Declaración y llamada para otro objeto Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();

        // Declaración y llamada para el objeto Gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.alimentarse();

        // Declaración y llamada para el objeto Caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();
    }
    }

