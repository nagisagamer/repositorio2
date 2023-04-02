/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LibroService {
    //llamar a la clase libro donde estan los atributos
    public Libro crearlibro(){
        
   
    Libro l1 = new Libro();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("ingrese el número ISBN del libro:");
    l1.setIsbn(sc.nextInt());
     sc.nextLine(); // consume el caracter de fin de línea
     
    System.out.println("ingrese el titulo del libro:");
    l1.setTitulo(sc.nextLine());
    
    System.out.println("ingrese el autor del libro:");
    l1.setAutor(sc.nextLine());
    
    System.out.println("ingrese el número de paginas del libro:");
    l1.setPaginas(sc.nextInt());
    
    return l1;
     }
}
