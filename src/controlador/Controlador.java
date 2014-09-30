/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
//Hello World!
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Auto;
import modelo.Cliente;
import modelo.Conexion;
import modelo.Cuenta;
import modelo.GestorCliente;
import modelo.GestorAuto;
import modelo.GestorMecanico;
import modelo.GestorProveedor;
import modelo.GestorRepuesto;
import modelo.Mantenimiento;
import modelo.Mecanico;
import modelo.Proveedor;
import modelo.Repuesto;
import modelo.gestorMantenimiento;
import vista.FRM_Registro;
import vista.Formulario;
import vista.jifActualizarCliente;
import vista.jifAuto;
import vista.jifCliente;
import vista.jifActualizarMantenimiento;
import vista.jifActualizarMecanico;
import vista.jifActualizarProveedor;
import vista.jifListaAutos;
import vista.jifListaClientes;
import vista.jifListaMantenimientos;
import vista.jifListaMecanicos;
import vista.jifListaProveedores;
import vista.jifListaRepuestos;
import vista.jifMecanico;
import vista.jifProveedor;
import vista.jifRepuesto;
import vista.jifMantenimiento;

/**
 *
 * @author sena
 */
public class Controlador {

    private GestorCliente GestorCliente;
    private GestorAuto GestorAuto;
    private GestorProveedor GestorProveedor;
    private GestorMecanico GestorMecanico;
    private GestorRepuesto GestorRepuesto;
    private gestorMantenimiento gestorMantenimiento;
    private Formulario form;
    private jifCliente jifCliente;
    private jifActualizarCliente jifActualizarCliente;
    private jifMantenimiento jifMantenimiento;
    private jifListaClientes jifListaClientes;
    private jifListaAutos jifListaAutos;
    private jifListaRepuestos jifListaRepuestos;
    private jifListaMecanicos jifListaMecanicos;
    private jifListaProveedores jifListaProveedores;
    private jifActualizarProveedor jifActualizarProveedor;
    private jifAuto jifAuto;
    private jifProveedor jifProveedor;
    private jifMecanico jifMecanico;
    private jifActualizarMecanico jifActualizarMecanico;
    private jifRepuesto jifRepuesto;
    private jifListaMantenimientos jifListaMantenimientos;
    private jifActualizarMantenimiento jifActualizarMantenimiento;
    private FRM_Registro fRegistro;

    /* CONSTRUCTOR */
    public Controlador() {
        fRegistro = new FRM_Registro();
        GestorCliente = new GestorCliente();
        GestorAuto = new GestorAuto();
        GestorProveedor = new GestorProveedor();
        GestorMecanico = new GestorMecanico();
        GestorRepuesto = new GestorRepuesto();
        gestorMantenimiento = new gestorMantenimiento();
        form = new Formulario();
        jifCliente = new jifCliente();
        jifActualizarCliente = new jifActualizarCliente();
        jifMantenimiento = new jifMantenimiento();
        jifListaClientes = new jifListaClientes();
        jifListaAutos = new jifListaAutos();
        jifListaRepuestos = new jifListaRepuestos();
        jifListaMecanicos = new jifListaMecanicos();
        jifActualizarMecanico = new jifActualizarMecanico();
        jifListaProveedores = new jifListaProveedores();
        jifActualizarProveedor = new jifActualizarProveedor();
        jifListaMantenimientos = new jifListaMantenimientos();
        jifActualizarMantenimiento = new jifActualizarMantenimiento();
        jifAuto = new jifAuto();
        jifProveedor = new jifProveedor();
        jifMecanico = new jifMecanico();
        jifRepuesto = new jifRepuesto();
        form.jDesktopPane1.add(jifMantenimiento);
        form.jDesktopPane1.add(jifCliente);
        form.jDesktopPane1.add(jifActualizarCliente);
        form.jDesktopPane1.add(jifListaClientes);
        form.jDesktopPane1.add(jifListaAutos);
        form.jDesktopPane1.add(jifListaRepuestos);
        form.jDesktopPane1.add(jifListaMecanicos);
        form.jDesktopPane1.add(jifListaProveedores);
        form.jDesktopPane1.add(jifAuto);
        form.jDesktopPane1.add(jifProveedor);
        form.jDesktopPane1.add(jifMecanico);
        form.jDesktopPane1.add(jifActualizarMecanico);
        form.jDesktopPane1.add(jifRepuesto);
        form.jDesktopPane1.add(jifListaMantenimientos);
        form.jDesktopPane1.add(jifActualizarMantenimiento);
        form.jDesktopPane1.add(jifActualizarProveedor);
    }
    /* INICIO LOGGIN */

    public void lanzarLogin() {
        /* Boton para iniciar sesión */
        form.jbtAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String usuario = form.jtfUsuario.getText();
                    String contrasena = form.jtfContraseña.getText();
                    Cuenta cuenta = new Cuenta(usuario, contrasena);
                    boolean r = GestorCliente.validarUsuario(cuenta);

                    if (r) {
                        form.Login.setVisible(false);
                        lanzarFormularioAdministrador();
                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario o la contraseña no son correctas...\nVerifique los Datos.", "Loggin - MECAUT", 1);
                        form.jtfContraseña.setText("");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Error -- MECAUT", 1);
                }
            }
        });
//        /* Boton para abrir el formulario de registro de cuentas */
//        form.jbtRegistrarse.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                form.Login.hide();
//                fRegistro.setVisible(true);
//                fRegistro.txt_usuario.setText("");
//                fRegistro.txt_contrasena.setText("");
//                fRegistro.txt_confContrasena.setText("");
//                // boton para volver al loggin
//                fRegistro.btn_volver.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        fRegistro.hide();
//                        form.Login.setVisible(true);
//                        form.jtfUsuario.setText("");
//                        form.jtfContraseña.setText("");
//                    }
//                });
//// boton para registrarse
//                fRegistro.btn_registrarse.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        String usuario = fRegistro.txt_usuario.getText();
//                        String contrasena = fRegistro.txt_contrasena.getText();
//                        String confContrasena = fRegistro.txt_confContrasena.getText();
//
//                        if (usuario.equals("") && contrasena.equals("") && confContrasena.equals("")) {
//                            JOptionPane.showMessageDialog(null, "Error");
//                        } else {
//                            if (contrasena.length() < 1 && confContrasena.length() < 1) {
//                                JOptionPane.showMessageDialog(null, "las contraseñas no pueden ir vacías");
//                            } else if (contrasena.equals(confContrasena)) {
//                                Cuenta c = new Cuenta(usuario, contrasena);
//                                if (GestorCliente.registrarUsuario(c)) {
//                                    JOptionPane.showMessageDialog(null, "La cuenta se registro Satisfactoriamente...");
//                                    fRegistro.hide();
//                                    form.Login.setVisible(true);
//                                    form.jtfUsuario.setText(usuario);
//                                } else {
//                                    JOptionPane.showMessageDialog(null, "No se pudo crear la cuenta...");
//                                }
//                            } else {
//                                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden...");
//                            }
//                        }
//                    }
//                });
//            }
//        });
        /* Boton para cerrar el programa */
        form.jbtSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        form.Login.setSize(400, 500);
        form.Login.setVisible(true);
        form.Login.setBounds(500, 150, 400, 500);
    }

    /* Formulario Administrador */
    public void lanzarFormularioAdministrador() {
        /* MenuBar acciones de los eventos */
        /* MENU - CLIENTES */
        form.jmiCliente.addActionListener(new ActionListener() {
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
                frmActualizarMecanico();
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

        form.jmiAuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarAuto();
            }
        });

        form.jmiProveedor.addActionListener(new ActionListener() {
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

        form.jmiMecanico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarMecanico();
            }
        });

        form.jmiRepuestos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarRepuestos();
            }
        });

        form.jmiMantenimiento.addActionListener(new ActionListener() {
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
                form.jtfUsuario.setText("");
                form.jtfContraseña.setText("");
                form.Login.setVisible(true);
            }
        });

        form.setVisible(true);
    }
    /* --------------------------- FIN ACCIONES FORMULARIOS ------------------------------------ */
    /* ----------------------------------------------------------------------------------------- */
    /* --------------------------- EVENTOS FORMULARIOS ------------------------------------ */

    public void frmRegistrarCliente() {
        limpiar();
        // boton para registrar un cliente
        jifCliente.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String identificacion = (jifCliente.jtfIdentificacion.getText());
                    String nombre = jifCliente.jtfNombre.getText();
                    String apellidos = jifCliente.jtfApellidos.getText();
                    String telefono = (jifCliente.jtfTelefono.getText());
                    String direccion = jifCliente.jtfDireccion.getText();
                    if (identificacion.isEmpty() || nombre.isEmpty() || apellidos.isEmpty() || direccion.isEmpty()) {
                        //JOptionPane.showMessageDialog(null, "Complete todos los campos", "MECAUT", 1);
                    } else {
                        Cliente cli = new Cliente(identificacion, nombre, apellidos, telefono, direccion);
                        if (GestorCliente.agregarCliente(cli)) {
                            JOptionPane.showMessageDialog(null, "¡Datos del cliente almacenados!");
                            limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos del cliente " + nombre + "", "MECAUT - Registro Clientes", 2);
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ingrese solo numeros en los campos...", "MECAUT", 1);
                }
            }
        });
        jifCliente.setVisible(true);
    }

    public void frmActualizarCliente() {
        //limpiar();
        jifActualizarCliente.jbtEliminar.setEnabled(false);
        jifActualizarCliente.jbtModificar.setEnabled(false);
        ArrayList<Cliente> clientes = GestorCliente.consultarClientes();
        jifActualizarCliente.jcbId.removeAllItems();
        jifActualizarCliente.jcbId.addItem("Seleccione Id");

        for (Cliente cliente : clientes) {
            jifActualizarCliente.jcbId.addItem(cliente);
        }

        jifActualizarCliente.jbtConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    Cliente cliente;
                    if (jifActualizarCliente.jcbId.getSelectedIndex() != 0) {
                        cliente = (Cliente) jifActualizarCliente.jcbId.getSelectedItem();
                        jifActualizarCliente.jtfNombre.setText(cliente.getNombre());
                        jifActualizarCliente.jtfApellidos.setText(cliente.getApellidos());
                        jifActualizarCliente.jtfTelefono.setText(cliente.getTelefono());
                        jifActualizarCliente.jtfDireccion.setText(cliente.getDireccion());
                        jifActualizarCliente.jbtEliminar.setEnabled(true);
                        jifActualizarCliente.jbtModificar.setEnabled(true);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "" + e.getMessage(), "MECAUT", 2);
                }
            }
        });

        jifActualizarCliente.jbtModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String identificacion = jifActualizarCliente.jcbId.getSelectedItem().toString();
                    String nombre = jifActualizarCliente.jtfNombre.getText();
                    String apellidos = jifActualizarCliente.jtfApellidos.getText();
                    String telefono = jifActualizarCliente.jtfTelefono.getText();
                    String direccion = jifActualizarCliente.jtfDireccion.getText();
                    Cliente cli = new Cliente(identificacion, nombre, apellidos, telefono, direccion);
                    if (GestorCliente.modificarCliente(cli)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del cliente " + nombre + " modificados!");
                        jifActualizarCliente.jcbId.setSelectedIndex(0);
                        limpiar();
                        jifActualizarCliente.jbtEliminar.setEnabled(false);
                        jifActualizarCliente.jbtModificar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron modificar los del cliente " + nombre + "!");
                    }
                } catch (HeadlessException re) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + re.getMessage(), "Error -- MECAUT", 1);
                }
            }
        });

        jifActualizarCliente.jbtEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = jifActualizarCliente.jtfNombre.getText();
                    int rs = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar el cliente " + nombre + "?", "Eliminar CLIENTE", JOptionPane.YES_NO_OPTION);
                    if (rs == JOptionPane.YES_OPTION) {
                        String identificacion = jifActualizarCliente.jcbId.getSelectedItem().toString();
                        if (GestorCliente.eliminarCliente(identificacion)) {
                            JOptionPane.showMessageDialog(null, "¡Datos del cliente " + nombre + " eliminados!");
                            jifActualizarCliente.jcbId.setSelectedIndex(0);
                            limpiar();
                            jifActualizarCliente.jbtEliminar.setEnabled(false);
                            jifActualizarCliente.jbtModificar.setEnabled(false);
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron eliminar los datos del cliente " + nombre + "");
                        }
                    }
                } catch (HeadlessException se) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + se.getMessage(), "Error -- MECAUT", 1);
                }
            }
        });
        jifActualizarCliente.setVisible(true);
    }

    public void frmRegistrarAuto() {
        limpiar();
        jifAuto.jtfNombreCliente.setEnabled(false);
        jifAuto.jtfApellidosCliente.setEnabled(false);
        jifAuto.jbtRegistrar.setEnabled(false);
        ArrayList<Cliente> clientes = GestorAuto.consultarClientes();
        jifAuto.jcbIdCliente.removeAllItems();
        jifAuto.jcbIdCliente.addItem("Seleccione Id");
        for (Cliente cliente : clientes) {
            jifAuto.jcbIdCliente.addItem(cliente);
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
                    if (GestorAuto.agregarAuto(aut)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del auto almacenados!");
                        jifAuto.jcbCiudad.setSelectedIndex(0);
                        jifAuto.jcbIdCliente.setSelectedIndex(0);
                        jifAuto.jcbMarca.setSelectedIndex(0);
                        jifAuto.jcbModelo.setSelectedIndex(0);
                        limpiar();
                        jifAuto.jbtRegistrar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos!");
                    }
                } catch (NumberFormatException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Error -- MECAUT", 1);
                }
            }
        });
        jifAuto.setVisible(true);
    }

    public void frmRegistrarMantenimientos() {
        limpiar();
        ArrayList<Auto> autos = gestorMantenimiento.consultarAutos();
        jifMantenimiento.jcbPlaca.removeAllItems();
        jifMantenimiento.jcbPlaca.addItem("Seleccione Nit");
        for (Auto auto : autos) {
            jifMantenimiento.jcbPlaca.addItem(auto);
        }
        ArrayList<Mecanico> mecanicos = gestorMantenimiento.consultarMecanicos();
        jifMantenimiento.jcbIdentificacion.removeAllItems();
        jifMantenimiento.jcbIdentificacion.addItem("seleccione Id");
        for (Mecanico mecanico : mecanicos) {
            jifMantenimiento.jcbIdentificacion.addItem(mecanico);
        }
        jifMantenimiento.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    java.util.Date fecha = jifMantenimiento.jdcFecha.getDate();
                    java.sql.Date fechaa = new java.sql.Date(fecha.getTime());
                    String tipo = jifMantenimiento.jcbTipo.getSelectedItem().toString();
                    String descripcion = jifMantenimiento.jtaDescripcion.getText();
                    String costo = (jifMantenimiento.jtfCosto.getText());
                    String placa = jifMantenimiento.jcbPlaca.getSelectedItem().toString();
                    String idMecanico = (jifMantenimiento.jcbIdentificacion.getSelectedItem().toString());
                    Mantenimiento man = new Mantenimiento(tipo, fechaa, descripcion, costo, placa, idMecanico);
                    if (gestorMantenimiento.agregarMantenimiento(man)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del mantenimiento almacenados!");
                        limpiar();
                        jifMantenimiento.jcbTipo.setSelectedIndex(0);
                        jifMantenimiento.jcbPlaca.setSelectedIndex(0);
                        jifMantenimiento.jcbIdentificacion.setSelectedIndex(0);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos!");
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Error -- MECAUT", 1);
                }
            }
        });
        jifMantenimiento.setVisible(true);
    }

    public void frmActualizarMecanico() {
        jifActualizarMecanico.jbtEliminar.setEnabled(false);
        jifActualizarMecanico.jbtModificar.setEnabled(false);
        ArrayList<Mecanico> mecanicos = GestorMecanico.consultarMecanicos();
        jifActualizarMecanico.jcbId.removeAllItems();
        jifActualizarMecanico.jcbId.addItem("seleccione Id");
        for (Mecanico mecanico : mecanicos) {
            jifActualizarMecanico.jcbId.addItem(mecanico);
        }

        jifActualizarMecanico.jbtConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Mecanico mecanico;
                if (jifActualizarMecanico.jcbId.getSelectedIndex() != 0) {
                    mecanico = (Mecanico) jifActualizarMecanico.jcbId.getSelectedItem();
                    jifActualizarMecanico.jtfNombre.setText(mecanico.getNombre());
                    jifActualizarMecanico.jtfApellidos.setText(mecanico.getApellidos());
                    jifActualizarMecanico.jtfTelefono.setText("" + mecanico.getTelefono());
                    jifActualizarMecanico.jtfDireccion.setText(mecanico.getDireccion());
                    jifActualizarMecanico.jtfSalario.setText("" + mecanico.getSalario());
                    jifActualizarMecanico.jbtEliminar.setEnabled(true);
                    jifActualizarMecanico.jbtModificar.setEnabled(true);
                }
            }
        });

        jifActualizarMecanico.jbtEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    int rs = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar este proveedor?", "Eliminar PROVEEDOR", JOptionPane.YES_NO_OPTION);
                    if (rs == JOptionPane.YES_OPTION) {
                        int id = Integer.parseInt(jifActualizarMecanico.jcbId.getSelectedItem().toString());
                        if (GestorMecanico.eliminarMecanico(id)) {
                            JOptionPane.showMessageDialog(null, "¡Datos del mecanico eliminados!");
                            limpiar();
                            jifActualizarMecanico.jcbId.setSelectedIndex(0);
                            jifActualizarMecanico.jbtEliminar.setEnabled(false);
                            jifActualizarMecanico.jbtModificar.setEnabled(false);
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron eliminar los datos!");
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Error -- MECAUT", 1);
                }
            }
        });

        jifActualizarMecanico.jbtModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String identificacion = jifActualizarMecanico.jcbId.getSelectedItem().toString();
                    String nombre = jifActualizarMecanico.jtfNombre.getText();
                    String apellidos = jifActualizarMecanico.jtfApellidos.getText();
                    String telefono = jifActualizarMecanico.jtfTelefono.getText();
                    String direccion = jifActualizarMecanico.jtfDireccion.getText();
                    String salario = jifActualizarMecanico.jtfSalario.getText();
                    Mecanico mec = new Mecanico(identificacion, nombre, apellidos, telefono, direccion, salario);
                    if (GestorMecanico.modificarMecanico(mec)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del mecánico modificados!");
                        limpiar();
                        jifActualizarMecanico.jcbId.setSelectedIndex(0);
                        jifActualizarMecanico.jbtEliminar.setEnabled(false);
                        jifActualizarMecanico.jbtModificar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron modificar los datos!");
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Error -- MECAUT", 1);
                }
            }
        });

        jifActualizarMecanico.setVisible(true);
    }

    public void frmActualizarMantenimiento() {
        try {
            limpiar();
            jifActualizarMantenimiento.jtfPlaca.setEnabled(false);
            jifActualizarMantenimiento.jtfIdMecanico.setEnabled(false);
            jifActualizarMantenimiento.jbtEliminar.setEnabled(false);
            jifActualizarMantenimiento.jbtModificar.setEnabled(false);

            jifActualizarMantenimiento.jcbCodigoMantenimiento.removeAllItems();
            ArrayList<Mantenimiento> mantenimientos = gestorMantenimiento.consultarManteniminetos();
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
                        if (gestorMantenimiento.eliminarMantenimiento(man)) {
                            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
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

                    if (gestorMantenimiento.actualizarMantenimiento(m)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del mantenimiento actualizados!");
                        jifActualizarMantenimiento.jcbCodigoMantenimiento.setSelectedIndex(0);
                        jifActualizarMantenimiento.jcbCodigoMantenimiento.setSelectedIndex(0);
                        limpiar();
                        jifActualizarMantenimiento.jbtEliminar.setEnabled(false);
                        jifActualizarMantenimiento.jbtModificar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron actualizar los datos!");
                    }
                    jifActualizarMantenimiento.jcbCodigoMantenimiento.setSelectedIndex(0);

                }
            });
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Error -- MECAUT", 1);
        }
        jifActualizarMantenimiento.setVisible(true);
    }

    public void frmRegistrarProveedor() {
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
                    if (GestorProveedor.agregarProveedor(prov)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del proveedor almacenados!");
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos!");
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Error -- MECAUT", 1);
                }

            }
        });
        jifProveedor.setVisible(true);
    }

    public void frmActualizarProveedor() {
        limpiar();
        jifActualizarProveedor.jbtEliminar.setEnabled(false);
        jifActualizarProveedor.jbtModificar.setEnabled(false);
        ArrayList<Proveedor> proveedores = GestorProveedor.consultarProveedores();
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
                    if (GestorProveedor.modificarProveedor(pro)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del proveedor modificados!");
                        jifActualizarProveedor.jcbNit.setSelectedIndex(0);
                        limpiar();
                        jifActualizarProveedor.jbtEliminar.setEnabled(false);
                        jifActualizarProveedor.jbtModificar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron modificar los datos!");
                    }
                } catch (HeadlessException | NumberFormatException errr) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + errr.getMessage(), "Error -- MECAUT", 1);
                }
            }
        });
        jifActualizarProveedor.jbtEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int rs = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar este proveedor?", "Eliminar PROVEEDOR", JOptionPane.YES_NO_OPTION);
                    if (rs == JOptionPane.YES_OPTION) {
                        int nit = Integer.parseInt(jifActualizarProveedor.jcbNit.getSelectedItem().toString());
                        if (GestorProveedor.eliminarProveedor(nit)) {
                            JOptionPane.showMessageDialog(null, "¡Datos del proveedor eliminados!");
                            jifActualizarProveedor.jcbNit.setSelectedIndex(0);
                            limpiar();
                            jifActualizarProveedor.jbtEliminar.setEnabled(false);
                            jifActualizarProveedor.jbtModificar.setEnabled(false);
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron eliminar los datos!");
                        }
                    }
                } catch (HeadlessException | NumberFormatException err) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + err.getMessage(), "Error -- MECAUT", 1);
                }
            }
        });
        jifActualizarProveedor.setVisible(true);
    }

    public void frmRegistrarMecanico() {
        jifMecanico.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String identificacion = jifMecanico.jtfIdentificacion.getText();
                    String nombre = jifMecanico.jtfNombre.getText();
                    String apellidos = jifMecanico.jtfApellidos.getText();
                    String telefono = jifMecanico.jtfTelefono.getText();
                    String direccion = jifMecanico.jtfDireccion.getText();
                    String salario = jifMecanico.jtfSalario.getText();

                    Mecanico mec = new Mecanico(identificacion, nombre, apellidos, telefono, direccion, salario);
                    if (GestorMecanico.agregarMecanico(mec)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del mecánico almacenados!");
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos!");
                    }
                } catch (NumberFormatException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Error -- MECAUT", 1);
                }
            }
        });
        jifMecanico.setVisible(true);
    }

    public void frmRegistrarRepuestos() {
        jifRepuesto.jbtRegistrar.setEnabled(false);
        jifRepuesto.jtfNomProveedor.setEnabled(false);
        ArrayList<Proveedor> proveedores = GestorRepuesto.consultarProveedores();
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
                    if (GestorRepuesto.agregarRepuesto(rep)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del repuesto almacenados!");
                        limpiar();
                        jifRepuesto.jcbTipo.setSelectedIndex(0);
                        jifRepuesto.jcbNitProveedor.setSelectedIndex(0);
                        jifRepuesto.jbtRegistrar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos!");
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Error -- MECAUT", 1);
                }
            }
        });
        jifRepuesto.setVisible(true);
    }

    public void frmListaClientes() {
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

    public void frmListaAutos() {
        ArrayList<Auto> autos = GestorAuto.verAutos();
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

    public void frmListaRepuestos() {
        ArrayList<Repuesto> repuestos = GestorRepuesto.verRepuestos();
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

    public void frmListaMecanicos() {
        evtMostrarMecanicos();
        jifListaMecanicos.jtfDato.addKeyListener(new KeyListener() {
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
        jifListaMecanicos.setVisible(true);
    }

    public void frmListaProveedores() {
        ArrayList<Proveedor> proveedores = GestorProveedor.verProveedor();
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

    public void frmListaMantenimientos() {
        ArrayList<Mantenimiento> mantenimientos = gestorMantenimiento.verMantenimientos();
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
    public void limpiar() {
        jifCliente.jtfNombre.setText(null);
        jifCliente.jtfApellidos.setText(null);
        jifCliente.jtfDireccion.setText(null);
        jifCliente.jtfTelefono.setText(null);
        jifCliente.jtfIdentificacion.setText(null);
        jifActualizarCliente.jtfNombre.setText(null);
        jifActualizarCliente.jtfApellidos.setText(null);
        jifActualizarCliente.jtfTelefono.setText(null);
        jifActualizarCliente.jtfDireccion.setText(null);
        jifAuto.jtfPlaca.setText(null);
        jifAuto.jtfNombreCliente.setText(null);
        jifAuto.jtfApellidosCliente.setText(null);
        jifAuto.jbtRegistrar.setEnabled(false);
        jifMantenimiento.jtaDescripcion.setText(null);
        jifMantenimiento.jtfCosto.setText(null);
        jifMecanico.jtfIdentificacion.setText("");
        jifMecanico.jtfNombre.setText("");
        jifMecanico.jtfApellidos.setText("");
        jifMecanico.jtfTelefono.setText("");
        jifMecanico.jtfDireccion.setText("");
        jifMecanico.jtfSalario.setText("");
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
        jifActualizarMecanico.jtfNombre.setText("");
        jifActualizarMecanico.jtfApellidos.setText("");
        jifActualizarMecanico.jtfTelefono.setText("");
        jifActualizarMecanico.jtfDireccion.setText("");
        jifActualizarMecanico.jtfSalario.setText("");
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

    public void evtMostrarClientes() {
        String dato = jifListaClientes.jtfDato.getText();
        ArrayList<Cliente> clientes = GestorCliente.verClientesPorDato(dato);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Identificación");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");
        for (Cliente cliente : clientes) {
            Object[] fila = new Object[5];
            fila[0] = cliente.getIdentificacion();
            fila[1] = cliente.getNombre();
            fila[2] = cliente.getApellidos();
            fila[3] = cliente.getTelefono();
            fila[4] = cliente.getDireccion();
            modelo.addRow(fila);
        }
        jifListaClientes.jtListaClientes.setModel(modelo);
    }

    public void evtMostrarMecanicos() {
        String dato = jifListaMecanicos.jtfDato.getText();
        ArrayList<Mecanico> mecanicos = GestorMecanico.verMecanicosPorDato(dato);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");
        modelo.addColumn("Salario");
        for (Mecanico mecanico : mecanicos) {
            Object[] fila = new Object[6];
            fila[0] = mecanico.getIdentificacion();
            fila[1] = mecanico.getNombre();
            fila[2] = mecanico.getApellidos();
            fila[3] = mecanico.getTelefono();
            fila[4] = mecanico.getDireccion();
            fila[5] = mecanico.getSalario();
            modelo.addRow(fila);
        }
        jifListaMecanicos.jtListaMecanicos.setModel(modelo);
    }
}
