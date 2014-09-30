/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sena
 */
public class Proveedor {
    private String nit;
    private String nombre;
    private String direccion;
    private String telefono;
    private String descripcion;

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
    
    public void setNit(String nit) {
        this.nit = nit;
    }
    
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString() {
        return ""+nit;
    }
}
