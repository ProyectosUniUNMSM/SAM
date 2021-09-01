/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Comida;
import modelo.ListaPedido;
import modelo.Menu;
import modelo.Pedido;

public class PanelMenu extends javax.swing.JPanel {

    ListaPedido misPedidos = ListaPedido.getListaPedido();
    Menu miMenu = Menu.getMenu();

    ArrayList<Pedido> enviados = misPedidos.getPedidos();
    ArrayList<Pedido> recibidos = misPedidos.getPedidosListos();
    PanelDatos panDatos = new PanelDatos();

    public PanelMenu() {
        initComponents();
        miMenu.setLlenarComidas();
        setComidasDelMenu();
        //Coloca TODOS los Pedidos Recibidos
        setTabla(enviados, tblRecibidos);
        //Coloca SOLO Pedidos Enviados/Listos
        setTabla(recibidos, tblEnviados);
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

        lblFoodMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodTemp.png"))); // NOI18N
        lblFoodMenu1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblNombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre1.setText("Comida 1");

        btnFoodMenu1.setBackground(new java.awt.Color(102, 102, 102));
        btnFoodMenu1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFoodMenu1.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodMenu1.setText("Agregar");
        btnFoodMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodMenu1ActionPerformed(evt);
            }
        });

        lblFoodMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodTemp.png"))); // NOI18N
        lblFoodMenu2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblNombre2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre2.setText("Comdia 2");

        lblFoodMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodTemp.png"))); // NOI18N
        lblFoodMenu3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblNombre3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre3.setText("Comida 3");

        btnFoodMenu3.setBackground(new java.awt.Color(102, 102, 102));
        btnFoodMenu3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFoodMenu3.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodMenu3.setText("Agregar");

        lblFoodMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodTemp.png"))); // NOI18N
        lblFoodMenu4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblNombre4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre4.setText("Comida 4");

        btnFoodMenu4.setBackground(new java.awt.Color(102, 102, 102));
        btnFoodMenu4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFoodMenu4.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodMenu4.setText("Agregar");

        lblFoodMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodTemp.png"))); // NOI18N
        lblFoodMenu5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblNombre5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre5.setText("Comida 5");

        btnFoodMenu5.setBackground(new java.awt.Color(102, 102, 102));
        btnFoodMenu5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFoodMenu5.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodMenu5.setText("Agregar");

        lblFoodMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodTemp.png"))); // NOI18N
        lblFoodMenu6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblNombre6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre6.setText("Comida 6");

        btnFoodMenu6.setBackground(new java.awt.Color(102, 102, 102));
        btnFoodMenu6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFoodMenu6.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodMenu6.setText("Agregar");

        lblFoodMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodTemp.png"))); // NOI18N
        lblFoodMenu7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblNombre7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre7.setText("Comida 7");

        btnFoodMenu7.setBackground(new java.awt.Color(102, 102, 102));
        btnFoodMenu7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFoodMenu7.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodMenu7.setText("Agregar");

        lblFoodMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodTemp.png"))); // NOI18N
        lblFoodMenu8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblNombre8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre8.setText("Comida 8");

        btnFoodMenu8.setBackground(new java.awt.Color(102, 102, 102));
        btnFoodMenu8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFoodMenu8.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodMenu8.setText("Agregar");

        btnFoodMenu2.setBackground(new java.awt.Color(102, 102, 102));
        btnFoodMenu2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFoodMenu2.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodMenu2.setText("Agregar");
        btnFoodMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodMenu2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblNombre5)
                        .addGap(133, 133, 133)
                        .addComponent(lblNombre6)
                        .addGap(133, 133, 133)
                        .addComponent(lblNombre7)
                        .addGap(153, 153, 153)
                        .addComponent(lblNombre8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnFoodMenu5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btnFoodMenu6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btnFoodMenu7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(btnFoodMenu8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFoodMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre1))
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombre2)
                                .addGap(142, 142, 142)
                                .addComponent(lblNombre3)
                                .addGap(155, 155, 155)
                                .addComponent(lblNombre4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnFoodMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(btnFoodMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(btnFoodMenu4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblFoodMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(lblFoodMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(lblFoodMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(lblFoodMenu4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblFoodMenu5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(lblFoodMenu6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(lblFoodMenu7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(lblFoodMenu8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFoodMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFoodMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFoodMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFoodMenu4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblNombre1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre4)
                            .addComponent(lblNombre3)
                            .addComponent(lblNombre2))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFoodMenu1)
                            .addComponent(btnFoodMenu3)
                            .addComponent(btnFoodMenu4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnFoodMenu2)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFoodMenu5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFoodMenu6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFoodMenu7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFoodMenu8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre5)
                    .addComponent(lblNombre6)
                    .addComponent(lblNombre7)
                    .addComponent(lblNombre8))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFoodMenu5)
                    .addComponent(btnFoodMenu6)
                    .addComponent(btnFoodMenu7)
                    .addComponent(btnFoodMenu8)))
        );

        jTabbedPane1.addTab("Menú", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblRecibidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "comida", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblRecibidos.setColumnSelectionAllowed(true);
        tblRecibidos.setDoubleBuffered(true);
        tblRecibidos.setRowHeight(20);
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
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

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 940, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFoodMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodMenu1ActionPerformed
        panDatos.setComidaAPedir(miMenu.getComida(0));
        panDatos.setVisible(true);
        //Coloca TODOS los Pedidos Recibidos
        setTabla(enviados, tblRecibidos);
        //Coloca SOLO Pedidos Enviados/Listos
        setTabla(recibidos, tblEnviados);
    }//GEN-LAST:event_btnFoodMenu1ActionPerformed

    private void btnFoodMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodMenu2ActionPerformed
        panDatos.setComidaAPedir(miMenu.getComida(1));
        panDatos.setVisible(true);
    }//GEN-LAST:event_btnFoodMenu2ActionPerformed


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
                miData[i][3] = p.get(i).getEstado();
            }
            DefaultTableModel miDefaultTableModel = new DefaultTableModel(miData, columnas);
            tbl.setModel(miDefaultTableModel);
        }

    }

}
