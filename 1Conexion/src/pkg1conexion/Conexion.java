import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private String bd = "";
    private String url = "jdbc:mysql://localhost:3306/";
    private String user = "root";
    private String password = "root";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private Connection cx;

    public Conexion() {
    }

    public Connection conectar() {
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url + bd, user, password);
            System.out.println("SE HA CONECTADO A LA BASE DE DATOS CORRECTAMENTE: " + bd);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("NO SE PUDO CONECTAR A LA BASE DE DATOS: " + bd);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }

    public void desconectar() {
        try {
            if (cx != null && !cx.isClosed()) {
                cx.close();
                System.out.println("SE HA DESCONECTADO DE LA BASE DE DATOS");
            }
        } catch (SQLException ex) {
            System.out.println("ERROR AL DESCONECTAR DE LA BASE DE DATOS");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        Connection connection = conexion.conectar();

        // Realizar operaciones en la base de datos utilizando la conexión

       conexion.desconectar();
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println("ERROR AL CERRAR LA CONEXIÓN");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
