/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Fabricantes;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public final class FabricantesDAO extends TiendaDAO{
  public int consultarCodigoF(int codigo) throws Exception{
        try {
            String sql = "SELECT codigo FROM fabricante ORDER BY codigo DESC LIMIT 1";
            consultarBase(sql);
            while (resultado.next()) {
                codigo = resultado.getInt("codigo");
            }                        
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
        return codigo;
    }
    
     public void crearFabricante(Fabricantes fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("El fabricante no puede estar vacio");
            }
            String sql = "INSERT INTO fabricante (codigo,nombre)" + "values('"
                    + fabricante.getCodigo() + "' , '" + fabricante.getNombre() + "');";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
     
    public void mostrarFabricantes(ArrayList<String> nombres) throws Exception{
        try {
            String sql = "SELECT codigo, nombre FROM fabricante";
            consultarBase(sql);            
            while (resultado.next()) {
                nombres.add(resultado.getString("codigo") + " - " + resultado.getString("nombre"));
            }
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
         
    //7
    public void ingresarFabricante(String sql) throws Exception{
        try {            
            insertarModificarEliminar(sql);                                   
            desconectarBase();            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            
            throw e;
        }
    }
    
    // SE DEBE HACER UN MÉTODO PARA BUSCAR EL FABRINCATE Y VALIDAR SI YA ESTA REGISTRADO ANTES DE AGREGARLO A LA BD   
}
