/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Autor;
import java.util.List;

/**
 *
 * @author Usuario
 */

 public class AutorDAO extends DAO <Autor>{

    public void persistirAutor(Autor autor) {
        persisitrEntidad(autor);
    }

    public void actualizarEstadoAutor(Autor autor) {

        actualizarEstadoEntidad(autor);

    }

    public List buscarAutor() {

        return em.createQuery("SELECT a FROM Autor a").getResultList();

    }

    public List<Autor> buscarAutoresPorNombre(String nombre) {
        String jpql = "SELECT a FROM Autor a WHERE a.nombre = :nombre";
        return em.createQuery(jpql, Autor.class)
                .setParameter("nombre", nombre)
                .getResultList();
    }   

    /*@Override
    public void borrarEntidad(Autor object) {
        super.borrarEntidad(object); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void actualizarEstadoEntidad(Autor object) {
        super.actualizarEstadoEntidad(object); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void persisitrEntidad(Autor object) {
        super.persisitrEntidad(object); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }*/
    
    
}
