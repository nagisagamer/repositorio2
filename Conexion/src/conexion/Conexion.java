/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexion;

import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;

/**
 *
 * @author Usuario
 */
public class Conexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String bd="";
        String url="jbdc:mysql://localhost:3306/";
        String user="root";
        String password="";
        String driver="com.myql.cj.jdbc.Driver"
        Connection cx;
        
        
    }

    public Conexion() {
    }
    
    public connection conectar(){
       try{
           Class.forName(driver);
           cx=DriverManager.getConnection(url+bd, user, password);
           System.out.println("SE CONECTO A LA BASE DE DATOS CORRECTAMENTE"+bd);
       } catch (ClassNotFoundException |SQLException ex){
                System.out.println("NO SE CONECTO A BASE DE DATOS"+bd);
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
       }
       return cx;
        
    }
    public void desconectar (){
        cx.close();
    }
}
