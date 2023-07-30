/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Producto;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public final class ProductosDAO extends TiendaDAO {
     //Ingresar un producto a la base de datos.
   public String consultarCodigo(String codigo) throws Exception{
        try {
            String sql = "SELECT codigo FROM producto ORDER BY codigo DESC LIMIT 1";
            consultarBase(sql);
            while (resultado.next()) {
                codigo = resultado.getString("codigo");
            }                        
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
        return codigo;
    }
    
    //1
    public void listarNombresProductos(ArrayList<String> nombres) throws Exception {
        try {
            String sql = "SELECT DISTINCT nombre FROM producto";
            consultarBase(sql);            
            while (resultado.next()) {
                nombres.add(resultado.getString("nombre"));
            }
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    //2
    public void listarNombresPreciosProductos(ArrayList<String> nombres) throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto";
            consultarBase(sql);            
            while (resultado.next()) {
                nombres.add(resultado.getString("nombre") + " - $" + resultado.getString("precio"));
            }
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    //3
    public void listarProductosEntrePrecios(ArrayList<String> nombres) throws Exception{
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202";
            consultarBase(sql);            
            while (resultado.next()) {
                nombres.add(resultado.getString("nombre") + " - $" + resultado.getString("precio"));
            }
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    //4
    public void listarProductosPortatiles(ArrayList<String> nombres) throws Exception{
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%Portatil%'";
            consultarBase(sql);            
            while (resultado.next()) {
                nombres.add(resultado.getString("nombre") + " - $" + resultado.getString("precio"));
            }
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    //5
    public void productoMasBarato() throws Exception{
        try {
            String sql = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1";
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") + " - $" + resultado.getString("precio"));
            }                        
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    //6
    public void ingresarProducto(String sql) throws Exception{       
        try {            
            insertarModificarEliminar(sql);                                   
            desconectarBase();            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            
            throw e;
        }
    }
    
    //8
    public void editarProducto(String sql) throws Exception{
        try {            
            insertarModificarEliminar(sql);                                   
            desconectarBase();            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            
            throw e;
        }
    }
    
    public void eliminarProducto(String nombreEliminar) throws Exception{
        try {
            String sql = "DELETE FROM producto WHERE nombre LIKE '" + nombreEliminar + "'";
            insertarModificarEliminar(sql);                                  
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
            
        }
    }
}
