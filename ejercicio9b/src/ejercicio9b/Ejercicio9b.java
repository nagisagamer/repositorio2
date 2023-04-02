/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9b;
import java.util.Scanner;
/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.*/
public class Ejercicio9b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    //se crean 2 variables, la de numero, que almacenara el numero ingresado por el usuario.
    int numero;
    //y la variable de contador que es la que leera los 20 numeros.
    int contador=0;
    do { 
    System.out.print("Ingrese un número: ");
    // esta formula: numero = sc.nextInt(); asigna el numero que ingresa el usuario a la variable creada.
         numero = sc.nextInt();
         // asignar un incremento a la variable contador, hace que podamos contar cuantas veces se repetira el bucle.
         contador++; {
        /*verificar si el número ingresado por el usuario es igual a 0. Si el número ingresado es 0, 
entonces se ejecuta la instrucción break que hace que el bucle se detenga inmediatamente, sin esperar a que se cumpla la condición del while*/
          if (numero == 0) {
            break;
     }    
    // while despues de do verifica que el contador no se pase de 20, si no el bucle se ejecutara infinitamente.
     } }while (contador < 20);

      System.out.println("Fin del programa.");
    
   
    
}
    }
    
