/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Cliente;
import java.util.List;


public class ClienteDao extends DAO <Cliente> {

    public void persistirCliente(Cliente cliente) {

        persisitrEntidad(cliente);
    }

    public void actualizarEstadoCleinte(Cliente cliente) {

        actualizarEstadoEntidad(cliente);

    }

    public List buscarCliente() {

        return em.createQuery("SELECT c FROM Cliente c").getResultList();

    }

    public Cliente buscarCliente(int documento) {

        return em.find(Cliente.class, documento);

    }

    /*@Override
    public void borrarEntidad(Cliente object) {
        super.borrarEntidad(object); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void actualizarEstadoEntidad(Cliente object) {
        super.actualizarEstadoEntidad(object); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void persisitrEntidad(Cliente object) {
        super.persisitrEntidad(object); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }*/

    
}
