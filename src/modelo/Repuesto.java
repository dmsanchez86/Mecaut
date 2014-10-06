package modelo;

/* @author Grupo - Mecaut */
public class Repuesto {
    private final String codigo;
    private final String tipo;
    private final String marca;
    private final String cantidad;
    private final String precio;
    private final String nitProv;
    private final String nomProv;

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
