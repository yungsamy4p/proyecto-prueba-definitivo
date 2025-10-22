/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import control.ControlPoblacional;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pais;

/**
 *
 * @author samue
 */

public class VentanaPaises extends javax.swing.JFrame {

    private ControlPoblacional control = new ControlPoblacional();

    public VentanaPaises() {
        initComponents(); 
        setLocationRelativeTo(null);
        btnConsultarActionPerformed(null); 
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Continente", "Población"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("        Sistema de Control poblacional");

        jButton1.setText("Buscar por Nombre");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNombreActionPerformed(evt);
            }
        });

        jButton2.setText("Listar por Continente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarContinenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblContinente)
                                    .addComponent(lblPoblacion)
                                    .addComponent(lblCodigo))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo)
                                    .addComponent(txtNombre)
                                    .addComponent(txtContinente)
                                    .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContinente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContinente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPoblacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnConsultar)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(17, Short.MAX_VALUE))
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

    }//GEN-LAST:event_txtCodigoActionPerformed

    /// ---- BOTONES DE PANEL PRINCIPAL
    
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    if (txtCodigo.getText().trim().isEmpty() || 
        txtNombre.getText().trim().isEmpty() ||
        txtContinente.getText().trim().isEmpty() ||
        txtPoblacion.getText().trim().isEmpty()) {
        
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        return; 
    }
    
    long poblacion;
    try {
        poblacion = Long.parseLong(txtPoblacion.getText());
        if (poblacion < 0) { 
             JOptionPane.showMessageDialog(this, "Error: La población no puede ser negativa.", "Dato Inválido", JOptionPane.ERROR_MESSAGE);
             return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error: La población debe ser un número válido.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        return; 
    }   
    
    try {
        if (control.buscarPaisPorCodigo(txtCodigo.getText().trim()) != null) {
            JOptionPane.showMessageDialog(this, "Error: Ya existe un país con ese código.", "Código Duplicado", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Pais p = new Pais();
        p.setCodigoPais(txtCodigo.getText().trim());
        p.setNombre(txtNombre.getText().trim());
        p.setContinente(txtContinente.getText().trim());
        p.setPoblacion(poblacion);

        control.agregarPais(p);
        JOptionPane.showMessageDialog(this, "País agregado correctamente.");

        limpiarCampos();
        btnConsultarActionPerformed(evt); 

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error inesperado al agregar el país: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        jTable1.setModel(control.obtenerModeloTabla());
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    String codigo = txtCodigo.getText().trim();
    if (codigo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe ingresar el código del país a modificar.", "Código Vacío", JOptionPane.WARNING_MESSAGE);
        return;
    }

     if (txtNombre.getText().trim().isEmpty() ||
        txtContinente.getText().trim().isEmpty() ||
        txtPoblacion.getText().trim().isEmpty()) {
        
        JOptionPane.showMessageDialog(this, "Por favor, complete Nombre, Continente y Población.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        return; 
    }

    long poblacion;
    try {
         poblacion = Long.parseLong(txtPoblacion.getText());
         if (poblacion < 0) {
             JOptionPane.showMessageDialog(this, "Error: La población no puede ser negativa.", "Dato Inválido", JOptionPane.ERROR_MESSAGE);
             return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error: La población debe ser un número válido.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        return; 
    }

    try {
        Pais nuevo = new Pais();
        nuevo.setCodigoPais(codigo); 
        nuevo.setNombre(txtNombre.getText().trim());
        nuevo.setContinente(txtContinente.getText().trim());
        nuevo.setPoblacion(poblacion); 
        
        if (control.modificarPais(codigo, nuevo)) {
            JOptionPane.showMessageDialog(this, "País modificado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró ningún país con el código '" + codigo + "'.", "País No Encontrado", JOptionPane.ERROR_MESSAGE);
        }

        limpiarCampos();
        btnConsultarActionPerformed(evt);
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error inesperado al modificar el país: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnModificarActionPerformed


    /// ---- BOTONES DE REVISION DE PAISES / CONTINENTES
    
    
    private void btnListarContinenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarContinenteActionPerformed

        String continenteBuscado = JOptionPane.showInputDialog(this, "Ingrese el continente a listar:", "Listar por Continente", JOptionPane.QUESTION_MESSAGE);

         if (continenteBuscado != null && !continenteBuscado.trim().isEmpty()) {
        ArrayList<Pais> paisesDelContinente = control.listarPaisesPorContinente(continenteBuscado.trim());

        if (!paisesDelContinente.isEmpty()) {

            jTable1.setModel(control.obtenerModeloTabla(paisesDelContinente)); 
            JOptionPane.showMessageDialog(this, "Mostrando países de " + continenteBuscado + ".", "Filtro Aplicado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron países en el continente '" + continenteBuscado + "'.", "Sin Resultados", JOptionPane.WARNING_MESSAGE); // Tabla vacía
             btnConsultarActionPerformed(null);
        }
    } else if (continenteBuscado != null) {
        JOptionPane.showMessageDialog(this, "Debe ingresar un continente para listar.", "Entrada Vacía", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnListarContinenteActionPerformed

    private void btnBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNombreActionPerformed

        String nombreBuscado = JOptionPane.showInputDialog(this, "Ingrese el nombre del país a buscar:", "Buscar por Nombre", JOptionPane.QUESTION_MESSAGE);

        if (nombreBuscado != null && !nombreBuscado.trim().isEmpty()) {
        Pais encontrado = control.buscarPaisPorNombre(nombreBuscado.trim());

        if (encontrado != null) {

            DefaultTableModel modeloResultado = new DefaultTableModel(new String[]{"Código", "Nombre", "Continente", "Población"}, 0);
            modeloResultado.addRow(new Object[]{
                encontrado.getCodigoPais(),
                encontrado.getNombre(),
                encontrado.getContinente(),
                encontrado.getPoblacion()
            });
            jTable1.setModel(modeloResultado); 
            JOptionPane.showMessageDialog(this,"País encontrado.", "Búsqueda Exitosa", JOptionPane.INFORMATION_MESSAGE);

            txtCodigo.setText(encontrado.getCodigoPais());
            txtNombre.setText(encontrado.getNombre());
            txtContinente.setText(encontrado.getContinente());
            txtPoblacion.setText(String.valueOf(encontrado.getPoblacion()));

        } else {
            JOptionPane.showMessageDialog(this, "No se encontró ningún país con el nombre '" + nombreBuscado + "'.", "Búsqueda Fallida", JOptionPane.WARNING_MESSAGE);
            btnConsultarActionPerformed(null);
        }
    } else if (nombreBuscado != null) { 
         JOptionPane.showMessageDialog(this, "Debe ingresar un nombre para buscar.", "Entrada Vacía", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnBuscarNombreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblContinente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPoblacion;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContinente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPoblacion;
    // End of variables declaration//GEN-END:variables

}