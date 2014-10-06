package modelo.Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Conexion;
import modelo.Logica.Repuesto;

public class RepuestosOp extends Conexion{
    //metodo para agregar un repuesto
    public boolean agregarRepuesto(Repuesto rep) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO repuestos VALUES (?,?,?,?,?,?,?)");
            consulta.setString(1, rep.getCodigo());
            consulta.setString(2, rep.getTipo());
            consulta.setString(3, rep.getMarca());
            consulta.setString(4, rep.getCantidad());
            consulta.setString(5, rep.getPrecio());
            consulta.setString(6, rep.getNitProv());
            consulta.setString(7, rep.getNomProv());
            consulta.executeUpdate();
            consulta.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //Metodo para ver la lista de los repuestos
    public ArrayList<Repuesto> verRepuestos() {
        ArrayList<Repuesto> Repuestos = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM repuestos");
            rs = consulta.executeQuery();
            while (rs.next()) {
                Repuestos.add(new Repuesto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException e) {
            return null;
        }
        return Repuestos;
    }
}
