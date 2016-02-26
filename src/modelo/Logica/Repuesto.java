package modelo.Logica;

/* @author Grupo - Mecaut */
public class Repuesto {
    private final String codigo;
    private final String tipo;
    private final String marca;
    private final String cantidad;
    private final String precio;
    private final String nitProv;

    public Repuesto(String codigo, String tipo, String marca, String cantidad, String precio, String nitProv) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
        this.nitProv = nitProv;
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
    
    @Override
    public String toString() {
        return ""+ codigo;
    }
}
