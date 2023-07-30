/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcej1.tiendaServicios;

import java.util.List;
import jdbcej1.PersistenciaTienda.productoDAOext;
import jdbcej1.entidadesTienda.producto;

/**
 *
 * @author Usuario
 */
public class ServicioProducto {
    
   private productoDAOext productoDao;

    public ServicioProducto() {
        productoDao = new productoDAOext();
    }

    public List<producto> listarProductos() {
        return productoDao.listarProductos();
    }

    public producto obtenerProductoPorCodigo(int codigo) {
        return productoDao.obtenerProductoPorCodigo(codigo);
    }

    public void ingresarProducto(producto producto) {
        productoDao.ingresarProducto(producto);
    }

    public void editarProducto(producto producto) {
        productoDao.editarProducto(producto);
    }

    public void eliminarProducto(int codigo) {
        productoDao.eliminarProducto(codigo);
    }
}
    
