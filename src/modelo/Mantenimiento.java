/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Sergio Alejandro
 */
public class Mantenimiento {
    private int codigo;
    private String tipo;
    private Date fecha;
    private String descripcion;
    private String costo;
    private String placaAuto;
    private String idMecanico;

    public Mantenimiento(int codigo, String tipo, Date fecha, String descripcion, String costo){
        this.codigo = codigo;
        this.tipo = tipo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.costo = costo;
    }
    
    public Mantenimiento(String tipo, Date fecha, String descripcion, String costo, String placaAuto, String idMecanico) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.costo = costo;
        this.placaAuto = placaAuto;
        this.idMecanico = idMecanico;
    }
    
    public Mantenimiento(int codigo, String tipo, Date fecha, String descripcion, String costo, String placaAuto, String idMecanico) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.costo = costo;
        this.placaAuto = placaAuto;
        this.idMecanico = idMecanico;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCosto() {
        return costo;
    }
    
    
    public String getPlacaAuto() {
        return placaAuto;
    }    

    public String getIdMecanico() {
        return idMecanico;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public void setPlacaAuto(String placaAuto) {
        this.placaAuto = placaAuto;
    }

    public void setIdMecanico(String idMecanico) {
        this.idMecanico = idMecanico;
    }
    
    @Override
    public String toString() {
        return ""+ codigo;
    } 
}
