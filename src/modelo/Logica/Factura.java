/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.Logica;

import java.sql.Date;

/**
 *
 * @author Sergio
 */
public class Factura {
    private final String numero;
    private final Date fecha;
    private final String idCliente;
    private final String nombreCliente;
    private final String total;

    public Factura(String numero, Date fecha, String idCliente, String nombreCliente, String total) {
        this.numero = numero;
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.total = total;
    }

    public String getNumero() {
        return numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTotal() {
        return total;
    }
    
     @Override
    public String toString() {
        return ""+ numero;
    }    
}
