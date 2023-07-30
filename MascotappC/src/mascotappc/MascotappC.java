/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotappc;

import Service.ServiceMascota;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class MascotappC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  /*       // TODO code application logic here
   //se creo el array
    String[] nombresArray = new String[5];
    
    //se lleno de forma dinamica y en la posicion i
    //se van asignando disintos objetos
        for (int i = 0; i < nombresArray.length; i++) {
            nombresArray[i] = "chiquito " + (i + 1);
            
        }
        
        for (String var : nombresArray) {
            System.out.println("var");
        }
    
        //collections
        
        ArrayList<String> nombresArrayList = new ArrayList();
        
        nombresArrayList.add("chiquito");
        nombresArrayList.add("chiquito");
        nombresArrayList.add("chiquito");
        System.out.println(nombresArrayList.size());//la dimension bajo a 3
        nombresArrayList.remove("chiquito");
        System.out.println(nombresArrayList.size());//la dimension bajo a 2
            */
  ServiceMascota servMasc = new ServiceMascota();
  servMasc.crearMascota();
  servMasc.crearMascota();
    
    servMasc.mostrarMascotas();
                
 }
    }
    
     
