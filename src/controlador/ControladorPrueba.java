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
import vista.principal;
import vista.prueba;

/**
 *
 * @author anthony.ricse
 */
public class ControladorPrueba{
        private prueba vista;
        
      public ControladorPrueba(prueba vista){
          this.vista = vista;
          
          this.vista.lblFondo.setIcon(setScalableFoto(vista.lblFondo, "/imagenes/FondoPrincipal.jpg"));
          
         this.vista.btnSalir.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  System.exit(0);            
              }
         });
          
      }
      public Icon setIconoButton(String direcc , JButton button){
        ImageIcon icon = new ImageIcon(getClass().getResource(direcc));
            int ancho = button.getWidth();
            int alto = button.getHeight();
            ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT));
            return icono;
    }
    public Icon seticonIconPresionado(String direcc , JButton boton , int ancho , int altura){
        ImageIcon icon = new ImageIcon(getClass().getResource(direcc));
        int width = boton.getWidth()  - ancho ; 
        int heigth = boton.getHeight() - altura;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, heigth, Image.SCALE_DEFAULT));
           return icono;
    }
    public Icon setScalableFoto(JLabel lbl,String direcc ){
        ImageIcon foto = new ImageIcon(getClass().getResource(direcc));
        Icon icono = new ImageIcon(foto.getImage().getScaledInstance(
                lbl.getWidth() ,
                lbl.getHeight(),
                1));
    return  icono;
    }
}
