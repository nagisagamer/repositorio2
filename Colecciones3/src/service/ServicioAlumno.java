/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */


public class ServicioAlumno {
    private List<Alumno> listaAlumnos;

    public ServicioAlumno() {
        listaAlumnos = new ArrayList<>();
    }

    public void agregarAlumno() {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        List<Integer> notas = new ArrayList<>();
        System.out.print("Ingrese el nombre del alumno: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese las notas del alumno (3 notas):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nota " + (i+1) + ": ");
            notas.add(scanner.nextInt());
        }
        scanner.nextLine();

        Alumno alumno = new Alumno(nombre, notas);
        listaAlumnos.add(alumno);

        System.out.println("Alumno agregado exitosamente.");
    }

    public void notaFinal() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();

        boolean encontrado = false;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                double notaFinal = alumno.notaFinal();
                System.out.println("La nota final de " + nombre + " es: " + notaFinal);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El alumno " + nombre + " no se encuentra en la lista.");
        }
    }
}

    

