/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.cristiangarcia.hoteles;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.cristiangarcia.principal.VentanaInicio;
/**
 *
 * @author crist
 */
public class FuncionesHotel extends javax.swing.JFrame {
    DefaultTableModel modelo;
    /**
     * Creates new form FuncionesHotel
     */
    public FuncionesHotel() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Lugar");
        modelo.addColumn("Categoria");
        modelo.addColumn("Telefono");
        this.tablaHotel.setModel(modelo); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdHotel = new javax.swing.JLabel();
        lblNombreHotel = new javax.swing.JLabel();
        lblLugarHotel = new javax.swing.JLabel();
        lblEstrellasHotel = new javax.swing.JLabel();
        lblTelefonoHotel = new javax.swing.JLabel();
        txtIdHotel = new javax.swing.JTextField();
        txtNombreHotel = new javax.swing.JTextField();
        txtLugarHotel = new javax.swing.JTextField();
        txtEstrellasHotel = new javax.swing.JTextField();
        txtTelefonoHotel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHotel = new javax.swing.JTable();
        btnAgregarHotel = new javax.swing.JButton();
        btnEliminarDatoHotel = new javax.swing.JButton();
        btnEliminarTodoHotel = new javax.swing.JButton();
        btnModificarDatoHotel = new javax.swing.JButton();
        lblFilaHotel = new javax.swing.JLabel();
        lblColumnaHotel = new javax.swing.JLabel();
        lblNuevoDatoHotel = new javax.swing.JLabel();
        txtFilaHotel = new javax.swing.JTextField();
        txtColumnaHotel = new javax.swing.JTextField();
        txtNuevoDatoHotel = new javax.swing.JTextField();
        btnRegresarHotel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        lblIdHotel.setText("ID");

        lblNombreHotel.setText("Nombre");

        lblLugarHotel.setText("Lugar");

        lblEstrellasHotel.setText("Categoria (estrellas)");

        lblTelefonoHotel.setText("Telefono");

        txtIdHotel.setBackground(new java.awt.Color(153, 255, 204));
        txtIdHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtNombreHotel.setBackground(new java.awt.Color(153, 255, 204));
        txtNombreHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtLugarHotel.setBackground(new java.awt.Color(153, 255, 204));
        txtLugarHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtEstrellasHotel.setBackground(new java.awt.Color(153, 255, 204));
        txtEstrellasHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtTelefonoHotel.setBackground(new java.awt.Color(153, 255, 204));
        txtTelefonoHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tablaHotel.setBackground(new java.awt.Color(204, 255, 204));
        tablaHotel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Lugar", "Categoria", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(tablaHotel);

        btnAgregarHotel.setText("AGREGAR DATOS");
        btnAgregarHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHotelActionPerformed(evt);
            }
        });

        btnEliminarDatoHotel.setText("ELIMINAR DATO");
        btnEliminarDatoHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarDatoHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDatoHotelActionPerformed(evt);
            }
        });

        btnEliminarTodoHotel.setText("ELIMINAR TODO");
        btnEliminarTodoHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarTodoHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoHotelActionPerformed(evt);
            }
        });

        btnModificarDatoHotel.setText("MODIFICAR DATO");
        btnModificarDatoHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarDatoHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDatoHotelActionPerformed(evt);
            }
        });

        lblFilaHotel.setText("Fila");

        lblColumnaHotel.setText("Columna");

        lblNuevoDatoHotel.setText("Nuevo Dato");

        txtFilaHotel.setBackground(new java.awt.Color(255, 153, 51));
        txtFilaHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtColumnaHotel.setBackground(new java.awt.Color(255, 153, 51));
        txtColumnaHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtNuevoDatoHotel.setBackground(new java.awt.Color(255, 153, 51));
        txtNuevoDatoHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnRegresarHotel.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresarHotel.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btnRegresarHotel.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarHotel.setText("REGRESAR");
        btnRegresarHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresarHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarHotelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarHotelMouseExited(evt);
            }
        });
        btnRegresarHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarHotelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdHotel)
                            .addComponent(lblNombreHotel)
                            .addComponent(lblLugarHotel)
                            .addComponent(lblEstrellasHotel)
                            .addComponent(lblTelefonoHotel))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombreHotel)
                            .addComponent(txtLugarHotel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstrellasHotel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdHotel)
                            .addComponent(txtTelefonoHotel, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnModificarDatoHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarDatoHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarTodoHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFilaHotel)
                            .addComponent(lblColumnaHotel)
                            .addComponent(lblNuevoDatoHotel))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNuevoDatoHotel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtColumnaHotel)
                            .addComponent(txtFilaHotel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresarHotel)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdHotel)
                            .addComponent(txtIdHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreHotel)
                            .addComponent(txtNombreHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLugarHotel)
                            .addComponent(txtLugarHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstrellasHotel)
                            .addComponent(txtEstrellasHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefonoHotel)
                            .addComponent(txtTelefonoHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnAgregarHotel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFilaHotel)
                            .addComponent(txtFilaHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarDatoHotel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarTodoHotel)
                    .addComponent(lblColumnaHotel)
                    .addComponent(txtColumnaHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarDatoHotel)
                    .addComponent(lblNuevoDatoHotel)
                    .addComponent(txtNuevoDatoHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresarHotel))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHotelActionPerformed
        // TODO add your handling code here:
        String info [] = new String [5];
        info [0] = txtIdHotel.getText();
        info [1] = txtNombreHotel.getText();
        info [2] = txtLugarHotel.getText();
        info [3] = txtEstrellasHotel.getText();
        info [4] = txtTelefonoHotel.getText();
        modelo.addRow(info);
        txtIdHotel.setText("");
        txtNombreHotel.setText("");
        txtLugarHotel.setText("");
        txtEstrellasHotel.setText("");
        txtTelefonoHotel.setText("");
        
    }//GEN-LAST:event_btnAgregarHotelActionPerformed

    private void btnEliminarDatoHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDatoHotelActionPerformed
        // TODO add your handling code here:
        int fila = tablaHotel.getSelectedRow();
        if (fila >= 0){
            modelo.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null,"Seleccionar fila");
        }
    }//GEN-LAST:event_btnEliminarDatoHotelActionPerformed

    private void btnEliminarTodoHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoHotelActionPerformed
        // TODO add your handling code here:
        int fila = tablaHotel.getRowCount();
        for (int i = fila -1;i >=0; i--){
            modelo.removeRow(i);
        }
    }//GEN-LAST:event_btnEliminarTodoHotelActionPerformed

    private void btnModificarDatoHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDatoHotelActionPerformed
        // TODO add your handling code here:
        int fila = Integer.parseInt(txtFilaHotel.getText());
        int columna = Integer.parseInt(txtColumnaHotel.getText());
        modelo.setValueAt(txtNuevoDatoHotel.getText(),fila,columna);
        //Se cuenta desde 0 para que funcione
    }//GEN-LAST:event_btnModificarDatoHotelActionPerformed

    private void btnRegresarHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarHotelActionPerformed
        // TODO add your handling code here:
        VentanaInicio xd = new VentanaInicio();
        xd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarHotelActionPerformed

    private void btnRegresarHotelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarHotelMouseEntered
        // TODO add your handling code here:
        btnRegresarHotel.setBackground(Color.cyan);
        btnRegresarHotel.setForeground(Color.black);
    }//GEN-LAST:event_btnRegresarHotelMouseEntered

    private void btnRegresarHotelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarHotelMouseExited
        // TODO add your handling code here:
        btnRegresarHotel.setBackground(Color.black);
        btnRegresarHotel.setForeground(Color.white);
    }//GEN-LAST:event_btnRegresarHotelMouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarHotel;
    private javax.swing.JButton btnEliminarDatoHotel;
    private javax.swing.JButton btnEliminarTodoHotel;
    private javax.swing.JButton btnModificarDatoHotel;
    private javax.swing.JButton btnRegresarHotel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblColumnaHotel;
    private javax.swing.JLabel lblEstrellasHotel;
    private javax.swing.JLabel lblFilaHotel;
    private javax.swing.JLabel lblIdHotel;
    private javax.swing.JLabel lblLugarHotel;
    private javax.swing.JLabel lblNombreHotel;
    private javax.swing.JLabel lblNuevoDatoHotel;
    private javax.swing.JLabel lblTelefonoHotel;
    private javax.swing.JTable tablaHotel;
    private javax.swing.JTextField txtColumnaHotel;
    private javax.swing.JTextField txtEstrellasHotel;
    private javax.swing.JTextField txtFilaHotel;
    private javax.swing.JTextField txtIdHotel;
    private javax.swing.JTextField txtLugarHotel;
    private javax.swing.JTextField txtNombreHotel;
    private javax.swing.JTextField txtNuevoDatoHotel;
    private javax.swing.JTextField txtTelefonoHotel;
    // End of variables declaration//GEN-END:variables
}