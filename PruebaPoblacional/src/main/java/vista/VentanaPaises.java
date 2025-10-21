/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import control.ControlPoblacional;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samue
 */

public class VentanaPaises extends javax.swing.JFrame {

    private ControlPoblacional control = new ControlPoblacional();

    public VentanaPaises() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblContinente = new javax.swing.JLabel();
        lblPoblacion = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtContinente = new javax.swing.JTextField();
        txtPoblacion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPaises = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCodigo.setText("Codigo");

        lblNombre.setText("Nombre");

        lblContinente.setText("Continente");

        lblPoblacion.setText("Poblacion");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        tblPaises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Código", "Nombre", "Continente", "Población"
            ));
            jScrollPane2.setViewportView(tblPaises);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAgregar)
                            .addGap(6, 6, 6)
                            .addComponent(btnConsultar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnModificar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCodigo)
                                .addComponent(lblNombre)
                                .addComponent(lblContinente)
                                .addComponent(lblPoblacion))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodigo)
                                .addComponent(txtNombre)
                                .addComponent(txtContinente)
                                .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(44, 44, 44)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCodigo)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNombre)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblContinente)
                                .addComponent(txtContinente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPoblacion)
                                .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAgregar)
                                .addComponent(btnConsultar)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(32, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtContinente.setText("");
        txtPoblacion.setText("");
    }
    
    
    
    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblContinente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPoblacion;
    private javax.swing.JTable tblPaises;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContinente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPoblacion;
    // End of variables declaration//GEN-END:variables

}