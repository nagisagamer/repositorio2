 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7b;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio_7b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String motor;
        System.out.println("ingresa un valor entre 1 y 4");
        motor = sc.nextLine();
        switch (motor) {
            case "1":
             System.out.println("La bomba es una bomba de agua");
            break;
             case "2":
                
             System.out.println("La bomba es una bomba de gasolina");
            break;
            case "3":
             System.out.println("La bomba es una bomba de hormigon");
            break;
            case "4":
             System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
            default:
             System.out.println("No existe un valor válido para el tipo de bomba");
           
        }
                
        
        
    }
    
}
