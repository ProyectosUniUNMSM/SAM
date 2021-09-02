/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Boleta;
import modelo.Caja;

/**
 *
 * @author Daniel
 */
public class ControladorCaja {

    private ArrayList<Boleta> boletas;
    Caja miCaja = Caja.getCaja();

    public ControladorCaja() {
        boletas = new ArrayList<Boleta>();
       // leerArchivo();
        //salvarArchivo();
    }

   /* public void leerArchivo() {
        try {
            FileInputStream file = new FileInputStream("boletas.dat");
            ObjectInputStream fileInput = new ObjectInputStream(file);
            boolean finArchivo = false;
            while (!finArchivo) {
                try {
                    boletas.add((Boleta) fileInput.readObject());
                } catch (EOFException e) {
                    finArchivo = true;
                    System.out.println("fin de archivo");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
            fileInput.close();
            cargarCaja();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Sin boletas");
        }
    }
*/
    public void salvarArchivo() {
        try {
            FileOutputStream file = new FileOutputStream("boletas.dat");
            ObjectOutputStream fileOut = new ObjectOutputStream(file);
            Boleta b = miCaja.getUltimo();
            for (int i = 0; i < miCaja.getTamaño(); i++) {
                fileOut.writeObject(b);
                b = b.sig;
                System.out.println(b.cliente.getDni());
            }
            fileOut.close();
            JOptionPane.showMessageDialog(null, "Las boletas fueron registradas.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Boletas no registradas.");
        }
    }

    public void cargarCaja() {
        for (Boleta b : this.boletas) {
            miCaja.addBoleta(b);
        }
    }
}
