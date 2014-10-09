package modelo.Logica;

public class Cuenta {
    private final String usuario;
    private final String contrasena;
    private final String tipo;
    
    public Cuenta(String USUARIO,String CONTRASENA, String tipo){
        this.usuario = USUARIO;
        this.contrasena = CONTRASENA;
        this.tipo = tipo;
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
    
}
