/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypt;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/**
 *
 * @author AbhijeetDesai
 */
public class Aes extends javax.swing.JFrame {

    /**
     * Creates new form Aes
     */
    private static String Algo="AES";
    private byte [] keyValue;
    private  AES256 aes_obj;
    
    public Aes() {
        initComponents();
        setTitle("Password Data Encryption");
        aes_obj=new AES256();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_cipher = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_decryption = new javax.swing.JTextArea();
        encrypt = new javax.swing.JButton();
        decrypt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_plaintext = new javax.swing.JTextArea();
        jTextField_password = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea_cipher.setEditable(false);
        jTextArea_cipher.setColumns(20);
        jTextArea_cipher.setRows(5);
        jTextArea_cipher.setBorder(javax.swing.BorderFactory.createTitledBorder("Cipher"));
        jScrollPane1.setViewportView(jTextArea_cipher);

        jTextArea_decryption.setEditable(false);
        jTextArea_decryption.setColumns(20);
        jTextArea_decryption.setRows(5);
        jTextArea_decryption.setBorder(javax.swing.BorderFactory.createTitledBorder("Decryption"));
        jScrollPane2.setViewportView(jTextArea_decryption);

        encrypt.setText("Encrypt");
        encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptActionPerformed(evt);
            }
        });

        decrypt.setText("Decrypt");
        decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptActionPerformed(evt);
            }
        });

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea_plaintext.setColumns(20);
        jTextArea_plaintext.setRows(5);
        jTextArea_plaintext.setBorder(javax.swing.BorderFactory.createTitledBorder("Plain Text"));
        jScrollPane3.setViewportView(jTextArea_plaintext);

        jTextField_password.setBorder(javax.swing.BorderFactory.createTitledBorder("Password"));
        jTextField_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jTextField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(encrypt)
                        .addGap(48, 48, 48)
                        .addComponent(decrypt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(encrypt)
                            .addComponent(decrypt)
                            .addComponent(jButton1))
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextArea_plaintext.setText("");
        jTextArea_cipher.setText("");
        jTextArea_decryption.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_passwordActionPerformed

    private void encryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptActionPerformed
        try {
            // TODO add your handling code here:
            aes_obj.setKey(jTextField_password.getText().toString());
            jTextArea_cipher.setText(aes_obj.encrypt(jTextArea_plaintext.getText()));
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Aes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Aes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_encryptActionPerformed

    private void decryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptActionPerformed
        // TODO add your handling code here:
        aes_obj.setKey(jTextField_password.getText().toString());
        jTextArea_decryption.setText(aes_obj.decrypt(jTextArea_cipher.getText()));
    }//GEN-LAST:event_decryptActionPerformed

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
            java.util.logging.Logger.getLogger(Aes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decrypt;
    private javax.swing.JButton encrypt;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea_cipher;
    private javax.swing.JTextArea jTextArea_decryption;
    private javax.swing.JTextArea jTextArea_plaintext;
    private javax.swing.JTextField jTextField_password;
    // End of variables declaration//GEN-END:variables
}
