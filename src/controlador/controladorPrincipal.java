/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.crypto.AEADBadTagException;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import vista.Ingrediente;
import vista.menuFrm;
import vista.panelBalance;
import vista.principal;
import vista.prueba;

/**
 *
 * @author anthony.ricse
 */
public class controladorPrincipal extends javax.swing.JFrame implements  ActionListener{
    
  private principal vista;
  
    
  public controladorPrincipal(principal vista){
      this.vista = vista;
      
     this.vista.btnMenu.addActionListener(new  ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
           
             
                    panelPrincipal.setVisible(false);
                  panel1.setVisible(false);
                 panel2.setVisible(true);
                panel3.setVisible(false);
                 
                 vista.contenedor.add(panel2);
                 
                 vista.contenedor.validate();
                 
                 desahabilitarBotones();
               
             
             
              
          }
     });
     
     this.vista.btnIngre.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent arg0) {
              panelPrincipal.setVisible(false);
               panel1.setVisible(true);
                  panel2.setVisible(false);
                  panel3.setVisible(false);
                  
                  
                  vista.contenedor.add(panel1);
                  vista.contenedor.validate();
                  
                  desahabilitarBotones();
              
              vista.lblBotonoes.setIcon(setScalableFoto(vista.lblBotonoes, "/imagenes/paneButton.jpg"));
              
              
              ImageIcon carne = new ImageIcon(getClass().getResource("/imagenes/carneText.png")); 
           ImageIcon Tamaño = new ImageIcon(carne.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
              panel1.TablaIngrediente.setIconAt(1, Tamaño );
               ImageIcon verudra = new ImageIcon(getClass().getResource("/imagenes/verduraText.png")); 
           ImageIcon TamañoV = new ImageIcon(verudra.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
           panel1.TablaIngrediente.setIconAt(0, TamañoV );
              
             
              
                 
                  
            
          }
     });
     this.vista.btnBalance.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent arg0) {
                panelPrincipal.setVisible(false);
               panel1.setVisible(false);
                  panel2.setVisible(false);
                  panel3.setVisible(true);
                  
                  vista.contenedor.add(panel3);
                  vista.contenedor.validate();
                  
                  desahabilitarBotones();
          }
     });
      
  }
    prueba panelPrincipal = new prueba();
   Ingrediente panel1 = new Ingrediente();
  menuFrm panel2 = new menuFrm();
    panelBalance panel3 = new panelBalance();
    public void inciar(){
       
        vista.setVisible(true);
        
        
        
        /*botonoes y label del frmPrincipal*/
        vista.lblBotonoes.setIcon(setScalableFoto(vista.lblBotonoes, "/imagenes/paneButton.jpg"));
        vista.btnIngre.setIcon(seticonIconPresionado("/imagenes/inventaryBtn_1.PNG", vista.btnIngre, 10, 10));
        vista.btnIngre.setIcon(setIconoButton("/imagenes/inventaryBtn_1.PNG", vista.btnIngre));
       
        vista.btnMenu.setIcon(setIconoButton("/imagenes/MenuBtn2.png", vista.btnMenu));
        vista.btnMenu.setIcon(setIconoButton("/imagenes/MenuBtn2.png", vista.btnMenu));
        
       vista.btnBalance.setIcon(setIconoButton("/imagenes/DineroBtn.PNG", vista.btnBalance));
       
        
        vista.contenedor.add(panelPrincipal); 
        panelPrincipal.setVisible(true);
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        
         vista.setLocationRelativeTo(null);
    
        
        desahabilitarBotones();
        
    }
    public void desahabilitarBotones(){
        if(panelPrincipal.isVisible()){
            vista.btnIngre.setEnabled(true);
            vista.btnMenu.setEnabled(true);
            vista.btnBalance.setEnabled(true);
        }else if(panel2.isVisible()){
            vista.btnIngre.setEnabled(true);
            vista.btnMenu.setEnabled(true);
            vista.btnBalance.setEnabled(true);
        }else if(panel1.isVisible()){
            vista.btnIngre.setEnabled(true);
            vista.btnMenu.setEnabled(true);
            vista.btnBalance.setEnabled(true);
        }else if(panel3.isVisible()){
            vista.btnBalance.setEnabled(true);
            vista.btnIngre.setEnabled(true);
            vista.btnMenu.setEnabled(true);
        }
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
    @Override
    public void actionPerformed(ActionEvent arg0) {
        
    }
    
    
}
