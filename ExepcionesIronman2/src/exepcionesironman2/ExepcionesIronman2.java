/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exepcionesironman2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExepcionesIronman2 {

    /**
     * @param args the command line arguments
     */
   
   

        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los detalles de la armadura
        System.out.println("Ingrese el color primario de la armadura:");
        String colorPrimario = scanner.nextLine();

        System.out.println("Ingrese el color secundario de la armadura:");
        String colorSecundario = scanner.nextLine();

        System.out.println("Ingrese el nivel de resistencia de la armadura:");
        int nivelResistencia = scanner.nextInt();

        System.out.println("Ingrese el nivel de salud de la armadura:");
        int nivelSalud = scanner.nextInt();

        // Crear una instancia de la armadura con los detalles ingresados
        Armadura armadura = new Armadura(colorPrimario, colorSecundario, nivelResistencia, nivelSalud);

        // Mostrar el menú de opciones
        int opcion;
        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Caminar");
            System.out.println("2. Correr");
            System.out.println("3. Propulsar");
            System.out.println("4. Volar");
            System.out.println("5. Usar guante como arma");
            System.out.println("6. Escribir en consola");
            System.out.println("7. Hablar por sintetizador");
            System.out.println("8. Calcular distancia a enemigos");
            System.out.println("9. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            // Realizar la acción correspondiente según la opción elegida
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el tiempo en segundos para caminar:");
                        int tiempoCaminar = scanner.nextInt();
                        armadura.caminar(tiempoCaminar);
                        System.out.println("Caminando...");
                        break;
                    case 2:
                        System.out.println("Ingrese el tiempo en segundos para correr:");
                        int tiempoCorrer = scanner.nextInt();
                        armadura.correr(tiempoCorrer);
                        System.out.println("Corriendo...");
                        break;
                    case 3:
                        System.out.println("Ingrese el tiempo en segundos para propulsar:");
                        int tiempoPropulsar = scanner.nextInt();
                        armadura.propulsar(tiempoPropulsar);
                        System.out.println("Propulsando...");
                        break;
                    case 4:
                        System.out.println("Ingrese el tiempo en segundos para volar:");
                        int tiempoVolar = scanner.nextInt();
                        armadura.volar(tiempoVolar);
                        System.out.println("Volando...");
                        break;
                    case 5:
                        System.out.println("Ingrese el tiempo en segundos para usar el guante como arma:");
                        int tiempoGuante = scanner.nextInt();
                        armadura.usarGuanteComoArma(tiempoGuante);
                        System.out.println("Usando guante como arma...");
                        break;
                    case 6:
                        System.out.println("Ingrese el mensaje a escribir en la consola:");
                        scanner.nextLine(); // Consumir el salto de línea pendiente
                        String mensajeConsola = scanner.nextLine();
                        armadura.escribirEnConsola(mensajeConsola);
                        System.out.println("Mensaje escrito en la consola: " + mensajeConsola);
                        break;
                    case 7:
                        System.out.println("Ingrese el mensaje a hablar por el sintetizador:");
                        scanner.nextLine(); // Consumir el salto de línea pendiente
                        String mensajeSintetizador = scanner.nextLine();
                        armadura.hablarPorSintetizador(mensajeSintetizador);
                        System.out.println("Mensaje hablado por el sintetizador: " + mensajeSintetizador);
                        break;
                    case 8:
                        int numObjetos = scanner.nextInt();
                        ObjetoRadar[] objetos = new ObjetoRadar[numObjetos];
    
                        for (int i = 0; i < numObjetos; i++) {
                        System.out.println("Ingrese los detalles del objeto " + (i + 1));
                        System.out.println("Ingrese las coordenadas del objeto X, Y, Z:");
                        double coordenadaX = scanner.nextDouble();
                        double coordenadaY = scanner.nextDouble();
                        double coordenadaZ = scanner.nextDouble();
                        
        
                        System.out.println("¿El objeto es hostil? (true/false):");
                        boolean hostil = scanner.nextBoolean();
                        
                        System.out.println("Ingrese la resistencia del objeto:");
                        int resistencia = scanner.nextInt();
        
                        // Crear una instancia de ObjetoRadar con los detalles ingresados
                        objetos[i] = new ObjetoRadar(coordenadaX, coordenadaY, coordenadaZ, hostil, resistencia);
                         }
    
                        armadura.calcularDistanciaEnemigos(objetos);
                        break;
                    
                    case 9:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (EnergiaInsuficienteException e) {
                System.out.println("No hay suficiente energía para realizar la acción.");
            }

        } while (opcion != 9);
    }
    }