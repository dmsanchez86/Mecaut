package modelo;

public class Cuenta {
    private final String usuario;
    private final String contrasena;
    
    public Cuenta(String USUARIO,String CONTRASENA){
        this.usuario = USUARIO;
        this.contrasena = CONTRASENA;
    }
    
    public String getUsuario(){
        return this.usuario;
    }
    public String getContrasena(){
        return this.contrasena;
    }
}
