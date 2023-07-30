/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesironman;

/**
 *
 * @author Usuario
 */
public class Simulador extends Radar {
    
    private static final int MAX_ENEMIGOS = 10;

    public Simulador(String colorPrimario, String colorSecundario, int resistencia) {
        super(colorPrimario, colorSecundario, resistencia);
    }
    
     // Método para agregar objetos al radar de forma aleatoria
    public void agregarObjetosAleatorios() {
        Random random = new Random();

        int cantidadObjetos = random.nextInt(MAX_ENEMIGOS) + 1; // Genera un número aleatorio entre 1 y MAX_ENEMIGOS

        for (int i = 0; i < cantidadObjetos; i++) {
            int coordenadaX = random.nextInt(100);
            int coordenadaY = random.nextInt(100);
            int coordenadaZ = random.nextInt(100);
            boolean hostil = random.nextBoolean();
            int resistencia = random.nextInt(100);

            ObjetoEnemigo enemigo = new ObjetoEnemigo("Objeto " + (i + 1), coordenadaX, coordenadaY, coordenadaZ, hostil, resistencia);
            agregarEnemigo(enemigo);
        }

        if (cantidadObjetos > MAX_ENEMIGOS) {
            System.out.println("Se han agregado más de " + MAX_ENEMIGOS + " objetos al radar.");
        }
    }

    // Método para aumentar la capacidad del radar
    public void aumentarCapacidadRadar(int nuevaCapacidad) {
        if (nuevaCapacidad > MAX_ENEMIGOS) {
            MAX_ENEMIGOS = nuevaCapacidad;
            System.out.println("Se ha aumentado la capacidad del radar a " + nuevaCapacidad + " objetos.");
        } else {
            System.out.println("La nueva capacidad del radar debe ser mayor a " + MAX_ENEMIGOS + ".");
        }
}
}
