/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej09poo;

import entidad.Matematica;
import java.util.Scanner;
import Service.serviceMatematica;
/**
 *
 * @author Usuario
 */
public class EJ09poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Pedimos al usuario que ingrese los números
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        // Creamos los objetos Matematica y ServiceMatematica con los números ingresados
        Matematica matematica = new Matematica(num1, num2);
        serviceMatematica service = new serviceMatematica(num1, num2);

        // Mostramos los números ingresados y los atributos del objeto Matematica
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        System.out.println("Atributo 1: " + matematica.getNumero1());
        System.out.println("Atributo 2: " + matematica.getNumero2());

        // Calculamos el mayor número y lo mostramos
        double mayor = service.devolverMayor();
        System.out.println("El mayor número es: " + mayor);

        // Calculamos la potencia del mayor número elevado al menor número y lo mostramos
        double potencia = service.calcularPotencia();
        System.out.println("La potencia del mayor número elevado al menor número es: " + potencia);

        // Calculamos la raíz cuadrada del menor número y lo mostramos
        double raiz = service.calcularRaiz();
        System.out.println("La raíz cuadrada del menor número es: " + raiz);
    }
}
/*El ejercicio que has presentado es un programa básico que utiliza conceptos de POO (Programación Orientada a Objetos) 
en Java. En este programa, se crean tres clases:

La clase Matematica: Esta clase contiene dos atributos que representan números, numero1 y numero2. Además, 
esta clase tiene dos constructores, un constructor vacío y un constructor que toma dos parámetros, los cuales son dos números. 
También tiene los métodos getNumero1() y getNumero2() que devuelven los valores de numero1 y numero2, respectivamente.

La clase serviceMatematica: Esta clase contiene un objeto de la clase Matematica y tres métodos: devolverMayor(), 
calcularPotencia() y calcularRaiz(). Estos métodos realizan diferentes operaciones matemáticas utilizando los valores de numero1 
y numero2 del objeto Matematica.

La clase EJ09poo: Esta es la clase principal del programa. Esta clase crea un objeto de la clase Matematica con dos números 
aleatorios generados por Math.random(). Luego, muestra los números generados y los atributos del objeto. Después, llama a los 
métodos devolverMayor(), calcularPotencia() y calcularRaiz() de la clase serviceMatematica para realizar operaciones matemáticas 
en los números generados.

Al ejecutar el programa, el usuario puede ingresar dos números en lugar de usar los generados aleatoriamente en la clase principal, 
lo que se hace a través de la clase Scanner. El programa muestra los números ingresados y los atributos del objeto Matematica. Luego, 
se realizan operaciones matemáticas en los números ingresados utilizando los métodos de la clase serviceMatematica y se muestran los 
resultados por pantalla.

En resumen, el programa utiliza POO para crear tres clases que interactúan entre sí para realizar operaciones matemáticas simples.*/