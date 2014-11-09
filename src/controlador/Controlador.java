package controlador;

import modelo.Logica.Reserva;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Gestor;
import modelo.Logica.Auto;
import modelo.Logica.Cliente;
import modelo.Logica.Cuenta;
import modelo.Logica.DetalleFactura;
import modelo.Logica.Empleados;
import modelo.Logica.Factura;
import modelo.Logica.GrupoClientes;
import modelo.Logica.HistorialMantenimiento;
import modelo.Logica.Mantenimiento;
import modelo.Logica.Proveedor;
import modelo.Logica.Repuesto;
import vista.Clientes.jifActualizarCliente;
import vista.Clientes.jifGrupoClientes;
import vista.Clientes.jifListaAutos;
import vista.Clientes.jifListaClientes;
import vista.Clientes.jifRegistrarAuto;
import vista.Clientes.jifRegistrarCliente;
import vista.Personal.jifActualizarEmpleado;
import vista.Personal.jifListaEmpleados;
import vista.Personal.jifRegistrarEmpleado;
import vista.Ventas.jifFactura;
import vista.FormulariosPrincipales.frmAdmin;
import vista.FormulariosPrincipales.frmCliente;
import vista.FormulariosPrincipales.frmEmpleado;
import vista.FormulariosPrincipales.frmLoggin;
import vista.Servicios.jifActualizarMantenimiento;
import vista.Servicios.jifListaMantenimientos;
import vista.Servicios.jifRegistrarMantenimiento;
import vista.Servicios.jifHistMantenimiento;
import vista.Proveedores.jifActualizarProveedor;
import vista.Proveedores.jifListaProveedores;
import vista.Proveedores.jifRegistrarProveedor;
import vista.Inventario.jifActualizarRepuesto;
import vista.Inventario.jifListaRepuestos;
import vista.Inventario.jifRegistrarRepuesto;
import vista.Servicios.jifReservas;
import vista.Inventario.jifOrdenDePedido;
import vista.Clientes.jifCuentas;
import vista.Ventas.jifListaFacturas;
import vista.Servicios.jifCotizacion;
import vista.Servicios.jifFichaAuto;

public class Controlador {

    private final Gestor Gestor;
    private final frmAdmin form;
    private final jifRegistrarCliente jifCliente;
    private final jifActualizarCliente jifActualizarCliente;
    private final jifRegistrarMantenimiento jifMantenimiento;
    private final jifListaClientes jifListaClientes;
    private final jifListaAutos jifListaAutos;
    private final jifListaRepuestos jifListaRepuestos;
    private final jifListaEmpleados jifListaEmpleados;
    private final jifListaProveedores jifListaProveedores;
    private final jifActualizarProveedor jifActualizarProveedor;
    private final jifRegistrarAuto jifAuto;
    private final jifRegistrarProveedor jifProveedor;
    private final jifRegistrarEmpleado jifEmpleado;
    private final jifActualizarEmpleado jifActualizarEmpleado;
    private final jifRegistrarRepuesto jifRepuesto;
    private final jifActualizarRepuesto jifActualizarRepuesto;
    private final jifListaMantenimientos jifListaMantenimientos;
    private final jifActualizarMantenimiento jifActualizarMantenimiento;
    private final jifFactura jifFactura;
    private final frmLoggin Login;
    private final frmCliente frmCliente;
    private final frmEmpleado frmEmpleado;
    private final jifGrupoClientes jifGrupoClientes;
    private final jifHistMantenimiento jifHistMantenimiento;
    private final jifReservas jifReservas;
    private final jifOrdenDePedido jifOrdenDePedido;
    private final jifCuentas jifCuentas;
    private final jifListaFacturas jifListaFacturas;
    private final jifCotizacion jifCotizacion;
    private final jifFichaAuto jifFichaAuto;
    
    /* CONSTRUCTOR */

    public Controlador() {
        // Inicializamos todos los objetos de los jInternalFrame
        Gestor = new Gestor();
        Login = new frmLoggin();
        form = new frmAdmin();
        frmCliente = new frmCliente();
        frmEmpleado = new frmEmpleado();
        jifCliente = new jifRegistrarCliente();
        jifActualizarCliente = new jifActualizarCliente();
        jifMantenimiento = new jifRegistrarMantenimiento();
        jifListaClientes = new jifListaClientes();
        jifListaAutos = new jifListaAutos();
        jifListaRepuestos = new jifListaRepuestos();
        jifListaEmpleados = new jifListaEmpleados();
        jifActualizarEmpleado = new jifActualizarEmpleado();
        jifListaProveedores = new jifListaProveedores();
        jifActualizarProveedor = new jifActualizarProveedor();
        jifListaMantenimientos = new jifListaMantenimientos();
        jifActualizarMantenimiento = new jifActualizarMantenimiento();
        jifAuto = new jifRegistrarAuto();
        jifProveedor = new jifRegistrarProveedor();
        jifEmpleado = new jifRegistrarEmpleado();
        jifRepuesto = new jifRegistrarRepuesto();
        jifActualizarRepuesto = new jifActualizarRepuesto();
        jifGrupoClientes = new jifGrupoClientes();
        jifFactura = new jifFactura();
        jifHistMantenimiento = new jifHistMantenimiento();
        jifReservas = new jifReservas();
        jifOrdenDePedido = new jifOrdenDePedido();
        jifCuentas = new jifCuentas();
        jifListaFacturas = new jifListaFacturas();
        jifCotizacion = new jifCotizacion();
        jifFichaAuto = new jifFichaAuto();
        // Se añaden los jInternalFrame al jDesktopPanel
        form.jDesktopPane1.add(jifMantenimiento);
        form.jDesktopPane1.add(jifCliente);
        form.jDesktopPane1.add(jifActualizarCliente);
        form.jDesktopPane1.add(jifListaClientes);
        form.jDesktopPane1.add(jifListaAutos);
        form.jDesktopPane1.add(jifListaRepuestos);
        form.jDesktopPane1.add(jifListaEmpleados);
        form.jDesktopPane1.add(jifListaProveedores);
        form.jDesktopPane1.add(jifAuto);
        form.jDesktopPane1.add(jifProveedor);
        form.jDesktopPane1.add(jifEmpleado);
        form.jDesktopPane1.add(jifActualizarEmpleado);
        form.jDesktopPane1.add(jifRepuesto);
        form.jDesktopPane1.add(jifActualizarRepuesto);
        form.jDesktopPane1.add(jifListaMantenimientos);
        form.jDesktopPane1.add(jifActualizarMantenimiento);
        form.jDesktopPane1.add(jifActualizarProveedor);
        form.jDesktopPane1.add(jifGrupoClientes);
        form.jDesktopPane1.add(jifFactura);
        form.jDesktopPane1.add(jifHistMantenimiento);
        form.jDesktopPane1.add(jifReservas);
        form.jDesktopPane1.add(jifOrdenDePedido);
        form.jDesktopPane1.add(jifCuentas);
        form.jDesktopPane1.add(jifListaFacturas);
        form.jDesktopPane1.add(jifCotizacion);
        form.jDesktopPane1.add(jifFichaAuto);
    }
    /* INICIO LOGGIN */
    public void lanzarLogin() {
        Login.btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evtIniciarSesion();
            }
        });
        Login.jtfUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evtIniciarSesion();
            }
        });
        Login.jtfContraseña.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evtIniciarSesion();
            }
        });
        Login.jbtSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        Login.jtfUsuario.requestFocus();
        Login.setVisible(true);
    }
    
    /* Formulario Administrador */

    private void lanzarFormularioAdministrador() {
        /* MENU - CLIENTES */
        // 1. Modulo Clientes
        form.jmiRegistrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarCliente();
            }
        });
        form.jmiActualizarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmActualizarCliente();
            }
        });
        form.jmiListaCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaClientes();
            }
        });
        form.jmiGrupoClientes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmGrupoClientes();
            }
        });
        form.jmiRegistrarAuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarAuto();
            }
        });
        form.jmiListaAutos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaAutos();
            }
        });
        form.jmiRegistrarCuenta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmCuentas();
            }
        });
        // 2. Modulo Servicios
        form.jmiRegistrarMantenimiento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarMantenimientos();
            }
        });
        form.jmiActualizarMantenimiento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmActualizarMantenimiento();
            }
        });
        form.jmiListaMantenimientos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaMantenimientos();
            }
        });
        form.jmiHistMantenimiento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmHistorialMantenimiento();
            }
        });
        form.jmiReservas.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmReservas();
            }
        });
        form.jmiCotizacion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmCotizacion();
            }
        });
        form.jmiFichaRecepcion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmFichaRecepcionAuto();
            }
        });
        // 3. Modulo Suministros
        form.jmiRegitrarProveedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarProveedor();
            }
        });
        form.jmiActualizarProveedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmActualizarProveedor();
            }
        });
        form.jmiListaProveedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaProveedores();
            }
        });
        // 4. Modulo Personal
        form.jmiRegistrarMecanico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarEmpleado();
            }
        });
        form.jmiActualizarMecanico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmActualizarEmpleado();
            }
        });
        form.jmiListaEmpleados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaEmpleados();
            }
        });
        // 5. Modulo Inventario
        form.jmiRegistrarRepuestos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarRepuestos();
            }
        });
        form.jmiActualizarRepuesto.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmActualizarRepuesto();
            }
        });
        form.jmiListaRepuestos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaRepuestos();
            }
        });
        form.jmiOrdenPedido.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmOrdenDePedido();
            }
        });
        // 6. Modulo Ventas
        form.jmiRegistrarFactura.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                frmFactura();
            }
        });
        // 7. Modulo Reportes
        form.jmiListaFacturas.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmListaFacturas();
            }
        });
        // 8. Modulo ayuda
        
        // 9. Modulo salir
        form.jmiSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form.setVisible(false);
                Login.jtfContraseña.setText("");
                Login.setVisible(true);
            }
        });
        String user = Login.jtfUsuario.getText();
        form.setVisible(true);
        form.user.setText(user.toUpperCase());
        form.user.setToolTipText("Usuario: "+user);
        form.conection.setText(Gestor.estadoConexion());
    }
    /* Formulario Cliente */

    private void lanzarFormularioCliente() {
        frmCliente.setVisible(true);
        frmCliente.jmiCerrarSesion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmCliente.hide();
                Login.setVisible(true);
                Login.jtfContraseña.setText(null);
            }
        });
    }
    /* Formulario Empleado */

    private void lanzarFormularioEmpleado() {
        frmEmpleado.setVisible(true);
        frmEmpleado.jmSalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmEmpleado.hide();
                Login.setVisible(true);
                Login.jtfContraseña.setText(null);
            }
        });
    }
    /* 1. Modulo Clientes */

    private void frmRegistrarCliente() {
        limpiar();
        limpiarComboBox();
        
        jifCliente.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String identificacion = jifCliente.jtfIdentificacion.getText();
                    String nombre = jifCliente.jtfNombre.getText();
                    String apellidos = jifCliente.jtfApellidos.getText();
                    String sexo = jifCliente.jcbSexo.getSelectedItem().toString();
                    String telefono = jifCliente.jtfTelefono.getText();
                    String direccion = jifCliente.jtfDireccion.getText();
                    String correo = jifCliente.jtfCorreo.getText();
                    if (identificacion.isEmpty() || nombre.isEmpty() || apellidos.isEmpty() || direccion.isEmpty()) {
                        /* Esta Condición es para que no salga error cuando se abre el formulario por 2da vez */
                        JOptionPane.showMessageDialog(null, "Llene todos los campos \n"+ae.getID());
                    } else {
                        Cliente cli = new Cliente(identificacion, nombre, apellidos, sexo, telefono, direccion, correo);
                        Cuenta cuenta = new Cuenta(identificacion, identificacion, "cliente", identificacion);
                        if (Gestor.agregarCliente(cli) && Gestor.registrarUsuario(cuenta) && Gestor.agregarGrupoCliente(identificacion, "GRO002", "Ocasional", "Activo")) {
                            JOptionPane.showMessageDialog(null, "¡Datos del cliente " + nombre.toUpperCase() + " almacenados!", "MECAUT - Registro Cliente", JOptionPane.INFORMATION_MESSAGE);
                            limpiarComboBox();
                            limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos del cliente " + nombre + "", "MECAUT - Registro Cliente", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese solo numeros en los campos...", "MECAUT", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifCliente.setVisible(true);
        locacionfrm(jifCliente);
    }

    private void frmActualizarCliente() {
        limpiar();
        limpiarComboBox();
        
        jifActualizarCliente.jtfIdentificacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evtConsultarClienteporId();
            }
        });
        jifActualizarCliente.jbtConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                evtConsultarClienteporId();
            }
        });
        jifActualizarCliente.jbtModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String identificacion = jifActualizarCliente.jtfIdentificacion.getText();
                    String nombre = jifActualizarCliente.jtfNombre.getText();
                    String apellidos = jifActualizarCliente.jtfApellidos.getText();
                    String sexo = jifActualizarCliente.jcbSexo.getSelectedItem().toString();
                    String telefono = jifActualizarCliente.jtfTelefono.getText();
                    String direccion = jifActualizarCliente.jtfDireccion.getText();
                    String correo = jifActualizarCliente.jtfCorreo.getText();
                    Cliente cli = new Cliente(identificacion, nombre, apellidos, sexo, telefono, direccion, correo);
                    if (Gestor.modificarCliente(cli)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del cliente " + nombre.toUpperCase() + " modificados!", "Mecaut - Cliente", JOptionPane.INFORMATION_MESSAGE);
                        jifActualizarCliente.jcbSexo.setSelectedItem(0);
                        limpiar();
                        limpiarComboBox();
                        jifActualizarCliente.jbtEliminar.setEnabled(false);
                        jifActualizarCliente.jbtModificar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron modificar los del cliente " + nombre + "!", "Mecaut - Cliente", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (HeadlessException re) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + re.getMessage(), "Mecaut - Cliente", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifActualizarCliente.jbtEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = jifActualizarCliente.jtfNombre.getText();
                    int rs = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar el cliente " + nombre.toUpperCase() + "?", "Eliminar CLIENTE", JOptionPane.YES_NO_OPTION);
                    if (rs == JOptionPane.YES_OPTION) {
                        String identificacion = jifActualizarCliente.jtfIdentificacion.getText();
                        if (Gestor.eliminarCliente(identificacion)) {
                            JOptionPane.showMessageDialog(null, "¡Datos del cliente " + nombre.toUpperCase() + " eliminados!", "Mecaut - Cliente", JOptionPane.INFORMATION_MESSAGE);
                            jifActualizarCliente.jcbSexo.setSelectedItem(0);
                            limpiar();
                            limpiarComboBox();
                            jifActualizarCliente.jbtEliminar.setEnabled(true);
                            jifActualizarCliente.jbtModificar.setEnabled(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron eliminar los datos del cliente " + nombre.toUpperCase() + "", "Mecaut - Cliente", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (HeadlessException se) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + se.getMessage(), "Error -- MECAUT", 1);
                }
            }
        });
        
        TextAutoCompleter t = new TextAutoCompleter(jifActualizarCliente.jtfIdentificacion);
        ResultSet ids = Gestor.IdsClientes();
        try {
            while (ids.next())
                t.addItem(ids.getString("cli_id"));
        } catch (Exception e) {}
        jifActualizarCliente.setVisible(true);
        locacionfrm(jifActualizarCliente);
    }

    private void frmListaClientes() {
        evtMostrarClientes();
        jifListaClientes.jtfDato.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                evtMostrarClientes();
            }
        });
        jifListaClientes.setVisible(true);
    }

    private void evtMostrarClientes() {
        String dato = jifListaClientes.jtfDato.getText();
        ArrayList<Cliente> clientes = Gestor.verClientePorDato(dato);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Identificación");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Sexo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");
        modelo.addColumn("Correo Eléctronico");
        for (Cliente cliente : clientes) {
            Object[] fila = new Object[7];
            fila[0] = cliente.getIdentificacion();
            fila[1] = cliente.getNombre();
            fila[2] = cliente.getApellidos();
            fila[3] = cliente.getSexo();
            fila[4] = cliente.getTelefono();
            fila[5] = cliente.getDireccion();
            fila[6] = cliente.getCorreo();
            modelo.addRow(fila);
        }
        jifListaClientes.jtListaClientes.setModel(modelo);
        int nRegistros = modelo.getRowCount();
        jifListaClientes.nRegistros.setText("" + nRegistros);
    }
    
    private void frmCuentas(){
        limpiar();
        limpiarComboBox();
        
        jifCuentas.jbtCrearCuenta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = jifCuentas.jtfUsuario.getText();
                String contrasena = jifCuentas.jtfcontrasena.getText();
                String cContrasena = jifCuentas.jtfconfContrasena.getText();
                String tipo = jifCuentas.jcbTipoCuenta.getSelectedItem().toString();
                if (contrasena.equals(cContrasena)) {
                    if (jifCuentas.jTabbedPane1.getSelectedIndex() == 0) {
                        String id = jifCuentas.jtfIdentificacionCli.getText();
                        String nom = jifCuentas.jtfNombrec.getText();
                        String apel = jifCuentas.jtfApellidosc.getText();
                        String sex = jifCuentas.jcbSexoc.getSelectedItem().toString();
                        String tel = jifCuentas.jtfTelefonoc.getText();
                        String dir = jifCuentas.jtfDireccionc.getText();
                        String cor = jifCuentas.jtfCorreoc.getText();
                        
                        Cliente cli = new Cliente(id, nom, apel, sex, tel, dir, cor);
                        Cuenta count = new Cuenta(usuario, contrasena, tipo, id);
                        if (Gestor.agregarCliente(cli) && Gestor.registrarUsuario(count)) {
                            JOptionPane.showMessageDialog(null, "Se registro correctamente la cuenta "+usuario.toUpperCase()+"\nAl Cliente "+nom.toUpperCase());
                            limpiar();
                            limpiarComboBox();
                        }
                    }else{
                        String id = jifCuentas.jtfIdentificacion1.getText();
                        String nom = jifCuentas.jtfNombre1.getText();
                        String apel = jifCuentas.jtfApellidos1.getText();
                        String sex = jifCuentas.jcbSexo1.getSelectedItem().toString();
                        String tipEmpl = jifCuentas.jcbTipo.getSelectedItem().toString();
                        String tel = jifCuentas.jtfTelefono1.getText();
                        String dir = jifCuentas.jtfDireccion1.getText();
                        String cor = jifCuentas.jtfCorreo1.getText();
                        String sal = jifCuentas.jtfSalario.getText();
                        
                        Empleados emp = new Empleados(id, nom, apel, sex, tipEmpl, tel, dir, cor, sal);
                        Cuenta count = new Cuenta(usuario, contrasena, tipo, id);
                        if (Gestor.agregarEmpleado(emp) && Gestor.registrarUsuario(count)) {
                            JOptionPane.showMessageDialog(null, "Se registro correctamente la cuenta "+usuario.toUpperCase()+"\nAl Empleado "+nom.toUpperCase());
                            limpiar();
                            limpiarComboBox();
                        }
                    }                        
                }else
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden...", "MECAUT",JOptionPane.ERROR_MESSAGE);
            }
        });
        
        jifCuentas.jcbTipoCuenta.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String dato = (jifCuentas.jcbTipoCuenta.getSelectedItem() != null)?jifCuentas.jcbTipoCuenta.getSelectedItem().toString():"";
                if ("administrador".equals(dato)){
                    jifCuentas.jTabbedPane1.setSelectedIndex(1);
                    jifCuentas.jcbTipo.setSelectedIndex(2);
                }else if("empleado".equals(dato)){
                    jifCuentas.jTabbedPane1.setSelectedIndex(1);
                    jifCuentas.jcbTipo.setSelectedIndex(1);
                }
                else
                    jifCuentas.jTabbedPane1.setSelectedIndex(0);
            }
        });
        
        jifCuentas.setVisible(true);
    }

    private void frmGrupoClientes() {
        limpiar();
        limpiarComboBox();
        evtVerGrupoClientes("Activo");
        int n2 = jifGrupoClientes.jtGrupoClientes.getRowCount();
        jifGrupoClientes.nRegistros.setText("" + n2);
        
        jifGrupoClientes.jcbTipo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String dato = jifGrupoClientes.jcbTipo.getSelectedItem().toString();
                evtVerGrupoClientes(dato);
            }
        });
        jifGrupoClientes.jbtModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = jifGrupoClientes.jtfId.getText();
                String cod = jifGrupoClientes.jcbcodigoGrupo.getSelectedItem().toString();
                String nom = jifGrupoClientes.jcbNombregrupo.getSelectedItem().toString();
                String est = jifGrupoClientes.jcbEstado.getSelectedItem().toString();
                if (Gestor.actualizarGrupoCliente(id, cod, nom, est)) {
                    JOptionPane.showMessageDialog(null, "Se modifico correctamente el estado del cliente", "MECAUT", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    limpiarComboBox();
                    jifGrupoClientes.jbtModificar.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el estado del cliente", "MECAUT", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifGrupoClientes.jbtCancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                limpiarComboBox();
                jifGrupoClientes.jbtModificar.setEnabled(false);
            }
        });
        
        jifGrupoClientes.setVisible(true);
        locacionfrm(jifGrupoClientes);
    }

    private void evtVerGrupoClientes(String tipo) {
        ArrayList<GrupoClientes> grupo;
        switch (tipo) {
            case "Habitual":
                grupo = Gestor.verGrupoClientes("Habitual");
                break;
            case "Ocasional":
                grupo = Gestor.verGrupoClientes("Ocasional");
                break;
            case "Potencial":
                grupo = Gestor.verGrupoClientes("Potencial");
                break;
            case "Activo":
                grupo = Gestor.verGrupoClientes("Activo");
                break;
            case "Inactivo":
                grupo = Gestor.verGrupoClientes("Inactivo");
                break;
            default:
                grupo = Gestor.verGrupoClientes("Activo");
                break;
        }
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre Grupo");
        modelo.addColumn("Id Cliente");
        modelo.addColumn("Estado");
        for (GrupoClientes grupos : grupo) {
            Object[] fila = new Object[4];
            fila[0] = grupos.getCodigo();
            fila[1] = grupos.getNombre();
            fila[2] = grupos.getCli_Id();
            fila[3] = grupos.getEstado();
            modelo.addRow(fila);
        }
        int n = jifGrupoClientes.jtGrupoClientes.getRowCount();
        jifGrupoClientes.nRegistros.setText("" + n);
        jifGrupoClientes.jtGrupoClientes.setModel(modelo);
    }

    private void frmRegistrarAuto() {
        limpiar();
        ArrayList<Cliente> clientes = Gestor.consultarClientes();
        jifAuto.jcbIdCliente.removeAllItems();
        jifAuto.jcbIdCliente.addItem("Seleccione Id");
        for (Cliente cliente : clientes) {
            jifAuto.jcbIdCliente.addItem(cliente.getIdentificacion());
        }
        limpiarComboBox();
        jifAuto.jcbIdCliente.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try {
                    String id = jifAuto.jcbIdCliente.getSelectedItem().toString();
                    ResultSet r = Gestor.consultarDatosAuto(id);
                    while (r.next()) {
                        jifAuto.jtfNombreCliente.setText(r.getString(2));
                    }
                    jifAuto.jbtRegistrar.setEnabled(true);
                } catch (Exception ex) {}
            }
        });
        jifAuto.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String placa = jifAuto.jtfPlaca.getText();
                String ciudad = jifAuto.jcbCiudad.getSelectedItem().toString();
                String tipo = jifAuto.jcbTipo.getSelectedItem().toString();
                String modelo = (jifAuto.jcbModelo.getSelectedItem().toString());
                String marca = jifAuto.jcbMarca.getSelectedItem().toString();
                String kilometraje = jifAuto.jtfKilometraje.getText();
                String combustible = jifAuto.jtfCombustible.getText();
                String idCliente = jifAuto.jcbIdCliente.getSelectedItem().toString();
                String nombreCliente = jifAuto.jtfNombreCliente.getText();
                try {
                    Auto aut = new Auto(placa, ciudad, tipo, modelo, marca, kilometraje, combustible, idCliente, nombreCliente);
                    if (Gestor.agregarAuto(aut)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del auto almacenados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                        limpiarComboBox();
                        jifAuto.jbtRegistrar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos del auto!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifAuto.setVisible(true);
        locacionfrm(jifAuto);
    }

    private void evtConsultarClienteporId() {
        try {
            ResultSet r;
            String id = jifActualizarCliente.jtfIdentificacion.getText();
            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese una Identificación", "MECAUT", JOptionPane.ERROR_MESSAGE);
            } else {
                r = Gestor.TraerDatosCliente(id);
                while (r.next()) {
                    int op = ("Masculino".equals(r.getString(4)) ? 2 : 1);
                    jifActualizarCliente.jtfNombre.setText(r.getString(2));
                    jifActualizarCliente.jtfApellidos.setText(r.getString(3));
                    jifActualizarCliente.jcbSexo.setSelectedIndex(op);
                    jifActualizarCliente.jtfTelefono.setText(r.getString(5));
                    jifActualizarCliente.jtfDireccion.setText(r.getString(6));
                    jifActualizarCliente.jtfCorreo.setText(r.getString(7));
                }
                jifActualizarCliente.jbtEliminar.setEnabled(true);
                jifActualizarCliente.jbtModificar.setEnabled(true);
            }
        } catch (HeadlessException | SQLException e) {}
    }

    private void frmListaAutos() {
        ArrayList<Auto> autos = Gestor.verAutos();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Placa");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Tipo");
        modelo.addColumn("Modelo");
        modelo.addColumn("Marca");
        modelo.addColumn("Kilometraje");
        modelo.addColumn("Combustible");
        modelo.addColumn("Id cliente");
        modelo.addColumn("Nombre cliente");
        for (Auto auto : autos) {
            Object[] fila = new Object[9];
            fila[0] = auto.getPlaca();
            fila[1] = auto.getCiudad();
            fila[2] = auto.getTipo();
            fila[3] = auto.getModelo();
            fila[4] = auto.getMarca();
            fila[5] = auto.getKilometraje();
            fila[6] = auto.getCombustible();
            fila[7] = auto.getIdCliente();
            fila[8] = auto.getNombreCliente();
            modelo.addRow(fila);
        }
        jifListaAutos.jtListaAutos.setModel(modelo);
        jifListaAutos.setVisible(true);
        jifListaAutos.lbRegistros.setText(""+(jifListaAutos.jtListaAutos.getRowCount()));
        locacionfrm(jifListaAutos);
    }
    /* 2. Modulo Servicios */

    private void frmRegistrarMantenimientos() {
        limpiar();
        limpiarFechas();
        limpiarTablas(jifMantenimiento.Detalles);
        final DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Tipo Mantenimiento");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Placa Auto");
        modelo.addColumn("Cliente");
        modelo.addColumn("Id Mécanico");
        modelo.addColumn("Nombre");
        modelo.addColumn("Repuesto Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        codigoMantenimiento();
        jifMantenimiento.jcbIdMecanico1.removeAllItems();
        jifMantenimiento.jcbIdMecanico1.addItem("----");
        jifMantenimiento.jcbcodRepuesto.removeAllItems();
        jifMantenimiento.jcbcodRepuesto.addItem("----");
        ResultSet ids = Gestor.idsMecanicos();
        try {
            while (ids.next())
                jifMantenimiento.jcbIdMecanico1.addItem(ids.getString("emp_id"));
        } catch (Exception e) {        }
        ResultSet cods = Gestor.codRepuestos();
        try {
            while (cods.next())
                jifMantenimiento.jcbcodRepuesto.addItem(cods.getString("rep_codigo"));
        } catch (Exception e) {        }
        limpiarComboBox();
        jifMantenimiento.jbtConsultarAuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dato = jifMantenimiento.jtfPlaca.getText();
                if(dato.isEmpty())
                    JOptionPane.showMessageDialog(null,"Ingrese una placa","MECAUT",JOptionPane.WARNING_MESSAGE);
                else{
                ResultSet r = Gestor.datosMantenimiento(dato);
                try {
                    while (r.next()) {
                        jifMantenimiento.jtfIdCliente.setText(r.getString("cli_id"));
                        jifMantenimiento.jtfNombreCliente.setText(r.getString("cli_nombre"));
                    }
                } catch (Exception ex) {}}
            }
        });
        jifMantenimiento.jcbIdMecanico1.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String id = (jifMantenimiento.jcbIdMecanico1.getSelectedItem() != null)?jifMantenimiento.jcbIdMecanico1.getSelectedItem().toString():"";
                ResultSet re = Gestor.traerDatosEmpleado(id);
                try {
                    while (re.next()) 
                        jifMantenimiento.jtfNombreMecanico1.setText(re.getString("emp_nombre")+" "+re.getString("emp_apellidos"));
                } catch (Exception ex) {}
            }
        });
        jifMantenimiento.jbtAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String placa = jifMantenimiento.jtfPlaca.getText();
                String nombreCliente = jifMantenimiento.jtfNombreCliente.getText();
                if(!placa.isEmpty() || !nombreCliente.isEmpty()){
                    Object[] fila = new Object[11];
                    fila[0] = "";
                    fila[1] = "";
                    fila[2] = "";
                    fila[3] = placa;
                    fila[4] = nombreCliente;
                    fila[5] = "";
                    fila[6] = "";
                    fila[7] = "";
                    fila[8] = "";
                    fila[9] = "";
                    fila[10] = "";
                    modelo.addRow(fila);
                    jifMantenimiento.Detalles.setModel(modelo);
                    jifMantenimiento.jcbTipoMantenimiento1.setSelectedIndex(0);
                    jifMantenimiento.jtfplaca.setText(placa);
                    jifMantenimiento.jtfCliNombre.setText(nombreCliente);
                    jifMantenimiento.jscantidadRepuesto.setValue(0);
                    jifMantenimiento.jdcFecha.setDate(null);
                    jifMantenimiento.jtfdescripcion.setText("");
                    jifMantenimiento.jcbcodRepuesto.setSelectedIndex(0);
                    jifMantenimiento.jtfnombreRepuesto.setText("");
                    jifMantenimiento.jtfPrecioRepuesto.setText("");
                    jifMantenimiento.jFrame1.setVisible(true);
                    jifMantenimiento.jFrame1.setBounds(300, 150, 793, 490);
                }else
                    JOptionPane.showMessageDialog(null, "Ingrese los Datos del Auto","MECAUT",JOptionPane.WARNING_MESSAGE);
            }
        });
        jifMantenimiento.jbtCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                limpiarFechas();
                limpiarTablas(jifMantenimiento.Detalles);
                limpiarComboBox();
            }
        });
        jifMantenimiento.jcbcodRepuesto.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String cod = (jifMantenimiento.jcbcodRepuesto.getSelectedItem() != null)?jifMantenimiento.jcbcodRepuesto.getSelectedItem().toString():"";
                ResultSet r = Gestor.datosRepuesto(cod);
                try {
                    while (r.next()) {
                        jifMantenimiento.jtfnombreRepuesto.setText(r.getString("rep_tipo"));
                        jifMantenimiento.disp.setText(r.getString("rep_cantidad"));
                        jifMantenimiento.jtfPrecioRepuesto.setText(r.getString("rep_precio"));
                        if(Integer.parseInt(r.getString("rep_cantidad")) == 0){
                            jifMantenimiento.jscantidadRepuesto.setEnabled(false);
                            int rs = JOptionPane.showConfirmDialog(null, "El repuesto no tiene mas articulos que vender\n\nDesea Hacer una nueva orden de pedido","MECAUT",JOptionPane.YES_NO_OPTION);
                            if (rs == JOptionPane.YES_OPTION) {
                                jifMantenimiento.jFrame1.hide();
                                frmOrdenDePedido();
                            }
                        }
                        else{
                            jifMantenimiento.jscantidadRepuesto.setEnabled(true);
                            jifMantenimiento.jscantidadRepuesto.setValue(0);
                        }
                    }
                } catch (SQLException | NumberFormatException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, ""+ex.getMessage());}
            }
        });
        jifMantenimiento.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String codigoMantenimiento = jifMantenimiento.jtfCodigo.getText();
                    String observaciones = jifMantenimiento.jtfObservaciones.getText();
                    String costo = jifMantenimiento.jtfCosto.getText();
                    String estado = "Pendiente";
                    String cli_id = jifMantenimiento.jtfIdCliente.getText();
                    String placa = jifMantenimiento.jtfPlaca.getText();
                    if(jifMantenimiento.jdcFechaInicio == null){
                        JOptionPane.showMessageDialog(null, "Ingrese una fecha para el Mantenimiento","MECAUT",JOptionPane.ERROR_MESSAGE);
                    }else if(observaciones.isEmpty() || placa.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Debe llenar todos los datos","MECAUT",JOptionPane.ERROR_MESSAGE);
                    }else{
                        if(jifMantenimiento.Detalles.getRowCount() > 0){
                            java.util.Date fechaInicio = jifMantenimiento.jdcFechaInicio.getDate();
                            SimpleDateFormat formatofecha= new SimpleDateFormat("dd/MM/YYYY");
                            String fec=""+formatofecha.format(fechaInicio);
                            if (Gestor.registrarMantenimiento(codigoMantenimiento, fec, observaciones, costo, estado,cli_id) && Gestor.registrarHistorialMantenimiento(placa,codigoMantenimiento,cli_id,fec)) {
                                JOptionPane.showMessageDialog(null, "Se registro el Mantenimiento","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                                int nColumnas = jifMantenimiento.Detalles.getRowCount();
                                String[][] datosdetalles = new String[nColumnas][11];
                                for (int i = 0; i < nColumnas; i++) {
                                    for (int j = 0; j < 11; j++) {
                                        datosdetalles[i][j] = (String) jifMantenimiento.Detalles.getValueAt(i, j);
                                    }
                                }
                                for (int i = 0; i < datosdetalles.length; i++) {
                                    if (Gestor.detallesMantenimiento(
                                            codigoMantenimiento,
                                            datosdetalles[i][0],
                                            datosdetalles[i][1],
                                            datosdetalles[i][2],
                                            datosdetalles[i][3],
                                            datosdetalles[i][4],
                                            datosdetalles[i][5],
                                            datosdetalles[i][6],
                                            datosdetalles[i][7],
                                            datosdetalles[i][8],
                                            datosdetalles[i][9])) {
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Algo salio mal :c");
                                    }
                                    System.out.println("");
                                }
                                limpiarTablas(jifMantenimiento.Detalles);
                                jifMantenimiento.jcbIdMecanico1.setSelectedIndex(0);
                                jifMantenimiento.jcbcodRepuesto.setSelectedIndex(0);
                                jifMantenimiento.jdcFecha.setDate(null);
                                jifMantenimiento.jdcFechaInicio.setDate(null);
                                jifMantenimiento.Detalles.setModel(modelo);
                                limpiar();
                                codigoMantenimiento();
                                limpiarComboBox();
                                jifMantenimiento.jbtRegistrar.setEnabled(false);
                            } else {
                                JOptionPane.showMessageDialog(null, "no se pudo registrar el mantenimiento","MECAUT",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Debes agregar al menos un mantenimiento","MECAUT",JOptionPane.ERROR_MESSAGE);
                    }
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "no se pudo registrar el mantenimiento\nVerifique si lleno todos los campos correcamente","MECAUT",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        TextAutoCompleter t = new TextAutoCompleter(jifMantenimiento.jtfPlaca);
        ResultSet res = Gestor.placasAutos();
        try {
            while (res.next()) 
                t.addItem(res.getString("aut_placa"));
        } catch (Exception e) { }
        jifMantenimiento.setVisible(true);
        locacionfrm(jifMantenimiento);
    }

    private void frmActualizarMantenimiento() {
        limpiar();
        limpiarTablas(jifActualizarMantenimiento.Detalles);
        final DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Tipo de Mantenimiento");
        modelo.addColumn("Descripcion del Mantenimiento");
        modelo.addColumn("Fecha del Mantenimiento");
        modelo.addColumn("Cod Repuesto");
        modelo.addColumn("Nombre Repuesto");
        modelo.addColumn("Cantidad Repuesto");
        
        jifActualizarMantenimiento.jcbCodigoMantenimiento.removeAllItems();
        jifActualizarMantenimiento.jcbCodigoMantenimiento.addItem("---");
        limpiarComboBox();
        ResultSet codigos = Gestor.codigosMantenimientos();
        try {
            while(codigos.next())
                jifActualizarMantenimiento.jcbCodigoMantenimiento.addItem(codigos.getString("man_codigo"));
        } catch (Exception e) {}
        jifActualizarMantenimiento.jcbCodigoMantenimiento.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String cod = (jifActualizarMantenimiento.jcbCodigoMantenimiento.getSelectedItem() != null)?jifActualizarMantenimiento.jcbCodigoMantenimiento.getSelectedItem().toString():"";
                ResultSet datos;
                datos = Gestor.traerDatosMantenimiento(cod);
                try {
                    while(datos.next()){
                        jifActualizarMantenimiento.jtfFecha.setText(datos.getString(2));
                        jifActualizarMantenimiento.jtfEstado.setText(datos.getString(3));
                        jifActualizarMantenimiento.jtfObsevaciones.setText(datos.getString(5));
                        jifActualizarMantenimiento.jtfCosto.setText(datos.getString(4));
                        jifActualizarMantenimiento.jtfIdCliente.setText(datos.getString(6));
                        jifActualizarMantenimiento.jtfNombreCliente.setText(datos.getString(12));
                        jifActualizarMantenimiento.jtfPlaca.setText(datos.getString(11));
                        jifActualizarMantenimiento.jtfIdEmpleado.setText(datos.getString(13));
                        jifActualizarMantenimiento.jtfNombreEmpleado.setText(datos.getString(14));
                    }
                } catch (Exception exc) {}
                datos = Gestor.traerDatosDetallesMantenimiento(cod);
                try {
                    while(datos.next()){
                        Object[] fila = new Object[6];
                        fila[0] = datos.getString(2);
                        fila[1] = datos.getString(3);
                        fila[2] = datos.getString(4);
                        fila[3] = datos.getString(9);
                        fila[4] = datos.getString(10);
                        fila[5] = datos.getString(11);
                        modelo.addRow(fila);
                    }
                    jifActualizarMantenimiento.Detalles.setModel(modelo);
                } catch (Exception ex) {}
            }
        });
        jifActualizarMantenimiento.jbtModificar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Se modifico corretamente el mantenimiento","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                limpiarComboBox();
                limpiarTablas(jifActualizarMantenimiento.Detalles);
            }
        });    
        jifActualizarMantenimiento.jbtEliminar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String cod = jifActualizarMantenimiento.jcbCodigoMantenimiento.getSelectedItem().toString();
                int rs = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar este mantenimiento","MECAUT",JOptionPane.YES_NO_OPTION);
                if(rs == JOptionPane.YES_OPTION){
                if (Gestor.eliminarMantenimiento(cod) && Gestor.eliminarDetMantenimiento(cod) && Gestor.eliminarHisMantenimiento(cod)) {
                    JOptionPane.showMessageDialog(null, "Se elimino corretamente el mantenimiento","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    limpiarComboBox();
                    limpiarTablas(jifActualizarMantenimiento.Detalles);
                }
                else
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el mantenimiento","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        jifActualizarMantenimiento.setVisible(true);
    }

    private void frmListaMantenimientos() {
        ArrayList<Mantenimiento> mantenimientos = Gestor.verMantenimientos();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Estado");
        modelo.addColumn("Costo");
        modelo.addColumn("Cliente");
        modelo.addColumn("Descripción");
        for (Mantenimiento mantenimiento : mantenimientos) {
            Object[] fila = new Object[6];
            fila[0] = mantenimiento.getCodigo();
            fila[1] = mantenimiento.getFecha();
            fila[2] = mantenimiento.getEstado();
            fila[3] = mantenimiento.getCosto();
            fila[4] = mantenimiento.getCli_id();
            fila[5] = mantenimiento.getDescripcion();
            modelo.addRow(fila);
        }
        jifListaMantenimientos.jtListaMantenimientos.setModel(modelo);
        jifListaMantenimientos.setVisible(true);
        locacionfrm(jifListaMantenimientos);
    }
    
    private void frmHistorialMantenimiento(){
        limpiar();
        limpiarFechas();
        ArrayList<HistorialMantenimiento> lista = Gestor.listaHistorialMantenimientos("", null);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo Mantenimiento");
        model.addColumn("Placa del Auto");
        model.addColumn("Id Cliente");
        model.addColumn("Fecha");
        for (HistorialMantenimiento his : lista) {
            Object[] fila = new Object[4];
            fila[0] = his.getCodigo_mantenimiento();
            fila[1] = his.getPlaca();
            fila[2] = his.getId_cliente();
            fila[3] = his.getFecha();
            model.addRow(fila);
        }
        ResultSet n = Gestor.nRegistrosHisMantenimientos();
        String registros = "";
        try{
        while(n.next())
            registros = n.getString(1);
        }catch(Exception exc){}
        jifHistMantenimiento.jTable1.setModel(model);
        jifHistMantenimiento.lblRegistros.setText(registros);
        jifHistMantenimiento.jbtConsultar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String dato ;
                ArrayList<HistorialMantenimiento> lista;
                if (jifHistMantenimiento.rbPlaca.isSelected()) {
                    dato = jifHistMantenimiento.jtfPlaca.getText();
                    lista = Gestor.listaHistorialMantenimientos("Placa",dato);
                }else if (jifHistMantenimiento.rbIdCliente.isSelected()) {
                    dato = jifHistMantenimiento.jtfIdCliente.getText();
                    lista = Gestor.listaHistorialMantenimientos("Id",dato);
                }
                else if (jifHistMantenimiento.rbFecha.isSelected()) {
                    java.util.Date fechaInicio = jifHistMantenimiento.jdcFecha.getDate();
                    SimpleDateFormat formatofecha= new SimpleDateFormat("dd/MM/YYYY");
                    dato=""+formatofecha.format(fechaInicio);
                    lista = Gestor.listaHistorialMantenimientos("Fecha",dato);
                }else{
                    lista = Gestor.listaHistorialMantenimientos("",null);
                }
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Codigo Mantenimiento");
                model.addColumn("Placa del Auto");
                model.addColumn("Id Cliente");
                model.addColumn("Fecha");
                for (HistorialMantenimiento his : lista) {
                    Object[] fila = new Object[4];
                    fila[0] = his.getCodigo_mantenimiento();
                    fila[1] = his.getPlaca();
                    fila[2] = his.getId_cliente();
                    fila[3] = his.getFecha();
                    model.addRow(fila);
                }
                jifHistMantenimiento.jTable1.setModel(model);
                int registros = jifHistMantenimiento.jTable1.getRowCount();                
                jifHistMantenimiento.lblRegistros.setText(""+registros);
            }
        });
        
        jifHistMantenimiento.setVisible(true);
        locacionfrm(jifHistMantenimiento);
    }
    
    private void codigoMantenimiento() {
        ResultSet r = Gestor.codigoMantenimiento();
        String cod = "";
        try{
        while(r.next())
            cod = r.getString(1);
        int c = Integer.parseInt(cod);
        jifMantenimiento.jtfCodigo.setText(""+(++c));
        }catch(SQLException | NumberFormatException e){}
    }
    
    private void frmReservas(){
        limpiar();
        codigoReserva();
        limpiarFechas();
        ResultSet ids = Gestor.IdsClientes();
        TextAutoCompleter t = new TextAutoCompleter(jifReservas.jtfIdentificacion);
        try {
            while(ids.next())
                t.addItem(ids.getString("cli_id"));
        } catch (Exception e) {}
        ids = Gestor.idsMecanicos();
        jifReservas.jcbIdMecanico.removeAllItems();
        jifReservas.jcbIdMecanico.addItem("-----");
        try {
            while(ids.next())
                jifReservas.jcbIdMecanico.addItem(ids.getString("emp_id"));
        } catch (Exception e) {}
        jifReservas.jcbIdMecanico.setSelectedIndex(0);
        
        jifReservas.jbtConsultarDatos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String id = jifReservas.jtfIdentificacion.getText();
                ResultSet datos = Gestor.datosReserva(id);
                try{
                while(datos.next()){
                    jifReservas.jtfNombre.setText(datos.getString(1));
                    jifReservas.jtfTelefono.setText(datos.getString(2));
                    jifReservas.jtfCorreo.setText(datos.getString(3));
                    jifReservas.jtfPlaca.setText(datos.getString(4));
                    jifReservas.jtfModelo.setText(datos.getString(5));
                    jifReservas.jtfMarca.setText(datos.getString(6));
                    jifReservas.jbtRegistrar.setEnabled(true);
                }
                }catch(Exception ex){}
            }
        });
        jifReservas.jcbIdMecanico.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String id = (jifReservas.jcbIdMecanico.getSelectedItem()!= null)?jifReservas.jcbIdMecanico.getSelectedItem().toString():"";
                ResultSet datos = Gestor.traerDatosEmpleado(id);
                try {
                    while(datos.next())
                        jifReservas.jtfNombreEmpleado.setText(datos.getString("emp_nombre"));
                } catch (Exception exc) {}
            }
        });
        jifReservas.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idCliente = jifReservas.jtfIdentificacion.getText();
                String placa = jifReservas.jtfPlaca.getText();
                String idEmpleado = jifReservas.jcbIdMecanico.getSelectedItem().toString();
                String observaciones = jifReservas.jtfObservaciones.getText();
                if(jifReservas.jdcFecha.getDate() == null)
                    JOptionPane.showMessageDialog(null, "Ingrese una fecha","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(idCliente.isEmpty() || placa.isEmpty() || idEmpleado.isEmpty() || observaciones.isEmpty())
                    JOptionPane.showMessageDialog(null, "Debes llenar todos los datos","MECAUT",JOptionPane.WARNING_MESSAGE);
                else{
                    java.util.Date f = jifReservas.jdcFecha.getDate();
                    SimpleDateFormat ffecha= new SimpleDateFormat("YYYY-MM-dd");
                    String fecha = ""+ffecha.format(f);
                    String nombreCliente = jifReservas.jtfNombre.getText();
                    String telefono = jifReservas.jtfTelefono.getText();
                    String correo = jifReservas.jtfCorreo.getText();
                    String modelo = jifReservas.jtfModelo.getText();
                    String marca = jifReservas.jtfMarca.getText();
                    String nombreEmpleado = jifReservas.jtfNombreEmpleado.getText();
                    
                    Reserva res = new Reserva(fecha,idCliente,nombreCliente,telefono,correo,placa,modelo,marca,idEmpleado,nombreEmpleado,observaciones);
                    if (Gestor.registrarReserva(res)) {
                        JOptionPane.showMessageDialog(null, "Se registro la reserva al cliente "+nombreCliente.toUpperCase(),"MECAUT",JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                        limpiarFechas();
                        jifReservas.jcbIdMecanico.setSelectedIndex(0);
                        codigoReserva();
                        jifReservas.jbtRegistrar.setEnabled(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"No se pudo registrar la Reserva", "MECAUT",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        jifReservas.jbtCancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                limpiarFechas();
                jifReservas.jcbIdMecanico.setSelectedIndex(0);
                jifReservas.jbtRegistrar.setEnabled(false);
            }
        });
        jifReservas.setVisible(true);
        locacionfrm(jifReservas);
    }
    
    private void codigoReserva(){
        ResultSet cod = Gestor.codigoReserva();
        String num= "";
        try{
        while(cod.next())
            num = cod.getString(1);
        int codigo = Integer.parseInt(num);
        jifReservas.jtfCodigo.setText(""+(++codigo));
        }catch(SQLException | NumberFormatException exc){}
    }
    
    private void frmCotizacion(){
        limpiar();
        limpiarTablas(jifCotizacion.Datosmantenimientos);
        limpiarFechas();
        codigoCotizacion();
        ResultSet ids = Gestor.IdsClientes();
        jifCotizacion.jcbIdCliente.removeAllItems();
        jifCotizacion.jcbIdCliente.addItem("-----");
        try {
            while(ids.next())
                jifCotizacion.jcbIdCliente.addItem(ids.getString("cli_id"));
        } catch (Exception e) {}
        final DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Fecha");
        model.addColumn("Costo");
         jifCotizacion.jcbIdCliente.setSelectedIndex(0);
        jifCotizacion.jcbIdCliente.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String id = (jifCotizacion.jcbIdCliente.getSelectedItem() != null)?jifCotizacion.jcbIdCliente.getSelectedItem().toString():"";
                ResultSet nombre = Gestor.TraerDatosCliente(id);
                try {
                    while(nombre.next())
                        jifCotizacion.jtfNombreCliente.setText(nombre.getString("cli_nombre"));
                } catch (Exception ex) {}
                limpiarTablas(jifCotizacion.Datosmantenimientos);
                ArrayList<Mantenimiento> lista = Gestor.datosCotizacion(id);
                try {
                    Object[] fila = new Object[3];
                    for( Mantenimiento man : lista){
                        fila[0] = man.getCodigo();
                        fila[1] = man.getFecha();
                        fila[2] = man.getCosto();
                        model.addRow(fila);
                        jifCotizacion.jbtRegistrar.setEnabled(true);
                    }
                    jifCotizacion.Datosmantenimientos.setModel(model);
                } catch (Exception ex) {JOptionPane.showMessageDialog(null, "er:\n"+ex.getMessage());}
            }
        });
        jifCotizacion.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idCliente = jifCotizacion.jcbIdCliente.getSelectedItem().toString();
                String valorMantenimiento = jifCotizacion.jtfValorMantenimiento.getText();
                String valorCotizacion = jifCotizacion.jtfValorCotizacion.getText();
                String observaciones = jifCotizacion.jtfObservaciones.getText();
                if(jifCotizacion.jdcFecha.getDate() == null)
                    JOptionPane.showMessageDialog(null, "Ingrese una fecha","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(idCliente.isEmpty() || valorMantenimiento.isEmpty() || valorCotizacion.isEmpty() || observaciones.isEmpty())
                    JOptionPane.showMessageDialog(null, "Debes llenar todos los campos","MECAUT",JOptionPane.WARNING_MESSAGE);
                else{
                    java.util.Date f = jifCotizacion.jdcFecha.getDate();
                    SimpleDateFormat sf = new SimpleDateFormat("YY-MM-dd");
                    String fecha = sf.format(f);
                    String nombreCliente = jifCotizacion.jtfNombreCliente.getText();
                    String codMante = jifCotizacion.jtfCodigo.getText();
                    int t = Integer.parseInt(valorMantenimiento)-Integer.parseInt(valorCotizacion);
                    String totalMantenimiento = String.valueOf(t);

                    if (Gestor.registrarCotizacion(fecha,idCliente,nombreCliente,codMante,valorMantenimiento,totalMantenimiento,valorCotizacion,observaciones) 
                            && Gestor.actualizarMantenimiento(codMante,totalMantenimiento)) {
                        JOptionPane.showMessageDialog(null, "Se Registro la cotización correctamente...","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                        limpiarFechas();
                        jifCotizacion.jcbIdCliente.setSelectedIndex(0);
                        limpiarTablas(jifCotizacion.Datosmantenimientos);
                        codigoCotizacion();
                        jifCotizacion.jbtRegistrar.setEnabled(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No se pudo registrar la cotización","MECAUT",JOptionPane.INFORMATION_MESSAGE); 
                    }
                }
            }
        });
        jifCotizacion.jbtCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                limpiarTablas(jifCotizacion.Datosmantenimientos);
                limpiarFechas();
                jifCotizacion.jcbIdCliente.setSelectedIndex(0);
                jifCotizacion.jbtRegistrar.setEnabled(false);
            }
        });
        jifCotizacion.setVisible(true);
        locacionfrm(jifCotizacion);
    }
    
    private void codigoCotizacion(){
        ResultSet numero = Gestor.codigosCotizacion();
        String cod ="";
        try {
            while(numero.next())
                cod = numero.getString(1);
            int num = Integer.parseInt(cod);
            jifCotizacion.jtfNumeroCotizacion.setText(""+(++num));
        } catch (SQLException | NumberFormatException e) {JOptionPane.showMessageDialog(null, ""+e.getMessage());}
    }
    
    private void frmFichaRecepcionAuto(){
        limpiar();
        limpiarComboBox();
        evtDesactivarPanelesFichaAuto();
        jifFichaAuto.jbtRegistrar.setText("Nueva Ficha");
        jifFichaAuto.jsAlto.setValue(0);
        jifFichaAuto.jsAncho.setValue(0);
        jifFichaAuto.jsLargo.setValue(0);
        jifFichaAuto.jsPeso.setValue(0);
        jifFichaAuto.bgCojineria.clearSelection();
        jifFichaAuto.bgLuces.clearSelection();
        jifFichaAuto.bgPuertas.clearSelection();
        jifFichaAuto.jcbPlaca.removeAllItems();
        jifFichaAuto.jcbPlaca.addItem("----");
        ResultSet placas = Gestor.placasAutos();
        try {
            while(placas.next())
                jifFichaAuto.jcbPlaca.addItem(placas.getString("aut_placa"));
        } catch (Exception e) {}
        
        jifFichaAuto.jcbPlaca.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String placa = (jifFichaAuto.jcbPlaca.getSelectedItem() != null)?jifFichaAuto.jcbPlaca.getSelectedItem().toString():"";
                ResultSet num = Gestor.validarFicha(placa);
                try{
                    if(!num.next()){                        
                        try {
                            ResultSet datos = Gestor.datosMantenimiento(placa);
                            while(datos.next()){
                                evtDesactivarPanelesFichaAuto();
                                limpiar();
                                jifFichaAuto.jcbTransmision.setSelectedIndex(0);
                                jifFichaAuto.jsAlto.setValue(0);
                                jifFichaAuto.jsAncho.setValue(0);
                                jifFichaAuto.jsLargo.setValue(0);
                                jifFichaAuto.jsPeso.setValue(0);
                                jifFichaAuto.bgCojineria.clearSelection();
                                jifFichaAuto.bgLuces.clearSelection();
                                jifFichaAuto.bgPuertas.clearSelection();
                                jifFichaAuto.jtfIdCliente.setText(datos.getString("cli_id"));
                                jifFichaAuto.jtfNombreCliente.setText(datos.getString("cli_nombre"));
                                jifFichaAuto.setEnabled(true);
                                jifFichaAuto.jbtRegistrar.setText("Nueva Ficha");
                            }
                        } catch (Exception ex) {}
                    }
                    else {
                        ResultSet datos = Gestor.datosMantenimiento(placa);
                        while(datos.next()){
                            jifFichaAuto.jtfIdCliente.setText(datos.getString("cli_id"));
                            jifFichaAuto.jtfNombreCliente.setText(datos.getString("cli_nombre"));
                        }
                        placa = (jifFichaAuto.jcbPlaca.getSelectedItem() != null)?jifFichaAuto.jcbPlaca.getSelectedItem().toString():"";
                        num = Gestor.validarFicha(placa);
                        while(num.next()){
                            evtActivarPanelesFichaAuto();
                            jifFichaAuto.jtfCilindraje.setText(num.getString("aut_cilindraje"));
                            jifFichaAuto.jtfFrenos.setText(num.getString("aut_frenos"));
                            jifFichaAuto.jtfMotor.setText(num.getString("aut_motor"));
                            jifFichaAuto.jtfPotencia.setText(num.getString("aut_potencia"));
                            jifFichaAuto.jtfColor.setText(num.getString("aut_color"));
                            jifFichaAuto.jsAlto.setValue(Integer.parseInt(num.getString("aut_alto")));
                            jifFichaAuto.jsAncho.setValue(Integer.parseInt(num.getString("aut_ancho")));
                            jifFichaAuto.jsLargo.setValue(Integer.parseInt(num.getString("aut_largo")));
                            jifFichaAuto.jsPeso.setValue(Integer.parseInt(num.getString("aut_peso")));
                            int op = ("Automatica".equals(num.getString("aut_transmision")))?1:2;
                            jifFichaAuto.jcbTransmision.setSelectedIndex(op);
                            if ("Buena".equals(num.getString("aut_cojineria")))
                                jifFichaAuto.jcbBuenaC.setSelected(true);
                            else if ("Regular".equals(num.getString("aut_cojineria")))
                                jifFichaAuto.jcbRegularC.setSelected(true);
                            else if ("Mala".equals(num.getString("aut_cojineria")))
                                jifFichaAuto.jcbMalaC.setSelected(true);
                            if ("Buena".equals(num.getString("aut_puertas")))
                                jifFichaAuto.jcbBuenaP.setSelected(true);
                            else if ("Regular".equals(num.getString("aut_puertas")))
                                jifFichaAuto.jcbRegularP.setSelected(true);
                            else if ("Mala".equals(num.getString("aut_puertas")))
                                jifFichaAuto.jcbMalaP.setSelected(true);
                            if ("Buena".equals(num.getString("aut_farolas")))
                                jifFichaAuto.jcbBuenaL.setSelected(true);
                            else if ("Regular".equals(num.getString("aut_farolas")))
                                jifFichaAuto.jcbRegularL.setSelected(true);
                            else if ("Mala".equals(num.getString("aut_farolas")))
                                jifFichaAuto.jcbMalaL.setSelected(true);
                        }
                        jifFichaAuto.jbtRegistrar.setText("Modificar Ficha");
                        jifFichaAuto.jbtRegistrar.setEnabled(true);
                    }
                }catch(SQLException | HeadlessException ec){ JOptionPane.showMessageDialog(null, ""+ec.getMessage());}
            }
        });
        
        jifFichaAuto.jbtRegistrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nomBoton = jifFichaAuto.jbtRegistrar.getText();
                if ("Nueva Ficha".equals(nomBoton)) {
                    jifFichaAuto.jbtRegistrar.setText("Registrar Fecha");
                    evtActivarPanelesFichaAuto();
                }else if("Modificar Ficha".equals(nomBoton)){
                    System.out.println(":)))");
                    limpiar();
                    limpiarComboBox();
                    jifFichaAuto.jsAlto.setValue(0);
                    jifFichaAuto.jsAncho.setValue(0);
                    jifFichaAuto.jsLargo.setValue(0);
                    jifFichaAuto.jsPeso.setValue(0);
                    jifFichaAuto.bgCojineria.clearSelection();
                    jifFichaAuto.bgLuces.clearSelection();
                    jifFichaAuto.bgPuertas.clearSelection();
                    jifFichaAuto.jbtRegistrar.setText("Nueva Ficha");
                    evtDesactivarPanelesFichaAuto();
                }
                else{
                    String Placa = jifFichaAuto.jcbPlaca.getSelectedItem().toString();
                    String idCli = jifFichaAuto.jtfIdCliente.getText();
                    String nomCli = jifFichaAuto.jtfNombreCliente.getText();
                    String cil = jifFichaAuto.jtfCilindraje.getText();
                    String fre = jifFichaAuto.jtfFrenos.getText();
                    String mot = jifFichaAuto.jtfMotor.getText();
                    String pot = jifFichaAuto.jtfMotor.getText();
                    String tran = jifFichaAuto.jcbTransmision.getSelectedItem().toString();
                    String alt = jifFichaAuto.jsAlto.getValue().toString();
                    String lar = jifFichaAuto.jsAlto.getValue().toString();
                    String anc = jifFichaAuto.jsAncho.getValue().toString();
                    String col = jifFichaAuto.jtfColor.getText();
                    String peso = jifFichaAuto.jsPeso.getValue().toString();
                    String luces,cojineria,puertas;
                    if(jifFichaAuto.jcbBuenaL.isSelected())
                        luces = jifFichaAuto.jcbBuenaL.getText();
                    else if(jifFichaAuto.jcbRegularL.isSelected())
                        luces = jifFichaAuto.jcbRegularL.getText();
                    else
                        luces = jifFichaAuto.jcbMalaL.getText();
                    if(jifFichaAuto.jcbBuenaC.isSelected())
                        cojineria = jifFichaAuto.jcbBuenaC.getText();
                    else if(jifFichaAuto.jcbRegularC.isSelected())
                        cojineria = jifFichaAuto.jcbRegularC.getText();
                    else
                        cojineria = jifFichaAuto.jcbMalaC.getText();
                    if(jifFichaAuto.jcbBuenaP.isSelected())
                        puertas = jifFichaAuto.jcbBuenaP.getText();
                    else if(jifFichaAuto.jcbRegularP.isSelected())
                        puertas = jifFichaAuto.jcbRegularP.getText();
                    else
                        puertas = jifFichaAuto.jcbMalaP.getText();
                    if (Gestor.registrarFichaTecnica(idCli,Placa,cil,fre,peso,col,mot,pot,tran,lar,anc,alt,cojineria,puertas,luces)) {
                        JOptionPane.showMessageDialog(null, "Se registro la ficha del auto","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                    }else
                        JOptionPane.showMessageDialog(null, "No se pudo registrar la ficha del auto","MECAUT",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        jifFichaAuto.jbtancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                limpiarComboBox();
                jifFichaAuto.jsAlto.setValue(0);
                jifFichaAuto.jsAncho.setValue(0);
                jifFichaAuto.jsLargo.setValue(0);
                jifFichaAuto.jsPeso.setValue(0);
                jifFichaAuto.bgCojineria.clearSelection();
                jifFichaAuto.bgLuces.clearSelection();
                jifFichaAuto.bgPuertas.clearSelection();
                evtDesactivarPanelesFichaAuto();
                jifFichaAuto.jbtRegistrar.setText("Nueva Ficha");
                jifFichaAuto.jbtRegistrar.setEnabled(false);
            }
        });
        jifFichaAuto.setVisible(true);
        locacionfrm(jifFichaAuto);
    }
    
    public void evtDesactivarPanelesFichaAuto(){
        jifFichaAuto.jtfCilindraje.setEnabled(false);
        jifFichaAuto.jtfFrenos.setEnabled(false);
        jifFichaAuto.jtfMotor.setEnabled(false);
        jifFichaAuto.jtfPotencia.setEnabled(false);
        jifFichaAuto.jcbTransmision.setEnabled(false);
        jifFichaAuto.jsAlto.setEnabled(false);
        jifFichaAuto.jsAncho.setEnabled(false);
        jifFichaAuto.jsLargo.setEnabled(false);
        jifFichaAuto.jsPeso.setEnabled(false);
        jifFichaAuto.jtfColor.setEnabled(false);
        jifFichaAuto.jcbBuenaC.setEnabled(false);
        jifFichaAuto.jcbRegularC.setEnabled(false);
        jifFichaAuto.jcbMalaC.setEnabled(false);
        jifFichaAuto.jcbBuenaL.setEnabled(false);
        jifFichaAuto.jcbRegularL.setEnabled(false);
        jifFichaAuto.jcbMalaL.setEnabled(false);
        jifFichaAuto.jcbBuenaP.setEnabled(false);
        jifFichaAuto.jcbRegularP.setEnabled(false);
        jifFichaAuto.jcbMalaP.setEnabled(false);
    }
    
    public void evtActivarPanelesFichaAuto(){
        jifFichaAuto.jtfCilindraje.setEnabled(true);
        jifFichaAuto.jtfFrenos.setEnabled(true);
        jifFichaAuto.jtfMotor.setEnabled(true);
        jifFichaAuto.jtfPotencia.setEnabled(true);
        jifFichaAuto.jcbTransmision.setEnabled(true);
        jifFichaAuto.jsAlto.setEnabled(true);
        jifFichaAuto.jsAncho.setEnabled(true);
        jifFichaAuto.jsLargo.setEnabled(true);
        jifFichaAuto.jsPeso.setEnabled(true);
        jifFichaAuto.jtfColor.setEnabled(true);
        jifFichaAuto.jcbBuenaC.setEnabled(true);
        jifFichaAuto.jcbRegularC.setEnabled(true);
        jifFichaAuto.jcbMalaC.setEnabled(true);
        jifFichaAuto.jcbBuenaL.setEnabled(true);
        jifFichaAuto.jcbRegularL.setEnabled(true);
        jifFichaAuto.jcbMalaL.setEnabled(true);
        jifFichaAuto.jcbBuenaP.setEnabled(true);
        jifFichaAuto.jcbRegularP.setEnabled(true);
        jifFichaAuto.jcbMalaP.setEnabled(true);
    }
    /* 3. Modulo Suministros */

    private void frmRegistrarProveedor() {
        limpiar();
        jifProveedor.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String nit = (jifProveedor.jtfNit.getText());
                    String nombre = jifProveedor.jtfNombre.getText();
                    String direccion = jifProveedor.jtfDireccion.getText();
                    String telefono = (jifProveedor.jtfTelefono.getText());
                    String descripcion = jifProveedor.jtaDescripcion.getText();
                    Proveedor prov = new Proveedor(nit, nombre, direccion, telefono, descripcion);
                    if (Gestor.agregarProveedor(prov)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del proveedor almacenados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos!");
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        jifProveedor.jbtRegistrar1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
        jifProveedor.setVisible(true);
        locacionfrm(jifProveedor);
    }

    private void frmActualizarProveedor() {
        limpiar();
        jifActualizarProveedor.jbtEliminar.setEnabled(false);
        jifActualizarProveedor.jbtModificar.setEnabled(false);
        ArrayList<Proveedor> proveedores = Gestor.consultarProveedor();
        jifActualizarProveedor.jcbNit.removeAllItems();
        jifActualizarProveedor.jcbNit.addItem("Seleccione Nit");
        for (Proveedor proveedor : proveedores) {
            jifActualizarProveedor.jcbNit.addItem(proveedor);
        }
        jifActualizarProveedor.jcbNit.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent ie) {
                String nit = (jifActualizarProveedor.jcbNit.getSelectedItem() !=  null)?jifActualizarProveedor.jcbNit.getSelectedItem().toString():"";
                ResultSet datos = Gestor.datosProveedor(nit);
                try{
                while(datos.next()){
                    jifActualizarProveedor.jtfNombre.setText(datos.getString(2));
                    jifActualizarProveedor.jtfDireccion.setText(datos.getString(3));
                    jifActualizarProveedor.jtfTelefono.setText(datos.getString(4));
                    jifActualizarProveedor.jtaDescripcion.setText(datos.getString(5));
                    jifActualizarProveedor.jbtEliminar.setEnabled(true);
                    jifActualizarProveedor.jbtModificar.setEnabled(true);
                }
                }catch(Exception exc){}
            }
        });
        jifActualizarProveedor.jbtModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nit = (jifActualizarProveedor.jcbNit.getSelectedItem().toString());
                    String nombre = jifActualizarProveedor.jtfNombre.getText();
                    String direccion = jifActualizarProveedor.jtfDireccion.getText();
                    String telefono = (jifActualizarProveedor.jtfTelefono.getText());
                    String descripcion = jifActualizarProveedor.jtaDescripcion.getText();
                    Proveedor pro = new Proveedor(nit, nombre, direccion, telefono, descripcion);
                    if (Gestor.modificarProveedor(pro)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del proveedor modificados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                        jifActualizarProveedor.jcbNit.setSelectedIndex(0);
                        limpiar();
                        jifActualizarProveedor.jbtEliminar.setEnabled(false);
                        jifActualizarProveedor.jbtModificar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron modificar los datos!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (HeadlessException | NumberFormatException errr) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + errr.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifActualizarProveedor.jbtEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int rs = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar este proveedor?", "Eliminar PROVEEDOR", JOptionPane.YES_NO_OPTION);
                    if (rs == JOptionPane.YES_OPTION) {
                        String nit = jifActualizarProveedor.jcbNit.getSelectedItem().toString();
                        if (Gestor.eliminarProveedor(nit)) {
                            JOptionPane.showMessageDialog(null, "¡Datos del proveedor eliminados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                            jifActualizarProveedor.jcbNit.setSelectedIndex(0);
                            limpiar();
                            jifActualizarProveedor.jbtEliminar.setEnabled(false);
                            jifActualizarProveedor.jbtModificar.setEnabled(false);
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron eliminar los datos!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (HeadlessException | NumberFormatException err) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + err.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifActualizarProveedor.setVisible(true);
        locacionfrm(jifActualizarProveedor);
    }

    private void frmListaProveedores() {
        ArrayList<Proveedor> proveedores = Gestor.consultarProveedor();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nit");
        modelo.addColumn("Nombre");
        modelo.addColumn("Dirección");
        modelo.addColumn("Telefono");
        modelo.addColumn("Descripción");
        for (Proveedor proveedor : proveedores) {
            Object[] fila = new Object[5];
            fila[0] = proveedor.getNit();
            fila[1] = proveedor.getNombre();
            fila[2] = proveedor.getDireccion();
            fila[3] = proveedor.getTelefono();
            fila[4] = proveedor.getDescripcion();
            modelo.addRow(fila);
        }
        jifListaProveedores.jtListaMecanicos.setModel(modelo);
        jifListaProveedores.setVisible(true);
        locacionfrm(jifListaProveedores);
    }
    /* 4. Modulo Personal */

    private void frmRegistrarEmpleado() {
        limpiar();
        jifEmpleado.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String identificacion = jifEmpleado.jtfIdentificacion.getText();
                    String nombre = jifEmpleado.jtfNombre.getText();
                    String apellidos = jifEmpleado.jtfApellidos.getText();
                    String sexo = jifEmpleado.jcbSexo.getSelectedItem().toString();
                    String tipo = jifEmpleado.jcbTipo.getSelectedItem().toString();
                    String telefono = jifEmpleado.jtfTelefono.getText();
                    String direccion = jifEmpleado.jtfDireccion.getText();
                    String salario = jifEmpleado.jtfSalario.getText();
                    String correo = jifEmpleado.jtfCorreo.getText();
                    Empleados emp = new Empleados(identificacion, nombre, apellidos, sexo, tipo, telefono, direccion, correo, salario);
                    Cuenta count = new Cuenta(identificacion, identificacion, "empleado", identificacion);
                    if (Gestor.agregarEmpleado(emp) && Gestor.registrarUsuario(count)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del mecánico " + nombre.toUpperCase() + " almacenados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                        jifEmpleado.jcbSexo.setSelectedIndex(0);
                        jifEmpleado.jcbTipo.setSelectedIndex(0);
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifEmpleado.setVisible(true);
        locacionfrm(jifEmpleado);
    }

    private void frmActualizarEmpleado() {
        jifActualizarEmpleado.jbtEliminar.setEnabled(false);
        jifActualizarEmpleado.jbtModificar.setEnabled(false);
        jifActualizarEmpleado.jbtConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    ResultSet r;
                    String id = jifActualizarEmpleado.jtfId.getText();
                    if (id.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ingrese una Identificación", "MECAUT", JOptionPane.ERROR_MESSAGE);
                    } else {
                        r = Gestor.traerDatosEmpleado(id);
                        while (r.next()) {
                            int op = ("Masculino".equals(r.getString(4)) ? 2 : 1);
                            jifActualizarEmpleado.jtfNombre.setText(r.getString(2));
                            jifActualizarEmpleado.jtfApellidos.setText(r.getString(3));
                            jifActualizarEmpleado.jcbSexo.setSelectedIndex(op);
                            jifActualizarEmpleado.jtfTipo1.setText(r.getString(5));
                            jifActualizarEmpleado.jtfTelefono.setText(r.getString(6));
                            jifActualizarEmpleado.jtfDireccion.setText(r.getString(7));
                            jifActualizarEmpleado.jtfSalario.setText(r.getString(8));
                            jifActualizarEmpleado.jtfCorreo.setText(r.getString(9));
                        }
                        jifActualizarEmpleado.jbtEliminar.setEnabled(true);
                        jifActualizarEmpleado.jbtModificar.setEnabled(true);
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "" + e.getMessage(), "MECAUT", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifActualizarEmpleado.jbtEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    int rs = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar este empleado?", "Eliminar Empleado", JOptionPane.YES_NO_OPTION);
                    if (rs == JOptionPane.YES_OPTION) {
                        String id = (jifActualizarEmpleado.jtfId.getText());
                        if (Gestor.eliminarEmpleado(id)) {
                            JOptionPane.showMessageDialog(null, "¡Datos del mecanico eliminados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                            limpiar();
                            jifActualizarEmpleado.jbtEliminar.setEnabled(false);
                            jifActualizarEmpleado.jbtModificar.setEnabled(false);
                            jifActualizarCliente.jcbSexo.setSelectedIndex(0);
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron eliminar los datos!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifActualizarEmpleado.jbtModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String identificacion = jifActualizarEmpleado.jtfId.getText();
                    String nombre = jifActualizarEmpleado.jtfNombre.getText();
                    String apellidos = jifActualizarEmpleado.jtfApellidos.getText();
                    String sexo = jifActualizarEmpleado.jcbSexo.getSelectedItem().toString();
                    String tipo = jifActualizarEmpleado.jtfTipo1.getText();
                    String telefono = jifActualizarEmpleado.jtfTelefono.getText();
                    String direccion = jifActualizarEmpleado.jtfDireccion.getText();
                    String correo = jifActualizarEmpleado.jtfCorreo.getText();
                    String salario = jifActualizarEmpleado.jtfSalario.getText();
                    Empleados emp = new Empleados(identificacion, nombre, apellidos, sexo, tipo, telefono, direccion, correo, salario);
                    if (Gestor.modificarEmpleado(emp)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del mecánico " + nombre.toUpperCase() + " modificados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                        jifActualizarEmpleado.jbtEliminar.setEnabled(false);
                        jifActualizarEmpleado.jbtModificar.setEnabled(false);
                        jifActualizarCliente.jcbSexo.setSelectedIndex(0);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron modificar los datos del mecánico " + nombre.toUpperCase() + "!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifActualizarEmpleado.setVisible(true);
        locacionfrm(jifActualizarEmpleado);
    }

    private void frmListaEmpleados() {
        evtMostrarEmpleadosporId();
        jifListaEmpleados.jtfDato.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                evtMostrarEmpleadosporId();
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        jifListaEmpleados.setVisible(true);
        locacionfrm(jifListaEmpleados);
    }

    private void evtMostrarEmpleadosporId() {
        String dato = jifListaEmpleados.jtfDato.getText();
        ArrayList<Empleados> empleados = Gestor.verEmpleadosPorDato(dato);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Sexo");
        modelo.addColumn("Tipo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");
        modelo.addColumn("Salario");
        modelo.addColumn("Correo");
        for (Empleados empleado : empleados) {
            Object[] fila = new Object[9];
            fila[0] = empleado.getIdentificacion();
            fila[1] = empleado.getNombre();
            fila[2] = empleado.getApellidos();
            fila[3] = empleado.getSexo();
            fila[4] = empleado.getTipo();
            fila[5] = empleado.getTelefono();
            fila[6] = empleado.getDireccion();
            fila[7] = empleado.getSalario();
            fila[8] = empleado.getCorreo();
            modelo.addRow(fila);
        }
        jifListaEmpleados.jtListaMecanicos.setModel(modelo);
    }
    /* 5. Modulo Inventario */

    private void frmRegistrarRepuestos() {
        limpiar();
        jifRepuesto.jcbTipo.setSelectedIndex(0);
        ArrayList<Proveedor> proveedores = Gestor.consultarProveedor();
        jifRepuesto.jcbNitProveedor.removeAllItems();
        jifRepuesto.jcbNitProveedor.addItem("Seleccione Nit");
        for (Proveedor proveedor : proveedores) {
            jifRepuesto.jcbNitProveedor.addItem(proveedor);
        }

        jifRepuesto.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String codigo = jifRepuesto.jtfCodigo.getText();
                    String tipo = jifRepuesto.jcbTipo.getSelectedItem().toString();
                    String marca = jifRepuesto.jtfMarca.getText();
                    String cantidad = (jifRepuesto.jtfCantidad.getText());
                    String precio = jifRepuesto.jtfPrecio.getText();
                    String nit = (jifRepuesto.jcbNitProveedor.getSelectedItem().toString());
                    Repuesto rep = new Repuesto(codigo, tipo, marca, cantidad, precio, nit);
                    if (Gestor.agregarRepuesto(rep)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del repuesto almacenados!", "Mecaut", JOptionPane.QUESTION_MESSAGE);
                        jifRepuesto.jcbTipo.setSelectedIndex(0);
                        limpiar();
                        jifRepuesto.jcbTipo.setSelectedIndex(0);
                        jifRepuesto.jcbNitProveedor.setSelectedIndex(0);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifRepuesto.setVisible(true);
        locacionfrm(jifRepuesto);
    }

    private void frmActualizarRepuesto() {
        limpiar();
        jifActualizarRepuesto.jbtModificar.setEnabled(false);
        jifActualizarRepuesto.jbtEliminar.setEnabled(false);
        
        jifActualizarRepuesto.jbtConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ResultSet r;
                    String codigo = jifActualizarRepuesto.jtfCodigo.getText();
                    if (codigo.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ingrese un codigo", "MECAUT", JOptionPane.ERROR_MESSAGE);
                    } else {
                        r = Gestor.TraerDatosRepuesto(codigo);
                        while (r.next()) {
                            jifActualizarRepuesto.jtfTipo.setText(r.getString(2));
                            jifActualizarRepuesto.jtfMarca.setText(r.getString(3));
                            jifActualizarRepuesto.jtfCantidad.setText(r.getString(4));
                            jifActualizarRepuesto.jtfPrecio.setText(r.getString(5));
                            jifActualizarRepuesto.jtfNitProveedor.setText(r.getString(6));
                        }
                        jifActualizarRepuesto.jbtEliminar.setEnabled(true);
                        jifActualizarRepuesto.jbtModificar.setEnabled(true);
                    }
                } catch (HeadlessException | SQLException ee) {
                    JOptionPane.showMessageDialog(null, "" + ee.getMessage(), "MECAUT", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        jifActualizarRepuesto.jbtModificar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String cod = jifActualizarRepuesto.jtfCodigo.getText();
                String marca = jifActualizarRepuesto.jtfMarca.getText();
                String cant = jifActualizarRepuesto.jtfCantidad.getText();
                String precio = jifActualizarRepuesto.jtfPrecio.getText();
                if (Gestor.modificarRepuesto(cod,marca,cant,precio)) {
                    JOptionPane.showMessageDialog(null, "Se modifico correctamente el repuesto","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                }else
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el repuesto","MECAUT",JOptionPane.ERROR_MESSAGE);
            }
        });
        
        jifActualizarRepuesto.jbtEliminar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String cod = jifActualizarRepuesto.jtfCodigo.getText();
                int r = JOptionPane.showConfirmDialog(null, "Desea eliminar este repuesto?","MECAUT",JOptionPane.YES_NO_OPTION);
                if (r == JOptionPane.YES_OPTION) {
                    if (Gestor.eliminarRepuesto(cod)) {
                    JOptionPane.showMessageDialog(null, "Se elimino correctamente el repuesto","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    }else
                        JOptionPane.showMessageDialog(null, "No se pudo eliminar el repuesto","MECAUT",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        jifActualizarRepuesto.setVisible(true);
        locacionfrm(jifActualizarRepuesto);
    }
    
    public void evtActualizarRespuesto(){
        String codigo;
        int cantidad;
        int stockInicial;
        int stockFinal;
        for (int i = 0; i < jifFactura.jTable1.getRowCount(); i++) {
            codigo = jifFactura.jTable1.getValueAt(i, 0).toString();
            cantidad = Integer.parseInt(jifFactura.jTable1.getValueAt(i, 4).toString());
            stockInicial = Integer.parseInt(jifFactura.jTable1.getValueAt(i, 3).toString());
            stockFinal = stockInicial - cantidad; 
            String sf = ""+stockFinal;
            if(Gestor.actualizarRepuesto(codigo, sf)){ }
            else{}
        }        
    }

    private void frmListaRepuestos() {
        ArrayList<Repuesto> repuestos = Gestor.verRepuestos();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Tipo");
        modelo.addColumn("Marca");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Nit proveedor");
        for (Repuesto repuesto : repuestos) {
            Object[] fila = new Object[6];
            fila[0] = repuesto.getCodigo();
            fila[1] = repuesto.getTipo();
            fila[2] = repuesto.getMarca();
            fila[3] = repuesto.getCantidad();
            fila[4] = repuesto.getPrecio();
            fila[5] = repuesto.getNitProv();
            modelo.addRow(fila);
        }
        jifListaRepuestos.jtListaRepuestos.setModel(modelo);
        jifListaRepuestos.setVisible(true);
        locacionfrm(jifListaRepuestos);
    }
    
    private void frmOrdenDePedido(){
        limpiar();
        limpiarComboBox();
        limpiarFechas();
        codigoOrdenPedido();
        limpiarTablas(jifOrdenDePedido.jTable1);
        final DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Tipo de Repuesto");
        model.addColumn("Marca");
        model.addColumn("Cantidad");
        model.addColumn("Precio");
        ResultSet nit = Gestor.NitsProveedores();
        jifOrdenDePedido.jcbNIT.removeAllItems();
        jifOrdenDePedido.jcbNIT.addItem("------");
        try {
            while(nit.next())
                jifOrdenDePedido.jcbNIT.addItem(nit.getString(1));
        } catch (Exception e) {}
        
        jifOrdenDePedido.jcbNIT.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String nit = (jifOrdenDePedido.jcbNIT.getSelectedItem() != null)?jifOrdenDePedido.jcbNIT.getSelectedItem().toString():"";
                ResultSet datos = Gestor.DatosOrden(nit);
                try {
                    while (datos.next()){
                        jifOrdenDePedido.jtfNombreProve.setText(datos.getString("prov_nombre"));
                        jifOrdenDePedido.jtfTelefono.setText(datos.getString("prov_telefono"));
                        jifOrdenDePedido.jtfDireccion.setText(datos.getString("prov_direccion"));
                    }
                } catch (Exception ex) {}
            }
        });
        
        jifOrdenDePedido.jbtAgregarRepuesto.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jifOrdenDePedido.jFrame1.setVisible(true);
                jifOrdenDePedido.jFrame1.setBounds(460, 270, 410, 310);
                jifOrdenDePedido.jcbTipoRep.setSelectedIndex(0);
                jifOrdenDePedido.jsCantidad.setValue(0);
                jifOrdenDePedido.jtfCodRep.setText("");
                jifOrdenDePedido.jtfMarcaRep.setText("");
                jifOrdenDePedido.jtfPrecioRep.setText("");
                ResultSet nombreRepuestos = Gestor.nomRepuestos();
                jifOrdenDePedido.jcbTipoRep.removeAllItems();
                jifOrdenDePedido.jcbTipoRep.addItem("----");
                try {
                    while(nombreRepuestos.next())
                        jifOrdenDePedido.jcbTipoRep.addItem(nombreRepuestos.getString(1));
                } catch (Exception exc) {
                }
            }
        });
        
        jifOrdenDePedido.jcbTipoRep.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String nombre = (jifOrdenDePedido.jcbTipoRep.getSelectedItem() != null)?jifOrdenDePedido.jcbTipoRep.getSelectedItem().toString():"";
                ResultSet datos = Gestor.datosRepuestoNombre(nombre);
                try {
                    while (datos.next()) {
                        jifOrdenDePedido.jtfCodRep.setText(datos.getString("rep_codigo"));
                        jifOrdenDePedido.jtfMarcaRep.setText(datos.getString("rep_marca"));
                        jifOrdenDePedido.jtfPrecioRep.setText(datos.getString("rep_precio"));
                    }
                } catch (Exception excc) {}
            }
        });
        
        jifOrdenDePedido.jbtAceptar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String tipoRep = jifOrdenDePedido.jcbTipoRep.getSelectedItem().toString();
                String cod = jifOrdenDePedido.jtfCodRep.getText();
                String marca = jifOrdenDePedido.jtfMarcaRep.getText();
                String prec = jifOrdenDePedido.jtfPrecioRep.getText();
                String cant = String.valueOf(jifOrdenDePedido.jsCantidad.getValue());
                if ("".equals(tipoRep)||"".equals(cod)||"".equals(marca)||"".equals(prec)||"".equals(cant)) {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","MECAUT",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    Object[] fila = new Object[5];
                    fila[0] = cod;
                    fila[1] = tipoRep;
                    fila[2] = marca;
                    fila[3] = cant;
                    fila[4] = prec;
                    model.addRow(fila);
                    jifOrdenDePedido.jTable1.setModel(model);
                }
                jifOrdenDePedido.jFrame1.hide();
                int columnas = jifOrdenDePedido.jTable1.getRowCount();
                int total = 0,Precio,Cantidad;
                for (int i = 0; i < columnas; i++) {
                    String can = (String)jifOrdenDePedido.jTable1.getValueAt(i, 3);
                    String pre = (String) jifOrdenDePedido.jTable1.getValueAt(i, 4);
                    Cantidad = Integer.parseInt(can);
                    Precio = Integer.parseInt(pre);
                    total += Cantidad*Precio; 
                }
                jifOrdenDePedido.jtfTotal.setText("$"+total);
            }
        });
        
        jifOrdenDePedido.jButton5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jifOrdenDePedido.jFrame1.hide();
            }
        });
        
        jifOrdenDePedido.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cod = jifOrdenDePedido.jtfNumero.getText();
                java.util.Date f = jifOrdenDePedido.jdcFecha.getDate();
                SimpleDateFormat sf = new SimpleDateFormat("YY-MM-dd");
                String fecha = sf.format(f);
                String nitPro = jifOrdenDePedido.jcbNIT.getSelectedItem().toString();
                String nomPro = jifOrdenDePedido.jtfNombreProve.getText();
                String telPro = jifOrdenDePedido.jtfTelefono.getText();
                String dirPro = jifOrdenDePedido.jtfDireccion.getText();
                String total = jifOrdenDePedido.jtfTotal.getText();
                
                
                if (Gestor.registrarOrdenPedido(fecha,nitPro,nomPro,telPro,dirPro,total)){
                    String[][] datos = new String[jifOrdenDePedido.jTable1.getRowCount()][5];
                    for (int k = 0; k < datos.length; k++) {
                        for (int j = 0; j < 5; j++) {
                            datos[k][j] = (String)jifOrdenDePedido.jTable1.getValueAt(k, j);
                            System.out.print(datos[k][j]+ " - ");
                        }
                        if(Gestor.actualizarRepuesto(datos[k][0], datos[k][3]))
                                JOptionPane.showMessageDialog(null, "Se registro la orden Correctamente.","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("");
                    }

                    for (int l = 0; l < jifOrdenDePedido.jTable1.getRowCount(); l++) {
                        if (Gestor.registrarDetallesOrden(cod,datos[l][0],datos[l][1],datos[l][2],datos[l][3],datos[l][4])) {
                            System.out.println(":)");
                        }
                    }
                    limpiar();
                    jifOrdenDePedido.jcbNIT.setSelectedIndex(0);
                    jifOrdenDePedido.jdcFecha.setDate(null);
                    limpiarTablas(jifOrdenDePedido.jTable1);
                    codigoOrdenPedido();
                }
            }
        });
        
        jifOrdenDePedido.setVisible(true);
        locacionfrm(jifOrdenDePedido);
    }
    
    public void codigoOrdenPedido(){
        ResultSet cod = Gestor.codigoOrdenPedido();
        String c = "";
        try {
            while(cod.next())
                    c = cod.getString(1);
            int codigo = Integer.parseInt(c);
            jifOrdenDePedido.jtfNumero.setText(""+(++codigo));
        } catch (SQLException | NumberFormatException e) {
        JOptionPane.showMessageDialog(null,""+e.getMessage());}
    }
    /* 6. Modulo Ventas */
    
    private void frmFactura(){
        limpiar();
        jifFactura.jdcFecha.setDate(null);
        codigoFactura();
        jifFactura.jcbCantidad.removeAllItems();
        jifFactura.jcbCantidad.addItem("---");
        jifFactura.jcbCantidad.setSelectedIndex(0);

        jifFactura.jbtConsultar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    ResultSet r;
                    String id = jifFactura.jtfIdCli.getText();
                    if (id.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ingrese una Identificación", "MECAUT", JOptionPane.ERROR_MESSAGE);
                    } else {
                        r = Gestor.TraerDatosCliente(id);
                        while (r.next()) {
                            jifFactura.jtfNombreCli.setText(r.getString(2)+" "+r.getString(3));
                            jifFactura.jtfTelefonoCli.setText(r.getString(5));
                            jifFactura.jtfDireccionCli.setText(r.getString(6));
                            jifFactura.jtfCorreoCli.setText(r.getString(7));
                        }
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "" + e.getMessage(), "MECAUT", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        ArrayList<Repuesto> repuestos = Gestor.verRepuestos();
        jifFactura.jcbCodRep.removeAllItems();
        jifFactura.jcbCodRep.addItem("Seleccione codigo");
        jifFactura.jcbCodRep.setSelectedIndex(0);
        for (Repuesto repuesto : repuestos) {
            jifFactura.jcbCodRep.addItem(repuesto);
        }
        jifFactura.jcbCodRep.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent ie) {
                jifFactura.jcbCantidad.removeAllItems();
                String codigo = (jifFactura.jcbCodRep.getSelectedItem() != null)?jifFactura.jcbCodRep.getSelectedItem().toString():null;
                ResultSet r = Gestor.TraerDatosRepuesto(codigo);
                try{
                while (r.next()) {
                    jifFactura.jtfTipoRep.setText(r.getString(2));
                    jifFactura.jtfMarcaRep.setText(r.getString(3));
                    jifFactura.jtfCantidadRep.setText(r.getString(4));
                    jifFactura.jtfPrecioRep.setText(r.getString(5));
                }
                }catch(Exception exc){}
                
                if("".equals(jifFactura.jtfCantidadRep.getText()))
                    jifFactura.jcbCantidad.addItem("0");
                else
                    for (int i = 1; i <= Integer.parseInt(jifFactura.jtfCantidadRep.getText()); i++) 
                        jifFactura.jcbCantidad.addItem(i);
            }
        });
        final DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Tipo");
        modelo.addColumn("Marca");
        modelo.addColumn("Stock");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        jifFactura.jbtAgregar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                String codgoRepuesto = jifFactura.jcbCodRep.getSelectedItem().toString();
                String tipoRepuesto = jifFactura.jtfTipoRep.getText();
                String marcaRepusto = jifFactura.jtfMarcaRep.getText();
                String stockRepuesto = jifFactura.jtfCantidadRep.getText();
                String cantidadRepuesto = jifFactura.jcbCantidad.getSelectedItem().toString();
                String precioRepueto = jifFactura.jtfPrecioRep.getText();
                Object[] fila = new Object[6];
                fila[0] = codgoRepuesto;
                fila[1] = tipoRepuesto;
                fila[2] = marcaRepusto;
                fila[3] = stockRepuesto;
                fila[4] = cantidadRepuesto;
                fila[5] = precioRepueto;
                modelo.addRow(fila);
                jifFactura.jTable1.setModel(modelo);
                jifFactura.jcbCantidad.removeAllItems();
                evtCalcularFactura();
            }

        });
        jifFactura.jbtRegistrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String numero = jifFactura.jtfNumFactura.getText();
                    java.util.Date fecha = jifFactura.jdcFecha.getDate();
                    java.sql.Date fechaa = new java.sql.Date(fecha.getTime());
                    String idCliente = jifFactura.jtfIdCli.getText();
                    String nombreCliente = jifFactura.jtfNombreCli.getText();
                    String total = jifFactura.lblTotal.getText();
                    if (numero.isEmpty() || idCliente.isEmpty() || nombreCliente.isEmpty()) {
                        /* Esta Condición es para que no salga error cuando se abre el formulario por 2da vez */
                    } else {
                        Factura fac = new Factura(Integer.parseInt(numero), fechaa, idCliente, nombreCliente, total);
                        if (Gestor.registrarFactura(fac)) {
                            evtRegistrarDetalleFactura();
                            evtActualizarRespuesto();
                            JOptionPane.showMessageDialog(null, "Se registro la factura correctamente","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                            limpiar();
                            jifFactura.jcbCantidad.setSelectedIndex(0);
                            jifFactura.jcbCodRep.setSelectedIndex(0);
                            jifFactura.jdcFecha.setDate(null);
                            DefaultTableModel modelo = (DefaultTableModel) jifFactura.jTable1.getModel();
                            int a =jifFactura.jTable1.getRowCount()-1;
                            int i;
                            for(i=a;i>=0;i--)
                                modelo.removeRow(i);
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos","MECAUT",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (HeadlessException e) {

                }
            }
        });
        jifFactura.setVisible(true);
    }
    
    public void codigoFactura(){
        ResultSet c = Gestor.codigoFactura();
        String n = "";
        try {
            while(c.next())
                n = c.getString(1);
            int codigo = Integer.parseInt(n);
            jifFactura.jtfNumFactura.setText(""+(++codigo));
        } catch (SQLException | NumberFormatException e) {}
    }
    
    public void evtRegistrarDetalleFactura() {
        for (int i = 0; i < jifFactura.jTable1.getRowCount(); i++) {
            String numero = jifFactura.jtfNumFactura.getText();
            String repCodigo = jifFactura.jTable1.getValueAt(i, 0).toString();
            String repTipo = jifFactura.jTable1.getValueAt(i, 1).toString();
            String repMarca = jifFactura.jTable1.getValueAt(i, 2).toString();
            String repCantidad = jifFactura.jTable1.getValueAt(i, 4).toString();
            String repPrecio = jifFactura.jTable1.getValueAt(i, 5).toString();
            DetalleFactura det = new DetalleFactura(numero, repCodigo, repTipo, repMarca, repCantidad, repPrecio);
            if (Gestor.registrarDetalleFactura(det)) {

            } else {
                
            }
        }
    }
    
    public void evtCalcularFactura() {
        if (jifFactura.jTable1.getRowCount() < 1) {
            JOptionPane.showMessageDialog(null, "Error, no ingreso ningun producto");
        } else {
            String pre;
            String can;
            double total = 0;
            double precio;
            int cantidad;

            for (int i = 0; i < jifFactura.jTable1.getRowCount(); i++) {
                pre = jifFactura.jTable1.getValueAt(i, 5).toString();
                can = jifFactura.jTable1.getValueAt(i, 4).toString();
                precio = Double.parseDouble(pre);
                cantidad = Integer.parseInt(can);
                total += precio * cantidad;
            }
            jifFactura.lblTotal.setText(Double.toString(total));
        }
    }
    
    public void frmListaFacturas(){
        ArrayList<Factura> lista = Gestor.consultarFacturas();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Numero");
        modelo.addColumn("Fecha");
        modelo.addColumn("Id Cliente");
        modelo.addColumn("Nombre Cliente");
        modelo.addColumn("Total Factura");
        for(Factura fac : lista){
            Object[] fila = new Object[5];
            fila[0] = fac.getNumero();
            fila[1] = fac.getFecha();
            fila[2] = fac.getIdCliente();
            fila[3] = fac.getNombreCliente();
            fila[4] = fac.getTotal();
            modelo.addRow(fila);
        }
        jifListaFacturas.tablaFacturas.setModel(modelo);
        jifListaFacturas.registros.setText(""+jifListaFacturas.tablaFacturas.getRowCount());
        jifListaFacturas.setVisible(true);
        locacionfrm(jifListaFacturas);
    }
    
    //Limpia todos los jtextField de los formulario
    private void limpiar(){
        jifFichaAuto.jtfCilindraje.setText("");
        jifFichaAuto.jtfColor.setText("");
        jifFichaAuto.jtfFrenos.setText("");
        jifFichaAuto.jtfIdCliente.setText("");
        jifFichaAuto.jtfMotor.setText("");
        jifFichaAuto.jtfNombreCliente.setText("");
        jifFichaAuto.jtfPotencia.setText("");
        jifCliente.jtfNombre.setText("");
        jifCliente.jtfApellidos.setText("");
        jifCliente.jtfDireccion.setText("");
        jifCliente.jtfCorreo.setText("");
        jifCliente.jtfTelefono.setText("");
        jifCliente.jtfIdentificacion.setText("");
        jifActualizarCliente.jtfIdentificacion.setText("");
        jifActualizarCliente.jtfNombre.setText("");
        jifActualizarCliente.jtfApellidos.setText("");
        jifActualizarCliente.jtfCorreo.setText("");
        jifActualizarCliente.jtfTelefono.setText("");
        jifActualizarCliente.jtfDireccion.setText("");
        jifAuto.jtfPlaca.setText("");
        jifAuto.jtfNombreCliente.setText("");
        jifAuto.jtfCombustible.setText("");
        jifAuto.jtfKilometraje.setText("");
        jifGrupoClientes.jtfId.setText("");
        jifEmpleado.jtfIdentificacion.setText("");
        jifEmpleado.jtfNombre.setText("");
        jifEmpleado.jtfApellidos.setText("");
        jifEmpleado.jtfTelefono.setText("");
        jifEmpleado.jtfDireccion.setText("");
        jifEmpleado.jtfCorreo.setText("");
        jifEmpleado.jtfSalario.setText("");
        jifActualizarEmpleado.jtfId.setText("");
        jifActualizarEmpleado.jtfNombre.setText("");
        jifActualizarEmpleado.jtfApellidos.setText("");
        jifActualizarEmpleado.jtfTelefono.setText("");
        jifActualizarEmpleado.jtfDireccion.setText("");
        jifActualizarEmpleado.jtfSalario.setText("");
        jifActualizarEmpleado.jtfCorreo.setText("");
        jifProveedor.jtfNit.setText("");
        jifProveedor.jtfNombre.setText("");
        jifProveedor.jtfDireccion.setText("");
        jifProveedor.jtfTelefono.setText("");
        jifProveedor.jtaDescripcion.setText("");
        jifActualizarProveedor.jtfNombre.setText("");
        jifActualizarProveedor.jtaDescripcion.setText("");
        jifActualizarProveedor.jtfDireccion.setText("");
        jifActualizarProveedor.jtfTelefono.setText("");
        jifRepuesto.jtfMarca.setText("");
        jifRepuesto.jtfCantidad.setText("");
        jifRepuesto.jtfPrecio.setText("");
        jifRepuesto.jtfCodigo.setText("");
        jifActualizarRepuesto.jtfCodigo.setText("");
        jifActualizarRepuesto.jtfCantidad.setText("");
        jifActualizarRepuesto.jtfMarca.setText("");
        jifActualizarRepuesto.jtfNitProveedor.setText("");
        jifActualizarRepuesto.jtfPrecio.setText("");
        jifActualizarRepuesto.jtfCantidad.setText("");
        jifMantenimiento.jtfObservaciones.setText("");
        jifMantenimiento.jtfCosto.setText("");
        jifMantenimiento.jtfPlaca.setText("");
        jifMantenimiento.jtfplaca.setText("");
        jifMantenimiento.jtfCliNombre.setText("");
        jifMantenimiento.jtfIdCliente.setText("");
        jifMantenimiento.jtfNombreMecanico1.setText("");
        jifMantenimiento.jtfdescripcion.setText("");
        jifMantenimiento.jtfNombreMecanico1.setText("");
        jifMantenimiento.jtfnombreRepuesto.setText("");
        jifMantenimiento.jtfNombreCliente.setText("");
        jifActualizarMantenimiento.jtfCosto.setText("");
        jifActualizarMantenimiento.jtfObsevaciones.setText("");
        jifActualizarMantenimiento.jtfEstado.setText("");
        jifActualizarMantenimiento.jtfFecha.setText("");
        jifActualizarMantenimiento.jtfIdCliente.setText("");
        jifActualizarMantenimiento.jtfNombreCliente.setText("");
        jifActualizarMantenimiento.jtfPlaca.setText("");
        jifActualizarMantenimiento.jtfIdEmpleado.setText("");
        jifActualizarMantenimiento.jtfNombreEmpleado.setText("");
        jifReservas.jtfIdentificacion.setText("");
        jifReservas.jtfNombre.setText("");
        jifReservas.jtfTelefono.setText("");
        jifReservas.jtfCorreo.setText("");
        jifReservas.jtfPlaca.setText("");
        jifReservas.jtfMarca.setText("");
        jifReservas.jtfModelo.setText("");
        jifReservas.jtfNombreEmpleado.setText("");
        jifReservas.jtfObservaciones.setText("");
        jifCuentas.jtfUsuario.setText("");
        jifCuentas.jtfcontrasena.setText("");
        jifCuentas.jtfconfContrasena.setText("");
        jifCuentas.jtfIdentificacionCli.setText("");
        jifCuentas.jtfNombrec.setText("");
        jifCuentas.jtfApellidosc.setText("");
        jifCuentas.jtfTelefonoc.setText("");
        jifCuentas.jtfDireccionc.setText("");
        jifCuentas.jtfCorreoc.setText("");
        jifCuentas.jtfIdentificacion1.setText("");
        jifCuentas.jtfNombre1.setText("");
        jifCuentas.jtfApellidos1.setText("");
        jifCuentas.jtfTelefono1.setText("");
        jifCuentas.jtfDireccion1.setText("");
        jifCuentas.jtfCorreo1.setText("");
        jifCuentas.jtfSalario.setText("");
        jifOrdenDePedido.jtfNombreProve.setText("");
        jifOrdenDePedido.jtfTelefono.setText("");
        jifOrdenDePedido.jtfDireccion.setText("");
        jifOrdenDePedido.jtfTotal.setText("");
        jifCotizacion.jtfNombreCliente.setText("");
        jifCotizacion.jtfValorMantenimiento.setText("");
        jifCotizacion.jtfCodigo.setText("");
        jifCotizacion.jtfObservaciones.setText("");
        jifCotizacion.jtfValorCotizacion.setText("");
        jifFactura.jtfIdCli.setText("");
        jifFactura.jtfNombreCli.setText("");
        jifFactura.jtfTelefonoCli.setText("");
        jifFactura.jtfDireccionCli.setText("");
        jifFactura.jtfCorreoCli.setText("");
        jifFactura.jtfTipoRep.setText("");
        jifFactura.jtfMarcaRep.setText("");
        jifFactura.jtfCantidadRep.setText("");
        jifFactura.jtfPrecioRep.setText("");
        jifHistMantenimiento.jtfIdCliente.setText("");
        jifHistMantenimiento.jtfPlaca.setText("");
    }

    private void locacionfrm(JInternalFrame j) {
        j.setLocation(350, 20);
    }
    
    private void evtIniciarSesion() {
        try {
            String usuario = Login.jtfUsuario.getText();
            String contrasena = Login.jtfContraseña.getText();
            Cuenta cuenta = new Cuenta(usuario, contrasena, "","");
            String r = Gestor.validarUsuario(cuenta);
            switch (r) {
                case "administrador":
                    lanzarFormularioAdministrador();
                    break;
                case "cliente":
                    lanzarFormularioCliente();
                    break;
                case "empleado":
                    lanzarFormularioEmpleado();
            }
            Login.setVisible(false);
        } catch (HeadlessException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "¡¡¡ Los Datos Ingresados Son Incorrectos !!!\n\n\tVerifiquelos Nuevamente....", "MECAUT - Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void limpiarTablas(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int a =tabla.getRowCount()-1;
        for(int i=a;i>=0;i--)
            modelo.removeRow(i);
    }
    
    public void limpiarComboBox(){
        jifCliente.jcbSexo.setSelectedItem(0);
        jifActualizarCliente.jcbSexo.setSelectedItem(0);
        jifOrdenDePedido.jcbNIT.setSelectedIndex(0);
        jifCuentas.jcbTipoCuenta.setSelectedIndex(0);
        jifCuentas.jcbSexo1.setSelectedIndex(0);
        jifCuentas.jcbSexoc.setSelectedIndex(0);
        jifCuentas.jcbTipo.setSelectedIndex(0);
        jifCuentas.jcbTipoCuenta.setSelectedIndex(0);
        jifGrupoClientes.jcbcodigoGrupo.setSelectedIndex(0);
        jifGrupoClientes.jcbNombregrupo.setSelectedIndex(0);
        jifGrupoClientes.jcbEstado.setSelectedItem(0);
        jifGrupoClientes.jcbEstado.setSelectedIndex(0);
        jifAuto.jcbCiudad.setSelectedIndex(0);
        jifAuto.jcbMarca.setSelectedIndex(0);
        jifAuto.jcbModelo.setSelectedIndex(0);
        jifAuto.jcbTipo.setSelectedIndex(0);
        jifMantenimiento.jcbIdMecanico1.setSelectedIndex(0);
        jifMantenimiento.jcbcodRepuesto.setSelectedIndex(0);
        jifCotizacion.jcbIdCliente.setSelectedIndex(0);
        jifFichaAuto.jcbPlaca.setSelectedIndex(0);
        jifFichaAuto.jcbTransmision.setSelectedIndex(0);
        jifFichaAuto.jcbTransmision.setSelectedIndex(0);
        jifFichaAuto.jcbPlaca.setSelectedIndex(0);
    }
    
    public void limpiarFechas(){
        jifOrdenDePedido.jdcFecha.setDate(null);
        jifMantenimiento.jdcFecha.setDate(null);
        jifMantenimiento.jdcFechaInicio.setDate(null);
        jifHistMantenimiento.jdcFecha.setDate(null);
        jifReservas.jdcFecha.setDate(null);
        jifCotizacion.jdcFecha.setDate(null);
    }
}
