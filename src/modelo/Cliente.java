package modelo;

/* @author Grupo - MECAUT */

public class Cliente {
    private String identificacion;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    
    public Cliente(String identificacion, String nombre, String apellidos, String telefono, String direccion) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
}
