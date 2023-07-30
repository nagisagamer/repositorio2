/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaeje2;
import java.util.Scanner;

// consumo energÃ©tico (letras entre A y F) y peso.  
// Los constructores que se deben implementar son los siguientes: 
// â€¢ Un constructor vacÃ­o. 
// â€¢ Un constructor con todos los atributos pasados por parÃ¡metro. 
// Los mÃ©todos a implementar son:  
// â€¢ MÃ©todos getters y setters de todos los atributos. 
public class Electrodomesticos {

     protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected double precio;
    protected String color;
    protected char consumoEnergetico;

    protected double peso;

    public Electrodomesticos() {
        this.precio = 1000;
    }

    public Electrodomesticos(double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        if (!(this.color.equalsIgnoreCase("Blanco")
                || this.color.equalsIgnoreCase("Negro")
                || this.color.equalsIgnoreCase("Rojo")
                || this.color.equalsIgnoreCase("Azul")
                || this.color.equalsIgnoreCase("Gris"))) {
            this.color = "Blanco";
        }
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        if (!(this.consumoEnergetico <= 'A' && this.consumoEnergetico >= 'F')) {
            this.consumoEnergetico = 'F';

        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    //MÃ©todo comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, 
// sino es correcta usara la letra F por defecto. Este mÃ©todo se debe invocar al crear el 
// objeto y no serÃ¡ visible. 
//     protected void comprobarConsumoEnergetico(char letra){
//         if (!(this.consumoEnergetico<='A'&& this.consumoEnergetico>='F')) {
//             this.consumoEnergetico='F';
    //â€¢ MÃ©todo comprobarColor(String color): comprueba que el color es correcto, y si no lo es, 
// usa el color blanco por defecto. Los colores disponibles para los electrodomÃ©sticos son 
// blanco, negro, rojo, azul y gris. No importa si el nombre estÃ¡ en mayÃºsculas o en 
// minÃºsculas. Este mÃ©todo se invocarÃ¡ al crear el objeto y no serÃ¡ visible.
//    private void comprobarColor(String color) {
//        if (!(this.color.equalsIgnoreCase("Blanco")
//                || this.color.equalsIgnoreCase("Negro")
//                || this.color.equalsIgnoreCase("Rojo")
//                || this.color.equalsIgnoreCase("Azul")
//                || this.color.equalsIgnoreCase("Gris"))) {
//            this.color = "Blanco";
//        }
//
//    }
// â€¢ Metodo crearElectrodomestico(): le pide la informaciÃ³n al usuario y llena el 
// electrodomÃ©stico, tambiÃ©n llama los mÃ©todos para comprobar el color y el consumo. Al 
// precio se le da un valor base de $1000. 
    protected void crearElectrodomestico() {
        Electrodomesticos E1 = new Electrodomesticos();
        System.out.println("Ingrese el color de su preferencia");
        this.color = leer.next();
        System.out.println("Ingrese el Consumo EnergÃ©tico de su preferencia");
        this.consumoEnergetico = leer.next().charAt(consumoEnergetico);
        System.out.println("Ingrese el peso de su preferencia");
        this.peso = leer.nextInt();

    }

// â€¢ MÃ©todo precioFinal(): segÃºn el consumo energÃ©tico y su tamaÃ±o, aumentarÃ¡ el valor del 
// precio. Esta es la lista de precios: 
//A $1000 B $800 C $600 D $500 E $300 F $100
//Entre 1 y 19 kg $100
//Entre 20 y 49 kg $500 Entre 50 y 79 kg $800 Mayor que 80 kg $1000
    protected void precioFinal() {

        switch (this.consumoEnergetico) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;

                break;

        }
        if (this.peso >= 1 && this.peso <= 19) {

            this.precio += 100;
        }
        if (this.peso >= 20 && this.peso <= 49) {

            this.precio += 500;

        }
        if (this.peso >= 50 && this.peso <= 79) {

            this.precio += 800;

            if (this.peso > 80) {

                this.precio += 1000;
            }
        }
    }
}
