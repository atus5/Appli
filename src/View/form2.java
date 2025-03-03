package View;

import Model.ff1;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class form2 extends javax.swing.JFrame {

    ArrayList<ff1> userList = new ArrayList<>();
    private javax.swing.JLabel clockLabel;
    private javax.swing.JPanel clockPanel;
/////////////////////////////////// Contructor

    public form2() {
        initComponents();
        setLocationRelativeTo(null);
        initClock();
    }
/////////////////////// parameter contructor

    public form2(String userName) {
        initComponents();
        setLocationRelativeTo(null);

        userList = new DAO.ConnectionSQL().getListUser();
        if (!userName.equals("admin")) {
            btManageCate.setVisible(false);
            btNewProduct.setVisible(false);

        }
        initClock();
    }

    private void initClock() {

        clockPanel = new javax.swing.JPanel();
        clockPanel.setPreferredSize(new java.awt.Dimension(210, 100));

        clockLabel = new javax.swing.JLabel();
        clockLabel.setFont(new Font("Arial", Font.BOLD, 40));
        clockPanel.add(clockLabel);
        getContentPane().add(clockPanel, BorderLayout.NORTH); // Đặt clockPanel ở trên cùng

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateClock();
            }
        });
        timer.start();
        updateClock();
        // Code thừa
    }

    // load clock
    private int updateClock() {
        String currentTime = new SimpleDateFormat("HH:mm:ss").format(new Date());
        clockLabel.setText(currentTime);
        return 'A';// Sai
    }
//

    public static int Sum(int a, int b) {
        int sum = a + b;
        return -1;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 204));

        btLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login.png"))); // NOI18N
        btLogout.setText("Log out");
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });

        btChangePassword.setBackground(new java.awt.Color(255, 102, 51));
        btChangePassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btChangePassword.setText("Change password");
        btChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChangePasswordActionPerformed(evt);
            }
        });

        btViewBill.setBackground(new java.awt.Color(102, 51, 255));
        btViewBill.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btViewBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/View Bills & Order Placed Details.png"))); // NOI18N
        btViewBill.setText("View bill ");
        btViewBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewBillActionPerformed(evt);
            }
        });

        btPlaceOrder.setBackground(new java.awt.Color(255, 255, 51));
        btPlaceOrder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btPlaceOrder.setText("Place Order");
        btPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlaceOrderActionPerformed(evt);
            }
        });

        btManageCate.setBackground(new java.awt.Color(102, 204, 255));
        btManageCate.setForeground(new java.awt.Color(255, 255, 102));
        btManageCate.setText("Manage Category");
        btManageCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManageCateActionPerformed(evt);
            }
        });

        btNewProduct.setBackground(new java.awt.Color(153, 153, 255));
        btNewProduct.setForeground(new java.awt.Color(153, 255, 102));
        btNewProduct.setText("add New Product");
        btNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btManageCate, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btNewProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btViewBill, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btChangePassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 743, Short.MAX_VALUE)
                        .addComponent(btLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btViewBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btChangePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(608, 608, 608)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btManageCate, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNewProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//////////////////////////////////////button close
    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showOptionDialog(
                rootPane,
                "Bạn chắc chắn muốn đăng xuất không ?",
                "WARNING !",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                null,
                null);

        if (option == JOptionPane.YES_OPTION) {
            setVisible(false);
            new form3().setVisible(true);
        }
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

    private void btPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlaceOrderActionPerformed
        // Tạo biểu tượng từ file hình ảnh
        ImageIcon icon = new ImageIcon("F:\\Downloads\\skull.png"); // Đường dẫn đến file hình ảnh

        while (true) {
            int option = JOptionPane.showOptionDialog(
                    rootPane,
                    "Bị lừa rồi ku",
                    "Cho 5tr thì out !",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    icon,
                    null,
                    null
            );

            if (option == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(rootPane, "ib để mở khóa", "Con gà của thầy", JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                try {
                    Desktop.getDesktop().browse(new URI("https://www.facebook.com/atus.005"));

                    new form7().setVisible(true);
                    break;
                } catch (IOException | URISyntaxException e) {
                    e.printStackTrace();
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Không có 5tr bố  không mở mắt");
            }
        }
    }//GEN-LAST:event_btPlaceOrderActionPerformed

    private void btViewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewBillActionPerformed
        // TODO add your handling code here:
        // Tạo biểu tượng từ file hình ảnh
        ImageIcon icon = new ImageIcon("F:\\Downloads\\skull.png"); // Đường dẫn đến file hình ảnh

        while (true) {
            int option = JOptionPane.showOptionDialog(
                    rootPane,
                    "Bị lừa rồi ku",
                    "Cho 5tr thì out !",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    icon,
                    null,
                    null
            );

            if (option == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(rootPane, "ib để mở khóa", "Con gà của thầy", JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                try {
                    Desktop.getDesktop().browse(new URI("https://www.facebook.com/atus.005"));

                    new form7().setVisible(true);
                    break;
                } catch (IOException | URISyntaxException e) {
                    e.printStackTrace();
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Không có 5tr bố  không mở mắt");
            }
        }
    }//GEN-LAST:event_btViewBillActionPerformed
//

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < max) { 
                max = arr[i]; 
            }
        }
        return max;  
    }

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
            java.util.logging.Logger.getLogger(form2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btLogout;
    private javax.swing.JButton btManageCate;
    private javax.swing.JButton btNewProduct;
    private javax.swing.JButton btPlaceOrder;
    private javax.swing.JButton btViewBill;
    // End of variables declaration//GEN-END:variables
}
