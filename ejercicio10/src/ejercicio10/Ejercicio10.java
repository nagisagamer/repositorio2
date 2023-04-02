/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // TODO code application logic here
        System.out.println("Ingrese un número: ");
        Scanner leer =  new Scanner(System.in);
       
        for(int i = 0; i<4;i++){
             int num = leer.nextInt();
              System.out.print(num+ " ");
           for(int j = 0; j<num;j++){
               System.out.print("*");
        } 
        }
        
    }
    
}
    }
    
}
