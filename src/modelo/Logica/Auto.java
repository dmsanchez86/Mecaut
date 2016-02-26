package modelo.Logica;

/* @author Grupo - MECAUT */
public class Auto {
    private final String placa;
    private final String ciudad;
    private final String tipo;
    private final String modelo;
    private final String marca;
    private final String kilometraje;
    private final String combustible;
    private final String idCliente;
    private final String nombreCliente;

    public Auto(String placa, String ciudad,String tipo, String modelo, String marca,String kilometraje,String combustible, String idCliente, String nombreCliente) {
        this.placa = placa;
        this.ciudad = ciudad;
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.combustible = combustible;
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
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

    public String getTipo() {
        return tipo;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public String getCombustible() {
        return combustible;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }
    
    @Override
    public String toString() {
        return ""+ placa;
    }
    
}
