/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.panelBalance;

/**
 *
 * @author anthony.ricse
 */
public class controladorBalance {
    private panelBalance vista;
    public controladorBalance(panelBalance vista){
       this.vista = vista;
       
      this.vista.btnSalir.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent arg0) {
               System.exit(0);
           }
      });
      
    }
    
}
