/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones3;



import java.util.Scanner;
import service.ServicioAlumno;

/**
 *
 * @author Usuario
 */
public class Colecciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        Scanner scanner = new Scanner(System.in);
        boolean seguirAgregando = true;

        while (seguirAgregando) {
            servicioAlumno.agregarAlumno();

            System.out.print("¿Desea agregar otro alumno? (S/N): ");
            String opcion = scanner.nextLine();
            if (!opcion.equalsIgnoreCase("S")) {
                seguirAgregando = false;
            }
        }

        servicioAlumno.notaFinal();
    }
}

    
    

