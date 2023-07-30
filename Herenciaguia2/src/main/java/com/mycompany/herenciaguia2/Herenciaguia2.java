/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herenciaguia2;

/*En este caso, se crea una clase MiClase que implementa la 
interfaz MiInterfaz y proporciona una implementación concreta para el método 
metodoAbstracto(). Luego, en el main, se instancia un objeto objeto de tipo
MiInterfaz utilizando la implementación de MiClase. Finalmente, se llama al método 
metodoAbstracto() y se imprime el resultado.
En resumen, una interfaz define un contrato que las clases pueden implementar, 
pero no se pueden instanciar directamente. Debes crear una clase que implemente la 
interfaz y luego instanciar objetos de esa clase para utilizar el contrato definido 
por la interfaz.
 */
interface MiInterfaz {
    void metodoAbstracto();
}

class MiClase implements MiInterfaz {
    @Override
    public void metodoAbstracto() {
        System.out.println("Implementación del método abstracto");
    }
}

public class Herenciaguia2 {
    public static void main(String[] args) {
        MiInterfaz objeto = new MiClase();
        objeto.metodoAbstracto(); // Imprime: "Implementación del método abstracto"
    }
}

