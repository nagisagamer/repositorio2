/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Cliente;
import Entidades.Prestamo;
import java.util.ArrayList;
import java.util.List;

public class PrestamoDao extends DAO  <Prestamo> {

    public void persistirPrestamo(Prestamo prestamo) {

        persisitrEntidad(prestamo);
    }

    public void actualizarEstadoPrestamo(Prestamo prestamo) {

        actualizarEstadoEntidad(prestamo);

    }

    public List buscarPrestamo() {

        return em.createQuery("SELECT p FROM Prestamo p").getResultList();

    }

    public Cliente buscarPorClienteId(int id) {
        return em.find(Cliente.class, id);
    }

    public List<Prestamo> buscarPrestamosPorClienteId(int id) {
        Cliente cliente = em.find(Cliente.class, id);
        if (cliente == null) {
            return new ArrayList<>();
        } else {
            return em.createQuery("SELECT p FROM Prestamo p WHERE p.cliente.id = :clienteId", Prestamo.class)
                    .setParameter("clienteId", id)
                    .getResultList();
        }
    }

   /* @Override
    public void borrarEntidad(Prestamo object) {
        super.borrarEntidad(object); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void actualizarEstadoEntidad(Prestamo object) {
        super.actualizarEstadoEntidad(object); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void persisitrEntidad(Prestamo object) {
        super.persisitrEntidad(object); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }*/
    
}
