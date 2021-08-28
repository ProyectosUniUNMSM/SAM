/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author anthony.ricse
 */
public class ImageConfig {
      public Icon setIconoButton(String direcc, JButton button) {
        ImageIcon icon = new ImageIcon(getClass().getResource(direcc));
        int ancho = button.getWidth();
        int alto = button.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
        return icono;
    }

    public Icon seticonIconPresionado(String direcc, JButton boton, int ancho, int altura) {
        ImageIcon icon = new ImageIcon(getClass().getResource(direcc));
        int width = boton.getWidth() - ancho;
        int heigth = boton.getHeight() - altura;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_DEFAULT));
        return icono;
    }

    public Icon setScalableFoto(JLabel lbl, String direcc) {
        ImageIcon foto = new ImageIcon(getClass().getResource(direcc));
        Icon icono = new ImageIcon(foto.getImage().getScaledInstance(
                lbl.getWidth(),
                lbl.getHeight(),
                1));
        return icono;
    }
}
