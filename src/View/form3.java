package View;

import Model.ff1;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//ffsfseesf
public class form3 extends javax.swing.JFrame {

    ArrayList<ff1> userList = new ArrayList<>();
/////////// Contructor
//ccccc
    public form3() {
        initComponents();
        setBackground(Color.yellow);
        userList = new DAO.ConnectionSQL().getListUser();
        btLogin.setEnabled(false);
        setLocationRelativeTo(null);
        setBackground(Color.YELLOW);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btLogin = new javax.swing.JButton();
        btSignup = new javax.swing.JButton();
        btFogetPassword = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("T Coffee Login Form");
        setBackground(new java.awt.Color(255, 153, 51));

        btClose.setBackground(new java.awt.Color(204, 255, 204));
        btClose.setFont(new java.awt.Font("Stencil Std", 1, 18)); // NOI18N
        btClose.setText("Exit");
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Wingdings 3", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setText("Username:");

        txtUsername.setBackground(new java.awt.Color(255, 102, 102));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 255, 51));
        txtUsername.setText(" ");
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Password:");

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btLogin.setBackground(new java.awt.Color(204, 255, 153));
        btLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLogin.setText("Login");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        btSignup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSignup.setText("Signup");
        btSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSignupActionPerformed(evt);
            }
        });

        btFogetPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btFogetPassword.setText("Forgot Password ?");
        btFogetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFogetPasswordActionPerformed(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(102, 0, 255));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(btLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 126, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(114, 114, 114)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btFogetPassword)
                        .addGap(68, 68, 68)
                        .addComponent(btSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btClose, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(514, 514, 514))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btClose, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)))
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSignup)
                    .addComponent(btFogetPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLogin)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
///////////////////////////////////////////////////////////////////////////////////////////////////////////close button
    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(rootPane, "Do you want to exit the app?", "Exit", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btCloseActionPerformed
///////////////////////////////////////////////////////////////////////////////////////Login button
    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed

        String userName = txtUsername.getText().trim(); // Lấy và loại bỏ khoảng trắng
        String password = txtPassword.getText().trim();

        boolean login = false;

        for (ff1 user : userList) {
            if (userName.equals(user.getUserName()) && password.equals(user.getPassWord())) {
                JOptionPane.showMessageDialog(rootPane, "Login success.");
                login = true;

                new form2(userName).setVisible(true);
                setVisible(false);
                break;
            }
        }

        if (!login) {
            JOptionPane.showMessageDialog(rootPane, "Incorrect username or password!");
        }
    }//GEN-LAST:event_btLoginActionPerformed
    ///////////////////////////////////////// validate - kiem tra hop le
    public void validateFields() {
        String userName = txtUsername.getText().trim(); // Lấy và loại bỏ khoảng trắng
        String password = txtPassword.getText().trim();
        if (!userName.equals("") && !password.equals("")) {
            btLogin.setEnabled(true);
        } else {
            btLogin.setEnabled(false);
        }
    }

    //
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }
        return min;
    }

    //
    public static void solveQ(int a, int b, int c) {
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Vô nghiệm.");
        } else {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Nghiệm 1: " + r1);
            System.out.println("Nghiệm 2: " + r2);
        }
    }// Lỗi: Không kiểm tra a có khác 0 hay không. Nếu a bằng 0, phương trình không phải là bậc 2
///////////////////////////////////////////sign up button
    private void btSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSignupActionPerformed
        // TODO add your handling code here:
        new form5().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btSignupActionPerformed
/////////////////////////// clear button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed
////////////////////////////////////////////////// KeyReleased
    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPasswordKeyReleased
//////////////////////////// foget password button
    private void btFogetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFogetPasswordActionPerformed
        // TODO add your handling code here:
        new form1().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btFogetPasswordActionPerformed
///////////////// clear method

    public void clear() {
        txtUsername.setText("");
        txtPassword.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form3().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClose;
    private javax.swing.JButton btFogetPassword;
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btSignup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
