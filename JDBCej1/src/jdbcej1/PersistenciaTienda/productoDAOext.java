/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcej1.PersistenciaTienda;

import jdbcej1.entidadesTienda.producto;

/**
 *
 * @author Usuario
 */
public class productoDAOext extends DAO1  {
    
   public void ingresarProducto(producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe registrar un producto");
            }
            
            String sql = "INSERT INTO producto (nombre, precio, codigoFabricante) VALUES ('" + producto.getNombre() + "', " + producto.getPrecio() + ", " + producto.getCodigoFabricante() + ")";
           insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void editarProducto(producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe proporcionar un producto válido para editar");
            }
            
            String sql = "UPDATE producto SET nombre = '" + producto.getNombre() + "', precio = " + producto.getPrecio() + ", codigoFabricante = " + producto.getCodigoFabricante() + " WHERE codigo = " + producto.getCodigo();
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    }
