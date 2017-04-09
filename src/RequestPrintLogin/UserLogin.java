/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RequestPrintLogin;

import RequestPrintDatabase.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Game
 */
public class UserLogin extends javax.swing.JFrame {

    /**
     * Creates new form WelcomePage
     */
    public UserLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameProgram = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        regisButton = new javax.swing.JButton();
        storeLoginButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LoginFailedStutus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameProgram.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        nameProgram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameProgram.setText("E - PRINTING");
        getContentPane().add(nameProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 400, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Username : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Password :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 70, 20));
        getContentPane().add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 270, -1));
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 270, -1));

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 140, -1));

        regisButton.setText("Register");
        regisButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regisButtonMouseClicked(evt);
            }
        });
        regisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisButtonActionPerformed(evt);
            }
        });
        getContentPane().add(regisButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 80, 30));

        storeLoginButton.setText("Login");
        storeLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeLoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(storeLoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Don't have an account?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 150, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("For store login.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 120, 30));
        getContentPane().add(LoginFailedStutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 270, 20));

        setSize(new java.awt.Dimension(418, 320));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisButtonActionPerformed
        SelectRegisUserOrRegisShop selectRegis = new SelectRegisUserOrRegisShop();
        selectRegis.setVisible(true);
    }//GEN-LAST:event_regisButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if (!"".equals(UsernameField.getText()) & !"".equals(PasswordField.getText())) {
            try {
                Connection con = ConnectionBuilder.getConnection();
                PreparedStatement pstm = con.prepareStatement("SELECT * FROM UserProfile WHERE username=? and password=?");
                pstm.setString(1, UsernameField.getText());
                pstm.setString(2, PasswordField.getText());
                ResultSet rs = pstm.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Sucessful");
                } else {
                    LoginFailedStutus.setText("");
                    LoginFailedStutus.setText("Invalid username or password");
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            LoginFailedStutus.setText("Please enter your username and password!");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void storeLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeLoginButtonActionPerformed
        // TODO add your handling code here:
        StoreLogin stl = new StoreLogin();
        stl.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_storeLoginButtonActionPerformed

    private void regisButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regisButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_regisButtonMouseClicked

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UserLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginFailedStutus;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel nameProgram;
    private javax.swing.JButton regisButton;
    private javax.swing.JButton storeLoginButton;
    // End of variables declaration//GEN-END:variables
}
