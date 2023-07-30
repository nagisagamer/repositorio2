/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herenciaguia1animal;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Herenciaguia1animal {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for (Animal animal : animales) {
            System.out.println(animal.hacerRuido());
        }
    }
}
