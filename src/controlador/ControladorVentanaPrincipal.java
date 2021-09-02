/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Caja;
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
    Caja miCaja = Caja.getCaja();

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
            panInventario.actualizarTablas();
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

            panBalance.actualizarComboBox();
            panBalance.setTablaBalance(miCaja);
            panBalance.setNumeroVentas(miCaja);
            panBalance.setPlatoMasVendido(miCaja);
        }

    }

}
