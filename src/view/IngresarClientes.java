/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 17 / mayo / 23
* Fecha de modificación: 11 / junio / 23
* Descripción: Se creó el Frame para ingresar clientes.
 */
package view;

import entity.Cliente;
import javax.swing.table.DefaultTableModel;
import controller.*;
import java.awt.Component;
import java.awt.Frame;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class IngresarClientes extends javax.swing.JDialog {

    private final ClienteController controlador = new ClienteController();
    private CuentaController cuentaController = new CuentaController();
    private Cliente cliente;
    private final Frame owner;

    private final DefaultTableModel modeloClientes;
    private String rfcActual;
    private final DefaultTableModel modeloCuentas;

    /**
     * Se inicializó el método cliente
     *
     * @param owner
     * @param modal
     */
    public IngresarClientes(Frame owner, boolean modal) {
        super(owner, modal);
        initComponents();
        modeloClientes = (DefaultTableModel) tablaClientes.getModel();
        modeloCuentas = (DefaultTableModel) tablaDeCuentas.getModel();
        mostrarDatosClienteTabla();
        nuevoCliente();
        this.owner = owner;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCliente = new javax.swing.JPanel();
        BotonRegresar = new javax.swing.JButton();
        cargarImagenUsuario = new javax.swing.JButton();
        fotoUsuario = new javax.swing.JLabel();
        guardarCliente = new javax.swing.JButton();
        eliminarCliente = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        panelDatosClientes = new javax.swing.JPanel();
        panelScrollClientes = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        rfc = new javax.swing.JLabel();
        ingresarRFC = new javax.swing.JTextField();
        nombreCliente = new javax.swing.JLabel();
        ingresarNombre = new javax.swing.JTextField();
        direccionCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDeCuentas = new javax.swing.JTable();
        ingresarDireccion = new javax.swing.JTextField();
        telefonoCliente = new javax.swing.JLabel();
        agregarCuenta = new javax.swing.JButton();
        ingresarTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelCliente.setBackground(new java.awt.Color(4, 92, 76));
        panelCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonRegresar.setBackground(new java.awt.Color(4, 92, 76));
        BotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Regresar.png"))); // NOI18N
        BotonRegresar.setBorder(null);
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
        });
        panelCliente.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 9, -1, 28));

        cargarImagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CargarFotoUsuario.png"))); // NOI18N
        cargarImagenUsuario.setToolTipText("Cambiar foto");
        cargarImagenUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargarImagenUsuarioMouseClicked(evt);
            }
        });
        panelCliente.add(cargarImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 40, 40));

        fotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AvatarHombre.png"))); // NOI18N
        panelCliente.add(fotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 55, -1, -1));

        guardarCliente.setBackground(new java.awt.Color(4, 92, 76));
        guardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonCaféGuardar.png"))); // NOI18N
        guardarCliente.setBorder(null);
        guardarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarClienteMouseClicked(evt);
            }
        });
        panelCliente.add(guardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 344, -1, -1));

        eliminarCliente.setBackground(new java.awt.Color(4, 92, 76));
        eliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonCaféEliminar.png"))); // NOI18N
        eliminarCliente.setBorder(null);
        eliminarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarClienteMouseClicked(evt);
            }
        });
        panelCliente.add(eliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 411, -1, -1));

        botonActualizar.setBackground(new java.awt.Color(4, 92, 76));
        botonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonCaféActualizar.png"))); // NOI18N
        botonActualizar.setBorder(null);
        botonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonActualizarMouseClicked(evt);
            }
        });
        panelCliente.add(botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 487, -1, 33));

        panelDatosClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del cliente.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        tablaClientes.setBackground(new java.awt.Color(243, 237, 221));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RFC", "Nombre", "Teléfono"
            }
        ));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        panelScrollClientes.setViewportView(tablaClientes);

        rfc.setBackground(new java.awt.Color(244, 145, 30));
        rfc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RFC.png"))); // NOI18N

        nombreCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nombre.png"))); // NOI18N

        direccionCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Direccion.png"))); // NOI18N

        tablaDeCuentas.setBackground(new java.awt.Color(243, 237, 221));
        tablaDeCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de cuenta", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDeCuentas);

        telefonoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Telefono.png"))); // NOI18N

        agregarCuenta.setBackground(new java.awt.Color(243, 237, 221));
        agregarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Agregar.png"))); // NOI18N
        agregarCuenta.setBorder(null);
        agregarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarCuentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelDatosClientesLayout = new javax.swing.GroupLayout(panelDatosClientes);
        panelDatosClientes.setLayout(panelDatosClientesLayout);
        panelDatosClientesLayout.setHorizontalGroup(
            panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelScrollClientes)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelDatosClientesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(agregarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDatosClientesLayout.createSequentialGroup()
                                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreCliente)
                                    .addComponent(rfc))
                                .addGap(18, 18, 18)
                                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ingresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingresarRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(51, 51, 51)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direccionCliente)
                    .addComponent(telefonoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingresarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        panelDatosClientesLayout.setVerticalGroup(
            panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosClientesLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosClientesLayout.createSequentialGroup()
                        .addComponent(direccionCliente)
                        .addGap(33, 33, 33)
                        .addComponent(telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosClientesLayout.createSequentialGroup()
                        .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ingresarRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rfc))
                        .addGap(33, 33, 33)
                        .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreCliente)
                            .addComponent(ingresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDatosClientesLayout.createSequentialGroup()
                        .addComponent(ingresarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(ingresarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelScrollClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDatosClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Se creó el método eliminar clientes de la tabla
     */
    private void eliminarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarClienteMouseClicked
        int respuesta = JOptionPane.showConfirmDialog(null,
                "¿Está seguro?", "Alerta!",
                JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION && rfcActual != null) {
            controlador.eliminarRegistro(rfcActual);
            mostrarDatosClienteTabla();
            rfcActual = null;
        }
    }//GEN-LAST:event_eliminarClienteMouseClicked

    /**
     * Se creó el método para que al seleccionar una celda de la tabla
     */
    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        int fila = tablaClientes.getSelectedRow();
        rfcActual = tablaClientes.getValueAt(fila, 0)
                .toString();
        Cliente clienteT = controlador.obtenerCliente(rfcActual);
        ingresarRFC.setText(clienteT.getRFC());
        ingresarNombre.setText(clienteT.getNombre());
        ingresarDireccion.setText(clienteT.getDireccion());
        ingresarTelefono.setText(clienteT.getTelefono());

        cuentaController.mostrarRegistros(clienteT.getRFC(),
                modeloCuentas);
    }//GEN-LAST:event_tablaClientesMouseClicked

    /**
     *
     * Se creó el método para guardar la información del cliente
     */
    private void guardarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarClienteMouseClicked
        cliente.setRFC(this.ingresarRFC.getText());
        cliente.setNombre(this.ingresarNombre.getText());
        cliente.setTelefono(this.ingresarTelefono.getText());
        cliente.setDireccion(this.ingresarDireccion.getText());

        controlador.agregarRegistro(cliente);
        mostrarDatosClienteTabla();
        nuevoCliente();
    }//GEN-LAST:event_guardarClienteMouseClicked

    /**
     *
     * Se creó el método para actualizar la información del cliente
     */

    private void botonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseClicked
        Cliente cliente = new Cliente(this.ingresarRFC.getText(),
                this.ingresarNombre.getText(),
                this.ingresarTelefono.getText(),
                this.ingresarDireccion.getText());

        controlador.modificarRegistro(cliente);
        mostrarDatosClienteTabla();
    }//GEN-LAST:event_botonActualizarMouseClicked

    /**
     *
     * Se creó el método para dirigir al jDialog y así agregar una cuenta al
     * cliente
     */

    private void agregarCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarCuentaMouseClicked
        IngresarCuenta iCuenta = new IngresarCuenta(
                IngresarClientes.this,
                owner, true);
        iCuenta.setVisible(true);

    }//GEN-LAST:event_agregarCuentaMouseClicked

    /**
     * Se creó el método para regresar al menú principal
     */
    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        this.dispose();
    }//GEN-LAST:event_BotonRegresarMouseClicked

    /**
     *
     * Se creó el método para importar una imagen de usuario
     */
    private void cargarImagenUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargarImagenUsuarioMouseClicked
        JFileChooser jF = new JFileChooser();
        jF.setMultiSelectionEnabled(false);
        if (jF.showOpenDialog(this) == JFileChooser.APPROVE_OPTION);
        fotoUsuario.setIcon(new ImageIcon(jF.getSelectedFile().toString()));
    }//GEN-LAST:event_cargarImagenUsuarioMouseClicked

    public DefaultTableModel getModeloCuentas() {
        return modeloCuentas;
    }

    private void nuevoCliente() {
        cliente = new Cliente();
        Component[] components = this.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField compo = (JTextField) component;
                // Realiza la acción deseada con el JTextField encontrado
                compo.setText("");
            }
        }
        ingresarRFC.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JButton agregarCuenta;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton cargarImagenUsuario;
    private javax.swing.JLabel direccionCliente;
    private javax.swing.JButton eliminarCliente;
    private javax.swing.JLabel fotoUsuario;
    private javax.swing.JButton guardarCliente;
    private javax.swing.JTextField ingresarDireccion;
    private javax.swing.JTextField ingresarNombre;
    private javax.swing.JTextField ingresarRFC;
    private javax.swing.JTextField ingresarTelefono;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreCliente;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelDatosClientes;
    private javax.swing.JScrollPane panelScrollClientes;
    private javax.swing.JLabel rfc;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaDeCuentas;
    private javax.swing.JLabel telefonoCliente;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * Se creó el método para mostrar los datos del cliente en la tabla
     */
    private void mostrarDatosClienteTabla() {
        controlador.mostrarRegistros(modeloClientes);
    }
}
