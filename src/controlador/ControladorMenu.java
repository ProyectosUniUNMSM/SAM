/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.ImageConfig;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorListener;
import vista.PanelDatos;
import javax.swing.Icon;
import javax.swing.JLabel;
import modelo.Comida;
import modelo.Menu;

import vista.PanelMenu;


/**
 *
 * @author anthony.ricse
 */
public class ControladorMenu {

    PanelDatos panDatos = new PanelDatos();

    PanelMenu vista;

    ImageConfig ImageConfig = new ImageConfig();
  

    public ControladorMenu(PanelMenu vista) {
        this.vista = vista;

      
        
    }

    public void getFormularioDatos() {

        panDatos.setVisible(true);
        panDatos.setLocationRelativeTo(null);
    }
    public void cerrar(){
        panDatos.dispose();
    }



}
