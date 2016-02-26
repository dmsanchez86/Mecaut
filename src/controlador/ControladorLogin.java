package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * @author Mauro
 */
public class ControladorLogin extends Controlador{
    
    public ControladorLogin(){
        super();
    }
    
    /* Formulario Login */
    public void launchLogin() {
        
        // evento del boton entrar
        Login.btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evt_LogIn();
            }
        });
        
        // evento del campo de texto usuario
        Login.jtfUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evt_LogIn();
            }
        });
        
        // evento del campo de texto contraseña
        Login.jtfPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evt_LogIn();
            }
        });
        
        // evento del boton salir del programa
        Login.btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
        // pongo el foco en el campo de texto usuario al iniciar el formulario
        Login.jtfUser.requestFocus();
        Login.setVisible(true); // muestro el formulario
    }
    
    private void evt_LogIn() {
        try {
            // capturo los datos ingresados
            String user = Login.jtfUser.getText();
            String password = Login.jtfPassword.getText();
            
            String[] dataUser = Gestor.validateUser(user, password);
            
            // Si la cuenta esta inactiva
            if ("Inactiva".equals(dataUser[2])) {
                // mostramos el mensaje de que si quiere activar la cuenta nuevamente
                int res = JOptionPane.showConfirmDialog(null, "La cuenta a la que esta intentando ingresar esta desactivada...\n\n¿Quieres Activar tu Cuenta de Nuevo?", "MECAUT", JOptionPane.YES_NO_OPTION);
                
                // si da en la opcion Si, le pedimos la contraseña
                if (res == JOptionPane.YES_OPTION) {
                    String passwordActivateAccount = JOptionPane.showInputDialog(null, "Ingrese su Contraseña", "MECAUT - Activar Tu Cuenta", JOptionPane.QUESTION_MESSAGE);
                    
                    // Activamos la cuenta
                    if (Gestor.activarCuenta(user, passwordActivateAccount)) {
                        dataUser = Gestor.validateUser(user, passwordActivateAccount);
                        
                        // Miramos que rol tiene el usuario, y lanzamos su respectivo formulario
                        switch (dataUser[0]) {
                            case "administrador":
                                launchFormAdministrator(dataUser[1]);
                                break;
                            case "cliente":
                                launchFormClient(dataUser[1]);
                                break;
                            case "empleado":
                                launchFormEmployee(dataUser[1]);
                                break;
                        }
                        Login.hide();
                    }
                }
            } else {
                // si la cuenta esta activa lanzamos el formulario respecto a su rol
                switch (dataUser[0]) {
                    case "empleado":
                        launchFormEmployee(dataUser[1]);
                        break;
                    case "administrador":
                        launchFormAdministrator(dataUser[1]);
                        break;
                    case "cliente":
                        launchFormClient(dataUser[1]);
                        break;
                }
                Login.hide(); // ocultamos el formulario
            }
        } catch (Exception ex) { // si ocurre algun error, mostramos que los datos son incorrectos
            System.out.println(ex.getMessage());
            message(null, "¡¡¡ Los Datos Ingresados Son Incorrectos !!!\n\n\tVerifiquelos Nuevamente....", "MECAUT - Inicio de Sesión", JOptionPane.WARNING_MESSAGE);
        }
    }
}