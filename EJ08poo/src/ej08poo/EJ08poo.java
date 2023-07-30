/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej08poo;

import Service.ServiceCadena;
import entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJ08poo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        Cadena c1 = new Cadena(frase);

        System.out.println("La frase ingresada tiene " + ServiceCadena.mostrarVocales(c1) + " vocales.");
        System.out.println("La frase invertida es: " + ServiceCadena.invertirFrase(c1));

        System.out.print("Ingrese una letra: ");
        String letra = scanner.nextLine();
        System.out.println("La letra " + letra + " se repite " + ServiceCadena.vecesRepetido(c1, letra) + " veces.");

        System.out.print("Ingrese una nueva frase: ");
        String nuevaFrase = scanner.nextLine();
        ServiceCadena.compararLongitud(c1, nuevaFrase);
        System.out.println("La nueva frase es:" + nuevaFrase);

        // Llamada al método "contiene"
        System.out.print("Ingrese una letra para buscar en la frase: ");
        String letraBuscar = scanner.nextLine();
        System.out.println("La frase " + (ServiceCadena.contiene(c1, letraBuscar) ? "sí" : "no") + " contiene la letra " + letraBuscar);

        // Llamada al método "unirFrases"
        System.out.print("Ingrese una nueva frase para unir a la anterior: ");
        String nuevaFraseUnir = scanner.nextLine();
        System.out.println("La nueva frase unida a la anterior es: " + ServiceCadena.unirFrases(c1, nuevaFraseUnir));

        // Llamada al método "reemplazar"
        System.out.print("Ingrese una letra para reemplazar en la frase: ");
        String letraReemplazar = scanner.nextLine();
        System.out.print("Ingrese la letra que reemplazará a la anterior: ");
        String letraReemplazo = scanner.nextLine();
        System.out.println("La frase con la letra " + letraReemplazar + " reemplazada por la letra " + letraReemplazo + " es: " + ServiceCadena.reemplazar(c1, letraReemplazar, letraReemplazo));
    }
}