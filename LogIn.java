
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pinCodePF = new javax.swing.JPasswordField();
        accountNumberTF = new javax.swing.JTextField();
        logInButton = new javax.swing.JButton();
        exitAppButton = new javax.swing.JButton();
        koquetteFront = new javax.swing.JLabel();
        koquetteBack = new javax.swing.JLabel();
        banLabel = new javax.swing.JLabel();
        taglineLabel = new javax.swing.JLabel();
        pincodeLabel = new javax.swing.JLabel();
        accNameLabel = new javax.swing.JLabel();
        jShowPasswordCB = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Account Log In");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 214, 214));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pinCodePF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinCodePFActionPerformed(evt);
            }
        });
        jPanel1.add(pinCodePF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 150, 30));

        accountNumberTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberTFActionPerformed(evt);
            }
        });
        jPanel1.add(accountNumberTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 150, 30));

        logInButton.setBackground(new java.awt.Color(255, 153, 153));
        logInButton.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        logInButton.setForeground(new java.awt.Color(255, 255, 255));
        logInButton.setText("Enter");
        logInButton.setActionCommand("LOGIN");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 80, 30));

        exitAppButton.setBackground(new java.awt.Color(255, 153, 153));
        exitAppButton.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        exitAppButton.setForeground(new java.awt.Color(255, 255, 255));
        exitAppButton.setText("Exit");
        exitAppButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitAppButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitAppButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 80, 30));

        koquetteFront.setFont(new java.awt.Font("Brush Script MT", 1, 48)); // NOI18N
        koquetteFront.setForeground(new java.awt.Color(153, 0, 0));
        koquetteFront.setText("Koquette");
        jPanel1.add(koquetteFront, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 5, 150, -1));

        koquetteBack.setFont(new java.awt.Font("Brush Script MT", 1, 48)); // NOI18N
        koquetteBack.setForeground(new java.awt.Color(255, 255, 255));
        koquetteBack.setText("Koquette");
        jPanel1.add(koquetteBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 10, 150, -1));

        banLabel.setFont(new java.awt.Font("Bodoni MT", 3, 24)); // NOI18N
        banLabel.setForeground(new java.awt.Color(204, 0, 51));
        banLabel.setText("Ban");
        jPanel1.add(banLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 25, 60, 30));

        taglineLabel.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        taglineLabel.setForeground(new java.awt.Color(204, 0, 0));
        taglineLabel.setText("Transact with Style");
        jPanel1.add(taglineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 200, -1));

        pincodeLabel.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        pincodeLabel.setForeground(new java.awt.Color(151, 62, 4));
        pincodeLabel.setText("6-Digit Pin: ");
        jPanel1.add(pincodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, -1));

        accNameLabel.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        accNameLabel.setForeground(new java.awt.Color(151, 62, 4));
        accNameLabel.setText("Account Number:");
        jPanel1.add(accNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jShowPasswordCB.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jShowPasswordCB.setForeground(new java.awt.Color(153, 51, 0));
        jShowPasswordCB.setText("Show Password");
        jShowPasswordCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowPasswordCBActionPerformed(evt);
            }
        });
        jPanel1.add(jShowPasswordCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 189, 189));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 340, 10));

        jPanel3.setBackground(new java.awt.Color(255, 189, 189));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 350, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pinCodePFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinCodePFActionPerformed
            
    }//GEN-LAST:event_pinCodePFActionPerformed

    private void accountNumberTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberTFActionPerformed
        
    }//GEN-LAST:event_accountNumberTFActionPerformed

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        //Accnumber = 1418 Pin = 012924
        if(accountNumberTF.getText().equals("") || pinCodePF.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Fields must not be Empty", "Empty Fields", JOptionPane.ERROR_MESSAGE);
            
        }else if(!accountNumberTF.getText().matches("\\d{4}")){
            JOptionPane.showMessageDialog(this, "Please Enter a Valid Account Number", "Wrong Input", JOptionPane.ERROR_MESSAGE);
            
        }else if (!accountNumberTF.getText().equals("1418")){
            JOptionPane.showMessageDialog(this, "Incorrect Account Number", "Wrong Input", JOptionPane.ERROR_MESSAGE);
            
        } else if (!pinCodePF.getText().matches("\\d{6}")){
            JOptionPane.showMessageDialog(this, "Enter only a 6-Digit Pin!", "Wrong Input", JOptionPane.ERROR_MESSAGE);
            
        } else if (pinCodePF.getText().matches("\\d{6}") && !pinCodePF.getText().equals("012924")){
            JOptionPane.showMessageDialog(this, "Incorrect Pin!", "Wrong Input", JOptionPane.ERROR_MESSAGE);
            
        }else{
            JOptionPane.showMessageDialog(this, "Welcome,Myne!\n\nYour Current Balance: Php 1000.0", "LogIn Successful", JOptionPane.INFORMATION_MESSAGE);
        
            
            BankMenu menu = new BankMenu();
            dispose(); //disposes login
            menu.show(); //shows menu page, default tab
        }
        
    }//GEN-LAST:event_logInButtonActionPerformed

    private void jShowPasswordCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowPasswordCBActionPerformed
        
        if(jShowPasswordCB.isSelected()){
            pinCodePF.setEchoChar((char)0);
        } else {
            pinCodePF.setEchoChar('*');
        }
        
    }//GEN-LAST:event_jShowPasswordCBActionPerformed

    private void exitAppButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitAppButtonActionPerformed
        
        dispose(); //disposes the login page
        
        int reply = JOptionPane.showConfirmDialog(this, "Exit Application?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
            if (reply == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(this, "Exiting Application...\nThank You for your time!");
               

            } else {
                JOptionPane.showMessageDialog(null, "Going back to Login Page...");
                LogIn login = new LogIn();
                login.setVisible(true);
                
            }   
            
    }//GEN-LAST:event_exitAppButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accNameLabel;
    private javax.swing.JTextField accountNumberTF;
    private javax.swing.JLabel banLabel;
    private javax.swing.JButton exitAppButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox jShowPasswordCB;
    private javax.swing.JLabel koquetteBack;
    private javax.swing.JLabel koquetteFront;
    private javax.swing.JButton logInButton;
    private javax.swing.JPasswordField pinCodePF;
    private javax.swing.JLabel pincodeLabel;
    private javax.swing.JLabel taglineLabel;
    // End of variables declaration//GEN-END:variables
}
