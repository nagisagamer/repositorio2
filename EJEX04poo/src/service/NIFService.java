/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.NIF;

/**
 *
 * @author Usuario
 */
public class NIFService {
   public void calcularNif() {
        NIF nif = new NIF(0, ' ');
        nif.crearNif();
        nif.mostrar();
    }
    }
    

