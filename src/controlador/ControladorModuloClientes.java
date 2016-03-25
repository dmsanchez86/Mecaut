package controlador;

import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Logica.Auto;
import modelo.Logica.Cliente;
import modelo.Logica.Cuenta;
import modelo.Logica.Empleados;
import modelo.Logica.GrupoClientes;
import vista.Clientes.jifActualizarCliente;
import vista.Clientes.jifCuentas;
import vista.Clientes.jifGrupoClientes;
import vista.Clientes.jifListaAutos;
import vista.Clientes.jifListaClientes;
import vista.Clientes.jifRegistrarAuto;
import vista.Clientes.jifRegistrarCliente;
import vista.Servicios.jifRegistroAuto;

/*
 * @author Mauro
 */
public class ControladorModuloClientes extends Controlador{
    
    protected void frmRegistrarCliente(String usuario) {

        jifCliente = new jifRegistrarCliente();

        if ("Administrador".equals(usuario)) {
            form.jDesktopPane1.add(jifCliente);
        } else {
            frmEmpleado.jDesktopPane1.add(jifCliente);
        }

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
                    if (identificacion.length() < 8) {
                        JOptionPane.showMessageDialog(null, "Ingrese una identificación valida", "MECAUT", JOptionPane.WARNING_MESSAGE);
                        jifCliente.jtfIdentificacion.requestFocus();
                    } else if (identificacion.isEmpty() || nombre.isEmpty() || apellidos.isEmpty() || direccion.isEmpty()) {
                        /* Esta Condición es para que no salga error cuando se abre el formulario por 2da vez */
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

        jifCliente.jbtCancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                limpiarComboBox();
            }
        });

        jifCliente.show();
        locacionfrm(jifCliente);
    }

    protected void frmActualizarCliente(String id, final String usuario) {

        jifActualizarCliente = new jifActualizarCliente();

        if ("Administrador".equals(usuario)) {
            form.jDesktopPane1.add(jifActualizarCliente);
        } else {
            frmEmpleado.jDesktopPane1.add(jifActualizarCliente);
        }

        if ("".equals(id)) {
            limpiar();
            limpiarComboBox();
        } else {
            limpiar();
            limpiarComboBox();
            evtConsultarClienteporId(id);
        }

        jifActualizarCliente.show();
        locacionfrm(jifActualizarCliente);

        jifActualizarCliente.jtfIdentificacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evtConsultarClienteporId("");
            }
        });

        jifActualizarCliente.jtfIdentificacion.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                evtConsultarClienteporId("");
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
                        limpiar();
                        limpiarComboBox();
                        jifActualizarCliente.jbtEliminar.setEnabled(false);
                        jifActualizarCliente.jbtModificar.setEnabled(false);
                        if ("Empleado".equals(usuario)) {
                            jifActualizarCliente.hide();
                            frmListaClientes(usuario);
                        }
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
            while (ids.next()) {
                t.addItem(ids.getString("cli_id"));
            }
        } catch (Exception e) {
        }
    }

    protected void frmListaClientes(final String usuario) {

        jifListaClientes = new jifListaClientes();

        if ("Administrador".equals(usuario)) {
            form.jDesktopPane1.add(jifListaClientes);
        } else {
            frmEmpleado.jDesktopPane1.add(jifListaClientes);
        }

        evtMostrarClientes();

        jifListaClientes.jmiModificar.setText("Modificar");
        jifListaClientes.jmiEliminar.setText("Eliminar");
        jifListaClientes.jmiNuevoCliente.setText("Nuevo Cliente");
        jifListaClientes.jmiRegistrarAuto.setText("Registrar Auto");
        jifListaClientes.jmiReporte.setText("Generar Reporte");

        jifListaClientes.jmiModificar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int filas = jifListaClientes.jtListaClientes.getSelectedRows().length;
                if (filas >= 2) {
                    JOptionPane.showMessageDialog(null, "Seleccione solo una fila", "MECAUT", JOptionPane.ERROR_MESSAGE);
                } else {
                    int fila = jifListaClientes.jtListaClientes.getSelectedRow();
                    if (fila < 0) {
                        JOptionPane.showMessageDialog(null, "Selecciones una fila", "MECAUT", JOptionPane.WARNING_MESSAGE);
                    } else {
                        String identificacion = jifListaClientes.jtListaClientes.getValueAt(fila, 0).toString();

                        if ("Administrador".equals(usuario)) {
                            frmActualizarCliente(identificacion, "Administrador");
                        } else {
                            frmActualizarCliente(identificacion, "Empleado");
                        }

                        jifListaClientes.hide();
                    }
                }
            }
        });

        jifListaClientes.jmiEliminar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int fila = jifListaClientes.jtListaClientes.getSelectedRow();
                if (fila < 0) {
                    JOptionPane.showMessageDialog(null, "Selecciones una fila", "MECAUT", JOptionPane.WARNING_MESSAGE);
                } else {
                    String nombre = jifListaClientes.jtListaClientes.getValueAt(fila, 1).toString();
                    int rs = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar el cliente " + nombre.toUpperCase() + "?", "Eliminar CLIENTE", JOptionPane.YES_NO_OPTION);
                    if (rs == JOptionPane.YES_OPTION) {
                        String identificacion = jifListaClientes.jtListaClientes.getValueAt(fila, 0).toString();
                        if (Gestor.eliminarCliente(identificacion)) {
                            JOptionPane.showMessageDialog(null, "¡Datos del cliente " + nombre.toUpperCase() + " eliminados!", "Mecaut - Cliente", JOptionPane.INFORMATION_MESSAGE);
                            evtMostrarClientes();
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron eliminar los datos del cliente " + nombre.toUpperCase() + "", "Mecaut - Cliente", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        });

        jifListaClientes.jmiNuevoCliente.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jifListaClientes.hide();
                frmRegistrarCliente("Administrador");
            }
        });

        jifListaClientes.jmiRegistrarAuto.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int fila = jifListaClientes.jtListaClientes.getSelectedRow();
                if (fila < 0) {
                    JOptionPane.showMessageDialog(null, "Selecciones una fila", "MECAUT", JOptionPane.WARNING_MESSAGE);
                } else {
                    jifListaClientes.hide();
                    String identificacion = jifListaClientes.jtListaClientes.getValueAt(fila, 0).toString();

                    if ("Administrador".equals(usuario)) {
                        frmRegistrarAuto(identificacion, "Administrador");
                    } else {
                        frmRegistrarAuto(identificacion, "Empleado");
                    }
                }
            }
        });

        jifListaClientes.jmiReporte.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                evtReportes("clientes", "Listado de Clientes");
            }
        });

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

        jifListaClientes.jtListaClientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jifListaClientes.jPopupMenu1.show(e.getComponent(), e.getX(), e.getY());
            }
        });

        jifListaClientes.show();
    }

    protected void evtMostrarClientes() {
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

        int[] anchos = {70, 90, 90, 60, 75, 90, 200};
        setColumnWidths(anchos, jifListaClientes.jtListaClientes);

        int nRegistros = modelo.getRowCount();
        jifListaClientes.nRegistros.setText("" + nRegistros);

    }

    protected void frmCuentas() {

        jifCuentas = new jifCuentas();
        form.jDesktopPane1.add(jifCuentas);

        limpiar();
        limpiarComboBox();

        jifCuentas.jbtCrearCuenta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = jifCuentas.jtfUsuario.getText();
                String contrasena = jifCuentas.jtfcontrasena.getText();
                String cContrasena = jifCuentas.jtfconfContrasena.getText();
                String tipo = jifCuentas.jcbTipoCuenta.getSelectedItem().toString();
                if (usuario.isEmpty() || usuario.length() < 5) {
                    JOptionPane.showMessageDialog(null, "Ingrese un usuario valido", "MECAUT", JOptionPane.WARNING_MESSAGE);
                } else if (contrasena.equals(cContrasena)) {
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
                            JOptionPane.showMessageDialog(null, "Se registro correctamente la cuenta " + usuario.toUpperCase() + "\nAl Cliente " + nom.toUpperCase(), "MECAUT", JOptionPane.INFORMATION_MESSAGE);
                            limpiar();
                            limpiarComboBox();
                        }
                    } else {
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
                            JOptionPane.showMessageDialog(null, "Se registro correctamente la cuenta " + usuario.toUpperCase() + "\nAl Empleado " + nom.toUpperCase());
                            limpiar();
                            limpiarComboBox();
                        }
                    }
                } else if (contrasena.length() < 6) {
                    JOptionPane.showMessageDialog(null, "La contraseña debe tener una longitud mayor a 6 caracteres", "MECAUT", JOptionPane.WARNING_MESSAGE);
                } else if (jifCuentas.jcbTipoCuenta.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Ingrese el tipo de cuenta", "MECAUT", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden...", "MECAUT", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        jifCuentas.jcbTipoCuenta.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String dato = (jifCuentas.jcbTipoCuenta.getSelectedItem() != null) ? jifCuentas.jcbTipoCuenta.getSelectedItem().toString() : "";
                switch (dato) {
                    case "administrador":
                        jifCuentas.jTabbedPane1.setSelectedIndex(1);
                        jifCuentas.jTabbedPane1.setEnabledAt(0, false);
                        jifCuentas.jTabbedPane1.setEnabledAt(1, true);
                        jifCuentas.jcbTipo.setSelectedIndex(2);
                        break;
                    case "empleado":
                        jifCuentas.jTabbedPane1.setSelectedIndex(1);
                        jifCuentas.jcbTipo.setSelectedIndex(1);
                        jifCuentas.jTabbedPane1.setEnabledAt(0, false);
                        jifCuentas.jTabbedPane1.setEnabledAt(1, true);
                        break;
                    default:
                        jifCuentas.jTabbedPane1.setSelectedIndex(0);
                        jifCuentas.jTabbedPane1.setEnabledAt(1, false);
                        jifCuentas.jTabbedPane1.setEnabledAt(0, true);
                        break;
                }
            }
        });

        jifCuentas.show();
        locacionfrm(jifCuentas);
    }

    protected void frmGrupoClientes() {

        jifGrupoClientes = new jifGrupoClientes();
        form.jDesktopPane1.add(jifGrupoClientes);

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
                    evtVerGrupoClientes(nom);
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

        int[] a = {30, 50, 60, 40};
        setColumnWidths(a, jifGrupoClientes.jtGrupoClientes);

        jifGrupoClientes.show();
        locacionfrm(jifGrupoClientes);
    }

    protected void evtVerGrupoClientes(String tipo) {
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

    protected void frmRegistrarAuto(String id, final String usuario) {

        jifAuto = new jifRegistrarAuto();

        if ("Administrador".equals(usuario)) {
            form.jDesktopPane1.add(jifAuto);
        } else {
            frmEmpleado.jDesktopPane1.add(jifAuto);
        }

        if ("".equals(id)) {
            limpiar();
            limpiarComboBox();

        } else {
            limpiar();
            limpiarComboBox();
            jifAuto.jtfId.setText(id);
            evtDatosAuto(id);
        }

        jifAuto.jtfId.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                evtDatosAuto("");
            }
        });

        jifAuto.jtfId.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                evtDatosAuto("");
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
                String idCliente = jifAuto.jtfId.getText();
                String nombreCliente = jifAuto.jtfNombreCliente.getText();
                try {
                    Auto aut = new Auto(placa, ciudad, tipo, modelo, marca, kilometraje, combustible, idCliente, nombreCliente);
                    if (Gestor.agregarAuto(aut)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del auto almacenados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                        limpiarComboBox();
                        jifAuto.jbtRegistrar.setEnabled(false);
                        if ("Empleado".equals(usuario)) {
                            jifAuto.hide();
                            frmListaClientes(usuario);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos del auto!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        TextAutoCompleter t = new TextAutoCompleter(jifAuto.jtfId);
        ResultSet ids = Gestor.IdsClientes();
        try {
            while (ids.next()) {
                t.addItem(ids.getString("cli_id"));
            }
        } catch (Exception e) {
        }
        jifAuto.show();
        locacionfrm(jifAuto);
    }

    protected void evtDatosAuto(String ide) {
        if ("".equals(ide)) {
            String id = jifAuto.jtfId.getText();
            ResultSet r = Gestor.consultarDatosAuto(id);
            try {
                while (r.next()) {
                    jifAuto.jtfNombreCliente.setText(r.getString(2));
                }
            } catch (SQLException e) {
            }

            jifAuto.jbtRegistrar.setEnabled(true);
        } else {
            ResultSet r = Gestor.consultarDatosAuto(ide);
            try {
                while (r.next()) {
                    jifAuto.jtfNombreCliente.setText(r.getString(2));
                }
            } catch (SQLException e) {
            }
            jifAuto.jbtRegistrar.setEnabled(true);
        }
    }

    protected void evtConsultarClienteporId(String ide) {
        try {
            if ("".equals(ide)) {
                ResultSet r;
                String id = jifActualizarCliente.jtfIdentificacion.getText();
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
            } else {
                ResultSet r;
                jifActualizarCliente.jtfIdentificacion.setText(ide);
                r = Gestor.TraerDatosCliente(ide);
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
        } catch (HeadlessException | SQLException e) {
        }
    }

    protected void frmListaAutos(String usuario) {

        jifListaAutos = new jifListaAutos();

        if ("Administrador".equals(usuario)) {
            form.jDesktopPane1.add(jifListaAutos);
        } else {
            frmEmpleado.jDesktopPane1.add(jifListaAutos);
        }

        ArrayList<Auto> autos = Gestor.verAutos();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Placa");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Tipo");
        modelo.addColumn("Modelo");
        modelo.addColumn("Marca");
        modelo.addColumn("Id cliente");
        modelo.addColumn("Nombre cliente");
        for (Auto auto : autos) {
            Object[] fila = new Object[7];
            fila[0] = auto.getPlaca();
            fila[1] = auto.getCiudad();
            fila[2] = auto.getTipo();
            fila[3] = auto.getModelo();
            fila[4] = auto.getMarca();
            fila[5] = auto.getIdCliente();
            fila[6] = auto.getNombreCliente();
            modelo.addRow(fila);
        }
        jifListaAutos.jtListaAutos.setModel(modelo);

        int[] ancho = {30, 50, 40, 25, 35, 50, 70};
        setColumnWidths(ancho, jifListaAutos.jtListaAutos);

        jifListaAutos.lbRegistros.setText("" + (jifListaAutos.jtListaAutos.getRowCount()));
        jifListaAutos.show();
        locacionfrm(jifListaAutos);
    }

    protected void frmRegistrarAutoCliente() {

        jifRegistroAuto = new jifRegistroAuto();
        frmCliente.jDesktopPane1.add(jifRegistroAuto);

        jifRegistroAuto.jbtRegistrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String[] datos = frmCliente.user.getToolTipText().split(" ");
                String cli_nombre = "";
                ResultSet r = Gestor.TraerDatosCliente(datos[1]);
                try {
                    while (r.next()) {
                        cli_nombre = r.getString("cli_nombre");
                    }
                } catch (Exception ex) {
                }
                String placa = jifRegistroAuto.jtfPlaca.getText();
                String ciudad = jifRegistroAuto.jcbCiudad.getSelectedItem().toString();
                String tipo = jifRegistroAuto.jcbTipo.getSelectedItem().toString();
                String modelo = jifRegistroAuto.jcbModelo.getSelectedItem().toString();
                String marca = jifRegistroAuto.jcbMarca.getSelectedItem().toString();
                String kilometraje = jifRegistroAuto.jtfKilometraje.getText();
                String combustible = jifRegistroAuto.jtfCombustible.getText();

                Auto auto = new Auto(placa, ciudad, tipo, modelo, marca, kilometraje, combustible, datos[1], cli_nombre);
                if (Gestor.agregarAuto(auto)) {
                    JOptionPane.showMessageDialog(null, "Se registro el auto correctamente", "MECAUT", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    limpiarComboBox();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo registrar el auto", "MECAUT", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        jifRegistroAuto.jbtRegistrar1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                limpiarComboBox();
            }
        });

        jifRegistroAuto.show();
    }
    
}
