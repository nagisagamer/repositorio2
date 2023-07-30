/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listalibros;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ListaLibros {

    public static void main(String[] args) {

        // Crear lista de libros usando ArrayList
        ArrayList<Libro> listaLibros = new ArrayList<>();

        // Agregar algunos libros
        listaLibros.add(new Libro("1984", "George Orwell"));
        listaLibros.add(new Libro("El señor de los anillos", "J.R.R. Tolkien"));
        listaLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez"));

        // Recorrer lista de libros con for each y mostrar información con toString()
        System.out.println("Libros en lista (ArrayList):");
        for (Libro libro : listaLibros) {
            System.out.println(libro.toString());
        }

        // Crear mapa de libros usando HashMap
        HashMap<Integer, Libro> mapaLibros = new HashMap<>();

        // Agregar algunos libros
        mapaLibros.put(1, new Libro("1984", "George Orwell"));
        mapaLibros.put(2, new Libro("El señor de los anillos", "J.R.R. Tolkien"));
        mapaLibros.put(3, new Libro("Cien años de soledad", "Gabriel García Márquez"));

        // Recorrer mapa de libros con for each y mostrar información con toString()
        System.out.println("Libros en mapa (HashMap):");
        for (Libro libro : mapaLibros.values()) {
            System.out.println(libro.toString());
        }

        // Crear conjunto de libros usando HashSet
        HashSet<Libro> conjuntoLibros = new HashSet<>();

        // Agregar algunos libros
        conjuntoLibros.add(new Libro("1984", "George Orwell"));
        conjuntoLibros.add(new Libro("El señor de los anillos", "J.R.R. Tolkien"));
        conjuntoLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez"));

        // Recorrer conjunto de libros con for each y mostrar información con toString()
        System.out.println("Libros en conjunto (HashSet):");
        for (Libro libro : conjuntoLibros) {
            System.out.println(libro.toString());
        }

    }

    // Clase interna Libro
    public static class Libro {
        private String titulo;
        private String autor;

        public Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        @Override
        public String toString() {
            return titulo + " - " + autor;
        }
    }
}
