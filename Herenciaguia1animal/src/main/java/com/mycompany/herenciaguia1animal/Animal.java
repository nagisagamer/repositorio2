/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaguia1animal;

/**
 *
 * @author Usuario
 */

    class Animal {
    public String hacerRuido() {
        return "Hola";
    }
}

class Perro extends Animal {
    @Override
    public String hacerRuido() {
        return "Guau";
    }
}

class Gato extends Animal {
    @Override
    public String hacerRuido() {
        return "Miau";
    }
}

