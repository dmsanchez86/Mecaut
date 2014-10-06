package modelo.Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Conexion;
import modelo.Logica.Mantenimiento;

public class MantenimientosOp extends Conexion{
    //metodo para agregar un mantenimiento
    public boolean agregarMantenimiento(Mantenimiento man) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO mantenimientos VALUES (?,?,?,?,?,?)");
            consulta.setString(1, man.getTipo());
            consulta.setDate(2, man.getFecha());
            consulta.setString(3, man.getDescripcion());
            consulta.setString(4, man.getCosto());
            consulta.setString(5, man.getPlacaAuto());
            consulta.setString(6, man.getIdMecanico());
            consulta.executeUpdate();
            consulta.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para eliminar un mantenimiento
    public boolean eliminarMantenimiento(Mantenimiento man) {
        try {
            consulta = conexion.prepareStatement("Delete From mantenimientos Where man_codigo = ?");
            consulta.setInt(1, man.getCodigo());
            consulta.executeUpdate();
            consulta.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para modificar un mantenimiento
    public boolean actualizarMantenimiento(Mantenimiento man) {
        try {
            consulta = conexion.prepareStatement("UPDATE mantenimientos SET man_tipo = ?, man_fecha = ?, man_descripcion = ?, man_costo = ? WHERE man_codigo = ?");
            consulta.setString(1, man.getTipo());
            consulta.setDate(2, man.getFecha());
            consulta.setString(3, man.getDescripcion());
            consulta.setString(4, man.getCosto());
            consulta.setInt(5, man.getCodigo());
            consulta.executeUpdate();
            consulta.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para consultar los datos del mantenimiento para modificarlos o eliminarlos
    public ArrayList<Mantenimiento> consultarMantenimientos() {
        ArrayList<Mantenimiento> mantenimientos = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("SELECT * FROM mantenimientos");
            rs = consulta.executeQuery();

            while (rs.next()) {
                mantenimientos.add(new Mantenimiento(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException e) {
            return null;
        }
        return mantenimientos;
    }
    //metodo para ver la lista de los mantenimientos
    public ArrayList<Mantenimiento> verMantenimientos() {
        ArrayList<Mantenimiento> mantenimientos = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM mantenimientos");
            rs = consulta.executeQuery();
            while (rs.next()) {
                mantenimientos.add(new Mantenimiento(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException e) {
            return null;
        }
        return mantenimientos;
    }
}
