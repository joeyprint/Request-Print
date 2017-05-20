/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RequestPrintUser;

import RequestPrintDatabase.ConnectionBuilder;
import RequestPrintLogin.LoginEPrinting;
import RequestPrintShop.EditShopProfile;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Userprofile extends javax.swing.JFrame {
    
    private String Username;
    private int UserId;

    public Userprofile() {
        initComponents();
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }
    
    public void EditProfile() {
        EditUserProfile editUProf = new EditUserProfile();
        editUProf.setVisible(true);
    }
    
    public void fetchProfile() {
        try {
            // TODO add your handling code here:
            Connection con = null;
            con = ConnectionBuilder.getConnection();
            LoginEPrinting login = new LoginEPrinting();
            PreparedStatement pstm = con.prepareStatement("SELECT name,surname,email,phone FROM UserProfile WHERE id = " + login.getUserId());
            ResultSet rs = pstm.executeQuery();
            System.out.println(login.getUserId());
            while(rs.next()) {
                System.out.println("a");
                NameLabel.setText(rs.getString("name"));
                SurnameLabel.setText(rs.getString("surname"));
                EmailLabel.setText(rs.getString("email"));
                PhoneLabel.setText(rs.getString("phone"));
            }
            con.close();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(Userprofile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void callBookList() {
        BookList book = new BookList();
        book.setUserId(UserId);
        book.setUsername(Username);
        book.setVisible(true);
        setVisible(false);
    }
    
    public void Logout() {
        System.exit(0);
    }
    
    public void callHome() {
        Home h = new Home();
        h.setUserId(UserId);
        h.setUsername(Username);
        h.setVisible(true);
        setVisible(false);
    }
    
    public void callRequestPage() {
        UserRequest userreq = new UserRequest();
        userreq.setUserId(UserId);
        userreq.setUsername(Username);
        userreq.setVisible(true);
        setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Surname = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        SurnameLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        Edit = new javax.swing.JButton();
        Navbar = new javax.swing.JPanel();
        HomeBox = new javax.swing.JPanel();
        HomeLabel = new javax.swing.JLabel();
        YourProfileBox = new javax.swing.JPanel();
        YourProfileLabel = new javax.swing.JLabel();
        RequestBox = new javax.swing.JPanel();
        RequestLabel = new javax.swing.JLabel();
        BookListBox = new javax.swing.JPanel();
        BookListLabel = new javax.swing.JLabel();
        LogoutBox = new javax.swing.JPanel();
        LogoutLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nithan", 0, 24)); // NOI18N
        jLabel1.setText("Your Profile");

        Name.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        Name.setText("Name : ");

        Surname.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        Surname.setText("Surname : ");

        Email.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        Email.setText("Email : ");

        Phone.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        Phone.setText("Telephone : ");

        NameLabel.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N

        SurnameLabel.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N

        EmailLabel.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N

        PhoneLabel.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        HomeBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HomeBox.setPreferredSize(new java.awt.Dimension(210, 51));
        HomeBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBoxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeBoxMouseExited(evt);
            }
        });

        HomeLabel.setFont(new java.awt.Font("Moon", 0, 24)); // NOI18N
        HomeLabel.setText("Home");

        javax.swing.GroupLayout HomeBoxLayout = new javax.swing.GroupLayout(HomeBox);
        HomeBox.setLayout(HomeBoxLayout);
        HomeBoxLayout.setHorizontalGroup(
            HomeBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeBoxLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(HomeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomeBoxLayout.setVerticalGroup(
            HomeBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        YourProfileBox.setPreferredSize(new java.awt.Dimension(210, 51));

        YourProfileLabel.setFont(new java.awt.Font("Moon", 0, 24)); // NOI18N
        YourProfileLabel.setText("Your Profile");

        javax.swing.GroupLayout YourProfileBoxLayout = new javax.swing.GroupLayout(YourProfileBox);
        YourProfileBox.setLayout(YourProfileBoxLayout);
        YourProfileBoxLayout.setHorizontalGroup(
            YourProfileBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YourProfileBoxLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(YourProfileLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        YourProfileBoxLayout.setVerticalGroup(
            YourProfileBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YourProfileBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(YourProfileLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RequestBox.setPreferredSize(new java.awt.Dimension(210, 51));
        RequestBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RequestBoxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RequestBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RequestBoxMouseExited(evt);
            }
        });

        RequestLabel.setFont(new java.awt.Font("Moon", 0, 24)); // NOI18N
        RequestLabel.setText("Request to Print");

        javax.swing.GroupLayout RequestBoxLayout = new javax.swing.GroupLayout(RequestBox);
        RequestBox.setLayout(RequestBoxLayout);
        RequestBoxLayout.setHorizontalGroup(
            RequestBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RequestLabel)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        RequestBoxLayout.setVerticalGroup(
            RequestBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RequestLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BookListBox.setPreferredSize(new java.awt.Dimension(210, 51));
        BookListBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookListBoxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BookListBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BookListBoxMouseExited(evt);
            }
        });

        BookListLabel.setFont(new java.awt.Font("Moon", 0, 24)); // NOI18N
        BookListLabel.setText("Book List");

        javax.swing.GroupLayout BookListBoxLayout = new javax.swing.GroupLayout(BookListBox);
        BookListBox.setLayout(BookListBoxLayout);
        BookListBoxLayout.setHorizontalGroup(
            BookListBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookListBoxLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(BookListLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BookListBoxLayout.setVerticalGroup(
            BookListBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookListBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BookListLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LogoutBox.setPreferredSize(new java.awt.Dimension(210, 51));
        LogoutBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBoxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutBoxMouseExited(evt);
            }
        });

        LogoutLabel.setFont(new java.awt.Font("Moon", 0, 24)); // NOI18N
        LogoutLabel.setText("Logout");

        javax.swing.GroupLayout LogoutBoxLayout = new javax.swing.GroupLayout(LogoutBox);
        LogoutBox.setLayout(LogoutBoxLayout);
        LogoutBoxLayout.setHorizontalGroup(
            LogoutBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoutBoxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutLabel)
                .addGap(72, 72, 72))
        );
        LogoutBoxLayout.setVerticalGroup(
            LogoutBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoutLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout NavbarLayout = new javax.swing.GroupLayout(Navbar);
        Navbar.setLayout(NavbarLayout);
        NavbarLayout.setHorizontalGroup(
            NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeBox, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
            .addComponent(YourProfileBox, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
            .addComponent(RequestBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
            .addComponent(BookListBox, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
            .addComponent(LogoutBox, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );
        NavbarLayout.setVerticalGroup(
            NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavbarLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(HomeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(YourProfileBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(RequestBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(BookListBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(LogoutBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Name)
                                    .addComponent(Phone)
                                    .addComponent(Surname)
                                    .addComponent(Email))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                                .addComponent(SurnameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 193, Short.MAX_VALUE)
                                .addComponent(Edit)
                                .addGap(176, 176, 176))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(138, 138, 138))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Surname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(SurnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PhoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addComponent(Edit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        EditProfile();
    }//GEN-LAST:event_EditActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Navbar.setBackground(Color.LIGHT_GRAY);
        HomeBox.setBackground(null);
        YourProfileBox.setBackground(null);
        RequestBox.setBackground(null);
        BookListBox.setBackground(null);
        LogoutBox.setBackground(null);
        fetchProfile();
        YourProfileLabel.setForeground(Color.white);
        YourProfileBox.setBackground(Color.black);
    }//GEN-LAST:event_formWindowActivated

    private void HomeBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBoxMouseEntered
        // TODO add your handling code here:
        HomeBox.setBackground(Color.black);
        HomeLabel.setForeground(Color.white);
    }//GEN-LAST:event_HomeBoxMouseEntered

    private void HomeBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBoxMouseExited
        // TODO add your handling code here:
        HomeBox.setBackground(null);
        HomeLabel.setForeground(Color.black);
    }//GEN-LAST:event_HomeBoxMouseExited

    private void RequestBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RequestBoxMouseEntered
        // TODO add your handling code here:
        RequestBox.setBackground(Color.black);
        RequestLabel.setForeground(Color.white);
    }//GEN-LAST:event_RequestBoxMouseEntered

    private void RequestBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RequestBoxMouseExited
        // TODO add your handling code here:
        RequestBox.setBackground(null);
        RequestLabel.setForeground(Color.black);
    }//GEN-LAST:event_RequestBoxMouseExited

    private void BookListBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookListBoxMouseEntered
        // TODO add your handling code here:
        BookListLabel.setForeground(Color.white);
        BookListBox.setBackground(Color.black);
    }//GEN-LAST:event_BookListBoxMouseEntered

    private void BookListBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookListBoxMouseExited
        // TODO add your handling code here:
        BookListLabel.setForeground(Color.black);
        BookListBox.setBackground(null);
    }//GEN-LAST:event_BookListBoxMouseExited

    private void LogoutBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBoxMouseEntered
        // TODO add your handling code here:
        LogoutBox.setBackground(Color.BLACK);
        LogoutLabel.setForeground(Color.white);
    }//GEN-LAST:event_LogoutBoxMouseEntered

    private void LogoutBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBoxMouseExited
        // TODO add your handling code here:
        LogoutBox.setBackground(null);
        LogoutLabel.setForeground(Color.black);
    }//GEN-LAST:event_LogoutBoxMouseExited

    private void LogoutBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBoxMouseClicked
        // TODO add your handling code here:
        Logout();
    }//GEN-LAST:event_LogoutBoxMouseClicked

    private void BookListBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookListBoxMouseClicked
        // TODO add your handling code here:
        callBookList();
    }//GEN-LAST:event_BookListBoxMouseClicked

    private void HomeBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBoxMouseClicked
        // TODO add your handling code here:
        callHome();
    }//GEN-LAST:event_HomeBoxMouseClicked

    private void RequestBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RequestBoxMouseClicked
        // TODO add your handling code here:
        callRequestPage();
    }//GEN-LAST:event_RequestBoxMouseClicked

    

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
            java.util.logging.Logger.getLogger(Userprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Userprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Userprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Userprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Userprofile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BookListBox;
    private javax.swing.JLabel BookListLabel;
    private javax.swing.JButton Edit;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JPanel HomeBox;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JPanel LogoutBox;
    private javax.swing.JLabel LogoutLabel;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JPanel Navbar;
    private javax.swing.JLabel Phone;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JPanel RequestBox;
    private javax.swing.JLabel RequestLabel;
    private javax.swing.JLabel Surname;
    private javax.swing.JLabel SurnameLabel;
    private javax.swing.JPanel YourProfileBox;
    private javax.swing.JLabel YourProfileLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
