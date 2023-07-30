/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplosmetodos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class EjemplosMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1 fill(List<T> lista, Objeto objeto)    
        //Este método reemplaza todos los elementos de la lista con un elemento específico

    
        List<String> lista = new ArrayList<>(Arrays.asList("hola", "mundo", "java"));
        System.out.println("Lista antes del fill: " + lista);

        Collections.fill(lista, "ejemplo");
        System.out.println("Lista después del fill: " + lista);
        
        
        
          //2 frequency(Collection<T> coleccion, Objeto objeto)
//Este método retorna la cantidad de veces que se encuentra un elemento específico en una colección.


      /* List<String> lista = new ArrayList<>(Arrays.asList("hola", "mundo", "java", "hola"));
        int cantidad = Collections.frequency(lista, "hola");
        System.out.println("La palabra 'hola' aparece " + cantidad + " veces en la lista.");*/
      
      
      /*3 replaceAll(List<T> lista, T valorViejo, T valorNuevo)
Este método reemplaza todas las apariciones de un elemento específico en una lista, con otro valor.

Ejemplo:

        List<String> lista = new ArrayList<>(Arrays.asList("hola", "mundo", "java"));
        System.out.println("Lista antes del replaceAll: " + lista);

        Collections.replaceAll(lista, "hola", "adiós");
        System.out.println("Lista después del replaceAll: " + lista);
    }*/
      
      /*4 reverse(List<T> lista)
        Este método invierte el orden de los elementos de una lista.
        Ejemplo:
      
      List<String> lista = new ArrayList<>(Arrays.asList("hola", "mundo", "java"));
        System.out.println("Lista antes del reverse: " + lista);

        Collections.reverse(lista);
        System.out.println("Lista después del reverse: " + lista);*/
      
      /*5 reverseOrder()
Este método retorna un comparator que invierte el orden de los elementos de una colección.

Ejemplo:
      
      List<String> lista = new ArrayList<>(Arrays.asList("hola", "mundo", "java"));
        System.out.println("Lista antes del sort: " + lista);

        Comparator<String> comparador = Collections.reverseOrder();
        Collections.sort(lista, comparador);

        System.out.println("Lista después del sort con reverseOrder: " + lista);
      
       */
      
      /*6 Ejemplo de uso del método fill:

        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Lista original: " + lista);

        // Reemplazar todos los elementos de la lista con el número 0
        Collections.fill(lista, 0);
        System.out.println("Lista después de fill: " + lista); */
      
      
    }
}

        
        
    

        
        
    
    

