package modelo.Logica;

/* @author Grupo - MECAUT */
public class Proveedor {
    private final String nit;
    private final String nombre;
    private final String direccion;
    private final String telefono;
    private final String descripcion;

    public Proveedor(String nit, String nombre, String direccion, String telefono, String descripcion) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.descripcion = descripcion;
    }

    public String getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    @Override
    public String toString() {
        return ""+ nit;
    }
}
