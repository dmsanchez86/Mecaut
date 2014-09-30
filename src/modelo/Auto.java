/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sena
 */
public class Auto {
    private String placa;
    private String ciudad;
    private String modelo;
    private String marca;
    private String idCliente;
    private String nombreCliente;
    private String apellidosCliente;

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

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }
    
    @Override
    public String toString() {
        return ""+ placa;
    }
}
