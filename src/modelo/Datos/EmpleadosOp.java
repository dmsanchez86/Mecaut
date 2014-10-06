package modelo.Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Conexion;
import modelo.Logica.Empleados;

public class EmpleadosOp extends Conexion{
    public boolean agregarEmpleado(Empleados emp) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO empleados VALUES (?,?,?,?,?,?,?,?)");
            consulta.setString(1, emp.getIdentificacion());
            consulta.setString(2, emp.getNombre());
            consulta.setString(3, emp.getApellidos());
            consulta.setString(4, emp.getTipo());
            consulta.setString(5, emp.getTelefono());
            consulta.setString(6, emp.getDireccion());
            consulta.setString(7, emp.getSalario());
            consulta.setString(3, emp.getCorreo());
            consulta.executeUpdate();
            consulta.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //Metodo para eliminar un mecanico 
    public boolean eliminarEmpleado(int id) {
        try {
            consulta = conexion.prepareStatement("DELETE FROM empleados WHERE emp_id = ?");
            consulta.setInt(1, id);
            consulta.executeUpdate();
            consulta.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para modificar un mecanico
    public boolean modificarEmpleado(Empleados mec) {
        try {
            consulta = conexion.prepareStatement("UPDATE empleados SET emp_nombre = ?, emp_apellidos = ?, emp_tipo = ?,emp_telefono = ?, emp_direccion = ?, emp_salario = ?,emp_correo = ? WHERE emp_id = ?");
            consulta.setString(1, mec.getNombre());
            consulta.setString(2, mec.getApellidos());
            consulta.setString(3, mec.getTipo());
            consulta.setString(4, mec.getTelefono());
            consulta.setString(5, mec.getDireccion());
            consulta.setString(6, mec.getSalario());
            consulta.setString(7, mec.getCorreo());
            consulta.setString(8, mec.getIdentificacion());
            consulta.executeUpdate();
            consulta.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para consultar la identificacion del mecanico que realizo el mantenimiento
    public ArrayList<Empleados> consultarEmpleados() {
        ArrayList<Empleados> empleados = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM empleados");
            rs = consulta.executeQuery();
            while (rs.next()) {
                empleados.add(new Empleados(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        } catch (SQLException e) {
            return null;
        }
        return empleados;
    }
    //metodo para consultar un empleado ingresando un dato
    public ArrayList<Empleados> verEmpleadosPorDato(String dato) {
        ArrayList<Empleados> empleados = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM empleados WHERE mec_id LIKE '" + dato + "%' OR mec_nombre LIKE '" + dato + "%' OR mec_apellidos LIKE '" + dato + "%' OR  mec_direccion LIKE '" + dato + "%'");
            rs = consulta.executeQuery();
            while (rs.next()) {
                empleados.add(new Empleados(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        } catch (SQLException e) {
            return null;
        }
        return empleados;
    }
}
