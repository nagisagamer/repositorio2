/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotapp.Servicios.ServicioMascota;
import mascotapp.entidades.Mascota;

/**
 *
 * @author Usuario
 */
public class MascotApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*esto importa el servicio mascota para que nazcan nuevas mascotas
        con los atributos mencionados en el paquete servicio mascota
        con esto se delega la creacion de mascotas a un servicio especializado
        en la creacion de mascotas*/
        
        ServicioMascota sm = new ServicioMascota();
        Mascota m1 = sm.crearMascota();
       System.out.println(m1.toString());
       //esto lo que hace es eliminar lo que ya no se volvera a usar
       m1 = null;
        
       // Scanner sc = new Scanner(System.in);
        //Mascota m2 = new Mascota();
       // Mascota m1 = new Mascota("fernando chiquito","chiquito" /*sc.next()*/, "perro");
        
       // m1.setNombre("pepe chiquito");
        //esto llama al atributo pasear, quiere decir:
        //que cuando lo pasee va a restar 100 de energia
       //System.out.println(m1.toString());
       //m1.pasear(100);
       //System.out.println(m1.toString());
        
        
        
        
        
       /* m1.apodo = "chiquito";
        m1.nombre = sc.next();
        m1.tipo = "perro";
        m1.edad = 14;
        m1.raza = "beagle";
        m1.cola = true;
        m1.color = "dorado";*/
        
        //System.out.println(m1.apodo+" "+m1.edad+" "+m1.tipo+" "+ m1.color);
        
//    public String nombre;
//    public String apodo;
//
//    public String tipo;
//    public String color;
//    public int edad;
//    public boolean cola;
//    public String raza;
}

}
