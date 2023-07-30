/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidad.Persona;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ServicioPersona {
    private Scanner scanner;

    public ServicioPersona() {
        scanner = new Scanner(System.in);
    }

    public Persona crearPersona() {
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento de la persona: ");
        int dia = pedirEntero("Ingrese el día: ");
        int mes = pedirEntero("Ingrese el mes: ");
        int anio = pedirEntero("Ingrese el año: ");

        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes - 1, dia);
        Date fechaNacimiento = calendar.getTime();

        return new Persona(nombre, fechaNacimiento);
    }

    public int calcularEdad(Persona persona) {
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.setTime(persona.getFechaNacimiento());

        Calendar fechaActual = Calendar.getInstance();

        int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);

        if (fechaNacimiento.get(Calendar.MONTH) > fechaActual.get(Calendar.MONTH)) {
            edad--;
        } else if (fechaNacimiento.get(Calendar.MONTH) == fechaActual.get(Calendar.MONTH)
                   && fechaNacimiento.get(Calendar.DAY_OF_MONTH) > fechaActual.get(Calendar.DAY_OF_MONTH)) {
            edad--;
        }

        return edad;
    }

    public boolean menorQue(Persona persona, int edad) {
        return calcularEdad(persona) < edad;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad: " + calcularEdad(persona));
    }

    private int pedirEntero(String mensaje) {
        int numero = 0;
        boolean esNumero = false;

        do {
            System.out.print(mensaje);
            try {
                numero = Integer.parseInt(scanner.nextLine());
                esNumero = true;
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número válido.");
            }
        } while (!esNumero);

        return numero;
    }
}
