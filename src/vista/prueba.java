/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author anthony.ricse
 */
public class prueba extends javax.swing.JPanel {

    /**
     * Creates new form prueba
     */
    public prueba() {
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

        panelPrueba = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(950, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrueba.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salirBtn2.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelPrueba.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 50, 50));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoPrincipal.png"))); // NOI18N
        panelPrueba.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 630));

        add(panelPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSalir;
    public javax.swing.JLabel lblFondo;
    public javax.swing.JPanel panelPrueba;
    // End of variables declaration//GEN-END:variables
}
