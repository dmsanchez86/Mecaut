package modelo.Logica;

/* @author Grupo - MECAUT */
public class Empleados {
    private final String identificacion;
    private final String nombre;
    private final String apellidos;
    private final String sexo;
    private final String tipo;
    private final String telefono;
    private final String direccion;
    private final String correo;
    private final String salario;

    public Empleados(String identificacion, String nombre, String apellidos, String sexo,String tipo, String telefono, String direccion,String correo, String salario) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.tipo = tipo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
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
    
    public String getSexo() {
        return sexo;
    }    
    
    public String getTipo(){
        return tipo;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getCorreo(){
            return correo;
    }
    public String getSalario() {
        return salario;
    }
    
    @Override
    public String toString() {
        return ""+ identificacion;
    }
}
