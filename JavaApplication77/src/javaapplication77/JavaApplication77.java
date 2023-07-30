/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication77;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class JavaApplication77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

HashMap<Integer, String> personas = new HashMap<>();

personas.put(1, "Albus");

personas.put(2, "Severus");;

for (Map.Entry<Integer, String> entry : personas.entrySet()) {
    System.out.println("Llave: " + entry.getKey() + ", Valor: " + entry.getValue());
}
        
    }
    
}
