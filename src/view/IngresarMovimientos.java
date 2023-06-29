/** ***************************************************
 * Autor: Arleth Machucha Fabian                      *
 * Fecha de creación: 26 jun 2023                     *
 * Fecha de actualización: 26 jun 2023                *
 * Descripción: Frame para el módulo del movimiento.
 **************************************************** */
package view;

import controller.ClienteController;
import controller.CuentaController;
import controller.MovimientoController;
import entity.Cliente;
import entity.Cuenta;
import entity.Movimiento;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IngresarMovimientos extends javax.swing.JFrame {

    private Cliente cliente;
    private final FramePrincipal owner;
    private final DefaultTableModel modeloMov;
    private List<Cuenta> listaCuentas;
    private final ClienteController clienteController = new ClienteController();
    private final CuentaController cuentaController = new CuentaController();
    private final MovimientoController movimientoController = new MovimientoController();

    public IngresarMovimientos(FramePrincipal owner) {
        initComponents();
        this.owner = owner;
        modeloMov = (DefaultTableModel) tablaMovimientos.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel panelEmpleados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoDatos = new javax.swing.JTextArea();
        insertarRFC = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        comboCuenta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboTipoMov = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        insertarMonto = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMovimientos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelEmpleados.setBackground(new java.awt.Color(4, 92, 76));
        panelEmpleados.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RFC");

        jPanel1.setBackground(new java.awt.Color(4, 92, 76));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));
        jPanel1.setForeground(null);

        textoDatos.setEditable(false);
        textoDatos.setBackground(new java.awt.Color(4, 92, 76));
        textoDatos.setColumns(20);
        textoDatos.setForeground(new java.awt.Color(255, 255, 255));
        textoDatos.setRows(5);
        textoDatos.setText("RFC: ASFGV6846516\nNombre: Juan Lopez García\nDireccion: Miahutlan de Porfirio Díaz");
        jScrollPane2.setViewportView(textoDatos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(null);
        jLabel2.setText("Cuenta");

        comboTipoMov.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deposito", "Retiro" }));

        jLabel3.setForeground(null);
        jLabel3.setText("Tipo de movimiento");

        jLabel4.setForeground(null);
        jLabel4.setText("Monto");

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEmpleadosLayout = new javax.swing.GroupLayout(panelEmpleados);
        panelEmpleados.setLayout(panelEmpleadosLayout);
        panelEmpleadosLayout.setHorizontalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(insertarMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboTipoMov, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonAgregar))))
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                .addComponent(insertarRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelEmpleadosLayout.setVerticalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertarRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(comboTipoMov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(insertarMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Cuenta", "Monto", "Saldo", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMovimientos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEmpleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        owner.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        cliente = clienteController.obtenerCliente(insertarRFC.getText());
        if (cliente != null) {
            textoDatos.setText("RFC: " + cliente.getRFC() + "\n"
                    + "Nombre: " + cliente.getNombre() + "\n"
                    + "Direccion: " + cliente.getDireccion());
            listaCuentas = new ArrayList<>();
            cuentaController.obtenerRegistrosAs(insertarRFC.getText(),
                    listaCuentas);
            comboCuenta.removeAllItems();
            for (Cuenta cu : listaCuentas) {
                comboCuenta.addItem(cu.getNombre());
            }
            movimientoController.mostrarRegistros(cliente.getRFC(),
                    modeloMov);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Persona no encontrada.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            textoDatos.setText("");
        }

    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        boolean sePuede = true;
        if (!insertarMonto.getText().isBlank()) {
            if (comboTipoMov.getSelectedIndex() == 0) {
                listaCuentas.get(comboCuenta.getSelectedIndex()).depositar(Double.parseDouble(
                        insertarMonto.getText()));
            } else {
                sePuede = listaCuentas.get(comboCuenta.getSelectedIndex()).retirar(Double.parseDouble(
                        insertarMonto.getText()));
            }
            if (sePuede) {
                Movimiento mov;
                mov = new Movimiento(
                        Double.parseDouble(insertarMonto.getText()),
                        cliente,
                        listaCuentas.get(comboCuenta.getSelectedIndex()),
                        comboTipoMov.getSelectedIndex(),
                        new Date());

                movimientoController.agregarRegistro(mov);
                movimientoController.mostrarRegistros(cliente.getRFC(),
                        modeloMov);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Ingresa un monto.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JComboBox<String> comboCuenta;
    private javax.swing.JComboBox<String> comboTipoMov;
    private javax.swing.JTextField insertarMonto;
    private javax.swing.JTextField insertarRFC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaMovimientos;
    private javax.swing.JTextArea textoDatos;
    // End of variables declaration//GEN-END:variables

}
