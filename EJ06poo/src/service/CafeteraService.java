/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import java.util.Scanner;
import nespresso.Cafetera;
/**
 *
 * @author Usuario
 */
//aqui creamos el objeto que llamara el main
//aqui crearemos las operaciones que realizara el objeto

 public class CafeteraService {
     Scanner sc = new Scanner(System.in);
    public Cafetera crearcafetera(){
        Cafetera c1 = new Cafetera();
        System.out.println("ingrese la cantidad maxima de la cafetera:");
        c1.setCapacidadMaxima(sc.nextInt());
        return c1;
    }
     //aca se le dice al subproceso que va a colocar sus datos en el c1 que se creo
   public void llenar(Cafetera c1){
       //aca cantidad actual va a pasar a valer capacidad maxima
       //decimos que se va a llenar
       //si dependiendo de lo que ingrese el usuario arriba
       
    c1.setCantidadActual(c1.getCapacidadMaxima());
   
 }
   
   public void servirTaza(Cafetera c1){
       System.out.println("ingrese el valor de la tasa");
       int taza = sc.nextInt();
       
       if (c1.getCantidadActual()>= taza) {
       c1.setCantidadActual(c1.getCantidadActual()- taza);
           System.out.println("ya lleno la taza");
           System.out.println("la cantidad de cafe en la cafetera es:"+c1.getCantidadActual());
           
        } else { 
           
           System.out.println("La taza no esta llena :( ");
           System.out.println("La taza se lleno" +(100*c1.getCantidadActual()/taza)+"%");
           
           c1.setCantidadActual(0); 
       }
    }
   
   public void vaciarCafetera(Cafetera c1){
       if (c1.getCantidadActual()==0) {
           System.out.println("la cafetera esta vacia :D");
        }else {
        c1.setCantidadActual(0);
           System.out.println("Ahora si la cafetera se vacio");
       }
   }
   
   public void agregarCafe(Cafetera c1){
       System.out.println("puede agregar un maximo de"+(c1.getCapacidadMaxima()-c1.getCantidadActual()));
       c1.setCantidadActual(c1.getCantidadActual()+sc.nextInt());
       System.out.println("la cafetera tiene" +c1.getCantidadActual()+ "cafe");
   }
  
   }
     
    

