/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Libro;
import java.util.List;
import javax.persistence.Query;

public class LibroDao extends DAO <Libro> {

    public void persistirLibro(Libro libro) {
        persisitrEntidad(libro);
    }

    public void actualizarLibro(Libro libro) {
        actualizarEstadoEntidad(libro);
    }

    public List consultaGenerica(String entidad, String atributo, String variable) {
        String jpql = "SELECT e FROM " + entidad + " e WHERE e." + atributo + " LIKE :variable";
        Query query = em.createQuery(jpql);
        query.setParameter("variable", "%" + variable + "%");
        return query.getResultList();
    }

    public List consultaLibros() {
        String jpql = "SELECT l FROM Libro l";
        return em.createQuery(jpql).getResultList();
    }

    public Libro buscarPorIsbn(long id) {
        return em.find(Libro.class, id);
    }

    /*@Override
    public void borrarEntidad(Libro object) {
        super.borrarEntidad(object); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void actualizarEstadoEntidad(Libro object) {
        super.actualizarEstadoEntidad(object); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void persisitrEntidad(Libro object) {
        super.persisitrEntidad(object); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }*/
    
}
