/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaejeextra1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class HerenciaEJEextra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de alquiler de barcos");
        System.out.print("Ingrese su nombre: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese su documento: ");
        String documentoCliente = scanner.nextLine();

        System.out.print("Ingrese la fecha de alquiler (YYYY-MM-DD): ");
        String fechaAlquilerStr = scanner.nextLine();
        LocalDate fechaAlquiler = LocalDate.parse(fechaAlquilerStr);

        System.out.print("Ingrese la fecha de devolución (YYYY-MM-DD): ");
        String fechaDevolucionStr = scanner.nextLine();
        LocalDate fechaDevolucion = LocalDate.parse(fechaDevolucionStr);

        System.out.print("Ingrese la posición del amarre: ");
        int posicionAmarre = scanner.nextInt();

        System.out.println("Seleccione el tipo de barco:");
        System.out.println("1. Velero");
        System.out.println("2. Barco a motor");
        System.out.println("3. Yate");
        System.out.print("Opción: ");
        int opcionBarco = scanner.nextInt();

        Barco barco;

        switch (opcionBarco) {
            case 1:
                System.out.print("Ingrese la matrícula del velero: ");
                String matriculaVelero = scanner.next();

                System.out.print("Ingrese la eslora del velero: ");
                double esloraVelero = scanner.nextDouble();

                System.out.print("Ingrese el año de fabricación del velero: ");
                int anioFabricacionVelero = scanner.nextInt();

                System.out.print("Ingrese el número de mástiles del velero: ");
                int numeroMastiles = scanner.nextInt();

                barco = new Velero(matriculaVelero, esloraVelero, anioFabricacionVelero, numeroMastiles);
                break;
            case 2:
                System.out.print("Ingrese la matrícula del barco a motor: ");
                String matriculaBarcoMotor = scanner.next();

                System.out.print("Ingrese la eslora del barco a motor: ");
                double esloraBarcoMotor = scanner.nextDouble();

                System.out.print("Ingrese el año de fabricación del barco a motor: ");
                int anioFabricacionBarcoMotor = scanner.nextInt();

                System.out.print("Ingrese la potencia en CV del barco a motor: ");
                int potenciaCV = scanner.nextInt();

                barco = new BarcoMotor(matriculaBarcoMotor, esloraBarcoMotor, anioFabricacionBarcoMotor, potenciaCV);
                break;
            case 3:
                System.out.print("Ingrese la matrícula del yate: ");
                String matriculaYate = scanner.next();

                System.out.print("Ingrese la eslora del yate: ");
                double esloraYate = scanner.nextDouble();

                System.out.print("Ingrese el año de fabricación del yate: ");
                int anioFabricacionYate = scanner.nextInt();

                System.out.print("Ingrese la potencia en CV del yate: ");
                int potenciaCVYate = scanner.nextInt();

                System.out.print("Ingrese el número de camarotes del yate: ");
                int numeroCamarotes = scanner.nextInt();

                barco = new Yate(matriculaYate, esloraYate, anioFabricacionYate, potenciaCVYate, numeroCamarotes);
                break;
            default:
                System.out.println("Opción inválida. Se seleccionará un velero por defecto.");
                barco = new Velero("VEL001", 10.5, 2000, 3);
        }

        Alquiler alquiler = new Alquiler(nombreCliente, documentoCliente, fechaAlquiler, fechaDevolucion,
                posicionAmarre, barco);

        double precioAlquiler = alquiler.calcularPrecio();

        System.out.println("El precio del alquiler es: " + precioAlquiler);
    }
}
        // Ejemplo de uso
       /* Velero velero = new Velero("VEL001", 10.5, 2000, 3);
        BarcoMotor barcoMotor = new BarcoMotor("BM001", 12.8, 2010, 300);
        Yate yate = new Yate("YAT001", 15.2, 2015, 500, 4);

        LocalDate fechaAlquiler = LocalDate.of(2023, 5, 1);
        LocalDate fechaDevolucion = LocalDate.of(2023, 5, 5);

        Alquiler alquilerVelero = new Alquiler("Juan", "12345678", fechaAlquiler, fechaDevolucion, 1, velero);
        Alquiler alquilerBarcoMotor = new Alquiler("Pedro", "87654321", fechaAlquiler, fechaDevolucion, 2, barcoMotor);
        Alquiler alquilerYate = new Alquiler("Ana", "56789012", fechaAlquiler, fechaDevolucion, 3, yate);

        double precioVelero = alquilerVelero.calcularPrecio();
        double precioBarcoMotor = alquilerBarcoMotor.calcularPrecio();
        double precioYate = alquilerYate.calcularPrecio();

        System.out.println("Precio del alquiler del velero: " + precioVelero);
        System.out.println("Precio del alquiler del barco a motor: " + precioBarcoMotor);
        System.out.println("Precio del alquiler del yate: " + precioYate);
    }
    }*/
    

