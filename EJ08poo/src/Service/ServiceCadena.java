/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidad.Cadena;

/**
 *
 * @author Usuario
 */
public class ServiceCadena {
    public static int mostrarVocales(Cadena cadena) {
     int contador = 0;
    String vocales = "aeiou";
    if (cadena == null) {
    } else {
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (vocales.indexOf(Character.toLowerCase(cadena.getFrase().charAt(i))) != -1) {
                contador++;
            }
        }
        }
        return contador;
    }
    public static String invertirFrase(Cadena cadena) {
        String fraseInvertida = "";
        for (int i = cadena.getFrase().length() - 1; i >= 0; i--) {
            fraseInvertida += cadena.getFrase().charAt(i);
        }
        return fraseInvertida;
    }
    
    public static int vecesRepetido(Cadena cadena, String letra) {
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }
        return contador;
    }
    
    public static boolean contiene(Cadena cadena, String letra) {
        return cadena.getFrase().indexOf(letra) != -1;
    }
    
    public static void compararLongitud(Cadena cadena, String frase) {
        if (cadena.getLongitud() > frase.length()) {
            System.out.println("La frase ingresada es más corta.");
        } else if (cadena.getLongitud() < frase.length()) {
            System.out.println("La frase ingresada es más larga.");
        } else {
            System.out.println("Las frases tienen la misma longitud.");
        }
    }
    
    public static String unirFrases(Cadena cadena, String frase) {
        return cadena.getFrase() + " " + frase;
    }
    
    public static String reemplazar(Cadena cadena, String letra, String reemplazo) {
        return cadena.getFrase().replace(letra, reemplazo);
    }
}
    
