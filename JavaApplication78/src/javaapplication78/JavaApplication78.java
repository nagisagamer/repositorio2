/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication78;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class JavaApplication78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Como pudimos ver más arriba para eliminar un elemento de una colección vamos a tener que
utilizar la función remove() del Iterator. Esto se aplica para el resto de nuestras colecciones. Los
mapas son los únicos que no podemos eliminar mientras las iteramos.

MANOS A LA OBRA - DETECCIÓN DE ERRORES
ArrayList<String> = new ArrayList()
bebidas.put(“café);
bebidas.add(“té”);
Iterator<String> it =bebidas.iterator();
whale (it.next()){
if (it.next().equals(“café”)){
it.remove();
}*/
        
/*Hay algunos errores en este código que necesitan ser corregidos. Primero, cuando 
se declara el ArrayList, es necesario especificar el tipo de elementos que contendrá 
entre los paréntesis angulares. En este caso, queremos un ArrayList de Strings, 
por lo que la declaración debería ser:

java
Copy code
ArrayList<String> bebidas = new ArrayList<>();
Luego, hay un error de sintaxis al agregar el primer elemento al ArrayList. 
La cadena "café" no está cerrada con comillas dobles, y el método put() no es un método 
válido para ArrayList. Para agregar elementos a un ArrayList, debemos utilizar el 
 método add(). Entonces, la línea debería ser:

java
Copy code
bebidas.add("café");

En la siguiente línea, hay un error de ortografía en la palabra "while". 
Además, la condición en el bucle está utilizando el método next() dos veces. 
Esto hará que el bucle se saltee cada segundo elemento. En lugar de eso, debemos 
guardar el resultado de it.next() en una variable y luego utilizar esa variable 
en la condición y en la comparación dentro del bloque del bucle. Finalmente, 
la comparación dentro del bloque del bucle debe ser con equalsIgnoreCase() en 
lugar de equals(), para que la eliminación de elementos sea insensible a mayúsculas 
y minúsculas. Entonces, el código corregido quedaría así:*/


ArrayList<String> bebidas = new ArrayList<>();
bebidas.add("café");
bebidas.add("té");

Iterator<String> it = bebidas.iterator();
while (it.hasNext()) {
String bebida = it.next();
if (bebida.equalsIgnoreCase("café")) {
it.remove();
    System.out.println(bebidas);
    }
}
//Con estos cambios, el código debería funcionar correctamente y eliminar el elemento "café" de la lista de bebidas.
    }
    
}
