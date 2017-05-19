/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RequestPrintUser;

import RequestPrintDatabase.ConnectionBuilder;
import RequestPrintLogin.LoginEPrinting;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import java.lang.String;
import java.sql.Date;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 *
 * @author Game
 */
public class SelectShop extends javax.swing.JFrame {

    private String Username;
    private int UserId;
    private String Link;
    private int DocCopies;
    private int ShopId;
    private String Message;
    private int OrderID;

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public void setDocCopies(int DocCopies) {
        this.DocCopies = DocCopies;
    }

    public String getUsername() {
        return Username;
    }

    public int getUserId() {
        return UserId;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Creates new form SelectShop
     */
    public SelectShop() {
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

        CancleButton = new javax.swing.JButton();
        Request = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ShopList = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CancleButton.setText("Cancel");
        CancleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancleButtonMouseClicked(evt);
            }
        });
        CancleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

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
        getContentPane().add(Request, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Select shop to request.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, -1, -1));

        ShopList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShopListActionPerformed(evt);
            }
        });
        getContentPane().add(ShopList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 360, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancleButtonActionPerformed

    private void CancleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancleButtonMouseClicked
        // TODO add your handling code here:
        UserRequest usrreq = new UserRequest();
        usrreq.setUserId(UserId);
        usrreq.setUsername(Username);
        setVisible(false);
        usrreq.setVisible(true);
    }//GEN-LAST:event_CancleButtonMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            // TODO add your handling code here:
            Connection con = ConnectionBuilder.getConnection();
            PreparedStatement pstm = con.prepareStatement("SELECT shopName FROM ShopProfile");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ShopList.addItem(rs.getString("shopName"));
            }

            con.close();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(SelectShop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void ShopListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShopListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShopListActionPerformed

    private void RequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RequestMouseClicked
    }//GEN-LAST:event_RequestMouseClicked

    private void RequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestActionPerformed
        try {
            System.out.println("Click");
            //int OrderID = -1;
            int productID = -5;
            int shopID = -1;
            // TODO add your handling code here:
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date(System.currentTimeMillis());
            //System.out.println(sdf.format(date));
            String datestr = sdf.format(date);
            LoginEPrinting login = new LoginEPrinting();
            Connection con = ConnectionBuilder.getConnection();
            PreparedStatement pstmShopId = con.prepareStatement("SELECT shopID FROM ShopProfile WHERE shopName = '"+ ShopList.getSelectedItem().toString()+"'");
            ResultSet rs = pstmShopId.executeQuery();
            while(rs.next()){
                shopID = rs.getInt("shopID");
            }
            System.out.println("shopID "+shopID);
            PreparedStatement pstm = con.prepareStatement("INSERT INTO Orders VALUES (null,?,?,?,?,?,?,?)");
            System.out.println("DocCopies : " + DocCopies);
            System.out.println("datestr : " + datestr);
            System.out.println("Message : " + Message);
            System.out.println("Link : " + Link);
            System.out.println("getUserId : " + login.getUserId());
            pstm.setInt(1, DocCopies);
            if (DocCopies > 0) {
                pstm.setString(2, "Pending Responding");
            } else if (DocCopies > 100) {
                pstm.setString(2, "Pending Payment");
            }
            pstm.setString(3, datestr);
            pstm.setString(4, Message);
            pstm.setString(5, Link);
            pstm.setInt(6, login.getUserId());
            pstm.setInt(7, shopID);
            pstm.executeUpdate();
            //SELECT ProductID
            PreparedStatement pstm2 = con.prepareStatement("SELECT productID FROM Product WHERE ShopProfile_shopID = "+shopID);
            ResultSet rs2 = pstm2.executeQuery();
            while(rs2.next()){
                productID = rs2.getInt("productID");
                System.out.println(productID);
            }
            //SELECT OrderID
            PreparedStatement pstm3 = con.prepareStatement("SELECT orderID FROM Orders ORDER BY orderID DESC LIMIT 0,1");
            ResultSet rstest = pstm3.executeQuery();
            while(rs.next()){
                OrderID = rstest.getInt("orderID");
            }
            
            //INSERT SheetOrder
            PreparedStatement pstm4 = con.prepareStatement("INSERT INTO SheetOrder (productAmount , Order_orderid , Product_productID) VALUES (? , ? , ?)");
            pstm4.setInt(1, DocCopies);
            System.out.println("OrderID : "+OrderID);
            System.out.println("productID : "+productID);
            pstm4.setInt(2, OrderID);
            pstm4.setInt(3, productID);
            pstm4.executeUpdate();
            con.close();
            pstm.close();
            //pstm2.close();
            pstm3.close();
            pstm4.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_RequestActionPerformed

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
            java.util.logging.Logger.getLogger(SelectShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancleButton;
    private javax.swing.JButton Request;
    private javax.swing.JComboBox<String> ShopList;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
