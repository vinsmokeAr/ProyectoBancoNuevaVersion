/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 09 / junio / 23
* Fecha de modificación: 11 / junio / 23
* Descripción: Se creó un jDialog para ingresar las cuentas y el monto inicial 
* de un cliente.
 */
package view;

import controller.CuentaController;
import entity.CuentaAhorro;
import entity.CuentaCorriente;
import entity.CuentaNomina;
import entity.Util;
import java.awt.Frame;
import javax.swing.JOptionPane;

public class IngresarCuenta extends javax.swing.JDialog {

    private final CuentaController cuentaController = new CuentaController();
    private final IngresarClientes frmClientes;

    public IngresarCuenta(IngresarClientes frmClientes, Frame parent,
            boolean modal) {
        super(parent, modal);
        this.frmClientes = frmClientes;
        initComponents();
        this.labelAdicional1.setVisible(false);
        this.ingresarAdicoinal1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelArriba = new javax.swing.JPanel();
        CabeceraBanco = new javax.swing.JLabel();
        tipoDeCuenta = new javax.swing.JLabel();
        montoInicial = new javax.swing.JLabel();
        cmbCuenta = new javax.swing.JComboBox<>();
        ingresarMonto = new javax.swing.JTextField();
        agregarCuentaC = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ingresarAdicoinal = new javax.swing.JTextField();
        labelAdicional = new javax.swing.JLabel();
        ingresarAdicoinal1 = new javax.swing.JTextField();
        labelAdicional1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelArriba.setBackground(new java.awt.Color(4, 92, 76));

        CabeceraBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BancoB.png"))); // NOI18N

        javax.swing.GroupLayout panelArribaLayout = new javax.swing.GroupLayout(panelArriba);
        panelArriba.setLayout(panelArribaLayout);
        panelArribaLayout.setHorizontalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArribaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CabeceraBanco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelArribaLayout.setVerticalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CabeceraBanco)
        );

        tipoDeCuenta.setForeground(new java.awt.Color(255, 255, 255));
        tipoDeCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TipoC.png"))); // NOI18N

        montoInicial.setForeground(new java.awt.Color(255, 255, 255));
        montoInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MontoInicial.png"))); // NOI18N

        cmbCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenta ahorro", "Cuenta corriente", "Cuenta nómina", " " }));
        cmbCuenta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCuentaItemStateChanged(evt);
            }
        });

        agregarCuentaC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Agregar.png"))); // NOI18N
        agregarCuentaC.setBorder(null);
        agregarCuentaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCuentaCActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos adicionales"));

        labelAdicional.setForeground(new java.awt.Color(0, 0, 0));
        labelAdicional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PlantillaLabel.png"))); // NOI18N
        labelAdicional.setText("% Interes");
        labelAdicional.setToolTipText("");
        labelAdicional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelAdicional1.setForeground(new java.awt.Color(0, 0, 0));
        labelAdicional1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PlantillaLabel.png"))); // NOI18N
        labelAdicional1.setText("% Interes");
        labelAdicional1.setToolTipText("");
        labelAdicional1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelAdicional)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ingresarAdicoinal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelAdicional1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ingresarAdicoinal1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ingresarAdicoinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAdicional))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ingresarAdicoinal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAdicional1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(agregarCuentaC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipoDeCuenta)
                                    .addComponent(montoInicial))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingresarMonto))))))
                .addContainerGap())
            .addComponent(panelArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoDeCuenta)
                    .addComponent(cmbCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingresarMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(montoInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarCuentaC)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     /**
     *
     * Se creó el método para agregar un tipo de cuenta al cliente
     */
    private void agregarCuentaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCuentaCActionPerformed
        Object[] fila = new Object[2];
        if (!isExiste(String.valueOf(cmbCuenta.getSelectedItem()))) {
            if (!ingresarMonto.getText().isBlank()) {
                switch ((String) cmbCuenta.getSelectedItem()) {
                    case "Cuenta ahorro":
                        cuentaController.agregarRegistro(new CuentaAhorro(
                                Double.parseDouble(
                                        ingresarAdicoinal.getText()),
                                Util.generarNumeroCuenta(
                                        (String) cmbCuenta.getSelectedItem()),
                                "Cuenta ahorro",
                                Double.parseDouble(ingresarMonto.getText()),
                                frmClientes.getCliente()));
                        break;
                    case "Cuenta corriente":
                        cuentaController.agregarRegistro(new CuentaCorriente(
                                Double.parseDouble(
                                        ingresarAdicoinal.getText()),
                                Double.parseDouble(
                                        ingresarAdicoinal1.getText()),
                                Util.generarNumeroCuenta(
                                        (String) cmbCuenta.getSelectedItem()),
                                "Cuenta corriente",
                                Double.parseDouble(ingresarMonto.getText()),
                                frmClientes.getCliente()));
                        break;
                    case "Cuenta nómina":
                        cuentaController.agregarRegistro(new CuentaNomina(
                                ingresarAdicoinal.getText(),
                                Util.generarNumeroCuenta((String) cmbCuenta.getSelectedItem()),
                                "Cuenta nómina",
                                Double.parseDouble(ingresarMonto.getText()),
                                frmClientes.getCliente()));
                        break;
                }

                fila[0] = cmbCuenta.getSelectedItem();
                fila[1] = ingresarMonto.getText();
                frmClientes.getModeloCuentas().addRow(fila);

                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this,
                        "Ingresa un monto.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this,
                    "Esta cuenta ya fue añadida", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_agregarCuentaCActionPerformed

    private void cmbCuentaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCuentaItemStateChanged
        switch ((String) cmbCuenta.getSelectedItem()) {
            case "Cuenta ahorro":
                this.labelAdicional.setText("Interes %");

                this.labelAdicional.setVisible(true);
                this.ingresarAdicoinal.setVisible(true);

                this.labelAdicional1.setVisible(false);
                this.ingresarAdicoinal1.setVisible(false);
                break;
            case "Cuenta corriente":
                this.labelAdicional.setText("Limite");
                this.labelAdicional1.setText("Comision");

                this.labelAdicional.setVisible(true);
                this.ingresarAdicoinal.setVisible(true);

                this.labelAdicional1.setVisible(true);
                this.ingresarAdicoinal1.setVisible(true);
                break;
            case "Cuenta nómina":
                this.labelAdicional.setText("Empresa");

                this.labelAdicional.setVisible(true);
                this.ingresarAdicoinal.setVisible(true);

                this.labelAdicional1.setVisible(false);
                this.ingresarAdicoinal1.setVisible(false);
                break;
        }
    }//GEN-LAST:event_cmbCuentaItemStateChanged

    private boolean isExiste(String cuenta) {
        for (int i = 0; i < frmClientes.getModeloCuentas().getRowCount(); i++) {
            if (frmClientes.getModeloCuentas().getValueAt(i, 0)
                    .equals(cuenta)) {
                return true;
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CabeceraBanco;
    private javax.swing.JButton agregarCuentaC;
    private javax.swing.JComboBox<String> cmbCuenta;
    private javax.swing.JTextField ingresarAdicoinal;
    private javax.swing.JTextField ingresarAdicoinal1;
    private javax.swing.JTextField ingresarMonto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAdicional;
    private javax.swing.JLabel labelAdicional1;
    private javax.swing.JLabel montoInicial;
    private javax.swing.JPanel panelArriba;
    private javax.swing.JLabel tipoDeCuenta;
    // End of variables declaration//GEN-END:variables
}
