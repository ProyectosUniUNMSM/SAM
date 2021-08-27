/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author anthony.ricse
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public VentanaPrincipal() {
        initComponents();
        this.lblBotones.setIcon(setScalableFoto(this.lblBotones, "/imagenes/paneButton.jpg"));
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panContenedor = new javax.swing.JPanel();
        panBtns = new javax.swing.JPanel();
        btnInventario = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnBalance = new javax.swing.JButton();
        lblBotones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panContenedor.setMinimumSize(new java.awt.Dimension(950, 490));
        panContenedor.setPreferredSize(new java.awt.Dimension(950, 490));
        panContenedor.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 500));

        panBtns.setBackground(new java.awt.Color(51, 102, 0));
        panBtns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventaryBtn.PNG"))); // NOI18N
        btnInventario.setMinimumSize(new java.awt.Dimension(100, 100));
        btnInventario.setPreferredSize(new java.awt.Dimension(100, 100));
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        panBtns.add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 10, 80, 80));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MenuBtn.png"))); // NOI18N
        panBtns.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 10, 80, 80));

        btnBalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/DineroBtn.PNG"))); // NOI18N
        panBtns.add(btnBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 10, 80, 80));
        panBtns.add(lblBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 100));

        getContentPane().add(panBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 950, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBalance;
    public javax.swing.JButton btnInventario;
    public javax.swing.JButton btnMenu;
    public javax.swing.JLabel lblBotones;
    public javax.swing.JPanel panBtns;
    public javax.swing.JPanel panContenedor;
    // End of variables declaration//GEN-END:variables

    public Icon setScalableFoto(JLabel lbl, String direcc) {
        ImageIcon foto = new ImageIcon(getClass().getResource(direcc));
        Icon icono = new ImageIcon(foto.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), 1));
        return icono;
    }
}