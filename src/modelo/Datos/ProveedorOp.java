package modelo.Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Conexion;
import modelo.Logica.Proveedor;

public class ProveedorOp extends Conexion{
     //metodo para agregar un proveedor
    public boolean agregarProveedor(Proveedor prov) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO proveedores VALUES (?,?,?,?,?)");
            consulta.setString(1, prov.getNit());
            consulta.setString(2, prov.getNombre());
            consulta.setString(3, prov.getDireccion());
            consulta.setString(4, prov.getTelefono());
            consulta.setString(5, prov.getDescripcion());
            consulta.executeUpdate();
            consulta.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para eliminar un proveedor
    public boolean eliminarProveedor(int nit) {
        try {
            consulta = conexion.prepareStatement("DELETE FROM proveedores WHERE prov_nit = ?");
            consulta.setInt(1, nit);
            consulta.executeUpdate();
            consulta.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para modificar un proveedor
    public boolean modificarProveedor(Proveedor prov) {
        try {
            consulta = conexion.prepareStatement("UPDATE proveedores SET prov_nombre = ?, prov_direccion = ?, prov_telefono = ?, prov_descripcion = ? WHERE prov_nit = ?");
            consulta.setString(1, prov.getNombre());
            consulta.setString(2, prov.getDireccion());
            consulta.setString(3, prov.getTelefono());
            consulta.setString(4, prov.getDescripcion());
            consulta.setString(5, prov.getNit());
            consulta.executeUpdate();
            consulta.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para ver la la lista de los proveedores
    public ArrayList<Proveedor> verProveedores() {
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM proveedores");
            rs = consulta.executeQuery();
            while (rs.next()) {
                proveedores.add(new Proveedor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException e) {
            return null;
        }
        return proveedores;
    }
    //Metodo para consultar el nit del proveedor del repuesto
    public ArrayList<Proveedor> consultarProveedores() {
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM proveedores");
            rs = consulta.executeQuery();
            while (rs.next()) {
                proveedores.add(new Proveedor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException e) {
            return null;
        }
        return proveedores;
    }
}
