/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import modelo.Boleta;
import modelo.Caja;

/**
 *
 * @author AlexTprog
 */
public class PanelBalance extends javax.swing.JPanel {

    /**
     * Creates new form panelBalance
     */
    public PanelBalance() {
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        panFactura = new javax.swing.JPanel();
        panEncabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnFactura = new javax.swing.JButton();
        cbxClientes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblFechaCliente = new javax.swing.JLabel();
        lblNomCliente = new javax.swing.JLabel();
        lblDniCliente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panPrecio = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panBalance = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblTotalVentas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPlato = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBalance = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(180, 237, 131));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 179, 102)));
        setMinimumSize(new java.awt.Dimension(950, 600));
        setPreferredSize(new java.awt.Dimension(950, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setBackground(new java.awt.Color(0, 140, 255));
        jTabbedPane2.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        panFactura.setBackground(new java.awt.Color(255, 255, 255));
        panFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panEncabezado.setBackground(new java.awt.Color(210, 232, 172));
        panEncabezado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 179, 102)));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Información");

        javax.swing.GroupLayout panEncabezadoLayout = new javax.swing.GroupLayout(panEncabezado);
        panEncabezado.setLayout(panEncabezadoLayout);
        panEncabezadoLayout.setHorizontalGroup(
            panEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEncabezadoLayout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel1)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        panEncabezadoLayout.setVerticalGroup(
            panEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panFactura.add(panEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 820, -1));

        btnFactura.setBackground(new java.awt.Color(0, 140, 255));
        btnFactura.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnFactura.setText("Pagar");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        panFactura.add(btnFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 100, 47));

        cbxClientes.setEditable(true);
        cbxClientes.setForeground(new java.awt.Color(102, 102, 102));
        cbxClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente 1", "Cliente 2", "Cliente 3", "Cliente 4" }));
        panFactura.add(cbxClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 62, 100, -1));

        jLabel2.setText("Cliente:");
        panFactura.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 63, 50, 20));

        lblFechaCliente.setText("FECHA DE FACTURA");
        panFactura.add(lblFechaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, -1, -1));

        lblNomCliente.setText("NOMBRE Y APELLIDO CLIENTE");
        panFactura.add(lblNomCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        lblDniCliente.setText("DNI CLIENTE");
        panFactura.add(lblDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel4.setText("FECHA:");
        panFactura.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, -1, -1));

        jLabel5.setText("DNI:");
        panFactura.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panFactura.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 810, 240));

        panPrecio.setBackground(new java.awt.Color(204, 204, 204));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotal.setText("00.00");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("TOTAL:");

        javax.swing.GroupLayout panPrecioLayout = new javax.swing.GroupLayout(panPrecio);
        panPrecio.setLayout(panPrecioLayout);
        panPrecioLayout.setHorizontalGroup(
            panPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPrecioLayout.createSequentialGroup()
                .addContainerGap(660, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(49, 49, 49)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panPrecioLayout.setVerticalGroup(
            panPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrecioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panFactura.add(panPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 507, 810, -1));

        jScrollPane4.setViewportView(panFactura);

        jTabbedPane2.addTab("Boleta", jScrollPane4);

        panBalance.setBackground(new java.awt.Color(255, 255, 255));
        panBalance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Total de Ventas:");
        panBalance.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 180, 30));

        lblTotalVentas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotalVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalVentas.setText("NUMERO");
        panBalance.add(lblTotalVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 90, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Plato mas Vendido:");
        panBalance.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 220, 30));

        lblPlato.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPlato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlato.setText("PLATO");
        panBalance.add(lblPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, 20));

        tblBalance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblBalance);

        panBalance.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 470, 240));

        jButton1.setBackground(new java.awt.Color(0, 140, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("IMPRIMIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panBalance.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 170, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Fin del Dia");
        panBalance.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jScrollPane3.setViewportView(panBalance);

        jTabbedPane2.addTab("Balance", jScrollPane3);

        add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 870, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFactura;
    private javax.swing.JComboBox<String> cbxClientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDniCliente;
    private javax.swing.JLabel lblFechaCliente;
    private javax.swing.JLabel lblNomCliente;
    private javax.swing.JLabel lblPlato;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalVentas;
    private javax.swing.JPanel panBalance;
    private javax.swing.JPanel panEncabezado;
    private javax.swing.JPanel panFactura;
    private javax.swing.JPanel panPrecio;
    private javax.swing.JTable tblBalance;
    // End of variables declaration//GEN-END:variables

    public void setTablaBoletas(Caja c) {
        String[] columnas = {"DNI", "Nombre", "Fecha", "Monto", "Estado"};
        Object[][] miData = new Object[c.getTamaño()][5];
        Boleta b = c.getUltimo();
        for (int i = 0; i < c.getTamaño(); i++) {
            b.calcMonto();
            miData[i][0] = b.cliente.getDni();
            miData[i][1] = b.cliente.getNombre();
            miData[i][2] = b.fecha;
            miData[i][3] = b.monto;
            miData[i][4] = b.estado;
            b = b.sig;
        }
        DefaultTableModel modelo = new DefaultTableModel(miData, columnas);
        tblBalance.setModel(modelo);
    }
    
    public void setNumeroVentas(Caja c) {
        int ventas = c.getTamaño();
        lblTotalVentas.setText(String.valueOf(ventas));
    }
    
    public void setPlatoMasVendido(Caja c) {
        ArrayList<String> comidas = new ArrayList<>();
        Boleta b = c.getUltimo();
        for (int i = 0; i < c.getTamaño(); i++) {
            for (int j = 0; j < b.pedidos.size(); j++) {
                comidas.add(b.pedidos.get(j).comida.nombre);
            }
            b = b.sig;
        }
        
        System.out.println(comidas.toString());
        int max = 0;
        int curr = 0;
        String currKey = null;
        Set<String> unique = new HashSet<String>(comidas);
        for (String key : unique) {
            curr = Collections.frequency(comidas, key);
            if (max < curr) {
                max = curr;
                currKey = key;
            }
        }
        lblPlato.setText(currKey);
    }
}
