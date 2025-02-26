package View;

import Model.ff;
import Model.ff1;
import java.util.ArrayList;

public class form2 extends javax.swing.JFrame {

    ArrayList<ff1> userList = new ArrayList<>();
    
/////////////////////////////////// Contructor
    public form2() {
        initComponents();
        setLocationRelativeTo(null);
    }
/////////////////////// parameter contructor
    public form2(String userName) {
        initComponents();
        setLocationRelativeTo(null);
        
        userList = new DAO.ConnectionSQL().getListUser();
        if(!userName.equals("admin")){
            btManageCate.setVisible(false);
            btNewProduct.setVisible(false);
            btEdit.setVisible(false);
        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btLogout = new javax.swing.JButton();
        btChangePassword = new javax.swing.JButton();
        btViewBill = new javax.swing.JButton();
        btPlaceOrder = new javax.swing.JButton();
        btManageCate = new javax.swing.JButton();
        btNewProduct = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login.png"))); // NOI18N
        btLogout.setText("Log out");
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });

        btChangePassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btChangePassword.setText("Change password");
        btChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChangePasswordActionPerformed(evt);
            }
        });

        btViewBill.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btViewBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/View Bills & Order Placed Details.png"))); // NOI18N
        btViewBill.setText("View bill ");

        btPlaceOrder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btPlaceOrder.setText("Place Order");

        btManageCate.setText("Manage Category");
        btManageCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManageCateActionPerformed(evt);
            }
        });

        btNewProduct.setText("add New Product");
        btNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewProductActionPerformed(evt);
            }
        });

        btEdit.setText("View, Edit & Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btManageCate)
                    .addComponent(btPlaceOrder))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btNewProduct)
                        .addGap(43, 43, 43)
                        .addComponent(btEdit)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btViewBill)
                        .addGap(70, 70, 70)
                        .addComponent(btChangePassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 800, Short.MAX_VALUE)
                        .addComponent(btLogout)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLogout)
                    .addComponent(btChangePassword)
                    .addComponent(btViewBill)
                    .addComponent(btPlaceOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 792, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btManageCate)
                    .addComponent(btNewProduct)
                    .addComponent(btEdit))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//////////////////////////////////////button close
    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        // TODO add your handling code here:

        setVisible(false);
        new form3().setVisible(true);
    }//GEN-LAST:event_btLogoutActionPerformed
/////////////////////// button Manage Category
    private void btManageCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManageCateActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new form4().setVisible(true);
    }//GEN-LAST:event_btManageCateActionPerformed
/////////////////////// add new food 
    private void btNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewProductActionPerformed
        // TODO add your handling code here:
        new form6().setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_btNewProductActionPerformed
////////////////// button foget password
    private void btChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChangePasswordActionPerformed
        // TODO add your handling code here:
        new form1().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btChangePasswordActionPerformed

    
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
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChangePassword;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btLogout;
    private javax.swing.JButton btManageCate;
    private javax.swing.JButton btNewProduct;
    private javax.swing.JButton btPlaceOrder;
    private javax.swing.JButton btViewBill;
    // End of variables declaration//GEN-END:variables
}
