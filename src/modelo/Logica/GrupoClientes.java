package modelo.Logica;

public class GrupoClientes {
    private final String codigo;
    private final String nombre;
    private final String cli_id;
    
    public GrupoClientes(String codigo,String nombre,String cli_id){
        this.codigo = codigo;
        this.nombre = nombre;
        this.cli_id = cli_id;
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
}
