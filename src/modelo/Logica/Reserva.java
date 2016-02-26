package modelo.Logica;

public class Reserva {
    private final String fecha;
    private final String cli_id;
    private final String cli_nombre;
    private final String cli_telefono;
    private final String cli_correo;
    private final String aut_placa;
    private final String aut_modelo;
    private final String aut_marca;
    private final String emp_id;
    private final String emp_nombre;
    private final String observaciones;

    public Reserva(String fecha, String cli_id, String cli_nombre, String cli_telefono, String cli_correo, String aut_placa, String aut_modelo, String aut_marca, String emp_id, String emp_nombre, String observaciones) {
        this.fecha = fecha;
        this.cli_id = cli_id;
        this.cli_nombre = cli_nombre;
        this.cli_telefono = cli_telefono;
        this.cli_correo = cli_correo;
        this.aut_placa = aut_placa;
        this.aut_modelo = aut_modelo;
        this.aut_marca = aut_marca;
        this.emp_id = emp_id;
        this.emp_nombre = emp_nombre;
        this.observaciones = observaciones;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCli_id() {
        return cli_id;
    }

    public String getCli_nombre() {
        return cli_nombre;
    }

    public String getCli_telefono() {
        return cli_telefono;
    }

    public String getCli_correo() {
        return cli_correo;
    }

    public String getAut_placa() {
        return aut_placa;
    }

    public String getAut_modelo() {
        return aut_modelo;
    }

    public String getAut_marca() {
        return aut_marca;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public String getEmp_nombre() {
        return emp_nombre;
    }

    public String getObservaciones() {
        return observaciones;
    }
    
    
}
