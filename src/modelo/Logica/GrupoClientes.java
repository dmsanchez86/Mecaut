package modelo.Logica;

public class GrupoClientes {
    private final String codigo;
    private final String nombre;
    private final String cli_id;
    private final String estado;
    
    public GrupoClientes(String codigo,String nombre,String cli_id,String estado){
        this.codigo = codigo;
        this.nombre = nombre;
        this.cli_id = cli_id;
        this.estado = estado;
    }
    
    public String getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCli_Id(){
        return cli_id;
    }
    public String getEstado(){
        return estado;
    }
    
    @Override
    public String toString() {
        return ""+ codigo;
    }
}
