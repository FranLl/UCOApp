/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mobilephone;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author JoseManuel
 */
public class Phone extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    private SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
    
    public Phone() {
        //setUndecorated(true);
        initComponents();
        //setBackground(new Color(0,0,0,0));
        body.setBackground(Color.WHITE);
        time.setText(sdf.format(new Date()));
        
        inicio_sesion.setVisible(true);
        MenuAlumno.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        inicio_sesion = new javax.swing.JPanel();
        Logo_UCO = new javax.swing.JLabel();
        Bandera1 = new javax.swing.JLabel();
        Bandera2 = new javax.swing.JLabel();
        Bandera3 = new javax.swing.JLabel();
        Usuario_campo = new javax.swing.JTextField();
        Usuario_etiqueta = new javax.swing.JLabel();
        Contraseña_etiqueta = new javax.swing.JLabel();
        Contraseña_campo = new javax.swing.JPasswordField();
        Mostrar_contraseña = new javax.swing.JCheckBox();
        Password_olvidada = new javax.swing.JLabel();
        inicio_de_sesion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        interfaz_alumno = new javax.swing.JPanel();
        Logo_UCO1 = new javax.swing.JLabel();
        MenuAlumno = new javax.swing.JPanel();
        MenuBotonCerrar = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        MenuBoton = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cellphone.png"))); // NOI18N
        body.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 910));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signal-icon (1).jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/battery-icon (1).jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Wireless-icon.svg (1).png"))); // NOI18N

        time.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );

        body.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 400, 30));

        Logo_UCO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_uco_small.png"))); // NOI18N
        Logo_UCO.setText("jLabel2");

        Bandera1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bandera1_small.png"))); // NOI18N
        Bandera1.setText("jLabel2");

        Bandera2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bandera2.png"))); // NOI18N
        Bandera2.setText("jLabel2");

        Bandera3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bandera3.png"))); // NOI18N
        Bandera3.setText("jLabel2");

        Usuario_campo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Usuario_campo.setText("Usuario1");
        Usuario_campo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 255)));
        Usuario_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuario_campoActionPerformed(evt);
            }
        });

        Usuario_etiqueta.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Usuario_etiqueta.setText("Usuario");

        Contraseña_etiqueta.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Contraseña_etiqueta.setText("Contraseña");

        Contraseña_campo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Contraseña_campo.setText("Contraseña1");
        Contraseña_campo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 255)));

        Mostrar_contraseña.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Mostrar_contraseña.setText("Mostrar contraseña");
        Mostrar_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar_contraseñaActionPerformed(evt);
            }
        });

        Password_olvidada.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        Password_olvidada.setText("Contraseña olvidada");

        inicio_de_sesion.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        inicio_de_sesion.setText("Iniciar Sesión");
        inicio_de_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicio_de_sesionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setText("                 Selección de idioma:");

        javax.swing.GroupLayout inicio_sesionLayout = new javax.swing.GroupLayout(inicio_sesion);
        inicio_sesion.setLayout(inicio_sesionLayout);
        inicio_sesionLayout.setHorizontalGroup(
            inicio_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicio_sesionLayout.createSequentialGroup()
                .addGroup(inicio_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicio_sesionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inicio_de_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicio_sesionLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Bandera1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(Bandera2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGap(3, 3, 3)
                .addComponent(Bandera3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(inicio_sesionLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(inicio_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo_UCO, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_olvidada)
                    .addGroup(inicio_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Usuario_campo)
                        .addComponent(Usuario_etiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Contraseña_etiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Contraseña_campo)
                        .addComponent(Mostrar_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicio_sesionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inicio_sesionLayout.setVerticalGroup(
            inicio_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicio_sesionLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(Logo_UCO)
                .addGap(29, 29, 29)
                .addComponent(Usuario_etiqueta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usuario_campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Contraseña_etiqueta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contraseña_campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password_olvidada, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Mostrar_contraseña)
                .addGap(32, 32, 32)
                .addComponent(inicio_de_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inicio_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bandera3)
                    .addComponent(Bandera1)
                    .addComponent(Bandera2))
                .addContainerGap())
        );

        body.add(inicio_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 64, 380, 780));
        inicio_sesion.setBackground(Color.WHITE);

        interfaz_alumno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo_UCO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_uco_small.png"))); // NOI18N
        Logo_UCO1.setText("jLabel2");
        interfaz_alumno.add(Logo_UCO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 106, 201, -1));

        MenuAlumno.setBackground(new java.awt.Color(0, 255, 255));
        MenuAlumno.setForeground(new java.awt.Color(43, 43, 43));

        MenuBotonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu-button.png"))); // NOI18N
        MenuBotonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuBotonCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuAlumnoLayout = new javax.swing.GroupLayout(MenuAlumno);
        MenuAlumno.setLayout(MenuAlumnoLayout);
        MenuAlumnoLayout.setHorizontalGroup(
            MenuAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuAlumnoLayout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(MenuBotonCerrar)
                .addContainerGap())
        );
        MenuAlumnoLayout.setVerticalGroup(
            MenuAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuBotonCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        interfaz_alumno.add(MenuAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 780));

        Header.setBackground(new java.awt.Color(53, 53, 255));

        MenuBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu-button.png"))); // NOI18N
        MenuBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuBotonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        interfaz_alumno.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 60));

        body.add(interfaz_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 64, 380, 780));
        interfaz_alumno.setBackground(Color.WHITE);

        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 125, 255)));
        body.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 62, 420, 10));

        jSeparator2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 125, 255)));
        body.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 850, 420, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inicio_de_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicio_de_sesionActionPerformed
        // TODO add your handling code here:
        inicio_sesion.setVisible(false);
        interfaz_alumno.setVisible(true);

        pack();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_inicio_de_sesionActionPerformed

    private void Mostrar_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar_contraseñaActionPerformed
        // TODO add your handling code here:
        if(Mostrar_contraseña.isSelected())
        Contraseña_campo.setEchoChar((char)0);
        else
        Contraseña_campo.setEchoChar('*');
    }//GEN-LAST:event_Mostrar_contraseñaActionPerformed

    private void Usuario_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuario_campoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Usuario_campoActionPerformed

    private void MenuBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBotonMouseClicked
        MenuAlumno.setVisible(true);
    }//GEN-LAST:event_MenuBotonMouseClicked

    private void MenuBotonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBotonCerrarMouseClicked
        MenuAlumno.setVisible(false);
    }//GEN-LAST:event_MenuBotonCerrarMouseClicked

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
            java.util.logging.Logger.getLogger(Phone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Phone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Phone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Phone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Phone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bandera1;
    private javax.swing.JLabel Bandera2;
    private javax.swing.JLabel Bandera3;
    private javax.swing.JPasswordField Contraseña_campo;
    private javax.swing.JLabel Contraseña_etiqueta;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Logo_UCO;
    private javax.swing.JLabel Logo_UCO1;
    private javax.swing.JPanel MenuAlumno;
    private javax.swing.JLabel MenuBoton;
    private javax.swing.JLabel MenuBotonCerrar;
    private javax.swing.JCheckBox Mostrar_contraseña;
    private javax.swing.JLabel Password_olvidada;
    private javax.swing.JTextField Usuario_campo;
    private javax.swing.JLabel Usuario_etiqueta;
    private javax.swing.JPanel body;
    private javax.swing.JButton inicio_de_sesion;
    private javax.swing.JPanel inicio_sesion;
    private javax.swing.JPanel interfaz_alumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
