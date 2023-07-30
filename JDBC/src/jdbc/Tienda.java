/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

import java.util.Scanner;
import servicios.FabricantesServicio;
import servicios.productoServicio;

//Las consultas a realizar sobre la BD son las siguientes:
//a) Lista el nombre de todos los productos que hay en la tabla producto.
//b) Lista los nombres y los precios de todos los productos de la tabla producto.
//c) Listar aquellos productos que su precio esté entre 120 y 202.
//d) Buscar y listar todos los Portátiles de la tabla producto.
//e) Listar el nombre y el precio del producto más barato.
//f) Ingresar un producto a la base de datos.
//g) Ingresar un fabricante a la base de datos
//h) Editar un producto con datos a elección.

public class Tienda {

  public static void main(String[] args) throws Exception{
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        productoServicio serviceP = new productoServicio();
        FabricantesServicio serviceF = new FabricantesServicio();
        
        int op = 0;
        do {
            System.out.println("----------------MENU----------------");
            System.out.println("1 - Nombre de todos los productos");
            System.out.println("2 - Nombre y precio de todos los productos");
            System.out.println("3 - Productos entre $120 y $202");
            System.out.println("4 - Productos portatiles");
            System.out.println("5 - Producto mas barato");
            System.out.println("6 - Ingresar producto nuevo");
            System.out.println("7 - Ingresar fabricante nuevo");
            System.out.println("8 - Editar datos de producto");
            System.out.println("9 - Eliminar producto");
            System.out.println("10 - Salir");
            System.out.println("----------------@----------------");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    //A)Lista el nombre de todos los productos que hay en la tabla producto. 
                    serviceP.listarNombreProductos();
                    break;
                case 2:
                    //B)Lista los nombres y los precios de todos los productos de la tabla producto. 
                    serviceP.listarNombrePrecioProductos();
                    break;
                case 3:
                    //C)Listar aquellos productos que su precio esté entre 120 y 202.
                    serviceP.productosEntrePrecios();
                    break;
                case 4:
                    //D)Buscar y listar todos los Portátiles de la tabla producto.
                    serviceP.productosPortatiles();
                    break; 
                case 5:
                    //E)Listar el nombre y el precio del producto más barato. 
                    serviceP.listarProductoMasBarato();
                    break;
                case 6:
                    //F)Ingresar un producto a la base de datos.
                    serviceP.ingresarProducto();
                    break;
                case 7:
                    //G)Ingresar un fabricante a la base de datos.
                    serviceF.ingresarFabricante();
                    break;
                case 8:
                    //H)Editar un producto con datos a elección.
                    serviceP.modificarProducto();
                    break;
                case 9:                       
                    //Eliminar producto
                    serviceP.eliminarProducto();
                    break;
                case 10:
                    System.out.println("Saliendo. . . .");
                    break;
                default:
                    System.out.println("Error. Vuelva a ingresar una opcion");
                    break;
            }
        } while (op != 10);
    }    
    
}
