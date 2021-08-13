/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author anthony.ricse
 */
public class principalFrm extends javax.swing.JFrame {

    /**
     * Creates new form principalFrm
     */
    public principalFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("image/logo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salirBtn = new javax.swing.JButton();
        dineroBtn = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnInventory = new javax.swing.JButton();
        fondoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/salirBtn2.png"))); // NOI18N
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });
        getContentPane().add(salirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 29, 50, 50));

        dineroBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/DineroBtn.PNG"))); // NOI18N
        dineroBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dineroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dineroBtnActionPerformed(evt);
            }
        });
        getContentPane().add(dineroBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 130, 120));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/MenuBtn2.png"))); // NOI18N
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 130, 130));

        btnInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/inventaryBtn.PNG"))); // NOI18N
        btnInventory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 338, 140, 130));

        fondoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Imagen3.png"))); // NOI18N
        getContentPane().add(fondoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 730, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
System.exit(0);    }//GEN-LAST:event_salirBtnActionPerformed

    private void dineroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dineroBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dineroBtnActionPerformed

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
        IngredientesFrm ingre = new IngredientesFrm();
        
                ingre.setVisible(true);
                
                ingre.setLocationRelativeTo(null);
                
    }//GEN-LAST:event_btnInventoryActionPerformed

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
            java.util.logging.Logger.getLogger(principalFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principalFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principalFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principalFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principalFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton dineroBtn;
    private javax.swing.JLabel fondoLbl;
    private javax.swing.JButton salirBtn;
    // End of variables declaration//GEN-END:variables
}
