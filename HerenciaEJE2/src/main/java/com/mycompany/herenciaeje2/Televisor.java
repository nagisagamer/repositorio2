/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaeje2;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

/*Se debe crear tambiÃ©n una subclase llamada Televisor con los siguientes atributos: resoluciÃ³n (en pulgadas) y sintonizador TDT (booleano), 
ademÃ¡s de los atributos heredados.
Los constructores que se implementarÃ¡n serÃ¡n:
â€¢ Un constructor vacÃ­o.
â€¢ Un constructor con la resoluciÃ³n, sintonizador TDT y el resto de los atributos heredados. Recuerda que debes llamar al constructor de la 
clase padre.
Los mÃ©todos que se implementara serÃ¡n:
â€¢ MÃ©todo get y set de los atributos resoluciÃ³n y sintonizador TDT.
â€¢ MÃ©todo crearTelevisor(): este mÃ©todo llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los atributos heredados del 
padre y despuÃ©s llenamos los atributos del televisor.
â€¢ MÃ©todo precioFinal(): este mÃ©todo serÃ¡ heredado y se le sumarÃ¡ la siguiente funcionalidad. Si el televisor tiene una resoluciÃ³n mayor de 
40 pulgadas, se incrementarÃ¡ el precio un 30% y si tiene un sintonizador TDT incorporado, aumentarÃ¡ $500. Recuerda que las condiciones que 
hemos visto en la clase Electrodomestico tambiÃ©n deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los mÃ©todos necesarios para mostrar el precio final de los dos electrodomÃ©sticos.
 */
public class Televisor extends Electrodomesticos {

    protected int resolucion;
    protected boolean sintonizador;

//    MÃ©todo crearTelevisor(): este mÃ©todo llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los atributos heredados del 
//padre y despuÃ©s llenamos los atributos del televisor.
//    
    public Televisor() {
    }

    public Televisor(double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
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

    public void setPeso(double peso) {
        this.peso = peso;
    }

//     MÃ©todo crearTelevisor(): este mÃ©todo llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los atributos heredados del 
//padre y despuÃ©s llenamos los atributos del televisor.
    public void crearTelevidor() {
        crearElectrodomestico();
        System.out.println("Ingrese la resoluciÃ³n preferida para su televisor");
        this.resolucion = leer.nextInt();
        System.out.println("Desea una televiÃ³n con sintonizador?");

        String op = leer.next();

        if (op.equalsIgnoreCase("Si")) {
            this.sintonizador = true;

        }else{
            this.sintonizador = false;
        }

    }

//    MÃ©todo precioFinal(): este mÃ©todo serÃ¡ heredado y se le sumarÃ¡ la siguiente funcionalidad. Si el televisor tiene una resoluciÃ³n mayor de 
//40 pulgadas, se incrementarÃ¡ el precio un 30% y si tiene un sintonizador TDT incorporado, aumentarÃ¡ $500. Recuerda que las condiciones que 
//hemos visto en la clase Electrodomestico tambiÃ©n deben afectar al precio.
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            this.precio = this.precio * 1.30;

        }
        if (this.sintonizador) {
            this.precio += 500;
        }

    }
}
