package modelo.Logica;

/* @author Grupo - MECAUT */

public class Cliente {
    private final String identificacion;
    private final String nombre;
    private final String apellidos;
    private final String sexo;
    private final String telefono;
    private final String direccion;
    private final String correo;
    
    public Cliente(String identificacion, String nombre, String apellidos,String sexo, String telefono, String direccion,String correo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
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
    public String getSexo(){
        return sexo;
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
    
    @Override
    public String toString() {
        return ""+ identificacion;
    }
}
