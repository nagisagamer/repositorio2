/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Editorial;
import java.util.List;


public class EditorialDAO extends DAO <Editorial> {

    public void persisitrEditorial(Editorial editorial) {

        persisitrEntidad(editorial);

    }

    public void actualizarEstadoEditorial(Editorial editorial) {

        actualizarEstadoEntidad(editorial);
    }

    public List consultarEditorial() {
        String jpql = "SELECT e FROM Editorial e";
        return em.createQuery(jpql).getResultList();
    }

    public List<Editorial> buscarEditorialesPorNombre(String nombre) {
        String jpql = "SELECT e FROM Editorial e WHERE e.nombre = :nombre";
        return em.createQuery(jpql, Editorial.class)
                .setParameter("nombre", nombre)
                .getResultList();
    }

   /* @Override
    public void borrarEntidad(Editorial object) {
        super.borrarEntidad(object); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void actualizarEstadoEntidad(Editorial object) {
        super.actualizarEstadoEntidad(object); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void persisitrEntidad(Editorial object) {
        super.persisitrEntidad(object); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }*/
    
    
}
