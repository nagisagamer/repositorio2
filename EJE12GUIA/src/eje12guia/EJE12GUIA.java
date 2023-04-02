/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje12guia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE12GUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner scanner = new Scanner(System.in);
        String inputStr;
        int correctCount = 0;
        int incorrectCount = 0;

        do {
            inputStr = readString(scanner);
            if (inputStr.equals("&&&&&")) {
                break;
            }
            if (isValidInput(inputStr)) {
                System.out.println("Cadena válida recibida: " + inputStr);
                correctCount++;
            } else {
                System.out.println("Cadena incorrecta recibida: " + inputStr);
                incorrectCount++;
            }
        } while (true);

        System.out.println("Informe: ");
        System.out.println("Cantidad de lecturas correctas: " + correctCount);
        System.out.println("Cantidad de lecturas incorrectas: " + incorrectCount);
    }

    private static String readString(Scanner scanner) {
        System.out.print("Ingrese una cadena con formato X****O (5 caracteres max): ");
        return scanner.nextLine().trim();
    }

    private static boolean isValidInput(String inputStr) {
        if (inputStr.length() != 5) {
            return false;
        }
        if (inputStr.charAt(0) != 'X') {
            return false;
        }
        if (inputStr.charAt(inputStr.length() - 1) != 'O') {
            return false;
        }
        return true;
    }
    
}
/*En este ejemplo, se utiliza un bucle do-while para solicitar al usuario una 
cadena repetidamente hasta que el usuario ingrese la cadena especial "&&&&&". 
Cada vez que se recibe una cadena, se verifica si es válida utilizando la función 
isValidInput. Si la cadena es válida, se imprime un mensaje indicando que se ha 
recibido una cadena válida y se incrementa el contador de lecturas correctas. Si 
la cadena no es válida, se imprime un mensaje indicando que se ha recibido una cadena 
incorrecta y se incrementa el contador de lecturas incorrectas.

Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para contar la cantidad de lecturas correctas e 
incorrectas, se utilizan dos contadores (correctCount e incorrectCount) que se incrementan 
cada vez que se recibe una lectura válida o inválida, respectivamente.

En cuanto a las funciones utilizadas:

inputStr.length() devuelve la longitud de la cadena inputStr.
inputStr.charAt(index) devuelve el carácter en la posición index de la cadena inputStr.
inputStr.equals(otherStr) devuelve true si la cadena inputStr es igual a la cadena otherStr.*/