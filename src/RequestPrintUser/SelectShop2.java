/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RequestPrintUser;

import RequestPrintDatabase.ConnectionBuilder;
import RequestPrintLogin.LoginEPrinting;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Game
 */
public class SelectShop2 extends javax.swing.JFrame {

    private String Username;
    private int UserId;
    private String Link;
    private int DocCopies;
    private int ShopId;
    private String Message;
    //private int OrderID;

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

    public void setMessage(String Message) {
        this.Message = Message;
    }
    
    public void fetchShopList() {
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
            System.out.println(ex.getMessage());
        }
    }
    
    public void Back() {
        UserRequest usrreq = new UserRequest();
        usrreq.setUserId(UserId);
        usrreq.setUsername(Username);
        setVisible(false);
        usrreq.setVisible(true);
    }
    
    public void RequestBook() {
        try {
            int orderId = -1;
            int productID = -5;
            int shopID = -1;
            // TODO add your handling code here:
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date(System.currentTimeMillis());
            //System.out.println(sdf.format(date));
            String datestr = sdf.format(date);
            LoginEPrinting login = new LoginEPrinting();
            Connection con = ConnectionBuilder.getConnection();
            PreparedStatement pstmShopId = con.prepareStatement("SELECT shopID FROM ShopProfile WHERE shopName = '" + ShopList.getSelectedItem().toString() + "'");
            ResultSet rs = pstmShopId.executeQuery();
            while (rs.next()) {
                shopID = rs.getInt("shopID");
            }
            PreparedStatement pstm = con.prepareStatement("INSERT INTO Orders VALUES (null,?,?,?,?,?,?,?)");
            pstm.setInt(1, DocCopies);
            if (DocCopies > 0) {
                pstm.setString(2, "Pending Responding");
            } else if (DocCopies > 100) {
                pstm.setString(2, "Pending Payment");
            }
            pstm.setString(3, datestr);
            pstm.setString(4, Message);
            pstm.setString(5, Link);
            pstm.setInt(6, UserId);
            pstm.setInt(7, shopID);
            pstm.executeUpdate();
            //SELECT ProductID
            PreparedStatement pstm2 = con.prepareStatement("SELECT productID FROM Product WHERE ShopProfile_shopID = " + shopID);
            ResultSet rs2 = pstm2.executeQuery();
            while (rs2.next()) {
                productID = rs2.getInt("productID");
            }
            
            //SELECT OrderID
            PreparedStatement pstm3 = con.prepareStatement("SELECT MAX(orderID) FROM Orders");
            ResultSet rstest = pstm3.executeQuery();
            while (rstest.next()) {
                orderId = rstest.getInt("MAX(orderID)");
            }
            //INSERT SheetOrder
            PreparedStatement pstm4 = con.prepareStatement("INSERT INTO SheetOrder (productAmount, Order_orderID, Product_productID) VALUES (?, ?, ?)");
            pstm4.setInt(1, DocCopies);
            pstm4.setInt(2, orderId);
            pstm4.setInt(3, productID);
            pstm4.executeUpdate();
            con.close();
            pstm.close();
            pstm2.close();
            pstm3.close();
            pstm4.close();
            JOptionPane.showMessageDialog(null, "Thank you for chosing our shop.");
            setVisible(false);
            Back();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
    /**
     * Creates new form SelectShop2
     */
    public SelectShop2() {
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

        jLabel1 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        Request = new javax.swing.JButton();
        ShopList = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Select Shop to Request.");

        CancelButton.setText("Cancel");
        CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelButtonMouseClicked(evt);
            }
        });
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        Request.setText("Request");
        Request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RequestMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(CancelButton)
                        .addGap(93, 93, 93)
                        .addComponent(Request))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(ShopList, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ShopList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(Request))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        fetchShopList();
    }//GEN-LAST:event_formWindowActivated

    private void CancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseClicked
        // TODO add your handling code here:
        Back();
    }//GEN-LAST:event_CancelButtonMouseClicked

    private void RequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RequestMouseClicked
        // TODO add your handling code here:
        RequestBook();
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
            java.util.logging.Logger.getLogger(SelectShop2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectShop2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectShop2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectShop2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectShop2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton Request;
    private javax.swing.JComboBox<String> ShopList;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
