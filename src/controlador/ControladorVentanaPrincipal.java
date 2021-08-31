/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import modelo.Caja;
import modelo.Cliente;
import modelo.Comida;
import modelo.Pedido;
import vista.PanelInventario;
import vista.PanelMenu;
import vista.PanelBalance;
import vista.VentanaPrincipal;
import vista.PanelHome;

/**
 *
 * @author anthony.ricse
 */
public class ControladorVentanaPrincipal extends javax.swing.JFrame implements ActionListener {

    VentanaPrincipal vista;
    PanelHome panHome = new PanelHome();
    PanelInventario panInventario = new PanelInventario();
    PanelMenu panMenu = new PanelMenu();
    PanelBalance panBalance = new PanelBalance();

    public ControladorVentanaPrincipal(VentanaPrincipal vista) {
        this.vista = vista;

        this.vista.panContenedor.add(panHome);

        panHome.setVisible(true);
        panInventario.setVisible(false);
        panMenu.setVisible(false);
        panBalance.setVisible(false);

        this.vista.btnInventario.addActionListener(this);
        this.vista.btnMenu.addActionListener(this);
        this.vista.btnBalance.addActionListener(this);

    }

    public void iniciar() {
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }



    @Override
    public void actionPerformed(ActionEvent event) {
        Object evt = event.getSource();

        if (evt.equals(vista.btnInventario)) {
            panHome.setVisible(false);
            panInventario.setVisible(true);
            panMenu.setVisible(false);
            panBalance.setVisible(false);

            vista.panContenedor.add(panInventario);
            vista.panContenedor.validate();
        } else if (evt.equals(vista.btnMenu)) {
            panHome.setVisible(false);
            panInventario.setVisible(false);
            panMenu.setVisible(true);
            panBalance.setVisible(false);

            vista.panContenedor.add(panMenu);
            vista.panContenedor.validate();

        } else if (evt.equals(vista.btnBalance)) {
            panHome.setVisible(false);
            panInventario.setVisible(false);
            panMenu.setVisible(false);
            panBalance.setVisible(true);

            vista.panContenedor.add(panBalance);
            vista.panContenedor.validate();
            
            Caja caja = Caja.getCaja();
            /*Prueba de caja
            Cliente c = new Cliente("Daniel", "19200102");
            Cliente c2 = new Cliente("Dan", "192002");
            Comida com = new Comida("Chaufa", 50);
            Comida com2 = new Comida("arroz", 10);
            Comida com3 = new Comida("pollo", 25);
            Pedido p = new Pedido(com, c);
            Pedido p2 = new Pedido(com2, c2);
            Pedido p3 = new Pedido(com, c2);
            Pedido p4 = new Pedido(com3, c2);
            Pedido p5 = new Pedido(com3, c);
            Pedido p6 = new Pedido(com3, c);
            caja.addBoleta(c);
            caja.addBoleta(c2);
            caja.addPedidoBoleta(p);
            caja.addPedidoBoleta(p2);
            caja.addPedidoBoleta(p3);
            caja.addBoleta(c2);
            caja.addPedidoBoleta(p4);
            caja.addPedidoBoleta(p5);
            caja.addPedidoBoleta(p6);
            */
            panBalance.setTablaBoletas(caja);
            panBalance.setNumeroVentas(caja);
            panBalance.setPlatoMasVendido(caja);
        }

    }

}
