package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    //--------------------------CONEXION CON MYSQL------------------------------
    private final String driver = "com.mysql.jdbc.Driver"; //Clase del driver de jConnector 
    private final String url = "jdbc:mysql://localhost:3306/db_mecaut"; //Cadena de conexion
    private final String usuario = "root"; //Usuario con permisos a la base de datos
    private final String contraseña = "";
    public Connection conexion;
    public PreparedStatement consulta;

    //metodo para crear la conexion
    public boolean crearConexion() {
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos");
        }
        return true;
    }

    //Metodo para cerrar la conexion
    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException e) {
        }
    }
}
