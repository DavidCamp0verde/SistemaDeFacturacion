/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class InterfazInicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form InterfazInicioSesion
     */
    public InterfazInicioSesion() {
        
        initComponents();
        setLocationRelativeTo(null);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panImagen2 = new gui.PanImagen();
        panImagen1 = new gui.PanImagen();
        jLabel1 = new javax.swing.JLabel();
        PanDatosUsuario = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtCorreoUsuario = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JButton();
        checkRecordar = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        panImagen4 = new gui.PanImagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        panImagen2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\fondo.jpg")); // NOI18N

        panImagen1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\logo boston.png")); // NOI18N

        javax.swing.GroupLayout panImagen1Layout = new javax.swing.GroupLayout(panImagen1);
        panImagen1.setLayout(panImagen1Layout);
        panImagen1Layout.setHorizontalGroup(
            panImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );
        panImagen1Layout.setVerticalGroup(
            panImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Source Sans Pro Black", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NombreEmpresa");

        javax.swing.GroupLayout panImagen2Layout = new javax.swing.GroupLayout(panImagen2);
        panImagen2.setLayout(panImagen2Layout);
        panImagen2Layout.setHorizontalGroup(
            panImagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panImagen2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(panImagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21))
        );
        panImagen2Layout.setVerticalGroup(
            panImagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panImagen2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanDatosUsuario.setBackground(new java.awt.Color(204, 204, 255));
        PanDatosUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));

        jLabel29.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel29.setText("Correo Electronico: ");

        jLabel30.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel30.setText("Contraseña: ");

        btnAcceder.setText("Acceder");
        btnAcceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAccederjButton1MouseClicked(evt);
            }
        });
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederjButton1ActionPerformed(evt);
            }
        });

        checkRecordar.setText("Recuerdame");

        jLabel31.setText("¿Olvidaste tu contraseña?");

        javax.swing.GroupLayout PanDatosUsuarioLayout = new javax.swing.GroupLayout(PanDatosUsuario);
        PanDatosUsuario.setLayout(PanDatosUsuarioLayout);
        PanDatosUsuarioLayout.setHorizontalGroup(
            PanDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanDatosUsuarioLayout.createSequentialGroup()
                .addGroup(PanDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanDatosUsuarioLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(PanDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanDatosUsuarioLayout.createSequentialGroup()
                                .addComponent(checkRecordar)
                                .addGap(141, 141, 141)
                                .addComponent(jLabel31))
                            .addGroup(PanDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanDatosUsuarioLayout.createSequentialGroup()
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtContraseña))
                                .addGroup(PanDatosUsuarioLayout.createSequentialGroup()
                                    .addComponent(jLabel29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(PanDatosUsuarioLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        PanDatosUsuarioLayout.setVerticalGroup(
            PanDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanDatosUsuarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkRecordar)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addComponent(btnAcceder)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panImagen4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\iniciar sesion.jpg")); // NOI18N

        javax.swing.GroupLayout panImagen4Layout = new javax.swing.GroupLayout(panImagen4);
        panImagen4.setLayout(panImagen4Layout);
        panImagen4Layout.setHorizontalGroup(
            panImagen4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );
        panImagen4Layout.setVerticalGroup(
            panImagen4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panImagen4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanDatosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(panImagen4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanDatosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addComponent(panImagen2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanPrincipalLayout = new javax.swing.GroupLayout(PanPrincipal);
        PanPrincipal.setLayout(PanPrincipalLayout);
        PanPrincipalLayout.setHorizontalGroup(
            PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanPrincipalLayout.setVerticalGroup(
            PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederjButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccederjButton1MouseClicked
        // TODO add your handling code here:
        String usuario="Usuario1";
        String contrasenia="123456";
        if(txtCorreoUsuario.getText().equals(usuario)&&txtContraseña.getText().equals(contrasenia))
        {
        InterfazPrincipal interfazPrincipal=new InterfazPrincipal();
        interfazPrincipal.setVisible(true);
        
        dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Usuario o contraseña INCORRECTAS","ERROR" , JOptionPane.ERROR_MESSAGE);
        }
        
        //        PanelInterfaz panelInterfaz = new PanelInterfaz();
        //        panelInterfaz.setVisible(true);
    }//GEN-LAST:event_btnAccederjButton1MouseClicked

    private void btnAccederjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederjButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAccederjButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanDatosUsuario;
    private javax.swing.JPanel PanPrincipal;
    private javax.swing.JButton btnAcceder;
    private javax.swing.JCheckBox checkRecordar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel2;
    private gui.PanImagen panImagen1;
    private gui.PanImagen panImagen2;
    private gui.PanImagen panImagen4;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreoUsuario;
    // End of variables declaration//GEN-END:variables
}
