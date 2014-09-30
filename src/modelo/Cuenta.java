/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

public class Cuenta {
    private String usuario;
    private String contrasena;
    
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
