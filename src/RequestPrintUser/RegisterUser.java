/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RequestPrintUser;

import RequestPrintDatabase.ConnectionBuilder;
import RequestPrintLogin.LoginEPrinting;
import RequestPrintShop.RegisterShop;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.PasswordField;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class RegisterUser extends javax.swing.JFrame {

    boolean checkall = true;

    /**
     * Creates new form Register
     */
    public RegisterUser() {
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

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        backBG = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        backButton = new javax.swing.JLabel();
        BG = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        surname = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        telephoneField = new javax.swing.JTextField();
        telephone = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        password = new javax.swing.JLabel();
        confirmPass = new javax.swing.JLabel();
        confirmField = new javax.swing.JPasswordField();
        confirmPassCheck = new javax.swing.JLabel();
        emailCheck = new javax.swing.JLabel();
        userNameCheck = new javax.swing.JLabel();
        errorPassText = new javax.swing.JLabel();
        submitBG = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        submitButton = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Moon", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 630, 40);

        jPanel2.setBackground(new java.awt.Color(228, 228, 228));
        jPanel2.setLayout(null);

        backBG.setBackground(new java.awt.Color(255, 255, 153));
        backBG.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 153));
        jPanel6.setLayout(null);
        backBG.add(jPanel6);
        jPanel6.setBounds(30, 380, 290, 40);

        backButton.setFont(new java.awt.Font("Cloud Light", 0, 18)); // NOI18N
        backButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backButton.setText("Back");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonMouseExited(evt);
            }
        });
        backBG.add(backButton);
        backButton.setBounds(0, 0, 290, 40);

        jPanel2.add(backBG);
        backBG.setBounds(20, 380, 290, 40);

        BG.setLayout(null);

        name.setFont(new java.awt.Font("Moon", 1, 16)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name.setText("Name :");
        BG.add(name);
        name.setBounds(130, 20, 70, 30);

        nameField.setFont(new java.awt.Font("Cloud Light", 0, 14)); // NOI18N
        BG.add(nameField);
        nameField.setBounds(220, 20, 220, 30);

        surnameField.setFont(new java.awt.Font("Cloud Light", 0, 14)); // NOI18N
        BG.add(surnameField);
        surnameField.setBounds(220, 60, 220, 30);

        surname.setFont(new java.awt.Font("Moon", 1, 16)); // NOI18N
        surname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        surname.setText("Surname :");
        BG.add(surname);
        surname.setBounds(90, 60, 110, 30);

        email.setFont(new java.awt.Font("Moon", 1, 16)); // NOI18N
        email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        email.setText("Email :");
        BG.add(email);
        email.setBounds(90, 100, 110, 30);

        emailField.setFont(new java.awt.Font("Cloud Light", 0, 14)); // NOI18N
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });
        BG.add(emailField);
        emailField.setBounds(220, 100, 220, 30);

        telephoneField.setFont(new java.awt.Font("Cloud Light", 0, 14)); // NOI18N
        BG.add(telephoneField);
        telephoneField.setBounds(220, 140, 220, 30);

        telephone.setFont(new java.awt.Font("Moon", 1, 16)); // NOI18N
        telephone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telephone.setText("Telephone :");
        BG.add(telephone);
        telephone.setBounds(90, 140, 110, 30);

        userName.setFont(new java.awt.Font("Moon", 1, 16)); // NOI18N
        userName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userName.setText("Username :");
        BG.add(userName);
        userName.setBounds(90, 180, 110, 30);

        userNameField.setFont(new java.awt.Font("Cloud Light", 0, 14)); // NOI18N
        userNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                userNameFieldFocusLost(evt);
            }
        });
        BG.add(userNameField);
        userNameField.setBounds(220, 180, 220, 30);

        passField.setFont(new java.awt.Font("Cloud Light", 0, 14)); // NOI18N
        passField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFieldFocusLost(evt);
            }
        });
        BG.add(passField);
        passField.setBounds(220, 220, 220, 30);

        password.setFont(new java.awt.Font("Moon", 1, 16)); // NOI18N
        password.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        password.setText("Password :");
        BG.add(password);
        password.setBounds(90, 220, 110, 30);

        confirmPass.setFont(new java.awt.Font("Moon", 1, 16)); // NOI18N
        confirmPass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        confirmPass.setText("Confirm Password :");
        BG.add(confirmPass);
        confirmPass.setBounds(20, 260, 181, 30);

        confirmField.setFont(new java.awt.Font("Cloud Light", 0, 14)); // NOI18N
        confirmField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmFieldFocusLost(evt);
            }
        });
        BG.add(confirmField);
        confirmField.setBounds(220, 260, 220, 30);
        BG.add(confirmPassCheck);
        confirmPassCheck.setBounds(450, 260, 30, 30);
        BG.add(emailCheck);
        emailCheck.setBounds(450, 100, 30, 30);
        BG.add(userNameCheck);
        userNameCheck.setBounds(450, 180, 30, 30);

        errorPassText.setFont(new java.awt.Font("Cloud Light", 0, 14)); // NOI18N
        errorPassText.setForeground(new java.awt.Color(255, 0, 0));
        BG.add(errorPassText);
        errorPassText.setBounds(450, 220, 130, 30);

        jPanel2.add(BG);
        BG.setBounds(20, 60, 590, 310);

        submitBG.setBackground(new java.awt.Color(153, 255, 153));
        submitBG.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));
        jPanel4.setLayout(null);
        submitBG.add(jPanel4);
        jPanel4.setBounds(30, 380, 290, 40);

        submitButton.setFont(new java.awt.Font("Cloud Light", 0, 18)); // NOI18N
        submitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submitButton.setText("Submit");
        submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitButtonMouseExited(evt);
            }
        });
        submitBG.add(submitButton);
        submitButton.setBounds(0, 0, 290, 40);

        jPanel2.add(submitBG);
        submitBG.setBounds(320, 380, 290, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 810, 620);

        setSize(new java.awt.Dimension(632, 471));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseClicked
        regis();
        this.setVisible(false);
        LoginEPrinting login = new LoginEPrinting();
        login.setVisible(true);
    }//GEN-LAST:event_submitButtonMouseClicked

    private void submitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseEntered
        
    }//GEN-LAST:event_submitButtonMouseEntered

    private void submitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseExited
        
    }//GEN-LAST:event_submitButtonMouseExited

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        LoginEPrinting login = new LoginEPrinting();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backButtonMouseClicked

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        
    }//GEN-LAST:event_backButtonMouseExited

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
        checkEmail();
    }//GEN-LAST:event_emailFieldFocusLost

    private void userNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameFieldFocusLost
        checkUserName();
    }//GEN-LAST:event_userNameFieldFocusLost

    private void passFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusLost
        checkPassword();
    }//GEN-LAST:event_passFieldFocusLost

    private void confirmFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmFieldFocusLost
        checkConfirmPass();
    }//GEN-LAST:event_confirmFieldFocusLost

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        getContentPane().setBackground(new java.awt.Color(138, 204, 203));
        submitButton.setBackground(new java.awt.Color(88,153,152));
        backButton.setBackground(new java.awt.Color(88,153,152));
        submitBG.setForeground(Color.white);
        backBG.setForeground(Color.white);
        
    }//GEN-LAST:event_formWindowActivated

    public void checkEmail() {
        Image trueIcon = new ImageIcon(this.getClass().getResource("../icon/correct.png")).getImage();
        Image wrongIcon = new ImageIcon(this.getClass().getResource("../icon/wrong.png")).getImage();
        if (emailField.getText().indexOf("@") > 0) {
            emailField.setBackground(null);
            emailCheck.setIcon(new ImageIcon(trueIcon.getScaledInstance(emailCheck.getWidth(), emailCheck.getHeight(), 0)));
        } else {
            emailCheck.setIcon(new ImageIcon(wrongIcon.getScaledInstance(emailCheck.getWidth(), emailCheck.getHeight(), 0)));
            emailField.setBackground(Color.PINK);
        }
    }

    public void checkUserName() {
        try {
            Connection con = ConnectionBuilder.getConnection();
            Image trueIcon = new ImageIcon(this.getClass().getResource("../icon/correct.png")).getImage();
            Image wrongIcon = new ImageIcon(this.getClass().getResource("../icon/wrong.png")).getImage();
            PreparedStatement pstm = con.prepareStatement("SELECT username FROM UserProfile WHERE username = ?");
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
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegisterShop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void checkPassword() {
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
    }

    public void checkConfirmPass() {
        Image trueIcon = new ImageIcon(this.getClass().getResource("../icon/correct.png")).getImage();
        Image wrongIcon = new ImageIcon(this.getClass().getResource("../icon/wrong.png")).getImage();
        if (passField.getText().length() <= 5 || passField.getText().length() > 45) {
            confirmPassCheck.setIcon(new ImageIcon(wrongIcon.getScaledInstance(confirmPassCheck.getWidth(), confirmPassCheck.getHeight(), 0)));
            passField.setBackground(Color.PINK);
        } else if (confirmField.getText().equals(passField.getText())) {
            passField.setBackground(null);
            confirmPassCheck.setIcon(new ImageIcon(trueIcon.getScaledInstance(confirmPassCheck.getWidth(), confirmPassCheck.getHeight(), 0)));
        } else {
            confirmPassCheck.setIcon(new ImageIcon(wrongIcon.getScaledInstance(confirmPassCheck.getWidth(), confirmPassCheck.getHeight(), 0)));
            passField.setBackground(Color.PINK);
        }
    }

    public void regis() {
        try {
            System.out.println(name.getText());

            if (name.getText() != "" && surname.getText() != "" && userNameField.getText() != ""
                    && password.getText() != "" && emailField.getText() != "" && telephoneField.getText() != "") {
                if (checkall) {
                    //   JOptionPane.showConfirmDialog(null, "Do you confirm?", "Message", JOptionPane.YES_NO_OPTION);
                    int confirm = JOptionPane.showOptionDialog(this, "Are You confirm?", "CONFIRM", JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, null, null);
                    if (confirm == JOptionPane.YES_OPTION) {
                        Connection con = ConnectionBuilder.getConnection();
                        String sql = "INSERT INTO UserProfile(id,username,password,name,surname,address,phone,email) VALUES (null,?,?,?,?,null,?,?)";
                        PreparedStatement pstm = con.prepareStatement(sql);
                        pstm.setString(3, nameField.getText());
                        pstm.setString(4, surnameField.getText());
                        pstm.setString(6, emailField.getText());
                        pstm.setString(5, telephoneField.getText());
                        pstm.setString(1, userNameField.getText());
                        pstm.setString(2, passField.getText());
                        pstm.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Registered Successfully.");
                        nameField.setText("");
                        surnameField.setText("");
                        emailField.setText("");
                        telephoneField.setText("");
                        userNameField.setText("");
                        passField.setText("");
                        errorPassText.setText("");
                        userNameCheck.setIcon(null);
                        con.close();
                        pstm.close();
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel backBG;
    private javax.swing.JLabel backButton;
    private javax.swing.JPasswordField confirmField;
    private javax.swing.JLabel confirmPass;
    private javax.swing.JLabel confirmPassCheck;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailCheck;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel errorPassText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel password;
    private javax.swing.JPanel submitBG;
    private javax.swing.JLabel submitButton;
    private javax.swing.JLabel surname;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel telephone;
    private javax.swing.JTextField telephoneField;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel userNameCheck;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
