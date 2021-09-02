/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import modelo.Caja;
import modelo.Cliente;
import modelo.Comida;
import modelo.ListaPedido;
import modelo.Pedido;

/**
 *
 * @author anthony.ricse
 */
public class PanelDatos extends javax.swing.JFrame {

    private Comida comida; //Comida que se va a pedir    
    Caja micaja = Caja.getCaja();
    ListaPedido misPedidos = ListaPedido.getListaPedido();
    PanelMenu conexion;

    public PanelDatos(PanelMenu menu) {
        this.conexion = menu;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrueba = new javax.swing.JPanel();
        txtDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        lblFotos = new javax.swing.JLabel();
        lblNombreComida = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panPrueba.setBackground(new java.awt.Color(102, 255, 102));
        panPrueba.setMinimumSize(new java.awt.Dimension(400, 400));
        panPrueba.setPreferredSize(new java.awt.Dimension(400, 400));
        panPrueba.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panPrueba.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 120, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        panPrueba.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("DNI:");
        panPrueba.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 40, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Agregar Pedido");
        panPrueba.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 140, -1));

        btnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        panPrueba.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menos.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panPrueba.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));
        panPrueba.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, -1));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        panPrueba.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 80, 50));
        panPrueba.add(lblFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 100, 100));
        panPrueba.add(lblNombreComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 140, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Precio: S/.");
        panPrueba.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, 30));

        getContentPane().add(panPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Cliente client = new Cliente(txtNombre.getText(), txtDni.getText());
        Pedido pedido = new Pedido(comida, client);
        misPedidos.addPedido(pedido);
        micaja.addPedidoBoleta(pedido);
        dispose();
        conexion.actualizarTablas();
        limpiarCampos();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        conexion.actualizarTablas();
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel lblFotos;
    public javax.swing.JLabel lblNombreComida;
    public javax.swing.JLabel lblPrecio;
    public javax.swing.JPanel panPrueba;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    public void setComidaAPedir(Comida c) {
        this.comida = c;
        lblPrecio.setText("" + comida.getPrecio());
        lblNombreComida.setText(comida.getNombre());
        lblFotos.setIcon(new javax.swing.ImageIcon(getClass().getResource(comida.getImg())));
    }

    public void limpiarCampos() {
        lblNombreComida.setText("");
        lblPrecio.setText("");
        txtNombre.setText("");
        txtDni.setText("");
    }

}
