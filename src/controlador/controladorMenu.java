/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.menuFrm;

/**
 *
 * @author anthony.ricse
 */
public class controladorMenu {
        private menuFrm vista;
        
        public controladorMenu(menuFrm vista){
            this.vista = vista;
            
            
        }
        public void iniciar(){
        
            vista.setVisible(true);
        }
}
