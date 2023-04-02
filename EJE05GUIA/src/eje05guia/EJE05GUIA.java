/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje05guia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE05GUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num = sc.nextInt();
        int doble = num*2;
        
        System.out.println("el doble de este numero es: "+doble );
        int triple = num*3;
        System.out.println("el triple de este numero es: "+triple );
        double raiz = Math.sqrt(num);
        System.out.println("La raiz cuadreda de este numero es: "+raiz );
    }
    
}
