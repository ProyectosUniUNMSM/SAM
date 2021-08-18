/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

/**
 *
 * @author anthony.ricse
 */
public class principal extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form principal
     */
     
    Ingrediente panel1 = new Ingrediente();
      
    private Icon icono;
    public principal() {
        initComponents();
           lblBotonoes.setIcon(setScalableFoto(lblBotonoes, "/imagenes/paneButton.jpg"));
            btnIngre.setIcon(setIconoButton("/imagenes/inventaryBtn_1.PNG", btnIngre));
          btnIngre.setIcon(seticonIconPresionado("/imagenes/inventaryBtn_1.PNG", btnIngre, 10, 10));
        
        /*imagenTableTextPanel1*/
           ImageIcon carne = new ImageIcon(getClass().getResource("/imagenes/carneText.png")); 
           ImageIcon Tamaño = new ImageIcon(carne.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
           panel1.TablaIngrediente.setIconAt(1, Tamaño );
           
           ImageIcon verudra = new ImageIcon(getClass().getResource("/imagenes/verduraText.png")); 
           ImageIcon TamañoV = new ImageIcon(verudra.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
           panel1.TablaIngrediente.setIconAt(0, TamañoV );
      
       
        this.setLocationRelativeTo(null);
       
        contenedor.add(panel1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnIngre = new javax.swing.JButton();
        lblBotonoes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor.setMinimumSize(new java.awt.Dimension(950, 600));
        contenedor.setPreferredSize(new java.awt.Dimension(950, 600));
        contenedor.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIngre.setMinimumSize(new java.awt.Dimension(100, 100));
        btnIngre.setPreferredSize(new java.awt.Dimension(100, 100));
        btnIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngreActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));
        jPanel1.add(lblBotonoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 110));

        contenedor.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(contenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngreActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }
    public Icon setIconoButton(String direcc , JButton button){
        ImageIcon icon = new ImageIcon(getClass().getResource(direcc));
            int ancho = button.getWidth();
            int alto = button.getHeight();
            ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT));
            return icono;
    }
    public Icon seticonIconPresionado(String direcc , JButton boton , int ancho , int altura){
        ImageIcon icon = new ImageIcon(getClass().getResource(direcc));
        int width = boton.getWidth()  - ancho ; 
        int heigth = boton.getHeight() - altura;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, heigth, Image.SCALE_DEFAULT));
           return icono;
    }
    public Icon setScalableFoto(JLabel lbl,String direcc ){
        ImageIcon foto = new ImageIcon(getClass().getResource(direcc));
        Icon icono = new ImageIcon(foto.getImage().getScaledInstance(
                lbl.getWidth() ,
                lbl.getHeight(),
                1));
    return  icono;
    }
    

       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngre;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBotonoes;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
