/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */

public class Libro {
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
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
}
