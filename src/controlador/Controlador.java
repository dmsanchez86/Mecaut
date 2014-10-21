package controlador;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Logica.Auto;
import modelo.Logica.Cliente;
import modelo.Logica.Cuenta;
import modelo.Gestor;
import modelo.Logica.Mantenimiento;
import modelo.Logica.Empleados;
import modelo.Logica.GrupoClientes;
import modelo.Logica.Proveedor;
import modelo.Logica.Repuesto;
import vista.FormulariosPrincipales.frmAdmin;
import vista.FormulariosPrincipales.frmCliente;
import vista.FormulariosPrincipales.frmEmpleado;
import vista.FormulariosPrincipales.frmLoggin;
import vista.Clientes.jifActualizarCliente;
import vista.Clientes.jifGrupoClientes;
import vista.jifRegistrarAuto;
import vista.Clientes.jifRegistrarCliente;
import vista.Mantenimientos.jifActualizarMantenimiento;
import vista.Empleados.jifActualizarEmpleado;
import vista.Proveedores.jifActualizarProveedor;
import vista.jifListaAutos;
import vista.Clientes.jifListaClientes;
import vista.Mantenimientos.jifListaMantenimientos;
import vista.Empleados.jifListaEmpleados;
import vista.Proveedores.jifListaProveedores;
import vista.Repuestos.jifListaRepuestos;
import vista.Empleados.jifRegistrarEmpleado;
import vista.Proveedores.jifRegistrarProveedor;
import vista.Repuestos.jifRegistrarRepuesto;
import vista.Mantenimientos.jifRegistrarMantenimiento;
import vista.Repuestos.jifActualizarRepuesto;

/* @author Grupo - MECAUT */
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
    private final frmLoggin Login;
    private final frmCliente frmCliente;
    private final frmEmpleado frmEmpleado;
    private final jifGrupoClientes jifGrupoClientes;
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
    }
    /* INICIO LOGGIN */

    public void lanzarLogin() {
        /* Boton para iniciar sesión */
        Login.btnIngresar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                evtIniciarSesion();
            }
        });
        /* Boton para cerrar el programa */
        Login.jtfUsuario.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                evtIniciarSesion();
            }
        });
        Login.jtfContraseña.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                evtIniciarSesion();;
            }
        });
        Login.jbtSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        Login.setVisible(true);
    }
    /* frmAdmin Administrador */
    private void lanzarFormularioAdministrador() {
        /* MenuBar acciones de los eventos */
        /* MENU - CLIENTES */
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
        form.jmiListaAutos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaAutos();
            }
        });
        form.jmiListaRepuestos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaRepuestos();
            }
        });
        form.jmiListaMecanicos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaMecanicos();
            }
        });
        form.jmiActualizarMecanico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmActualizarEmpleado();
            }
        });
        form.jmiListaProveedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaProveedores();
            }
        });
        form.jmiListaMantenimientos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaMantenimientos();
            }
        });
        form.jmiRegistrarAuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarAuto();
            }
        });
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
        form.jmiRegistrarMecanico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarEmpleado();
            }
        });
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
        form.jmiSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form.setVisible(false);
                Login.jtfContraseña.setText("");
                Login.setVisible(true);
            }
        });
        form.setVisible(true);
        form.jLabel1.setText(form.jLabel1.getText() + Login.jtfUsuario.getText().toUpperCase() + "  ");
    }
    /* Formulario Cliente */

    private void lanzarFormularioCliente() {
        frmCliente.setVisible(true);
    }
    /* Formulario Empleado */

    private void lanzarFormularioEmpleado() {
        frmEmpleado.setVisible(true);
    }
    /* --------------------------- FIN ACCIONES FORMULARIOS ------------------------------------ */
    /* ----------------------------------------------------------------------------------------- */
    /* --------------------------- EVENTOS FORMULARIOS ------------------------------------ */

    private void frmRegistrarCliente() {
        limpiar();
        // boton para registrar un cliente
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
                        /* Esta Condición es para que no 
                         * salga error cuando se abre el formulario por 2da vez
                         */
                    } else {
                        Cliente cli = new Cliente(identificacion, nombre, apellidos, sexo, telefono, direccion, correo);
                        Cuenta cuenta = new Cuenta(identificacion, identificacion, "cliente");
                        if (Gestor.agregarCliente(cli) && Gestor.registrarUsuario(cuenta)) {
                            JOptionPane.showMessageDialog(null, "¡Datos del cliente " + nombre.toUpperCase() + " almacenados!", "MECAUT - Registro Cliente", JOptionPane.INFORMATION_MESSAGE);
                            jifCliente.jcbSexo.setSelectedIndex(0);
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
    }

    private void frmActualizarCliente() {
        limpiar();
        jifActualizarCliente.jbtEliminar.setEnabled(false);
        jifActualizarCliente.jbtModificar.setEnabled(false);
        jifActualizarCliente.jbtConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    ResultSet r;
                    String id = jifActualizarCliente.jtfIdentificacion.getText();
                    if (id.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ingrese una Identificación", "MECAUT", JOptionPane.ERROR_MESSAGE);
                    } else {
                        r = Gestor.TraerDatosCliente(id);
//                        if (!r.next()) {
//                            JOptionPane.showMessageDialog(null, "No se encontraron resultados...","MECAUT - Búsqueda",JOptionPane.ERROR_MESSAGE);
//                        }
                        while (r.next()) {
                            int op = ("Masculino".equals(r.getString(4)) ? 2 : 1);
                            jifActualizarCliente.jtfNombre.setText(r.getString(2));
                            jifActualizarCliente.jtfApellidos.setText(r.getString(3));
                            jifActualizarCliente.jcbSexo.setSelectedIndex(op);
                            jifActualizarCliente.jtfTelefono.setText(r.getString(5));
                            jifActualizarCliente.jtfDireccion.setText(r.getString(6));
                            jifActualizarCliente.jtfCorreo.setText(r.getString(7));
                            jifActualizarCliente.jbtEliminar.setEnabled(true);
                            jifActualizarCliente.jbtModificar.setEnabled(true);
                        }                        
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "" + e.getMessage(), "MECAUT", JOptionPane.ERROR_MESSAGE);
                }
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
                        JOptionPane.showMessageDialog(null, "¡Datos del cliente " + nombre + " modificados!", "Mecaut - Cliente", JOptionPane.INFORMATION_MESSAGE);

                        limpiar();
                        jifActualizarCliente.jbtEliminar.setEnabled(true);
                        jifActualizarCliente.jbtModificar.setEnabled(true);
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
                    //String nombre = jifActualizarCliente.jtfNombre.getText();
                    int rs = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar el cliente ?", "Eliminar CLIENTE", JOptionPane.YES_NO_OPTION);
                    if (rs == JOptionPane.YES_OPTION) {
                        String identificacion = jifActualizarCliente.jtfIdentificacion.getText();
                        if (Gestor.eliminarCliente(identificacion)) {
                            JOptionPane.showMessageDialog(null, "¡Datos del cliente eliminados!", "Mecaut - Cliente", JOptionPane.INFORMATION_MESSAGE);
                            limpiar();
                            jifActualizarCliente.jbtEliminar.setEnabled(true);
                            jifActualizarCliente.jbtModificar.setEnabled(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron eliminar los datos del cliente ", "Mecaut - Cliente", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (HeadlessException se) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + se.getMessage(), "Error -- MECAUT", 1);
                }
            }
        });
        jifActualizarCliente.setVisible(true);
    }

    private void frmRegistrarAuto() {
        limpiar();
        jifAuto.jtfNombreCliente.setEnabled(false);
        jifAuto.jtfApellidosCliente.setEnabled(false);
        jifAuto.jbtRegistrar.setEnabled(false);
        ArrayList<Cliente> clientes = Gestor.consultarCli();
        jifAuto.jcbIdCliente.removeAllItems();
        jifAuto.jcbIdCliente.addItem("Seleccione Id");
        for (Cliente cliente : clientes) {
            jifAuto.jcbIdCliente.addItem(cliente.getIdentificacion());
        }
        jifAuto.jbtConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Cliente cliente;
                if (jifAuto.jcbIdCliente.getSelectedIndex() != 0) {
                    cliente = (Cliente) jifAuto.jcbIdCliente.getSelectedItem();
                    jifAuto.jtfNombreCliente.setText(cliente.getNombre());
                    jifAuto.jtfApellidosCliente.setText(cliente.getApellidos());
                    jifAuto.jbtRegistrar.setEnabled(true);
                }
            }
        });
        jifAuto.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String placa = jifAuto.jtfPlaca.getText();
                    String ciudad = jifAuto.jcbCiudad.getSelectedItem().toString();
                    String modelo = (jifAuto.jcbModelo.getSelectedItem().toString());
                    String marca = jifAuto.jcbMarca.getSelectedItem().toString();
                    String idCliente = jifAuto.jcbIdCliente.getSelectedItem().toString();
                    String nombreCliente = jifAuto.jtfNombreCliente.getText();
                    String apellidosCliente = jifAuto.jtfApellidosCliente.getText();

                    Auto aut = new Auto(placa, ciudad, modelo, marca, idCliente, nombreCliente, apellidosCliente);
                    if (Gestor.agregarAuto(aut)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del auto almacenados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                        jifAuto.jcbCiudad.setSelectedIndex(0);
                        jifAuto.jcbIdCliente.setSelectedIndex(0);
                        jifAuto.jcbMarca.setSelectedIndex(0);
                        jifAuto.jcbModelo.setSelectedIndex(0);
                        limpiar();
                        jifAuto.jbtRegistrar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifAuto.setVisible(true);
    }

    private void frmRegistrarMantenimientos() {
        limpiar();
        jifMantenimiento.btnConsultar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = jifMantenimiento.jtfId.getText();
                    ResultSet rs = Gestor.ConsultarAutosClientes(id);
                    DefaultTableModel modelo = new DefaultTableModel();
                    modelo.addColumn("Placa");
                    modelo.addColumn("Ciudad");
                    modelo.addColumn("Marca");
                    while (rs.next()) {
                        Object[] fila = new Object[3];
                        fila[0] = rs.getString(1);
                        fila[1] = rs.getString(2);
                        fila[2] = rs.getString(4);
                        modelo.addRow(fila);
                    }
                    jifMantenimiento.TablaAutos.setModel(modelo);

                } catch (SQLException exc) {

                }
            }
        });
        jifMantenimiento.btnRegistrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
//        ArrayList<Auto> autos = Gestor.consultarAutos();
//        jifMantenimiento.jcbPlaca.removeAllItems();
//        jifMantenimiento.jcbPlaca.addItem("Seleccione Nit");
//        for (Auto auto : autos) {
//            jifMantenimiento.jcbPlaca.addItem(auto);
//        }
//        ArrayList<Empleados> mecanicos = Gestor.consultarEmpleados();
//        jifMantenimiento.jcbIdentificacion.removeAllItems();
//        jifMantenimiento.jcbIdentificacion.addItem("seleccione Id");
//        for (Empleados mecanico : mecanicos) {
//            jifMantenimiento.jcbIdentificacion.addItem(mecanico);
//        }
//        jifMantenimiento.jbtRegistrar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                try {
//                    java.util.Date fecha = jifMantenimiento.jdcFecha.getDate();
//                    java.sql.Date fechaa = new java.sql.Date(fecha.getTime());
//                    String tipo = jifMantenimiento.jcbTipo.getSelectedItem().toString();
//                    String descripcion = jifMantenimiento.jtaDescripcion.getText();
//                    String costo = (jifMantenimiento.jtfCosto.getText());
//                    String placa = jifMantenimiento.jcbPlaca.getSelectedItem().toString();
//                    String idMecanico = (jifMantenimiento.jcbIdentificacion.getSelectedItem().toString());
//                    Mantenimiento man = new Mantenimiento(tipo, fechaa, descripcion, costo, placa, idMecanico);
//                    if (Gestor.agregarMantenimiento(man)) {
//                        JOptionPane.showMessageDialog(null, "¡Datos del mantenimiento almacenados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
//                        limpiar();
//                        jifMantenimiento.jcbTipo.setSelectedIndex(0);
//                        jifMantenimiento.jcbPlaca.setSelectedIndex(0);
//                        jifMantenimiento.jcbIdentificacion.setSelectedIndex(0);
//                    } else {
//                        JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos!", "Mecaut", JOptionPane.ERROR_MESSAGE);
//                    }
//                } catch (HeadlessException | NumberFormatException e) {
//                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
//                }
//            }
//        });
        jifMantenimiento.btnRegistrar.setEnabled(true);
        jifMantenimiento.btnEliminar.setEnabled(false);
        jifMantenimiento.btnModificar.setEnabled(false);
        jifMantenimiento.setBounds(0, 0, 350, 250);
        jifMantenimiento.setVisible(true);
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
//                        if (!r.next()) {
//                            JOptionPane.showMessageDialog(null, "No se encontraron resultados...","MECAUT - Búsqueda",JOptionPane.ERROR_MESSAGE);
//                        }
                        while (r.next()) {
                            int op = ("Masculino".equals(r.getString(4)) ? 2 : 1);
                            jifActualizarEmpleado.jtfNombre.setText(r.getString(2));
                            jifActualizarEmpleado.jtfApellidos.setText(r.getString(3));
                            jifActualizarEmpleado.jcbSexo.setSelectedIndex(op);
                            jifActualizarEmpleado.jtfTipo1.setText(r.getString(5));
                            jifActualizarEmpleado.jtfTelefono.setText(r.getString(6));
                            jifActualizarEmpleado.jtfDireccion.setText(r.getString(7));
                            jifActualizarEmpleado.jtfCorreo.setText(r.getString(8));
                            jifActualizarEmpleado.jtfSalario.setText(r.getString(9));
                            jifActualizarEmpleado.jbtEliminar.setEnabled(true);
                            jifActualizarEmpleado.jbtModificar.setEnabled(true);
                            jifActualizarEmpleado.jcbSexo.setSelectedIndex(0);
                        }                        
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
                    Empleados emp = new Empleados(identificacion, nombre, apellidos,sexo, tipo, telefono, direccion, correo, salario);
                    if (Gestor.modificarEmpleado(emp)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del mecánico modificados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                        jifActualizarEmpleado.jbtEliminar.setEnabled(false);
                        jifActualizarEmpleado.jbtModificar.setEnabled(false);
                        jifActualizarCliente.jcbSexo.setSelectedIndex(0);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron modificar los datos!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifActualizarEmpleado.setVisible(true);
    }

    private void frmActualizarMantenimiento() {
        try {
            limpiar();
            jifActualizarMantenimiento.jtfPlaca.setEnabled(false);
            jifActualizarMantenimiento.jtfIdMecanico.setEnabled(false);
            jifActualizarMantenimiento.jbtEliminar.setEnabled(false);
            jifActualizarMantenimiento.jbtModificar.setEnabled(false);
            jifActualizarMantenimiento.jcbCodigoMantenimiento.removeAllItems();
            ArrayList<Mantenimiento> mantenimientos = Gestor.consultarManteniminetos();
            jifActualizarMantenimiento.jcbCodigoMantenimiento.addItem("seleccione código");
            for (Mantenimiento mantenimiento : mantenimientos) {
                jifActualizarMantenimiento.jcbCodigoMantenimiento.addItem(mantenimiento);
            }
            jifActualizarMantenimiento.jbtConsultar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Mantenimiento mantenimiento;
                    if (jifActualizarMantenimiento.jcbCodigoMantenimiento.getSelectedIndex() != 0) {
                        mantenimiento = (Mantenimiento) jifActualizarMantenimiento.jcbCodigoMantenimiento.getSelectedItem();
                        jifActualizarMantenimiento.jtfTipo.setText(mantenimiento.getTipo());
                        jifActualizarMantenimiento.jdcFecha.setText("" + Date.valueOf(mantenimiento.getFecha().toString()));
                        jifActualizarMantenimiento.jtaDescripcion.setText(mantenimiento.getDescripcion());
                        jifActualizarMantenimiento.jtfCosto.setText(mantenimiento.getCosto());
                        jifActualizarMantenimiento.jtfPlaca.setText(mantenimiento.getPlacaAuto());
                        jifActualizarMantenimiento.jtfIdMecanico.setText(mantenimiento.getIdMecanico());
                        jifActualizarMantenimiento.jbtEliminar.setEnabled(true);
                        jifActualizarMantenimiento.jbtModificar.setEnabled(true);
                    }
                }
            });
            jifActualizarMantenimiento.jbtEliminar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Mantenimiento man = (Mantenimiento) jifActualizarMantenimiento.jcbCodigoMantenimiento.getSelectedItem();
                    if (Integer.parseInt(jifActualizarMantenimiento.jcbCodigoMantenimiento.getSelectedItem().toString()) != 0) {
                        if (Gestor.eliminarMantenimiento(man)) {
                            JOptionPane.showMessageDialog(null, "Se elimino correctamente", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                            jifActualizarMantenimiento.jcbCodigoMantenimiento.setSelectedIndex(0);
                            jifActualizarMantenimiento.jcbCodigoMantenimiento.setSelectedIndex(0);
                            limpiar();
                            jifActualizarMantenimiento.jbtEliminar.setEnabled(false);
                            jifActualizarMantenimiento.jbtModificar.setEnabled(false);
                        }
                    }

                }
            });
            jifActualizarMantenimiento.jbtModificar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    int codigo = Integer.parseInt(jifActualizarMantenimiento.jcbCodigoMantenimiento.getSelectedItem().toString());
                    String tipo = jifActualizarMantenimiento.jtfTipo.getText();
                    Date fecha = Date.valueOf(jifActualizarMantenimiento.jdcFecha.getText());
                    String descripcion = jifActualizarMantenimiento.jtaDescripcion.getText();
                    String costo = jifActualizarMantenimiento.jtfCosto.getText();

                    Mantenimiento m = new Mantenimiento(codigo, tipo, fecha, descripcion, costo);

                    if (Gestor.actualizarMantenimiento(m)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del mantenimiento actualizados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                        jifActualizarMantenimiento.jcbCodigoMantenimiento.setSelectedIndex(0);
                        jifActualizarMantenimiento.jcbCodigoMantenimiento.setSelectedIndex(0);
                        limpiar();
                        jifActualizarMantenimiento.jbtEliminar.setEnabled(false);
                        jifActualizarMantenimiento.jbtModificar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron actualizar los datos!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                    }
                    jifActualizarMantenimiento.jcbCodigoMantenimiento.setSelectedIndex(0);

                }
            });
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
        }
        jifActualizarMantenimiento.setVisible(true);
    }

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
        jifProveedor.setVisible(true);
    }

    private void frmActualizarProveedor() {
        limpiar();
        jifActualizarProveedor.jbtEliminar.setEnabled(false);
        jifActualizarProveedor.jbtModificar.setEnabled(false);
        ArrayList<Proveedor> proveedores = Gestor.consultarProveedores();
        jifActualizarProveedor.jcbNit.removeAllItems();
        jifActualizarProveedor.jcbNit.addItem("Seleccione Id");
        for (Proveedor proveedor : proveedores) {
            jifActualizarProveedor.jcbNit.addItem(proveedor);
        }
        jifActualizarProveedor.jbtConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Proveedor proveedor;
                if (jifActualizarProveedor.jcbNit.getSelectedIndex() != 0) {
                    proveedor = (Proveedor) jifActualizarProveedor.jcbNit.getSelectedItem();
                    jifActualizarProveedor.jtfNombre.setText(proveedor.getNombre());
                    jifActualizarProveedor.jtfDireccion.setText(proveedor.getDireccion());
                    jifActualizarProveedor.jtfTelefono.setText("" + proveedor.getTelefono());
                    jifActualizarProveedor.jtaDescripcion.setText(proveedor.getDescripcion());
                    jifActualizarProveedor.jbtEliminar.setEnabled(true);
                    jifActualizarProveedor.jbtModificar.setEnabled(true);
                }
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
                    int rs = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar este proveedor?", "Eliminar PROVEEDOR", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
                    if (rs == JOptionPane.YES_OPTION) {
                        int nit = Integer.parseInt(jifActualizarProveedor.jcbNit.getSelectedItem().toString());
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
    }

    private void frmRegistrarEmpleado() {
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
                    Empleados emp = new Empleados(identificacion, nombre, apellidos,sexo, tipo, telefono, direccion, correo, salario);
                    Cuenta count = new Cuenta(identificacion, identificacion, "empleado");
                    if (Gestor.agregarEmpleado(emp) && Gestor.registrarUsuario(count)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del mecánico almacenados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
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
    }

    private void frmRegistrarRepuestos() {
        jifRepuesto.jbtRegistrar.setEnabled(false);
        jifRepuesto.jtfNomProveedor.setEnabled(false);
        ArrayList<Proveedor> proveedores = Gestor.consultarProveedores();
        jifRepuesto.jcbNitProveedor.removeAllItems();
        jifRepuesto.jcbNitProveedor.addItem("Seleccione Nit");
        for (Proveedor proveedor : proveedores) {
            jifRepuesto.jcbNitProveedor.addItem(proveedor);
        }
        jifRepuesto.jbtConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Proveedor proveedor;
                if (jifRepuesto.jcbNitProveedor.getSelectedIndex() != 0) {
                    proveedor = (Proveedor) jifRepuesto.jcbNitProveedor.getSelectedItem();
                    jifRepuesto.jtfNomProveedor.setText(proveedor.getNombre());
                    jifRepuesto.jbtRegistrar.setEnabled(true);
                }
            }
        });
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
                    String nomProv = jifRepuesto.jtfNomProveedor.getText();
                    Repuesto rep = new Repuesto(codigo, tipo, marca, cantidad, precio, nit, nomProv);
                    if (Gestor.agregarRepuesto(rep)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del repuesto almacenados!", "Mecaut", JOptionPane.QUESTION_MESSAGE);
                        limpiar();
                        jifRepuesto.jcbTipo.setSelectedIndex(0);
                        jifRepuesto.jcbNitProveedor.setSelectedIndex(0);
                        jifRepuesto.jbtRegistrar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifRepuesto.setVisible(true);
    }
    
    private void frmActualizarRepuesto(){
        jifActualizarRepuesto.jtfNitProveedor.setEnabled(false);        
        jifActualizarRepuesto.jtfNomProveedor.setEnabled(false);
        jifActualizarRepuesto.jbtModificar.setEnabled(false);
        jifActualizarRepuesto.jbtEliminar.setEnabled(false);
        jifActualizarRepuesto.jbtConsultar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ResultSet r;
                    String codigo = jifActualizarRepuesto.jtfCodigo.getText();
                    if (codigo.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ingrese un codigo", "MECAUT", JOptionPane.ERROR_MESSAGE);
                    } else {
                        r = Gestor.TraerDatosRepuesto(codigo);
//                        if (!r.next()) {
//                            JOptionPane.showMessageDialog(null, "No se encontraron resultados...","MECAUT - Búsqueda",JOptionPane.ERROR_MESSAGE);
//                        }
                        while (r.next()) {   
                            jifActualizarRepuesto.jtfTipo.setText(r.getString(2));
                            jifActualizarRepuesto.jtfMarca.setText(r.getString(3));
                            jifActualizarRepuesto.jtfCantidad.setText(r.getString(4));                            
                            jifActualizarRepuesto.jtfPrecio.setText(r.getString(5));
                            jifActualizarRepuesto.jtfNitProveedor.setText(r.getString(6));
                            jifActualizarRepuesto.jtfNomProveedor.setText(r.getString(7));
                        }
                        jifActualizarRepuesto.jbtEliminar.setEnabled(true);
                        jifActualizarRepuesto.jbtModificar.setEnabled(true);
                    }
                } catch (HeadlessException | SQLException ee) {
                    JOptionPane.showMessageDialog(null, "" + ee.getMessage(), "MECAUT", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifActualizarRepuesto.setVisible(true);
    }

    private void frmListaClientes() {
        evtMostrarClientes();
        jifListaClientes.jtfDato.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                evtMostrarClientes();
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }
        });
        jifListaClientes.setVisible(true);
    }

    private void frmGrupoClientes() {
        evtVerGrupoClientes("Activo");
        jifGrupoClientes.jcbTipo.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String dato = jifGrupoClientes.jcbTipo.getSelectedItem().toString();
                evtVerGrupoClientes(dato);
            }
        });

        jifGrupoClientes.setVisible(true);
    }

    private void frmListaAutos() {
        ArrayList<Auto> autos = Gestor.verAutos();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Placa");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Modelo");
        modelo.addColumn("Marca");
        modelo.addColumn("Id cliente");
        modelo.addColumn("Nombre cliente");
        modelo.addColumn("Apellidos cliente");
        for (Auto auto : autos) {
            Object[] fila = new Object[7];
            fila[0] = auto.getPlaca();
            fila[1] = auto.getCiudad();
            fila[2] = auto.getModelo();
            fila[3] = auto.getMarca();
            fila[4] = auto.getIdCliente();
            fila[5] = auto.getNombreCliente();
            fila[6] = auto.getApellidosCliente();
            modelo.addRow(fila);
        }
        jifListaAutos.jtListaAutos.setModel(modelo);
        jifListaAutos.setVisible(true);
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
        modelo.addColumn("Nombre proveedor");
        for (Repuesto repuesto : repuestos) {
            Object[] fila = new Object[7];
            fila[0] = repuesto.getCodigo();
            fila[1] = repuesto.getTipo();
            fila[2] = repuesto.getMarca();
            fila[3] = repuesto.getCantidad();
            fila[4] = repuesto.getPrecio();
            fila[5] = repuesto.getNitProv();
            fila[6] = repuesto.getNomProv();
            modelo.addRow(fila);
        }
        jifListaRepuestos.jtListaRepuestos.setModel(modelo);
        jifListaRepuestos.setVisible(true);
    }

    private void frmListaMecanicos() {
        evtMostrarMecanicos();
        jifListaEmpleados.jtfDato.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                evtMostrarMecanicos();
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        jifListaEmpleados.setVisible(true);
    }

    private void frmListaProveedores() {
        ArrayList<Proveedor> proveedores = Gestor.verProveedor();
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
    }

    private void frmListaMantenimientos() {
        ArrayList<Mantenimiento> mantenimientos = Gestor.verMantenimientos();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Tipo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Descripción");
        modelo.addColumn("Costo");
        modelo.addColumn("Placa auto");
        modelo.addColumn("Id mecánico");
        for (Mantenimiento mantenimiento : mantenimientos) {
            Object[] fila = new Object[7];
            fila[0] = mantenimiento.getCodigo();
            fila[1] = mantenimiento.getTipo();
            fila[2] = mantenimiento.getFecha();
            fila[3] = mantenimiento.getDescripcion();
            fila[4] = mantenimiento.getFecha();
            fila[5] = mantenimiento.getPlacaAuto();
            fila[6] = mantenimiento.getIdMecanico();
            modelo.addRow(fila);
        }
        jifListaMantenimientos.jtListaMantenimientos.setModel(modelo);
        jifListaMantenimientos.setVisible(true);
    }

    //Limpia todos los jtextField de los formulario
    private void limpiar() {
        jifCliente.jtfNombre.setText(null);
        jifCliente.jtfApellidos.setText(null);
        jifCliente.jtfDireccion.setText(null);
        jifCliente.jtfCorreo.setText(null);
        jifCliente.jtfTelefono.setText(null);
        jifCliente.jtfIdentificacion.setText(null);
        jifActualizarCliente.jtfIdentificacion.setText(null);
        jifActualizarCliente.jtfNombre.setText(null);
        jifActualizarCliente.jtfApellidos.setText(null);
        jifActualizarCliente.jtfCorreo.setText(null);
        jifActualizarCliente.jtfTelefono.setText(null);
        jifActualizarCliente.jtfDireccion.setText(null);
        jifAuto.jtfPlaca.setText(null);
        jifAuto.jtfNombreCliente.setText(null);
        jifAuto.jtfApellidosCliente.setText(null);
        jifAuto.jbtRegistrar.setEnabled(false);
        jifEmpleado.jtfIdentificacion.setText("");
        jifEmpleado.jtfNombre.setText("");
        jifEmpleado.jtfApellidos.setText("");
        jifEmpleado.jtfTelefono.setText("");
        jifEmpleado.jtfDireccion.setText("");
        jifEmpleado.jtfCorreo.setText("");
        jifEmpleado.jtfSalario.setText("");
        jifProveedor.jtfNit.setText("");
        jifProveedor.jtfNombre.setText("");
        jifProveedor.jtfDireccion.setText("");
        jifProveedor.jtfTelefono.setText("");
        jifProveedor.jtaDescripcion.setText("");
        jifActualizarMantenimiento.jtfTipo.setText("");
        jifActualizarMantenimiento.jdcFecha.removeAll();
        jifActualizarMantenimiento.jtaDescripcion.setText("");
        jifActualizarMantenimiento.jtfCosto.setText(null);
        jifActualizarMantenimiento.jtfPlaca.setText(null);
        jifActualizarMantenimiento.jtfIdMecanico.setText(null);
        jifActualizarProveedor.jtfNombre.setText(null);
        jifActualizarProveedor.jtaDescripcion.setText(null);
        jifActualizarProveedor.jtfDireccion.setText(null);
        jifActualizarProveedor.jtfTelefono.setText(null);
        jifActualizarEmpleado.jtfId.setText(null);
        jifActualizarEmpleado.jtfNombre.setText("");
        jifActualizarEmpleado.jtfApellidos.setText("");
        jifActualizarEmpleado.jtfTelefono.setText("");
        jifActualizarEmpleado.jtfDireccion.setText("");
        jifActualizarEmpleado.jtfSalario.setText("");
        jifActualizarEmpleado.jtfCorreo.setText(null);
        jifRepuesto.jtfMarca.setText("");
        jifRepuesto.jtfCantidad.setText("");
        jifRepuesto.jtfPrecio.setText("");
        jifRepuesto.jtfCodigo.setText("");
        jifRepuesto.jtfNomProveedor.setText("");
        jifActualizarCliente.jtfNombre.setText("");
        jifActualizarCliente.jtfApellidos.setText("");
        jifActualizarCliente.jtfTelefono.setText("");
        jifActualizarCliente.jtfDireccion.setText("");
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
    }

    private void evtMostrarMecanicos() {
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
        modelo.addColumn("Correo");
        modelo.addColumn("Salario");
        for (Empleados empleado : empleados) {
            Object[] fila = new Object[9];
            fila[0] = empleado.getIdentificacion();
            fila[1] = empleado.getNombre();
            fila[2] = empleado.getApellidos();
            fila[3] = empleado.getSexo();
            fila[4] = empleado.getTipo();
            fila[5] = empleado.getTelefono();
            fila[6] = empleado.getDireccion();
            fila[7] = empleado.getCorreo();
            fila[8] = empleado.getSalario();
            modelo.addRow(fila);
        }
        jifListaEmpleados.jtListaMecanicos.setModel(modelo);
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
                grupo = Gestor.verGrupoClientes("");
                break;
        }
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre Grupo");
        modelo.addColumn("Cliente-Identificación");
        modelo.addColumn("Estado");
        for (GrupoClientes grupos : grupo) {
            Object[] fila = new Object[4];
            fila[0] = grupos.getCodigo();
            fila[1] = grupos.getNombre();
            fila[2] = grupos.getCli_Id();
            fila[3] = grupos.getEstado();
            modelo.addRow(fila);
        }
        jifGrupoClientes.jtGrupoClientes.setModel(modelo);
    }
    private void evtIniciarSesion(){
            try {
                String usuario = Login.jtfUsuario.getText();
                String contrasena = Login.jtfContraseña.getText();
                Cuenta cuenta = new Cuenta(usuario, contrasena, "");
                String r = Gestor.validarUsuario(cuenta);
                switch (r) {
                    case "administrador":
                        Login.setVisible(false);
                        lanzarFormularioAdministrador();
                        break;
                    case "cliente":
                        Login.setVisible(false);
                        lanzarFormularioCliente();
                        break;
                    case "empleado":
                        Login.setVisible(false);
                        lanzarFormularioEmpleado();
                }
            } catch (HeadlessException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "¡¡¡ Los Datos Ingresados Son Incorrectos !!!\n\n\tVerifiquelos Nuevamente....", "MECAUT - Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
            }
        }
}
