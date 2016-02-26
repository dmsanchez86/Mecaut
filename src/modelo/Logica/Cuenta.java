package modelo.Logica;

public class Cuenta {
    private final String usuario;
    private final String contrasena;
    private final String tipo;
    private final String cli_id;
    
    public Cuenta(String USUARIO,String CONTRASENA, String tipo, String cli_id){
        this.usuario = USUARIO;
        this.contrasena = CONTRASENA;
        this.tipo = tipo;
        this.cli_id = cli_id;
    }
    
    public String getUsuario(){
        return this.usuario;
    }
    public String getContrasena(){
        return this.contrasena;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCli_id() {
        return cli_id;
    }
    
}
