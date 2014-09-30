/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sergio Alejandro
 */
public class Repuesto {
    private String codigo;
    private String tipo;
    private String marca;
    private String cantidad;
    private String precio;
    private String nitProv;
    private String nomProv;

    public Repuesto(String codigo, String tipo, String marca, String cantidad, String precio, String nitProv, String nomProv) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
        this.nitProv = nitProv;
        this.nomProv = nomProv;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }
    
    public String getMarca(){
        return marca;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public String getNitProv() {
        return nitProv;
    }

    public String getNomProv() {
        return nomProv;
    }
          
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }    
    
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setNitProv(String nitProv) {
        this.nitProv = nitProv;
    }

    public void setNomProv(String nomProv) {
        this.nomProv = nomProv;
    }
    
    @Override
    public String toString() {
        return ""+ codigo;
    }
}
