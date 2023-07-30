/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Producto;
import java.util.ArrayList;
import java.util.Scanner;
import persistencia.ProductosDAO;

/**
 *
 * @author Usuario
 */
public class productoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ProductosDAO DAOP = new ProductosDAO();
    FabricantesServicio serviceF = new FabricantesServicio();

    public void listarNombreProductos() throws Exception {
        ArrayList<String> nombres = new ArrayList<String>();
        DAOP.listarNombresProductos(nombres);
        for (String aux : nombres) {
            System.out.println(aux);
        }
    }

    public void listarNombrePrecioProductos() throws Exception {
        ArrayList<String> nombres = new ArrayList<String>();
        DAOP.listarNombresPreciosProductos(nombres);
        for (String aux : nombres) {
            System.out.println(aux);
        }
    }

    public void productosEntrePrecios() throws Exception {
        ArrayList<String> nombres = new ArrayList<String>();
        DAOP.listarProductosEntrePrecios(nombres);
        for (String aux : nombres) {
            System.out.println(aux);
        }
    }

    public void productosPortatiles() throws Exception {
        ArrayList<String> nombres = new ArrayList<String>();
        DAOP.listarProductosPortatiles(nombres);
        for (String aux : nombres) {
            System.out.println(aux);
        }
    }

    public void listarProductoMasBarato() throws Exception {
        DAOP.productoMasBarato();
    }

    public void ingresarProducto() throws Exception {
        String codigo = "", nombre = "", precio = "", codFab = "";

        codigo = String.valueOf(Integer.parseInt(DAOP.consultarCodigo(codigo)) + 1);
        System.out.println("Producto N°" + codigo);
        System.out.println("Ingrese el nombre del producto: ");
        nombre = leer.next();
        System.out.println("Ingrese el precio del producto: ");
        precio = leer.next();
        System.out.println("Ingrese el codigo del fabricante: ");
        serviceF.mostrarListaFabricantes();
        codFab = leer.next();

        String sql = "INSERT INTO producto VALUES(" + codigo + ",'" + nombre + "'," + precio + "," + codFab + ");";
        DAOP.ingresarProducto(sql);
    }

    public void eliminarProducto() throws Exception {
        System.out.println("Elija el producto que desea eliminar: ");
        listarNombreProductos();
        String nombreEliminar = leer.next();
        DAOP.eliminarProducto(nombreEliminar);
        System.out.println("Producto eliminado!");

    }

    public void modificarProducto() throws Exception {
        
        String nombre = "", precio = "", codFab = "";
        
        listarNombrePrecioProductos();
        String condicion = "";
        
        System.out.println("Que producto desea modificar: ");
        condicion = leer.next();
        
        System.out.println("--------------");
        System.out.println("Ingrese nuevo nombre de producto: ");
        nombre = leer.next();
        System.out.println("Ingrese el nuevo precio del producto: ");
        precio = leer.next();
        System.out.println("Ingrese el nuevo codigo del fabricante: ");
        serviceF.mostrarListaFabricantes();
        codFab = leer.next();

        String sql = "UPDATE producto SET nombre = '" + nombre + "', precio = " + precio + ", codigo_fabricante = " + codFab + " WHERE nombre LIKE '" + condicion + "';";
        DAOP.editarProducto(sql);
    }

}