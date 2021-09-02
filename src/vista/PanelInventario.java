/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorArchivoInventario;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Comida;
import modelo.Ingrediente;
import modelo.Inventario;

/**
 *
 * @author anthony.ricse
 */
public class PanelInventario extends javax.swing.JPanel {

    Inventario miInventario = Inventario.getInventario();
    ArrayList<Ingrediente> carnes = miInventario.getCarnes();
    ArrayList<Ingrediente> vegetales = miInventario.getVegetales();
    ControladorArchivoInventario ing;

    public PanelInventario() {
        initComponents();

        //Colocando img
        ImageIcon imgCarne = new ImageIcon(getClass().getResource("/imagenes/carneText.png"));
        ImageIcon Tamaño = new ImageIcon(imgCarne.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        this.tabpanel.setIconAt(1, Tamaño);

        ImageIcon imgVeget = new ImageIcon(getClass().getResource("/imagenes/verduraText.png"));
        ImageIcon TamañoV = new ImageIcon(imgVeget.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        this.tabpanel.setIconAt(0, TamañoV);

        //Leyendo archivos de ingredientes
        ing = new ControladorArchivoInventario();
        ArrayList<Ingrediente> temp;
        temp = ing.crearArrayList();
        ing.leerArchivo(temp);

        //Cargando archivos en clase inventario
        miInventario.cargarInventario(temp);
        actualizarTablas();

//        //Cargando Tablas y cbx
//        for (int i = 0; i < temp.size(); i++) {
//            if (temp.get(i).getCategoria().equalsIgnoreCase("carnes")) {
//                carnes.add(temp.get(i));
//                setTablaCarnes(carnes);
//                setCmbxIngredientesCarnes(carnes);
//            } else if (temp.get(i).getCategoria().equalsIgnoreCase("vegetales")) {
//                vegetales.add(temp.get(i));
//                setTablaVegetales(vegetales);
//                setCmbxIngredientesVegetales(vegetales);
//            }
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabpanel = new javax.swing.JTabbedPane();
        panVegetales = new javax.swing.JPanel();
        cbxIngVeg = new javax.swing.JComboBox<>();
        btnAddVeg = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVegetales = new javax.swing.JTable();
        btnMinusVeg = new javax.swing.JButton();
        PanelOrdenVeg = new javax.swing.JPanel();
        ordAlfabeticoVeg = new javax.swing.JRadioButton();
        ordCantidadVeg = new javax.swing.JRadioButton();
        panCarnes = new javax.swing.JPanel();
        cbxIngCarn = new javax.swing.JComboBox<>();
        btnAddCar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCarnes = new javax.swing.JTable();
        btnMinusCar = new javax.swing.JButton();
        PanelOrdenCar = new javax.swing.JPanel();
        ordAlfabeticoCar = new javax.swing.JRadioButton();
        ordCantidadCar = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(180, 237, 131));
        setMinimumSize(new java.awt.Dimension(950, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabpanel.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabpanel.setDoubleBuffered(true);
        tabpanel.setName(""); // NOI18N

        panVegetales.setBackground(new java.awt.Color(255, 255, 255));
        panVegetales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnAddVeg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        btnAddVeg.setBorder(null);
        btnAddVeg.setContentAreaFilled(false);
        btnAddVeg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAddVeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVegActionPerformed(evt);
            }
        });

        tableVegetales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Categoria", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableVegetales);

        btnMinusVeg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menos.png"))); // NOI18N
        btnMinusVeg.setBorder(null);
        btnMinusVeg.setContentAreaFilled(false);
        btnMinusVeg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinusVeg.setMinimumSize(new java.awt.Dimension(61, 30));
        btnMinusVeg.setPreferredSize(new java.awt.Dimension(61, 30));
        btnMinusVeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusVegActionPerformed(evt);
            }
        });

        PanelOrdenVeg.setBackground(new java.awt.Color(102, 153, 255));
        PanelOrdenVeg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ordAlfabeticoVeg.setBackground(new java.awt.Color(102, 153, 255));
        ordAlfabeticoVeg.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        ordAlfabeticoVeg.setForeground(new java.awt.Color(255, 255, 255));
        ordAlfabeticoVeg.setText("Ordenar Alfabetcamente");
        ordAlfabeticoVeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordAlfabeticoVegActionPerformed(evt);
            }
        });
        PanelOrdenVeg.add(ordAlfabeticoVeg);

        ordCantidadVeg.setBackground(new java.awt.Color(102, 153, 255));
        ordCantidadVeg.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        ordCantidadVeg.setForeground(new java.awt.Color(255, 255, 255));
        ordCantidadVeg.setText("Ordenar por la cantidad");
        ordCantidadVeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordCantidadVegActionPerformed(evt);
            }
        });
        PanelOrdenVeg.add(ordCantidadVeg);

        javax.swing.GroupLayout panVegetalesLayout = new javax.swing.GroupLayout(panVegetales);
        panVegetales.setLayout(panVegetalesLayout);
        panVegetalesLayout.setHorizontalGroup(
            panVegetalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVegetalesLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panVegetalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelOrdenVeg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxIngVeg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panVegetalesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnAddVeg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnMinusVeg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panVegetalesLayout.setVerticalGroup(
            panVegetalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVegetalesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PanelOrdenVeg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(cbxIngVeg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panVegetalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddVeg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinusVeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(202, 252, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        tabpanel.addTab("", panVegetales);

        panCarnes.setBackground(new java.awt.Color(255, 255, 255));
        panCarnes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cbxIngCarn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnAddCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        btnAddCar.setBorder(null);
        btnAddCar.setContentAreaFilled(false);
        btnAddCar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarActionPerformed(evt);
            }
        });

        tableCarnes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Categoria", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableCarnes);

        btnMinusCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menos.png"))); // NOI18N
        btnMinusCar.setBorder(null);
        btnMinusCar.setContentAreaFilled(false);
        btnMinusCar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinusCar.setMinimumSize(new java.awt.Dimension(61, 30));
        btnMinusCar.setPreferredSize(new java.awt.Dimension(61, 30));
        btnMinusCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusCarActionPerformed(evt);
            }
        });

        PanelOrdenCar.setBackground(new java.awt.Color(102, 153, 255));
        PanelOrdenCar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ordAlfabeticoCar.setBackground(new java.awt.Color(102, 153, 255));
        ordAlfabeticoCar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        ordAlfabeticoCar.setForeground(new java.awt.Color(255, 255, 255));
        ordAlfabeticoCar.setText("Ordenar Alfabetcamente");
        ordAlfabeticoCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordAlfabeticoCarActionPerformed(evt);
            }
        });
        PanelOrdenCar.add(ordAlfabeticoCar);

        ordCantidadCar.setBackground(new java.awt.Color(102, 153, 255));
        ordCantidadCar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        ordCantidadCar.setForeground(new java.awt.Color(255, 255, 255));
        ordCantidadCar.setText("Ordenar por la cantidad");
        ordCantidadCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordCantidadCarActionPerformed(evt);
            }
        });
        PanelOrdenCar.add(ordCantidadCar);

        javax.swing.GroupLayout panCarnesLayout = new javax.swing.GroupLayout(panCarnes);
        panCarnes.setLayout(panCarnesLayout);
        panCarnesLayout.setHorizontalGroup(
            panCarnesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCarnesLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panCarnesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelOrdenCar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxIngCarn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panCarnesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnAddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnMinusCar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panCarnesLayout.setVerticalGroup(
            panCarnesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCarnesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PanelOrdenCar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(cbxIngCarn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panCarnesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinusCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        tabpanel.addTab("", panCarnes);

        add(tabpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 870, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddVegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVegActionPerformed
        aumentarIngrediente(cbxIngVeg);
        setTablaVegetales(vegetales);
    }//GEN-LAST:event_btnAddVegActionPerformed

    private void ordCantidadVegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordCantidadVegActionPerformed
        // TODO add your handling code here:

        ordAlfabeticoVeg.setSelected(false);
        // ordCantidadVeg.setSelected(true);
        if (ordCantidadVeg.isSelected()) {
            ordCantidad(vegetales, 0, vegetales.size() - 1);
            setTablaVegetales(vegetales);

        } else {
            
        }


    }//GEN-LAST:event_ordCantidadVegActionPerformed

    private void btnAddCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarActionPerformed
        // TODO add your handling code here:
        aumentarIngrediente(cbxIngCarn);
        setTablaCarnes(carnes);
    }//GEN-LAST:event_btnAddCarActionPerformed

    private void ordCantidadCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordCantidadCarActionPerformed
        // TODO add your handling code here:
        ordCantidadCar.setSelected(true);
        ordAlfabeticoCar.setSelected(false);
        ordCantidad(carnes, 0, carnes.size() - 1);
        setTablaCarnes(carnes);
    }//GEN-LAST:event_ordCantidadCarActionPerformed

    private void btnMinusCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusCarActionPerformed
        // TODO add your handling code here:
        disminuirIngrediente(cbxIngCarn);
        setTablaCarnes(carnes);
    }//GEN-LAST:event_btnMinusCarActionPerformed

    private void btnMinusVegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusVegActionPerformed
        // TODO add your handling code here:
        disminuirIngrediente(cbxIngVeg);
        setTablaVegetales(vegetales);
    }//GEN-LAST:event_btnMinusVegActionPerformed

    private void ordAlfabeticoVegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordAlfabeticoVegActionPerformed
        // TODO add your handling code here:
        ordCantidadVeg.setSelected(false);
        ordAlfabeticoVeg.setSelected(true);
        //ordCantidad(vegetales, 0, vegetales.size() - 1);
        ordAlfabeticamente(vegetales, 0, vegetales.size() - 1);
        setTablaVegetales(vegetales);
    }//GEN-LAST:event_ordAlfabeticoVegActionPerformed

    private void ordAlfabeticoCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordAlfabeticoCarActionPerformed
        // TODO add your handling code here:
        ordCantidadCar.setSelected(false);
        ordAlfabeticoCar.setSelected(true);
        ordAlfabeticamente(carnes, 0, carnes.size()-1);
        
        setTablaCarnes(carnes);
    }//GEN-LAST:event_ordAlfabeticoCarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelOrdenCar;
    private javax.swing.JPanel PanelOrdenVeg;
    public javax.swing.JButton btnAddCar;
    public javax.swing.JButton btnAddVeg;
    private javax.swing.JButton btnMinusCar;
    private javax.swing.JButton btnMinusVeg;
    private javax.swing.JComboBox<String> cbxIngCarn;
    private javax.swing.JComboBox<String> cbxIngVeg;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton ordAlfabeticoCar;
    private javax.swing.JRadioButton ordAlfabeticoVeg;
    private javax.swing.JRadioButton ordCantidadCar;
    private javax.swing.JRadioButton ordCantidadVeg;
    public javax.swing.JPanel panCarnes;
    public javax.swing.JPanel panVegetales;
    private javax.swing.JTable tableCarnes;
    private javax.swing.JTable tableVegetales;
    public javax.swing.JTabbedPane tabpanel;
    // End of variables declaration//GEN-END:variables

    public void actualizarTablas() {
        carnes = miInventario.getCarnes();
        vegetales = miInventario.getVegetales();
        setTablaCarnes(carnes);
        setTablaVegetales(vegetales);
        setCmbxIngredientesCarnes(carnes);
        setCmbxIngredientesVegetales(vegetales);
    }

    public void setTablaCarnes(ArrayList<Ingrediente> ingredientes) {
        String[] columnas = {"Nombre", "Categoria", "Cantidad"};
        Object[][] miData = new Object[ingredientes.size()][3];
        for (int i = 0; i < ingredientes.size(); i++) {
            miData[i][0] = ingredientes.get(i).getNombre();
            miData[i][1] = ingredientes.get(i).getCategoria();
            miData[i][2] = ingredientes.get(i).getCantidad();
        }
        DefaultTableModel miDefaultTableModel = new DefaultTableModel(miData, columnas);
        tableCarnes.setModel(miDefaultTableModel);
    }

    public void setTablaVegetales(ArrayList<Ingrediente> ingredientes) {
        String[] columnas = {"Nombre", "Categoria", "Cantidad"};
        Object[][] miData = new Object[ingredientes.size()][3];
        for (int i = 0; i < ingredientes.size(); i++) {
            miData[i][0] = ingredientes.get(i).getNombre();
            miData[i][1] = ingredientes.get(i).getCategoria();
            miData[i][2] = ingredientes.get(i).getCantidad();
        }
        DefaultTableModel miDefaultTableModel = new DefaultTableModel(miData, columnas);
        tableVegetales.setModel(miDefaultTableModel);
    }

    public void setCmbxIngredientesCarnes(ArrayList<Ingrediente> ing) {
        cbxIngCarn.removeAllItems();
        for (int i = 0; i < ing.size(); i++) {
            cbxIngCarn.addItem(ing.get(i).getNombre());
        }
    }

    public void setCmbxIngredientesVegetales(ArrayList<Ingrediente> ing) {
        cbxIngVeg.removeAllItems();
        for (int i = 0; i < ing.size(); i++) {
            cbxIngVeg.addItem(ing.get(i).getNombre());
        }
    }

    public void aumentarIngrediente(JComboBox cbx) {
        if (cbx.getSelectedItem() != null) {
            String find = (String) cbx.getSelectedItem();
            Ingrediente seleccionado = miInventario.buscarIngrediente(find);
            seleccionado.aumIngrediente(1);

        } else {
            JOptionPane.showMessageDialog(null, "Ingrediente no seleccionado");
        }
    }

    public void disminuirIngrediente(JComboBox cbx) {
        if (cbx.getSelectedItem() != null) {
            String find = (String) cbx.getSelectedItem();
            Ingrediente seleccionado = miInventario.buscarIngrediente(find);
            seleccionado.disIngrediente(1);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrediente no seleccionado");
        }
    }

    //QuickSort
    public void ordAlfabeticamente(ArrayList<Ingrediente> ing, int primero, int ultimo) {
        int i, j, central;
        String pivote;

        central = (primero + ultimo) / 2;
        pivote = ing.get(central).getNombre();
        i = primero;
        j = ultimo;

        do {
            /*while (ing.get(i).getNombre().compareToIgnoreCase(pivote) == 1) {
                i++;
            }*/
            while(ing.get(i).getNombre().charAt(0)< pivote.charAt(0)){
                i++;
            }
            while (ing.get(j).getNombre().charAt(0)>pivote.charAt(0)) {
                j--;
            }
            if (i <= j) {
                Collections.swap(ing, i, j);
                i++;
                j--;
            }

        } while (i <= j);

        if (primero < j) {
            ordAlfabeticamente(ing, primero, j);
        }
        if (i < ultimo) {
            ordAlfabeticamente(ing, i, ultimo);
        }
    }

    public void ordCantidad(ArrayList<Ingrediente> ing, int primero, int ultimo) {
        int i, j, central;
        int pivote;

        central = (primero + ultimo) / 2;

        pivote = ing.get(central).getCantidad();

        i = primero;
        j = ultimo;

        do {
            while (ing.get(i).getCantidad() < pivote) {
                i++;
            }
            while (ing.get(j).getCantidad() > pivote) {
                j--;
            }
            if (i <= j) {
                Collections.swap(ing, i, j);
                i++;
                j--;
            }

        } while (i <= j);

        if (primero < j) {
            ordCantidad(ing, primero, j);
        }
        if (i < ultimo) {
            ordCantidad(ing, i, ultimo);
        }
    }
   
}
