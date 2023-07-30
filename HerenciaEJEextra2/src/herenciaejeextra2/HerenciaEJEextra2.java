/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaejeextra2;


import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class HerenciaEJEextra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scanner = new Scanner(System.in);
        
     ArrayList<Edificio> edificios = new ArrayList<>();

    // Ingresar datos para el primer polideportivo
    System.out.println("Ingrese los datos para el primer polideportivo:");
    System.out.print("Nombre: ");
    String nombre1 = scanner.nextLine();
    System.out.print("Tipo de instalación (Techado/Abierto): ");
    String tipoInstalacion1 = scanner.nextLine();
    System.out.print("Ancho: ");
    double ancho1 = scanner.nextDouble();
    System.out.print("Largo: ");
    double largo1 = scanner.nextDouble();
    System.out.print("Alto: ");
    double alto1 = scanner.nextDouble();
    scanner.nextLine(); // Limpiar el buffer de entrada

    // Ingresar datos para el segundo polideportivo
    System.out.println("Ingrese los datos para el segundo polideportivo:");
    System.out.print("Nombre: ");
    String nombre2 = scanner.nextLine();
    System.out.print("Tipo de instalación (Techado/Abierto): ");
    String tipoInstalacion2 = scanner.nextLine();
    System.out.print("Ancho: ");
    double ancho2 = scanner.nextDouble();
    System.out.print("Largo: ");
    double largo2 = scanner.nextDouble();
    System.out.print("Alto: ");
    double alto2 = scanner.nextDouble();
    scanner.nextLine(); // Limpiar el buffer de entrada

    // Crear instancias de Polideportivo y agregarlas a la lista de edificios
    Polideportivo polideportivo1 = new Polideportivo(nombre1, tipoInstalacion1, ancho1, largo1, alto1);
    Polideportivo polideportivo2 = new Polideportivo(nombre2, tipoInstalacion2, ancho2, largo2, alto2);

    edificios.add(polideportivo1);
    edificios.add(polideportivo2);

    // Ingresar datos para el primer edificio de oficinas
    System.out.println("Ingrese los datos para el primer edificio de oficinas:");
    System.out.print("Número de oficinas: ");
    int numOficinas1 = scanner.nextInt();
    System.out.print("Cantidad de personas por oficina: ");
    int personasPorOficina1 = scanner.nextInt();
    System.out.print("Número de pisos: ");
    int numPisos1 = scanner.nextInt();

    // Ingresar datos para el segundo edificio de oficinas
    System.out.println("Ingrese los datos para el segundo edificio de oficinas:");
    System.out.print("Número de oficinas: ");
    int numOficinas2 = scanner.nextInt();
    System.out.print("Cantidad de personas por oficina: ");
    int personasPorOficina2 = scanner.nextInt();
    System.out.print("Número de pisos: ");
    int numPisos2 = scanner.nextInt();

    // Crear instancias de EdificioDeOficinas y agregarlas a la lista de edificios
   EdificioDeOficinas edificioOficinas1 = new EdificioDeOficinas(numOficinas1, personasPorOficina1, numPisos1, ancho1, largo1, alto1);
   EdificioDeOficinas edificioOficinas2 = new EdificioDeOficinas(numOficinas2, personasPorOficina2, numPisos2, ancho2, largo2, alto2);


    edificios.add(edificioOficinas1);
    edificios.add(edificioOficinas2);

    // Calcular superficie y volumen de cada edificio
    for (Edificio edificio : edificios) {
        double superficie = edificio.calcularSuperficie();
        double volumen = edificio.calcularVolumen();

        System.out.println("Superficie del edificio: " + superficie);
        System.out.println("Volumen del edificio: " + volumen);
    }

    // Contar polideportivos techados y abiertos
    int techados = 0;
    int abiertos = 0;

    for (Edificio edificio : edificios) {
        if (edificio instanceof Polideportivo) {
            Polideportivo polideportivo = (Polideportivo) edificio;
            if (polideportivo.getTipoInstalacion().equalsIgnoreCase("Techado")) {
                techados++;
            } else if (polideportivo.getTipoInstalacion().equalsIgnoreCase("Abierto")) {
                abiertos++;
            }
        }
    }

    System.out.println("Número de polideportivos techados: " + techados);
    System.out.println("Número de polideportivos abiertos: " + abiertos);

    // Calcular cantidad de personas en los edificios de oficinas
    for (Edificio edificio : edificios) {
        if (edificio instanceof EdificioDeOficinas) {
            EdificioDeOficinas edificioOficinas = (EdificioDeOficinas) edificio;
            edificioOficinas.cantPersonas();
        }
    }
}
    }