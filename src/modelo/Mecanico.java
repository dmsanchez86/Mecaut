/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sergio Alejandro
 */
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

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return ""+ identificacion;
    }
}
