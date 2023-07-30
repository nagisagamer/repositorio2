/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package javaapplication76;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Usuario
 */
public class JavaApplication76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*ArrayList<integer> numerosA = new ArrayList();
        int x = 20;
        int j = 10;
        int y = 30;
        int z = 40;
        int w = 50;
         
        numerosA.add(x);
        numerosA.add(j);
        numerosA.add(y);
        numerosA.add(z);
        numerosA.add(w);
        
        HashSet<integer> numerosB = new Hashset();
        integer x = 20;
        integer j = 10;
        integer y = 30;
        integer z = 40;
        integer w = 50;
         
        numerosB.add(x);
        numerosB.add(j);
        numerosB.add(y);
        numerosB.add(z);
        numerosB.add(w);
        
        HashMap<integer, String> alumnos = new HashMap();
        int dni = 24921527;
        String nombreAlumno = "ana";
        double altura = 1.78;
        int edad = 20;
        int aniodecurso = 5;*/
        
        ArrayList<Integer> numerosA = new ArrayList<>();
int x = 20;
int j = 10;
int y = 30;
int z = 40;
int w = 50;

numerosA.add(x);
numerosA.add(j);
numerosA.add(y);
numerosA.add(z);
numerosA.add(w);
numerosA.remove(0);

HashSet<Integer> numerosB = new HashSet<>();
Integer a = 20;
Integer b = 10;
Integer c = 30;
Integer d = 40;
Integer e = 50;

numerosB.add(a);
numerosB.add(b);
numerosB.add(c);
numerosB.add(d);
numerosB.add(e);
numerosB.remove(d);

HashMap<Integer, String> alumnos = new HashMap<>();
int dni1 = 24921527;
String nombreAlumno1 = "ana";
double altura1 = 1.78;
int edad1 = 20;
int aniodecurso1 = 5;

int dni2 = 24921528;
String nombreAlumno2 = "juan";
double altura2 = 1.82;
int edad2 = 21;
int aniodecurso2 = 6;

alumnos.remove(dni1);
alumnos.remove(dni2);


alumnos.put(dni1, nombreAlumno1);
alumnos.put(dni2, nombreAlumno2);


        
        System.out.println(numerosA);    
        System.out.println(numerosB);   
        System.out.println(alumnos);
          
        
        
    }
    
}
