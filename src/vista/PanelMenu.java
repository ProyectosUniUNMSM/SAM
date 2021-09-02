/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Comida;
import modelo.ListaPedido;
import modelo.Menu;
import modelo.Pedido;

public class PanelMenu extends javax.swing.JPanel {

    ListaPedido misPedidos = ListaPedido.getListaPedido();
    Menu miMenu = Menu.getMenu();
    PanelDatos panDatos = new PanelDatos(this);
    ArrayList<Pedido> recibido = misPedidos.getPedidos();
    ArrayList<Pedido> enviado = misPedidos.getPedidosListos();

    public PanelMenu() {
        initComponents();
        miMenu.setLlenarComidas();
        setComidasDelMenu();
        actualizarTablas();
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblFoodMenu1 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        btnFoodMenu1 = new javax.swing.JButton();
        lblFoodMenu2 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblFoodMenu3 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        btnFoodMenu3 = new javax.swing.JButton();
        lblFoodMenu4 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        btnFoodMenu4 = new javax.swing.JButton();
        lblFoodMenu5 = new javax.swing.JLabel();
        lblNombre5 = new javax.swing.JLabel();
        btnFoodMenu5 = new javax.swing.JButton();
        lblFoodMenu6 = new javax.swing.JLabel();
        lblNombre6 = new javax.swing.JLabel();
        btnFoodMenu6 = new javax.swing.JButton();
        lblFoodMenu7 = new javax.swing.JLabel();
        lblNombre7 = new javax.swing.JLabel();
        btnFoodMenu7 = new javax.swing.JButton();
        lblFoodMenu8 = new javax.swing.JLabel();
        lblNombre8 = new javax.swing.JLabel();
        btnFoodMenu8 = new javax.swing.JButton();
        btnFoodMenu2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRecibidos = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnviados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(180, 237, 131));
        setMinimumSize(new java.awt.Dimension(950, 500));
        setPreferredSize(new java.awt.Dimension(950, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(0, 140, 255));
        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(865, 460));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFoodMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodTemp.png"))); // NOI18N
        lblFoodMenu1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(lblFoodMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 100, 90));

        lblNombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre1.setText("Comida 1");
        jPanel1.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 100, -1));

        btnFoodMenu1.setBackground(new java.awt.Color(102, 102, 102));
        btnFoodMenu1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFoodMenu1.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodMenu1.setText("Agregar");
        btnFoodMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodMenu1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFoodMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 80, -1));

        lblFoodMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodTemp.png"))); // NOI18N
        lblFoodMenu2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(lblFoodMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 100, 90));

        lblNombre2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre2.setText("Comdia 2");
        jPanel1.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 141, 100, -1));

        lblFoodMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodTemp.png"))); // NOI18N
        lblFoodMenu3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(lblFoodMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 40, 100, 90));

        lblNombre3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre3.setText("Comida 3");
        jPanel1.add(lblNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 141, 100, -1));

        btnFoodMenu3.setBackground(new java.awt.Color(102, 102, 102));
        btnFoodMenu3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFoodMenu3.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodMenu3.setText("Agregar");
        btnFoodMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodMenu3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFoodMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 174, 80, -1));

        lblFoodMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodTemp.png"))); // NOI18N
        lblFoodMenu4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(lblFoodMenu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 100, 90));

        lblNombre4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre4.setText("Comida 4");
        jPanel1.add(lblNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 100, -1));

        btnFoodMenu4.setBackground(new java.awt.Color(102, 102, 102));
        btnFoodMenu4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFoodMenu4.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodMenu4.setText("Agregar");
        btnFoodMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodMenu4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFoodMenu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 80, -1));

        lblFoodMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodTemp.png"))); // NOI18N
        lblFoodMenu5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(lblFoodMenu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 100, 90));

        lblNombre5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre5.setText("Comida 5");
        jPanel1.add(lblNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 100, -1));

        btnFoodMenu5.setBackground(new java.awt.Color(102, 102, 102));
        btnFoodMenu5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFoodMenu5.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodMenu5.setText("Agregar");
        btnFoodMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodMenu5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFoodMenu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 80, -1));

        lblFoodMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodTemp.png"))); // NOI18N
        lblFoodMenu6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(lblFoodMenu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 100, 90));

        lblNombre6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre6.setText("Comida 6");
        jPanel1.add(lblNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 100, -1));

        btnFoodMenu6.setBackground(new java.awt.Color(102, 102, 102));
        btnFoodMenu6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFoodMenu6.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodMenu6.setText("Agregar");
        btnFoodMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodMenu6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFoodMenu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 80, -1));

        lblFoodMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodTemp.png"))); // NOI18N
        lblFoodMenu7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(lblFoodMenu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 220, 100, 90));

        lblNombre7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre7.setText("Comida 7");
        jPanel1.add(lblNombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 330, 100, -1));

        btnFoodMenu7.setBackground(new java.awt.Color(102, 102, 102));
        btnFoodMenu7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFoodMenu7.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodMenu7.setText("Agregar");
        btnFoodMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodMenu7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFoodMenu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 80, -1));

        lblFoodMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodTemp.png"))); // NOI18N
        lblFoodMenu8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(lblFoodMenu8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 100, 90));

        lblNombre8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre8.setText("Comida 8");
        jPanel1.add(lblNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 100, -1));

        btnFoodMenu8.setBackground(new java.awt.Color(102, 102, 102));
        btnFoodMenu8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFoodMenu8.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodMenu8.setText("Agregar");
        btnFoodMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodMenu8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFoodMenu8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 80, -1));

        btnFoodMenu2.setBackground(new java.awt.Color(102, 102, 102));
        btnFoodMenu2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFoodMenu2.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodMenu2.setText("Agregar");
        btnFoodMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodMenu2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFoodMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 80, -1));

        jTabbedPane1.addTab("Menú", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblRecibidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null,  new Boolean(true)},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Comida", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblRecibidos.setDoubleBuffered(true);
        tblRecibidos.setRowHeight(20);
        tblRecibidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRecibidosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRecibidos);

        tblEnviados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Comida", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblEnviados.setEnabled(false);
        tblEnviados.setRowHeight(20);
        jScrollPane1.setViewportView(tblEnviados);

        jLabel1.setText("Lista de Pedidos");

        jLabel3.setText("Pedidos Entregados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lista de Pedidos", jPanel2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 860, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFoodMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodMenu1ActionPerformed
        panDatos.setComidaAPedir(miMenu.getComida(0));
        panDatos.setVisible(true);
    }//GEN-LAST:event_btnFoodMenu1ActionPerformed

    private void btnFoodMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodMenu2ActionPerformed
        panDatos.setComidaAPedir(miMenu.getComida(1));
        panDatos.setVisible(true);
    }//GEN-LAST:event_btnFoodMenu2ActionPerformed

    private void btnFoodMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodMenu3ActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_btnFoodMenu3ActionPerformed

    private void btnFoodMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFoodMenu4ActionPerformed

    private void btnFoodMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFoodMenu5ActionPerformed

    private void btnFoodMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFoodMenu6ActionPerformed

    private void btnFoodMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodMenu7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFoodMenu7ActionPerformed

    private void btnFoodMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodMenu8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFoodMenu8ActionPerformed

    private void tblRecibidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRecibidosMouseClicked
        // TODO add your handling code here:
        int fila = tblRecibidos.getSelectedRow();
        boolean val = (boolean) tblRecibidos.getValueAt(fila, 3);
        recibido.get(fila).setEstado(val);
        actualizarTablas();
    }//GEN-LAST:event_tblRecibidosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnFoodMenu1;
    private javax.swing.JButton btnFoodMenu2;
    private javax.swing.JButton btnFoodMenu3;
    private javax.swing.JButton btnFoodMenu4;
    private javax.swing.JButton btnFoodMenu5;
    private javax.swing.JButton btnFoodMenu6;
    private javax.swing.JButton btnFoodMenu7;
    private javax.swing.JButton btnFoodMenu8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JLabel lblFoodMenu1;
    public javax.swing.JLabel lblFoodMenu2;
    public javax.swing.JLabel lblFoodMenu3;
    public javax.swing.JLabel lblFoodMenu4;
    public javax.swing.JLabel lblFoodMenu5;
    public javax.swing.JLabel lblFoodMenu6;
    public javax.swing.JLabel lblFoodMenu7;
    public javax.swing.JLabel lblFoodMenu8;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNombre5;
    private javax.swing.JLabel lblNombre6;
    private javax.swing.JLabel lblNombre7;
    private javax.swing.JLabel lblNombre8;
    public javax.swing.JTable tblEnviados;
    public javax.swing.JTable tblRecibidos;
    // End of variables declaration//GEN-END:variables

    public void setComidasDelMenu() {
        JLabel[] imagenes = {lblFoodMenu1, lblFoodMenu2, lblFoodMenu3, lblFoodMenu4,
            lblFoodMenu5, lblFoodMenu6, lblFoodMenu7, lblFoodMenu8};

        JLabel[] nombres = {lblNombre1, lblNombre2, lblNombre3, lblNombre4, lblNombre5,
            lblNombre6, lblNombre7, lblNombre8};

        for (int i = 0; i < miMenu.getTamaño(); i++) {
            if (miMenu.getComida(i) != null) {
                Comida c = miMenu.getComida(i);
                imagenes[i].setIcon(new ImageIcon(getClass().getResource(c.getImg())));
                nombres[i].setText(c.getNombre());
            }
        }
    }

    public void setTabla(ArrayList<Pedido> p, JTable tbl) {
        String[] columnas = {"Dni", "Nombre", "Comida", "Estado"};
        if (!p.equals(null)) {
            Object[][] miData = new Object[p.size()][4];
            for (int i = 0; i < p.size(); i++) {
                miData[i][0] = p.get(i).getDniCliente();
                miData[i][1] = p.get(i).getNombreCliente();
                miData[i][2] = p.get(i).getNombreComida();
                miData[i][3] = p.get(i).isEstado();
            }
            DefaultTableModel miDefaultTableModel = new DefaultTableModel(miData, columnas) {
                Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
                };

                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }
            };
            tbl.setModel(miDefaultTableModel);
        }

    }

    public void actualizarTablas() {
        //setTabla(misPedidos.getPedidos(), tblRecibidos);
        //setTabla(misPedidos.getPedidosListos(), tblEnviados);
        recibido = misPedidos.getPedidos();
        enviado = misPedidos.getPedidosListos();
        setTabla(recibido, tblRecibidos);
        setTabla(enviado, tblEnviados);

    }

    

}
