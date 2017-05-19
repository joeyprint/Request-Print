/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RequestPrintUser;

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

/**
 *
 * @author Game
 */
public class UserRequest extends javax.swing.JFrame {
    
    private String DocURL;
    private String Username;
    private int UserId;
    
    /**
     * Creates new form UserProfile
     */
    public UserRequest() {
        initComponents();
    }
    public void setUsername(String Username) {
        this.Username = Username;
    }
    
    public String getUsername() {
        return Username;
    }
    
    public void setUserId(int UserId) {
        this.UserId = UserId;
    }
    
    public int getuserId() {
        return UserId;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Request = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DocumentLink = new javax.swing.JTextField();
        LocationLink = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RequestHaed = new javax.swing.JLabel();
        NumberofCopies = new javax.swing.JSpinner();
        Copies = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        MessageLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        HomeBox = new javax.swing.JPanel();
        Home = new javax.swing.JLabel();
        RequestPrintBox = new javax.swing.JPanel();
        RequestPrint = new javax.swing.JLabel();
        YourProfileBox = new javax.swing.JPanel();
        YourProfile = new javax.swing.JLabel();
        BookListBox = new javax.swing.JPanel();
        BookList = new javax.swing.JLabel();
        LogoutBox = new javax.swing.JPanel();
        Logout = new javax.swing.JLabel();
        Headder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Request.setText("Request");
        Request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RequestMouseClicked(evt);
            }
        });
        Request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestActionPerformed(evt);
            }
        });
        getContentPane().add(Request, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, -1, -1));

        jLabel1.setText("beta 2");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));
        getContentPane().add(DocumentLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 410, -1));

        LocationLink.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LocationLink.setText("Location link");
        getContentPane().add(LocationLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel3.setText("Require cloud service (Google Drive , Onedrive , etc.)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        RequestHaed.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RequestHaed.setText("Request to print your document");
        getContentPane().add(RequestHaed, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));
        getContentPane().add(NumberofCopies, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        Copies.setText("Copies");
        getContentPane().add(Copies, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 520, 170));

        MessageLabel.setText("Message to shop.");
        getContentPane().add(MessageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        Home.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Home.setText("Home");

        javax.swing.GroupLayout HomeBoxLayout = new javax.swing.GroupLayout(HomeBox);
        HomeBox.setLayout(HomeBoxLayout);
        HomeBoxLayout.setHorizontalGroup(
            HomeBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeBoxLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(Home)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomeBoxLayout.setVerticalGroup(
            HomeBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeBoxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Home)
                .addContainerGap())
        );

        RequestPrintBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RequestPrint.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RequestPrint.setText("Request to Print");
        RequestPrintBox.add(RequestPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 179, 27));

        YourProfileBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YourProfileBoxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                YourProfileBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                YourProfileBoxMouseExited(evt);
            }
        });

        YourProfile.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        YourProfile.setText("Your Profile");

        javax.swing.GroupLayout YourProfileBoxLayout = new javax.swing.GroupLayout(YourProfileBox);
        YourProfileBox.setLayout(YourProfileBoxLayout);
        YourProfileBoxLayout.setHorizontalGroup(
            YourProfileBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YourProfileBoxLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(YourProfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        YourProfileBoxLayout.setVerticalGroup(
            YourProfileBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YourProfileBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(YourProfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        BookList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BookList.setText("Book List");

        javax.swing.GroupLayout BookListBoxLayout = new javax.swing.GroupLayout(BookListBox);
        BookListBox.setLayout(BookListBoxLayout);
        BookListBoxLayout.setHorizontalGroup(
            BookListBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookListBoxLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(BookList)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BookListBoxLayout.setVerticalGroup(
            BookListBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookListBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BookList)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        Logout.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Logout.setText("Logout");

        javax.swing.GroupLayout LogoutBoxLayout = new javax.swing.GroupLayout(LogoutBox);
        LogoutBox.setLayout(LogoutBoxLayout);
        LogoutBoxLayout.setHorizontalGroup(
            LogoutBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoutBoxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout)
                .addGap(67, 67, 67))
        );
        LogoutBoxLayout.setVerticalGroup(
            LogoutBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoutBoxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RequestPrintBox, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
            .addComponent(YourProfileBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BookListBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LogoutBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HomeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(YourProfileBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RequestPrintBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BookListBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LogoutBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, 500));

        Headder.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(Headder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 50));

        setSize(new java.awt.Dimension(793, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestActionPerformed
        // TODO add your handling code here:
        DocURL = DocumentLink.getText();
        SelectShop selc = new SelectShop();
        setVisible(false);
        selc.setVisible(true);
    }//GEN-LAST:event_RequestActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
            RequestPrintBox.setBackground(Color.black);
            RequestPrint.setForeground(Color.white);
            Headder.setText("Welcome , "+Username);
        
    }//GEN-LAST:event_formWindowActivated

    private void YourProfileBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YourProfileBoxMouseEntered
        // TODO add your handling code here:
        YourProfile.setForeground(Color.white);
        YourProfileBox.setBackground(Color.black);
    }//GEN-LAST:event_YourProfileBoxMouseEntered

    private void YourProfileBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YourProfileBoxMouseExited
        // TODO add your handling code here:
        YourProfile.setForeground(Color.black);
        YourProfileBox.setBackground(null);
    }//GEN-LAST:event_YourProfileBoxMouseExited

    private void YourProfileBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YourProfileBoxMouseClicked
        // TODO add your handling code here:
        Userprofile userp = new Userprofile();
        userp.setUserId(UserId);
        userp.setUsername(Username);
        setVisible(false);
        userp.setVisible(true);
    }//GEN-LAST:event_YourProfileBoxMouseClicked

    private void HomeBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBoxMouseEntered
        // TODO add your handling code here:
        Home.setForeground(Color.white);
        HomeBox.setBackground(Color.black);
    }//GEN-LAST:event_HomeBoxMouseEntered

    private void HomeBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBoxMouseExited
        // TODO add your handling code here:
        Home.setForeground(Color.black);
        HomeBox.setBackground(null);
    }//GEN-LAST:event_HomeBoxMouseExited

    private void HomeBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBoxMouseClicked
        // TODO add your handling code here:
        Home home = new Home();
        home.setUserId(UserId);
        home.setUsername(Username);
        home.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_HomeBoxMouseClicked

    private void BookListBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookListBoxMouseEntered
        // TODO add your handling code here:
        BookList.setForeground(Color.white);
        BookListBox.setBackground(Color.black);
    }//GEN-LAST:event_BookListBoxMouseEntered

    private void BookListBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookListBoxMouseExited
        // TODO add your handling code here:
        BookList.setForeground(Color.black);
        BookListBox.setBackground(null);
    }//GEN-LAST:event_BookListBoxMouseExited

    private void BookListBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookListBoxMouseClicked
        // TODO add your handling code here:
        BookList book = new BookList();
        book.setUserId(UserId);
        book.setUsername(Username);
        book.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BookListBoxMouseClicked

    private void LogoutBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBoxMouseEntered
        // TODO add your handling code here:
        Logout.setForeground(Color.white);
        LogoutBox.setBackground(Color.black);
    }//GEN-LAST:event_LogoutBoxMouseEntered

    private void LogoutBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBoxMouseExited
        // TODO add your handling code here:
        Logout.setForeground(Color.BLACK);
        LogoutBox.setBackground(null);
    }//GEN-LAST:event_LogoutBoxMouseExited

    private void LogoutBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBoxMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_LogoutBoxMouseClicked

    private void RequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RequestMouseClicked
        // TODO add your handling code here:
        int DocCopies = (int)NumberofCopies.getValue();
        SelectShop select = new SelectShop();
        select.setDocCopies(DocCopies);
        select.setUsername(Username);
        select.setUserId(UserId);
        select.setLink(DocumentLink.getText());
        select.setVisible(true);
    }//GEN-LAST:event_RequestMouseClicked

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
            java.util.logging.Logger.getLogger(UserRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookList;
    private javax.swing.JPanel BookListBox;
    private javax.swing.JLabel Copies;
    private javax.swing.JTextField DocumentLink;
    private javax.swing.JLabel Headder;
    private javax.swing.JLabel Home;
    private javax.swing.JPanel HomeBox;
    private javax.swing.JLabel LocationLink;
    private javax.swing.JLabel Logout;
    private javax.swing.JPanel LogoutBox;
    private javax.swing.JLabel MessageLabel;
    private javax.swing.JSpinner NumberofCopies;
    private javax.swing.JButton Request;
    private javax.swing.JLabel RequestHaed;
    private javax.swing.JLabel RequestPrint;
    private javax.swing.JPanel RequestPrintBox;
    private javax.swing.JLabel YourProfile;
    private javax.swing.JPanel YourProfileBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
