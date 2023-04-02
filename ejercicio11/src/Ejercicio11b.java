/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner
package ejercicio11;

/**
 *
 * @author Usuario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase terminada en punto: ");
        String frase = leer.nextLine();
        String codificada = codificarFrase(frase);
        System.out.println("Frase codificada: " + codificada);
        leer.close();
    }

    public static String codificarFrase(String frase) {
        // Convertir la frase a minúsculas
        frase = frase.toLowerCase();
        
        // Definir la tabla de codificación
        final String VOWELS = "aeiou";
        final String CODES = "@#$%*";

        // Inicializar la frase codificada
        String codificada = "";

        // Iterar sobre cada caracter de la frase
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            int indiceVocal = VOWELS.indexOf(caracter);

            // Si el caracter es una vocal, codificarla
            if (indiceVocal >= 0) {
                char codigo = CODES.charAt(indiceVocal);
                codificada = codificada.concat(Character.toString(codigo));
            } else {
                codificada = codificada.concat(Character.toString(caracter));
            }
        }

        return codificada;
    }

    }
    

