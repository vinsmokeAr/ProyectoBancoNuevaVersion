/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 19 / mayo / 23
* Fecha de modificación: 11 / junio / 23
* Descripción: Se creó el Frame para el Frame Principal.
 */
package view;

import entity.Datos;

public class FramePrincipal extends javax.swing.JFrame {

    public FramePrincipal() {
        initComponents();
        Datos datos = new Datos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        ingresarMovimientos = new javax.swing.JButton();
        registrarClientes = new javax.swing.JButton();
        ingresarEmpleados = new javax.swing.JButton();
        salirPrincipal = new javax.swing.JButton();
        etiqEmpleados = new javax.swing.JLabel();
        etiqClientes = new javax.swing.JLabel();
        etiqMovimientos = new javax.swing.JLabel();
        logoSalir = new javax.swing.JLabel();
        LabelInicioBienestar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresarMovimientos.setBackground(new java.awt.Color(255, 255, 255));
        ingresarMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/movimientos.png"))); // NOI18N
        ingresarMovimientos.setBorder(null);
        ingresarMovimientos.setContentAreaFilled(false);
        ingresarMovimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresarMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarMovimientosActionPerformed(evt);
            }
        });
        loginPanel.add(ingresarMovimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 90, 70));

        registrarClientes.setBackground(new java.awt.Color(255, 255, 255));
        registrarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/credencial.png"))); // NOI18N
        registrarClientes.setBorder(null);
        registrarClientes.setContentAreaFilled(false);
        registrarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarClientesActionPerformed(evt);
            }
        });
        loginPanel.add(registrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 90, 70));

        ingresarEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        ingresarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RegistrarEmpleados.png"))); // NOI18N
        ingresarEmpleados.setBorder(null);
        ingresarEmpleados.setContentAreaFilled(false);
        ingresarEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarEmpleadosActionPerformed(evt);
            }
        });
        loginPanel.add(ingresarEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 90, 70));

        salirPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SalirP.png"))); // NOI18N
        salirPrincipal.setBorder(null);
        salirPrincipal.setContentAreaFilled(false);
        salirPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirPrincipalMouseClicked(evt);
            }
        });
        loginPanel.add(salirPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 130, -1));

        etiqEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        etiqEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PlantillaLabel.png"))); // NOI18N
        etiqEmpleados.setText("Movimiento");
        etiqEmpleados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginPanel.add(etiqEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        etiqClientes.setForeground(new java.awt.Color(0, 0, 0));
        etiqClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PlantillaLabel.png"))); // NOI18N
        etiqClientes.setText("Clientes");
        etiqClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginPanel.add(etiqClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        etiqMovimientos.setForeground(new java.awt.Color(0, 0, 0));
        etiqMovimientos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PlantillaLabel.png"))); // NOI18N
        etiqMovimientos.setText("Empleados");
        etiqMovimientos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginPanel.add(etiqMovimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        logoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        loginPanel.add(logoSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        LabelInicioBienestar.setBackground(new java.awt.Color(255, 255, 255));
        LabelInicioBienestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.png"))); // NOI18N
        loginPanel.add(LabelInicioBienestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Se creó el método que dirigirá al Frame para registrar clientes
     */
    private void registrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarClientesActionPerformed
        IngresarClientes iClientes = new IngresarClientes(this, true);
        iClientes.setVisible(true);
    }//GEN-LAST:event_registrarClientesActionPerformed

    /**
     * Se creó el método que dirigirá al Frame para registrar empleados
     */

    private void ingresarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarEmpleadosActionPerformed
        IngresarEmpleados iEmpleados = new IngresarEmpleados(this, true);
        iEmpleados.setVisible(true);
    }//GEN-LAST:event_ingresarEmpleadosActionPerformed

    /**
     * Se creó el método que dirigirá al Frame para salir del programa
     */

    private void salirPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirPrincipalMouseClicked
        System.exit(WIDTH);
    }//GEN-LAST:event_salirPrincipalMouseClicked

    private void ingresarMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarMovimientosActionPerformed
        this.setVisible(false);
        IngresarMovimientos iMovimientos = new IngresarMovimientos(
                FramePrincipal.this);
        iMovimientos.setVisible(true);
    }//GEN-LAST:event_ingresarMovimientosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelInicioBienestar;
    private javax.swing.JLabel etiqClientes;
    private javax.swing.JLabel etiqEmpleados;
    private javax.swing.JLabel etiqMovimientos;
    private javax.swing.JButton ingresarEmpleados;
    private javax.swing.JButton ingresarMovimientos;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logoSalir;
    private javax.swing.JButton registrarClientes;
    private javax.swing.JButton salirPrincipal;
    // End of variables declaration//GEN-END:variables
}
