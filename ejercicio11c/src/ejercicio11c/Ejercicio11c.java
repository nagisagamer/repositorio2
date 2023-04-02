/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11c;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio11c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase terminada en punto: ");
        String frase = sc.nextLine();
        String codificada = codificarFrase(frase);
        System.out.println("Frase codificada: " + codificada);
        sc.close();
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
    /*Este ejercicio es un ejemplo de cómo se puede utilizar Java para codificar una frase. 
El programa toma una frase ingresada por el usuario, la convierte a minúsculas y luego la codifica, 
reemplazando cada vocal por un carácter especial. El resultado codificado se imprime en la consola.
El programa utiliza una función llamada "codificarFrase" que acepta una cadena de caracteres como 
argumento y devuelve una cadena de caracteres codificada. La función utiliza dos constantes: "VOWELS" y "CODES". 
"VOWELS" es una cadena de caracteres que contiene las cinco vocales en minúsculas ("aeiou"), 
mientras que "CODES" es una cadena de caracteres que contiene cinco caracteres especiales ("@#$%*").

La función recorre cada caracter de la cadena de entrada y verifica si es una vocal o no. 
Si el caracter es una vocal, la función determina el índice de la vocal en la cadena "VOWELS" y 
utiliza ese índice para obtener el carácter correspondiente en la cadena "CODES". El carácter codificado se 
agrega a la cadena "codificada". Si el caracter no es una vocal, se agrega a la cadena "codificada" sin cambios.

El programa principal utiliza la función "codificarFrase" para codificar la frase ingresada por el usuario y 
luego imprime la frase codificada en la consola. El programa utiliza la clase "Scanner" para leer la entrada 
del usuario desde la consola.
*/