package modelo.Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Conexion;
import modelo.Logica.Auto;

public class AutoOp extends Conexion{
    //Metodo para agregar un auto
    public boolean agregarAuto(Auto aut) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO autos VALUES (?,?,?,?,?,?,?)");
            consulta.setString(1, aut.getPlaca());
            consulta.setString(2, aut.getCiudad());
            consulta.setString(3, aut.getModelo());
            consulta.setString(4, aut.getMarca());
            consulta.setString(5, aut.getIdCliente());
            consulta.setString(6, aut.getNombreCliente());
            consulta.setString(7, aut.getApellidosCliente());
            consulta.executeUpdate();
            consulta.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para consultar la placa del auto al que se realizara el mantenimeinto
    public ArrayList<Auto> consultarAutos() {
        ArrayList<Auto> autos = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM autos");
            rs = consulta.executeQuery();
            while (rs.next()) {
                autos.add(new Auto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException e) {
            return null;
        }
        return autos;
    }
    //metodo para ver la lista de los autos
    public ArrayList<Auto> verAutos() {
        ArrayList<Auto> Autos = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM autos");

            rs = consulta.executeQuery();
            while (rs.next()) {
                Autos.add(new Auto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException e) {
            return null;
        }
        return Autos;
    }
}
