/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RequestPrintShop;

import RequestPrintDatabase.ConnectionBuilder;
import RequestPrintLogin.LoginEPrinting;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class ResponPrint extends javax.swing.JFrame {

    private static int orderId;
    DefaultTableModel model;

    public static int getOrderId() {
        return orderId;
    }

    /**
     * Creates new form ResponPrint
     */
    public ResponPrint() {
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

        jPanel1 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        signOut = new javax.swing.JLabel();
        bgMenu = new javax.swing.JPanel();
        respondPrint = new javax.swing.JLabel();
        manageBook = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        responnPrintTitle = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        custNameField = new javax.swing.JLabel();
        telephone = new javax.swing.JLabel();
        telephoneField = new javax.swing.JLabel();
        order = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        emailField = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        statusField = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionField = new javax.swing.JTextPane();
        changeStatusButton = new javax.swing.JButton();
        productAmount = new javax.swing.JLabel();
        productAmountField = new javax.swing.JLabel();
        typeOrder = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        priceField = new javax.swing.JLabel();
        orderField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        home.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setText("Home");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel1.add(home);
        home.setBounds(0, 100, 190, 30);

        profile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setText("Profile");
        profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        jPanel1.add(profile);
        profile.setBounds(0, 150, 190, 30);

        signOut.setText("Sign out");
        signOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signOutMouseClicked(evt);
            }
        });
        jPanel1.add(signOut);
        signOut.setBounds(10, 500, 50, 16);

        bgMenu.setBackground(new java.awt.Color(204, 204, 204));

        respondPrint.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        respondPrint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        respondPrint.setText("Respond Print");
        respondPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bgMenuLayout = new javax.swing.GroupLayout(bgMenu);
        bgMenu.setLayout(bgMenuLayout);
        bgMenuLayout.setHorizontalGroup(
            bgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(respondPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgMenuLayout.setVerticalGroup(
            bgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(respondPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(bgMenu);
        bgMenu.setBounds(0, 250, 190, 30);

        manageBook.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageBook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageBook.setText("Manage Book");
        manageBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageBookMouseClicked(evt);
            }
        });
        jPanel1.add(manageBook);
        manageBook.setBounds(0, 200, 190, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 190, 520);

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OrderID", "Customer Name", "Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orderTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(200, 70, 500, 440);

        responnPrintTitle.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        responnPrintTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        responnPrintTitle.setText("Respond Print");
        getContentPane().add(responnPrintTitle);
        responnPrintTitle.setBounds(190, 15, 750, 40);

        customerName.setText("Customer name");
        getContentPane().add(customerName);
        customerName.setBounds(720, 70, 110, 20);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(610, 100, 190, 0);
        getContentPane().add(custNameField);
        custNameField.setBounds(730, 90, 190, 20);

        telephone.setText("Telephone");
        getContentPane().add(telephone);
        telephone.setBounds(720, 120, 110, 20);
        getContentPane().add(telephoneField);
        telephoneField.setBounds(730, 140, 190, 20);

        order.setText("Order");
        getContentPane().add(order);
        order.setBounds(720, 220, 40, 20);

        email.setText("Email");
        getContentPane().add(email);
        email.setBounds(720, 170, 110, 20);
        getContentPane().add(emailField);
        emailField.setBounds(730, 190, 190, 20);

        description.setText("Description");
        getContentPane().add(description);
        description.setBounds(720, 270, 110, 20);

        status.setText("Order status");
        getContentPane().add(status);
        status.setBounds(720, 470, 110, 20);
        getContentPane().add(statusField);
        statusField.setBounds(730, 490, 120, 20);

        jScrollPane2.setViewportView(descriptionField);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(730, 290, 190, 70);

        changeStatusButton.setText("change");
        changeStatusButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changeStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeStatusButtonActionPerformed(evt);
            }
        });
        getContentPane().add(changeStatusButton);
<<<<<<< HEAD
        changeStatusButton.setBounds(730, 490, 89, 29);
=======
        changeStatusButton.setBounds(850, 490, 73, 25);
>>>>>>> master

        productAmount.setText("Product Amount");
        getContentPane().add(productAmount);
        productAmount.setBounds(720, 370, 110, 20);
        getContentPane().add(productAmountField);
        productAmountField.setBounds(730, 390, 190, 20);

        typeOrder.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(typeOrder);
        typeOrder.setBounds(760, 220, 90, 20);

        price.setText("Price");
        getContentPane().add(price);
        price.setBounds(720, 420, 110, 20);
        getContentPane().add(priceField);
<<<<<<< HEAD
        priceField.setBounds(610, 440, 190, 20);

        orderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderFieldActionPerformed(evt);
            }
        });
        getContentPane().add(orderField);
        orderField.setBounds(610, 240, 190, 26);
=======
        priceField.setBounds(730, 440, 190, 20);
        getContentPane().add(orderField);
        orderField.setBounds(730, 240, 190, 30);
>>>>>>> master

        setSize(new java.awt.Dimension(952, 566));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void manageBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBookMouseClicked
        ManageListBook mlb = new ManageListBook();
        this.setVisible(false);
        mlb.setVisible(true);
    }//GEN-LAST:event_manageBookMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        model = (DefaultTableModel) orderTable.getModel();
        model.setRowCount(0);
        Connection con = null;
        try {
            con = ConnectionBuilder.getConnection();
            LoginEPrinting login = new LoginEPrinting();
            PreparedStatement pstmOrder = con.prepareStatement("SELECT * FROM mydb.Order WHERE "
                    + "ShopProfile_shopID = " + login.getShopId());
            ResultSet rsOrder = pstmOrder.executeQuery();
            rsOrder.next();
            PreparedStatement pstmUser = con.prepareStatement("SELECT * FROM UserProfile WHERE "
                    + "id = " + rsOrder.getInt("UserProfile_id"));
            ResultSet rsUser = pstmUser.executeQuery();
            while (rsUser.next()) {
                Vector v = new Vector();
                v.add(rsOrder.getInt("orderID"));
                v.add(rsUser.getString("name") + " " + rsUser.getString("surname"));
                v.add(rsOrder.getDate("datetime"));
                if (rsOrder.getString("status").equals("Product can be picked")) {
                    v.add("Wait for receipt");
                } else {
                    v.add(rsOrder.getString("status"));
                }
                model.addRow(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ResponPrint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        ShopProfile sProf = new ShopProfile();
        this.setVisible(false);
        sProf.setVisible(true);
    }//GEN-LAST:event_profileMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        bgMenu.setBackground(Color.DARK_GRAY);
        respondPrint.setBackground(Color.DARK_GRAY);
        respondPrint.setForeground(Color.WHITE);
        orderTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        orderTable.getColumnModel().getColumn(0).setPreferredWidth(60);
        orderTable.getColumnModel().getColumn(1).setPreferredWidth(160);
        orderTable.getColumnModel().getColumn(2).setPreferredWidth(79);
        orderTable.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
    }//GEN-LAST:event_formComponentShown

    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMouseClicked
        Connection con = null;
        try {
            con = ConnectionBuilder.getConnection();
            LoginEPrinting login = new LoginEPrinting();
            //executeQuery Order Table
            PreparedStatement pstmOrder = con.prepareStatement("SELECT * FROM mydb.Order WHERE "
                    + "ShopProfile_shopID = " + login.getShopId());
            ResultSet rsOrder = pstmOrder.executeQuery();
            rsOrder.next();

            //executeQuery UserProfile Table
            PreparedStatement pstmUser = con.prepareStatement("SELECT * FROM UserProfile WHERE "
                    + "id = " + rsOrder.getInt("UserProfile_id"));
            ResultSet rsUser = pstmUser.executeQuery();
            rsUser.next();

            //executeQuery SheetOrder Table
            PreparedStatement pstmSheetOrder = con.prepareStatement("SELECT * FROM SheetOrder WHERE "
                    + "Order_orderID = " + rsOrder.getInt("orderID"));
            ResultSet rsSheetOrder = pstmSheetOrder.executeQuery();
            rsSheetOrder.next();

            //executeQuery Product Table
            PreparedStatement pstmProduct = con.prepareStatement("SELECT * FROM Product WHERE "
                    + "productID = " + rsSheetOrder.getInt("Product_productID"));
            ResultSet rsProduct = pstmProduct.executeQuery();
            rsProduct.next();

            custNameField.setText(orderTable.getValueAt(orderTable.getSelectedRow(), 0) + "");
            statusField.setText(orderTable.getValueAt(orderTable.getSelectedRow(), 3) + "");
            telephoneField.setText(rsUser.getString("phone"));
            emailField.setText(rsUser.getString("email"));
            orderField.setEditable(false);
            //check Order
            if (rsOrder.getString("url") == null) {
                typeOrder.setText("* Book *");
                orderField.setText(rsProduct.getString("productName"));
            } else {
                typeOrder.setText("* URL *");
                orderField.setText(rsOrder.getString("url"));
            }
            //check description
            if (rsOrder.getString("description") == null) {
                descriptionField.setText("<null>");
            } else {
                descriptionField.setText(rsOrder.getString("description"));
            }
            descriptionField.setEditable(false); //don't edit text in descripton Field
            productAmountField.setText(rsSheetOrder.getInt("productAmount") + "");
            priceField.setText(rsOrder.getDouble("priceOrder") + "");

            orderId = (int) (orderTable.getValueAt(orderTable.getSelectedRow(), 0));
            System.out.println("Order id = " + orderId);
        } catch (SQLException ex) {
            Logger.getLogger(ResponPrint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_orderTableMouseClicked

<<<<<<< HEAD
    private void orderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderFieldActionPerformed
=======
    private void signOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutMouseClicked
        LoginEPrinting login = new LoginEPrinting();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_signOutMouseClicked

    private void changeStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeStatusButtonActionPerformed
        ChangeStatus change = new ChangeStatus();
        change.setVisible(true);
    }//GEN-LAST:event_changeStatusButtonActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        Home home = new Home();
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_homeMouseClicked
>>>>>>> master

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set thbgMenuook and feel */
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
            java.util.logging.Logger.getLogger(ResponPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResponPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResponPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResponPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResponPrint().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgMenu;
    private javax.swing.JButton changeStatusButton;
    private javax.swing.JLabel custNameField;
    private javax.swing.JLabel customerName;
    private javax.swing.JLabel description;
    private javax.swing.JTextPane descriptionField;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailField;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel manageBook;
    private javax.swing.JLabel order;
    private javax.swing.JTextField orderField;
    private javax.swing.JTable orderTable;
    private javax.swing.JLabel price;
    private javax.swing.JLabel priceField;
    private javax.swing.JLabel productAmount;
    private javax.swing.JLabel productAmountField;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel respondPrint;
    private javax.swing.JLabel responnPrintTitle;
    private javax.swing.JLabel signOut;
    private javax.swing.JLabel status;
    private javax.swing.JLabel statusField;
    private javax.swing.JLabel telephone;
    private javax.swing.JLabel telephoneField;
    private javax.swing.JLabel typeOrder;
    // End of variables declaration//GEN-END:variables
}
