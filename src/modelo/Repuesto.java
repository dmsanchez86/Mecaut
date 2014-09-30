package modelo;

/* @author Grupo - Mecaut */
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
}
