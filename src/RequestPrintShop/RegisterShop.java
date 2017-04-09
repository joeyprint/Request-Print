/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RequestPrintShop;

import RequestPrintDatabase.ConnectionBuilder;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class RegisterShop extends javax.swing.JFrame {

    /**
     * Creates new form RegisterShop
     */
    public RegisterShop() {
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

        registerTitle = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        surname = new javax.swing.JLabel();
        surnameField = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        Telephone = new javax.swing.JLabel();
        telephoneField = new javax.swing.JTextField();
        shopName = new javax.swing.JLabel();
        shopNameField = new javax.swing.JTextField();
        userName = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        confirmPasswor = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        passwordCheck = new javax.swing.JLabel();
        emailCheck = new javax.swing.JLabel();
        userNameCheck = new javax.swing.JLabel();
        errorPassText = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        confirmField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        registerTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        registerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerTitle.setText("Register");
        getContentPane().add(registerTitle);
        registerTitle.setBounds(0, 10, 600, 30);

        name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name.setText("Name :");
        getContentPane().add(name);
        name.setBounds(140, 60, 60, 30);

        nameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(nameField);
        nameField.setBounds(220, 60, 220, 30);

        surname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        surname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        surname.setText("Surname :");
        getContentPane().add(surname);
        surname.setBounds(120, 100, 80, 30);

        surnameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(surnameField);
        surnameField.setBounds(220, 100, 220, 30);

        address.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        address.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        address.setText("Address :");
        getContentPane().add(address);
        address.setBounds(120, 140, 80, 30);

        addressField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(addressField);
        addressField.setBounds(220, 140, 220, 30);

        email.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        email.setText("Email :");
        getContentPane().add(email);
        email.setBounds(120, 180, 80, 30);

        emailField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });
        getContentPane().add(emailField);
        emailField.setBounds(220, 180, 220, 30);

        Telephone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Telephone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Telephone.setText("Telephone :");
        getContentPane().add(Telephone);
        Telephone.setBounds(100, 220, 100, 30);

        telephoneField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(telephoneField);
        telephoneField.setBounds(220, 220, 220, 30);

        shopName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        shopName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        shopName.setText("Shop Name :");
        getContentPane().add(shopName);
        shopName.setBounds(100, 260, 100, 30);

        shopNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(shopNameField);
        shopNameField.setBounds(220, 260, 220, 30);

        userName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        userName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userName.setText("Username :");
        getContentPane().add(userName);
        userName.setBounds(100, 300, 100, 30);

        userNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                userNameFieldFocusLost(evt);
            }
        });
        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(userNameField);
        userNameField.setBounds(220, 300, 220, 30);

        password.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        password.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        password.setText("Password :");
        getContentPane().add(password);
        password.setBounds(100, 340, 100, 30);

        confirmPasswor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        confirmPasswor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        confirmPasswor.setText("Confirm password :");
        getContentPane().add(confirmPasswor);
        confirmPasswor.setBounds(60, 380, 140, 30);

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton);
        submitButton.setBounds(320, 440, 100, 40);

        backButton.setText("Back");
        getContentPane().add(backButton);
        backButton.setBounds(170, 440, 100, 40);
        getContentPane().add(passwordCheck);
        passwordCheck.setBounds(450, 380, 30, 30);
        getContentPane().add(emailCheck);
        emailCheck.setBounds(450, 180, 30, 30);
        getContentPane().add(userNameCheck);
        userNameCheck.setBounds(450, 300, 30, 30);

        errorPassText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorPassText.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(errorPassText);
        errorPassText.setBounds(450, 340, 120, 30);

        passField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFieldFocusLost(evt);
            }
        });
        getContentPane().add(passField);
        passField.setBounds(220, 340, 220, 30);

        confirmField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmFieldFocusLost(evt);
            }
        });
        getContentPane().add(confirmField);
        confirmField.setBounds(220, 380, 220, 30);

        setSize(new java.awt.Dimension(618, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameFieldActionPerformed

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
        Image trueIcon = new ImageIcon(this.getClass().getResource("../icon/correct.png")).getImage();
        Image wrongIcon = new ImageIcon(this.getClass().getResource("../icon/wrong.png")).getImage();
        if (emailField.getText().indexOf("@") > 0) {
            emailField.setBackground(null);
            emailCheck.setIcon(new ImageIcon(trueIcon.getScaledInstance(emailCheck.getWidth(), emailCheck.getHeight(), 0)));
        } else {
            emailCheck.setIcon(new ImageIcon(wrongIcon.getScaledInstance(emailCheck.getWidth(), emailCheck.getHeight(), 0)));
            emailField.setBackground(Color.PINK);
        }
    }//GEN-LAST:event_emailFieldFocusLost

    private void userNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameFieldFocusLost
         try {
            Connection con = ConnectionBuilder.getConnection();
            Image trueIcon = new ImageIcon(this.getClass().getResource("../icon/correct.png")).getImage();
            Image wrongIcon = new ImageIcon(this.getClass().getResource("../icon/wrong.png")).getImage();
            PreparedStatement pstm = con.prepareStatement("SELECT username FROM ShopProfile WHERE username = ?");
            pstm.setString(1, userNameField.getText());
            ResultSet rs = pstm.executeQuery();
            if (userNameField.getText().length() > 0) {
                if (rs.next()) {
                    userNameCheck.setIcon(new ImageIcon(wrongIcon.getScaledInstance(userNameCheck.getWidth(), userNameCheck.getHeight(), 0)));
                    userNameField.setBackground(Color.PINK);
                } else {
                    userNameField.setBackground(null);
                    userNameCheck.setIcon(new ImageIcon(trueIcon.getScaledInstance(userNameCheck.getWidth(), userNameCheck.getHeight(), 0)));
                }
            } else {
                userNameCheck.setIcon(new ImageIcon(wrongIcon.getScaledInstance(userNameCheck.getWidth(), userNameCheck.getHeight(), 0)));
                userNameField.setBackground(Color.PINK);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterShop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_userNameFieldFocusLost

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try {
            Connection con = ConnectionBuilder.getConnection();
            if ((passField.getText().length() > 5) & (userNameField.getText().length() > 0) & (emailField.getText().indexOf("@") > 0)) {
                if (passField.getText().equals(confirmField.getText())) {
                    PreparedStatement pstm = con.prepareStatement("INSERT INTO ShopProfile (username, password, shopName, ownerName, "
                            + "ownerSurname, address, phone, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
                    pstm.setString(1, userNameField.getText());
                    pstm.setString(2, passField.getText());
                    pstm.setString(3, shopNameField.getText());
                    pstm.setString(4, nameField.getText());
                    pstm.setString(5, surnameField.getText());
                    pstm.setString(6, addressField.getText());
                    pstm.setString(7, telephoneField.getText());
                    pstm.setString(8, emailField.getText());
                    pstm.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Register Successful.");
                    userNameField.setText("");
                    passField.setText("");
                    shopNameField.setText("");
                    nameField.setText("");
                    surnameField.setText("");
                    addressField.setText("");
                    telephoneField.setText("");
                    emailField.setText("");
                    confirmField.setText("");
                    errorPassText.setText(null);
                    emailCheck.setIcon(null);
                    passwordCheck.setIcon(null);
                    userNameCheck.setIcon(null);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterShop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void passFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusLost
        if (passField.getText().length() >= 0 & passField.getText().length() <= 5) {
            errorPassText.setText("Password weak");
            passField.setBackground(Color.PINK);
        } else if (passField.getText().length() <= 10) {
            passField.setBackground(null);
            errorPassText.setText("Password medium");
        } else if (passField.getText().length() <= 45) {
            passField.setBackground(null);
            errorPassText.setText("Password Strong");
        } else {
            errorPassText.setText("Error");
            passField.setBackground(Color.PINK);
        }
    }//GEN-LAST:event_passFieldFocusLost

    private void confirmFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmFieldFocusLost
        Image trueIcon = new ImageIcon(this.getClass().getResource("../icon/correct.png")).getImage();
        Image wrongIcon = new ImageIcon(this.getClass().getResource("../icon/wrong.png")).getImage();
        if (passField.getText().length() <= 5 || passField.getText().length() > 45) {
            passwordCheck.setIcon(new ImageIcon(wrongIcon.getScaledInstance(passwordCheck.getWidth(), passwordCheck.getHeight(), 0)));
            passField.setBackground(Color.PINK);
        } else if (confirmField.getText().equals(passField.getText())) {
            passField.setBackground(null);
            passwordCheck.setIcon(new ImageIcon(trueIcon.getScaledInstance(passwordCheck.getWidth(), passwordCheck.getHeight(), 0)));
        } else {
            passwordCheck.setIcon(new ImageIcon(wrongIcon.getScaledInstance(passwordCheck.getWidth(), passwordCheck.getHeight(), 0)));
            passField.setBackground(Color.PINK);
        }
    }//GEN-LAST:event_confirmFieldFocusLost

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
            java.util.logging.Logger.getLogger(RegisterShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegisterShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Telephone;
    private javax.swing.JLabel address;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton backButton;
    private javax.swing.JPasswordField confirmField;
    private javax.swing.JLabel confirmPasswor;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailCheck;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel errorPassText;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel password;
    private javax.swing.JLabel passwordCheck;
    private javax.swing.JLabel registerTitle;
    private javax.swing.JLabel shopName;
    private javax.swing.JTextField shopNameField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel surname;
    private javax.swing.JTextField surnameField;
    private javax.swing.JTextField telephoneField;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel userNameCheck;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
