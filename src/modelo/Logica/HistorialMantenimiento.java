package modelo.Logica;

public class HistorialMantenimiento {
    private final String Placa;
    private final String Codigo_mantenimiento;
    private final String Id_cliente;
    private final String Fecha;

    public HistorialMantenimiento(String Placa, String Codigo_mantenimiento, String Id_cliente,String fecha) {
        this.Placa = Placa;
        this.Codigo_mantenimiento = Codigo_mantenimiento;
        this.Id_cliente = Id_cliente;
        this.Fecha = fecha;
    }

    public String getPlaca() {
        return Placa;
    }

    public String getCodigo_mantenimiento() {
        return Codigo_mantenimiento;
    }

    public String getId_cliente() {
        return Id_cliente;
    }
    
    public String getFecha(){
        return Fecha;
    }
}
