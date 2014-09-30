package modelo;

/* @author Grupo - MECAUT */
public class Mecanico {
    private String identificacion;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String salario;

    public Mecanico(String identificacion, String nombre, String apellidos, String telefono, String direccion, String salario) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.salario = salario;
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

    public String getSalario() {
        return salario;
    }
}
