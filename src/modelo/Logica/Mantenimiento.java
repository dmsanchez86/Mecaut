package modelo.Logica;

import java.sql.Date;

/* @author Grupo - MECAUT */
public class Mantenimiento {
    private int codigo;
    private final String tipo;
    private final Date fecha;
    private final String descripcion;
    private final String costo;
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
}
