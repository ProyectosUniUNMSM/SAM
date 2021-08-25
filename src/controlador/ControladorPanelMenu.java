/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.PanelMenu;

/**
 *
 * @author anthony.ricse
 */
public class ControladorPanelMenu {

    private PanelMenu vista;

    public ControladorPanelMenu(PanelMenu vista) {
        this.vista = vista;

    }

    public void iniciar() {

        vista.setVisible(true);
    }
}
