package controlador;

import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Gestor;
import modelo.Logica.Auto;
import modelo.Logica.Cliente;
import modelo.Logica.Cuenta;
import modelo.Logica.DetalleFactura;
import modelo.Logica.Empleados;
import modelo.Logica.Factura;
import modelo.Logica.GrupoClientes;
import modelo.Logica.Mantenimiento;
import modelo.Logica.Proveedor;
import modelo.Logica.Repuesto;
import vista.Clientes.jifActualizarCliente;
import vista.Clientes.jifGrupoClientes;
import vista.Clientes.jifListaAutos;
import vista.Clientes.jifListaClientes;
import vista.Clientes.jifRegistrarAuto;
import vista.Clientes.jifRegistrarCliente;
import vista.Empleados.jifActualizarEmpleado;
import vista.Empleados.jifListaEmpleados;
import vista.Empleados.jifRegistrarEmpleado;
import vista.Factura.jifFactura;
import vista.FormulariosPrincipales.frmAdmin;
import vista.FormulariosPrincipales.frmCliente;
import vista.FormulariosPrincipales.frmEmpleado;
import vista.FormulariosPrincipales.frmLoggin;
import vista.Mantenimientos.jifActualizarMantenimiento;
import vista.Mantenimientos.jifListaMantenimientos;
import vista.Mantenimientos.jifRegistrarMantenimiento;
import vista.Proveedores.jifActualizarProveedor;
import vista.Proveedores.jifListaProveedores;
import vista.Proveedores.jifRegistrarProveedor;
import vista.Repuestos.jifActualizarRepuesto;
import vista.Repuestos.jifListaRepuestos;
import vista.Repuestos.jifRegistrarRepuesto;

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
        Login.setVisible(true);
    }
    /* Formulario Administrador */

    private void lanzarFormularioAdministrador() {
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
        form.jmiListaEmpleados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaEmpleados();
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
        form.jmiListaEmpleados.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmListaEmpleados();
            }
        });

        form.jmiRegistrarFactura.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                frmFactura();
            }
        });
        form.setVisible(true);
        form.user.setText(Login.jtfUsuario.getText().toUpperCase());
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
        jifCliente.jcbSexo.setSelectedItem(0);
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
                        /* Esta Condición es para que no salga error cuando se abre el formulario por 2da vez */
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
        locacionfrm(jifCliente);
    }

    private void frmActualizarCliente() {
        limpiar();
        jifActualizarCliente.jcbSexo.setSelectedItem(0);
        jifActualizarCliente.jbtEliminar.setEnabled(false);
        jifActualizarCliente.jbtModificar.setEnabled(false);
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
            while (ids.next()) {
                t.addItem(ids.getString("cli_id"));
            }
        } catch (Exception e) {
        }
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
                evtMostrarClientes();
            }

            @Override
            public void keyReleased(KeyEvent ke) {
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

    private void frmGrupoClientes() {
        evtVerGrupoClientes("Activo");
        int n2 = jifGrupoClientes.jtGrupoClientes.getRowCount();
        jifGrupoClientes.nRegistros.setText("" + n2);
        jifGrupoClientes.jbtModificar.setEnabled(false);
        jifGrupoClientes.jcbTipo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String dato = jifGrupoClientes.jcbTipo.getSelectedItem().toString();
                evtVerGrupoClientes(dato);
            }
        });
        jifGrupoClientes.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = jifGrupoClientes.jtfId.getText();
                String cod = jifGrupoClientes.jtfCodigo.getText();
                String nom = jifGrupoClientes.jtfNombre.getText();
                String est = jifGrupoClientes.jcbEstado.getSelectedItem().toString();
                if (Gestor.agregarGrupoCliente(id, cod, nom, est)) {
                    JOptionPane.showMessageDialog(null, "El cliente se agrego correctamente al grupo", "MECAUT", JOptionPane.INFORMATION_MESSAGE);
                    jifGrupoClientes.jtfId.setText(null);
                    jifGrupoClientes.jtfCodigo.setText(null);
                    jifGrupoClientes.jtfNombre.getText();
                    jifGrupoClientes.jcbEstado.setSelectedItem(0);
                    jifGrupoClientes.jbtRegistrar.setEnabled(true);
                    jifGrupoClientes.jtfId.setEnabled(false);
                    jifGrupoClientes.jtfCodigo.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo agregar al grupo", "MECAUT", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifGrupoClientes.jbtModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = jifGrupoClientes.jtfId.getText();
                String cod = jifGrupoClientes.jtfCodigo.getText();
                String nom = jifGrupoClientes.jtfNombre.getText();
                String est = jifGrupoClientes.jcbEstado.getSelectedItem().toString();
                if (Gestor.actualizarGrupoCliente(id, cod, nom, est)) {
                    JOptionPane.showMessageDialog(null, "Se modifico correctamente el estado del cliente", "MECAUT", JOptionPane.INFORMATION_MESSAGE);
                    jifGrupoClientes.jtfId.setText(null);
                    jifGrupoClientes.jtfCodigo.setText(null);
                    jifGrupoClientes.jtfNombre.setText(null);
                    jifGrupoClientes.jcbEstado.setSelectedItem(0);
                    jifGrupoClientes.jbtRegistrar.setEnabled(true);
                    jifGrupoClientes.jbtModificar.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el estado del cliente", "MECAUT", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        TextAutoCompleter t = new TextAutoCompleter(jifGrupoClientes.jtfId);
        ResultSet r = Gestor.IdsClientes();
        try {
            while (r.next()) {
                t.addItem(r.getString("cli_id"));
            }
        } catch (Exception e) {
        }
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
        int n = jifGrupoClientes.jtGrupoClientes.getRowCount();
        jifGrupoClientes.nRegistros.setText("" + n);
        jifGrupoClientes.jtGrupoClientes.setModel(modelo);
    }

    private void frmRegistrarAuto() {
        limpiar();
        jifAuto.jtfNombreCliente.setEnabled(false);
        jifAuto.jbtRegistrar.setEnabled(false);
        ArrayList<Cliente> clientes = Gestor.consultarClientes();
        jifAuto.jcbIdCliente.removeAllItems();
        jifAuto.jcbIdCliente.addItem("Seleccione Id");
        for (Cliente cliente : clientes) {
            jifAuto.jcbIdCliente.addItem(cliente.getIdentificacion());
        }
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
                } catch (Exception ex) {
                }
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
                        jifAuto.jcbCiudad.setSelectedIndex(0);
                        jifAuto.jcbIdCliente.setSelectedIndex(0);
                        jifAuto.jcbMarca.setSelectedIndex(0);
                        jifAuto.jcbModelo.setSelectedIndex(0);
                        limpiar();
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
                    jifActualizarCliente.jbtEliminar.setEnabled(true);
                    jifActualizarCliente.jbtModificar.setEnabled(true);
                }
                jifActualizarCliente.jbtEliminar.setEnabled(true);
                jifActualizarCliente.jbtModificar.setEnabled(true);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "MECAUT", JOptionPane.ERROR_MESSAGE);
        }
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
        locacionfrm(jifListaAutos);
    }
    /* 2. Modulo Servicios */

    private void frmRegistrarMantenimientos() {
        limpiar();
        jifMantenimiento.jcbIdMecanico.setSelectedIndex(0);
        jifMantenimiento.jtfIdCliente.setEnabled(false);
        jifMantenimiento.jtfNombreCliente.setEnabled(false);
        jifMantenimiento.jtfNombreMecanico.setEnabled(false);
        int cont = 0;
        jifMantenimiento.jtfCodigo.setText("" + (++cont));
        TextAutoCompleter t = new TextAutoCompleter(jifMantenimiento.jtfPlaca);
        ResultSet res = Gestor.placasAutos();
        try {
            while (res.next()) {
                t.addItem(res.getString("aut_placa"));
            }
        } catch (Exception e) {
        }
        final DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
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
        jifMantenimiento.jcbIdMecanico.removeAllItems();
        jifMantenimiento.jcbIdMecanico.addItem("----");
        jifMantenimiento.jcbcodRepuesto.removeAllItems();
        jifMantenimiento.jcbcodRepuesto.addItem("----");
        ResultSet ids = Gestor.idsMecanicos();
        try {
            while (ids.next()) {
                jifMantenimiento.jcbIdMecanico.addItem(ids.getString("emp_id"));
            }
        } catch (Exception e) {
        }
        ResultSet cods = Gestor.codRepuestos();
        try {
            while (cods.next()) {
                jifMantenimiento.jcbcodRepuesto.addItem(cods.getString("rep_codigo"));
            }
        } catch (Exception e) {
        }
        jifMantenimiento.jbtConsultarAuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dato = jifMantenimiento.jtfPlaca.getText();
                ResultSet r = Gestor.datosMantenimiento(dato);
                try {
                    while (r.next()) {
                        jifMantenimiento.jtfIdCliente.setText(r.getString("cli_id"));
                        jifMantenimiento.jtfNombreCliente.setText(r.getString("cli_nombre"));
                    }
                } catch (Exception ex) {
                }
            }
        });
        jifMantenimiento.jbtConsultarMecanico.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String id = jifMantenimiento.jcbIdMecanico.getSelectedItem().toString();
                ResultSet re = Gestor.traerDatosEmpleado(id);
                try {
                    while (re.next()) {
                        jifMantenimiento.jtfNombreMecanico.setText(re.getString("emp_nombre"));
                    }
                } catch (Exception ex) {
                }
            }
        });
        jifMantenimiento.jbtAgregar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String codMantenimiento = jifMantenimiento.jtfCodigo.getText();
                String TipoMantenimiento = jifMantenimiento.jcbTipoMantenimiento.getSelectedItem().toString();
                String placa = jifMantenimiento.jtfPlaca.getText();
                String nombreCliente = jifMantenimiento.jtfNombreCliente.getText();
                String idMecanico = jifMantenimiento.jcbIdMecanico.getSelectedItem().toString();
                String nombreMecanico = jifMantenimiento.jtfNombreMecanico.getText();
                Object[] fila = new Object[11];
                fila[0] = codMantenimiento;
                fila[1] = TipoMantenimiento;
                fila[2] = "";
                fila[3] = "";
                fila[4] = placa;
                fila[5] = nombreCliente;
                fila[6] = idMecanico;
                fila[7] = nombreMecanico;
                fila[8] = "";
                fila[9] = "";
                fila[10] = "";
                modelo.addRow(fila);
                jifMantenimiento.Detalles.setModel(modelo);
            }
        });
        jifMantenimiento.jbtConsultarRepuesto.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String cod = jifMantenimiento.jcbcodRepuesto.getSelectedItem().toString();
                ResultSet r = Gestor.datosRepuesto(cod);
                try {
                    while (r.next()) {
                        jifMantenimiento.jtfnombreRepuesto.setText(r.getString("rep_tipo"));
                    }
                } catch (Exception ex) {
                }
            }
        });
        jifMantenimiento.jbtRegistrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String codigoMantenimiento = jifMantenimiento.jtfCodigo.getText();
                String fechaInicio = jifMantenimiento.jdcFechaInicio.getDate().toString();
                String observaciones = jifMantenimiento.jtfObsevaciones.getText();
                String costo = jifMantenimiento.jtfCosto.getText();
                String estado = "Pendiente";

                if (Gestor.registrarMantenimiento(codigoMantenimiento, fechaInicio, observaciones, costo, estado)) {
                    JOptionPane.showMessageDialog(null, "Se registro el Mantenimiento");
                } else {
                    JOptionPane.showMessageDialog(null, "no se pudo registrar el mantenimiento");
                }

                int nColumnas = jifMantenimiento.Detalles.getRowCount();
                String[][] datosdetalles = new String[nColumnas][11];
                for (int i = 0; i < nColumnas; i++) {
                    for (int j = 0; j < 11; j++) {
                        datosdetalles[i][j] = (String) jifMantenimiento.Detalles.getValueAt(i, j);
                    }
                }
                for (int i = 0; i < datosdetalles.length; i++) {
                    for (int j = 0; j < datosdetalles[i].length; j++) {
                        System.out.print(datosdetalles[i][j]);
                    }
                    if (Gestor.detallesMantenimiento(
                            datosdetalles[i][0],
                            datosdetalles[i][1],
                            datosdetalles[i][2],
                            datosdetalles[i][3],
                            datosdetalles[i][4],
                            datosdetalles[i][5],
                            datosdetalles[i][6],
                            datosdetalles[i][7],
                            datosdetalles[i][8],
                            datosdetalles[i][9],
                            datosdetalles[i][10])) {
                        JOptionPane.showMessageDialog(null, "Se agrego correctamente el detalle de mantenimiento");
                    } else {
                        JOptionPane.showMessageDialog(null, "Operación Fallada ='CC");
                    }
                    System.out.println("");
                }

                System.out.println(fechaInicio);
            }
        });
        /*
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
         JOptionPane.showMessageDialog(null, "Error Interno...","MECAUT",JOptionPane.ERROR_MESSAGE);
         }
         }
         });
         jifMantenimiento.btnRegistrar.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
         }
         });*/
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
//        TextAutoCompleter t= new TextAutoCompleter(jifMantenimiento.jtfId);
        /*ResultSet r = Gestor.IdsClientes();
         try {
         while(r.next())
         t.addItem(r.getString("cli_id"));
         } catch (Exception e) {}
         jifMantenimiento.btnRegistrar.setEnabled(true);
         jifMantenimiento.btnEliminar.setEnabled(false);
         jifMantenimiento.btnModificar.setEnabled(false);*/
        jifMantenimiento.setVisible(true);
    }

    private void frmActualizarMantenimiento() {
        limpiar();
        try {
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
        locacionfrm(jifActualizarMantenimiento);
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
        locacionfrm(jifListaMantenimientos);
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
                    Cuenta count = new Cuenta(identificacion, identificacion, "empleado");
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
        jifActualizarRepuesto.jtfNitProveedor.setEnabled(false);
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
        jifActualizarRepuesto.setVisible(true);
        locacionfrm(jifActualizarRepuesto);
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
    /* 6. Modulo Ventas */

    private void evtIniciarSesion() {
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

    //Limpia todos los jtextField de los formulario
    private void limpiar() {
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
        jifActualizarMantenimiento.jtfTipo.setText("");
        jifActualizarMantenimiento.jdcFecha.removeAll();
        jifActualizarMantenimiento.jtaDescripcion.setText("");
        jifActualizarMantenimiento.jtfCosto.setText("");
        jifActualizarMantenimiento.jtfPlaca.setText("");
        jifActualizarMantenimiento.jtfIdMecanico.setText("");
        jifRepuesto.jtfMarca.setText("");
        jifRepuesto.jtfCantidad.setText("");
        jifRepuesto.jtfPrecio.setText("");
        jifRepuesto.jtfCodigo.setText("");
    }

    private void locacionfrm(JInternalFrame j) {
        j.setLocation(350, 50);
    }

    private void frmFactura() {
        jifFactura.jtfNombreCli.setEnabled(false);
        jifFactura.jtfApellidosCli.setEnabled(false);
        jifFactura.jcbSexoCli.setEnabled(false);
        jifFactura.jtfTelefonoCli.setEnabled(false);
        jifFactura.jtfDireccionCli.setEnabled(false);
        jifFactura.jtfCorreoCli.setEnabled(false);
        jifFactura.jtfTipoRep.setEnabled(false);
        jifFactura.jtfMarcaRep.setEnabled(false);
        jifFactura.jtfCantidadRep.setEnabled(false);
        jifFactura.jtfPrecioRep.setEnabled(false);

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
                            int op = ("Masculino".equals(r.getString(4)) ? 2 : 1);
                            jifFactura.jtfNombreCli.setText(r.getString(2));
                            jifFactura.jtfApellidosCli.setText(r.getString(3));
                            jifFactura.jcbSexoCli.setSelectedIndex(op);
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
        jifFactura.jcbCodRep.addItem("Seleccione codigo");
        for (Repuesto repuesto : repuestos) {
            jifFactura.jcbCodRep.addItem(repuesto);
        }
        jifFactura.jcbCodRep.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent ie) {
                jifFactura.jcbCantidad.removeAllItems();
                Repuesto repuesto;
                if (jifActualizarProveedor.jcbNit.getSelectedIndex() != 0) {
                    repuesto = (Repuesto) jifFactura.jcbCodRep.getSelectedItem();
                    jifFactura.jtfTipoRep.setText(repuesto.getTipo());
                    jifFactura.jtfMarcaRep.setText(repuesto.getMarca());
                    jifFactura.jtfCantidadRep.setText("" + repuesto.getCantidad());
                    jifFactura.jtfPrecioRep.setText(repuesto.getPrecio());
                }

                for (int i = 1; i <= Integer.parseInt(jifFactura.jtfCantidadRep.getText()); i++) {
                    jifFactura.jcbCantidad.addItem(i);
                }
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
                        Factura fac = new Factura(numero, fechaa, idCliente, nombreCliente, total);
                        if (Gestor.registrarFactura(fac)) {
                            evtRegistrarDetalleFactura();
                            evtActualizarInventario();
                            JOptionPane.showMessageDialog(null, "Datos almacenados exitosamente");                            
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos");
                        }
                    }
                } catch (HeadlessException e) {

                }
            }
        });
        jifFactura.setVisible(true);
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
    
    public void evtActualizarInventario(){
        String codigo;
        int cantidad;
        int stockInicial;
        int stockFinal;
        for (int i = 0; i < jifFactura.jTable1.getRowCount(); i++) {
            codigo = jifFactura.jTable1.getValueAt(i, 0).toString();
            cantidad = Integer.parseInt(jifFactura.jTable1.getValueAt(i, 4).toString());
            stockInicial = Integer.parseInt(jifFactura.jTable1.getValueAt(i, 3).toString());
            stockFinal = stockInicial - cantidad;  
            if(Gestor.actualizarInventario(codigo, stockFinal)){ }
            else{}
        }        
    }
}
