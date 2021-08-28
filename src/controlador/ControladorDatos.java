/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.PanelDatos;



/**
 *
 * @author anthony.ricse
 */
public class ControladorDatos   {
    PanelDatos vista;
    
    public ControladorDatos(PanelDatos vista){
        this.vista = vista ;
     
    
    }
    
    public void iniciar(){
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    public void cerrar(){
        vista.dispose();
    }

   

    }
    

