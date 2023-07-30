/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcej1.PersistenciaTienda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import jdbcej1.entidadesTienda.producto;

/**
 *
 * @author Usuario
 */
public abstract class DAO1 {
    
    protected Connection con = null;
    protected ResultSet result = null;
    protected Statement ste = null;

    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver"; //OJO VERIFICAR
    
    protected void conectarBase() throws SQLException, ClassNotFoundException {
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?zeroDateTimeBehavior=convertToNull";
            con=DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException |SQLException ex) {
            throw ex;
        }
    }

   protected void desconectarBase() throws SQLException{
        try {
            if(result!=null){
                result.close();
            //si resultado es distinto a null cierra el resultado
            //aplica lo mismo con la sentencia y conexion
            }
            if(con!=null){
               con.close();
            }
            if(ste!=null){
                ste.close();
            }
        } catch (SQLException e) {
            throw e;
        }
    }
 
    //3. INSERTAR MODIFICAR ELIMINAR REGISTROS DE LA BASE DE DATOS
    protected void insertarModificarEliminar(String sql) throws Exception {
        try {
            conectarBase();
            ste = con.createStatement();
            ste.executeUpdate(sql);
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        } finally {
            desconectarBase();
        }
    }

//4. CONSULTAR BASE DE DATOS
    protected void consultarBase(String sql) throws Exception {
        try {
            conectarBase();
            ste = con.createStatement();
            result = ste.executeQuery(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }

//INGRESAR PRODUCTO A BASE DE DATOS
public void ingresarProducto(producto producto) throws Exception{
        try {
            if (producto == null) {
                throw new Exception("Debe registrar un producto");
            }
            
            String sql = "INSERT INTO producto " + "VALUES('"+producto.getNombre()+"', '"+producto.getPrecio() +"', '"+producto.getCodigoFabricante()+"')";  //NO SE PERMITE INGRESAR EL CODIGO PORQUE LA BD LOS GENERA POR UNSIGNED AUTO_INCREMENT PRIMARY KEY
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

//PRECIO PRODUCTO
public void editarNombreProducto(producto producto) throws Exception{
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto a editar");
            }            
            String sql = "UPDATE producto SET " + "nombre = '"+producto.getNombre()+"'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }    


 
}
