package modelo.Logica;

/* @author Grupo - MECAUT */
public class Mantenimiento {
    private final int codigo;
    private final String fecha;
    private String estado;
    private final String costo;
    private String descripcion;
    private final String cli_id;

    public Mantenimiento(int codigo, String fecha, String estado, String costo, String descripcion, String cli_id) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.estado = estado;
        this.costo = costo;
        this.descripcion = descripcion;
        this.cli_id = cli_id;
    }

    public Mantenimiento(int codigo, String fecha, String costo, String cli_id) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.costo = costo;
        this.cli_id = cli_id;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public String getCosto() {
        return costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCli_id() {
        return cli_id;
    }
    
    
}
