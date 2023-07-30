/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcej1.PersistenciaTienda;

import jdbcej1.entidadesTienda.fabricante;


/**
 *
 * @author Usuario
 */
public class fabricanteDAOext extends DAO1  {
    
   public void ingresarFabricante(fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe registrar un fabricante");
            }
            
            String sql = "INSERT INTO fabricante (nombre) VALUES ('" + fabricante.getNombre() + "')";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    
}
