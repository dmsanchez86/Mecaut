package modelo;

/* @author Grupo - MECAUT */
public class Auto {
    private final String placa;
    private final String ciudad;
    private final String modelo;
    private final String marca;
    private final String idCliente;
    private final String nombreCliente;
    private final String apellidosCliente;

    public Auto(String placa, String ciudad, String modelo, String marca, String idCliente, String nombreCliente, String apellidosCliente) {
        this.placa = placa;
        this.ciudad = ciudad;
        this.modelo = modelo;
        this.marca = marca;
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }
}
