package modelo.Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Conexion;
import modelo.Logica.Cuenta;

public class CuentaOp extends Conexion{
    //metodo para validar cuenta
    public String validarCuentas(Cuenta c) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM cuentas WHERE cue_usuario = ? AND cue_contrasena = ?");
            consulta.setString(1, c.getUsuario());
            consulta.setString(2, c.getContrasena());
            consulta.executeQuery();
            ResultSet r = consulta.getResultSet();
            while (r.next()) {
                return r.getString(4);
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
        return null;
    }
    //metodo para registrar una cuenta
    public boolean registrarCuenta(Cuenta c) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO cuentas VALUES(?,?)");
            consulta.setString(1, c.getUsuario());
            consulta.setString(2, c.getContrasena());
            consulta.executeUpdate();
            conexion.close();
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
}
