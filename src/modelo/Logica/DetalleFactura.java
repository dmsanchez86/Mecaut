/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.Logica;

/**
 *
 * @author Sergio
 */
public class DetalleFactura {
    private final String numeroFactura;
    private final String codigoRepuesto;
    private final String tipoRepuesto;
    private final String marcaRepuesto;
    private final String cantidadRepuesto;
    private final String precioRepuesto;

    public DetalleFactura(String numeroFactura, String codigoRepuesto, String tipoRepuesto, String marcaRepuesto, String cantidadRepuesto, String precioRepuesto) {
        this.numeroFactura = numeroFactura;
        this.codigoRepuesto = codigoRepuesto;
        this.tipoRepuesto = tipoRepuesto;
        this.marcaRepuesto = marcaRepuesto;
        this.cantidadRepuesto = cantidadRepuesto;
        this.precioRepuesto = precioRepuesto;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public String getCodigoRepuesto() {
        return codigoRepuesto;
    }

    public String getTipoRepuesto() {
        return tipoRepuesto;
    }

    public String getMarcaRepuesto() {
        return marcaRepuesto;
    }

    public String getCantidadRepuesto() {
        return cantidadRepuesto;
    }

    public String getPrecioRepuesto() {
        return precioRepuesto;
    }    
}
