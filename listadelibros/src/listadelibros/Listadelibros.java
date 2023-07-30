import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Listadelibros {

    public static void main(String[] args) {

        // Crear lista de libros usando ArrayList
        ArrayList<Libro> Listadelibros = new ArrayList<>();

        // Agregar algunos libros
        Listadelibros.add(new Libro("1984", "George Orwell"));
        Listadelibros.add(new Libro("El señor de los anillos", "J.R.R. Tolkien"));
        Listadelibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez"));

        // Recorrer lista de libros con for each y mostrar información con toString()
        System.out.println("Libros en lista (ArrayList):");
        Listadelibros.forEach((libro) -> {
            System.out.println(libro.toString());
        });

        // Crear mapa de libros usando HashMap
        HashMap<Integer, Libro> mapaLibros = new HashMap<>();

        // Agregar algunos libros
        mapaLibros.put(1, new Libro("1984", "George Orwell"));
        mapaLibros.put(2, new Libro("El señor de los anillos", "J.R.R. Tolkien"));
        mapaLibros.put(3, new Libro("Cien años de soledad", "Gabriel García Márquez"));

        // Recorrer mapa de libros con for each y mostrar información con toString()
        System.out.println("Libros en mapa (HashMap):");
        mapaLibros.values().forEach((libro) -> {
            System.out.println(libro.toString());
        });

        // Crear conjunto de libros usando HashSet
        HashSet<Libro> conjuntoLibros = new HashSet<>();

        // Agregar algunos libros
        conjuntoLibros.add(new Libro("1984", "George Orwell"));
        conjuntoLibros.add(new Libro("El señor de los anillos", "J.R.R. Tolkien"));
        conjuntoLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez"));

        // Recorrer conjunto de libros con for each y mostrar información con toString()
        System.out.println("Libros en conjunto (HashSet):");
        conjuntoLibros.forEach((libro) -> {
            System.out.println(libro.toString());
        });

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

