package controlador;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Comida;

/**
 *
 * @author Carlos
 */
public class ControladorArchivoComida {

    private ArrayList<Comida> comidas;

    public ControladorArchivoComida() {
        comidas = new ArrayList<Comida>();
        leerArchivo();
    }

    public void leerArchivo() {
        try {
            FileInputStream file = new FileInputStream("Comidas.dat");
            ObjectInputStream fileInput = new ObjectInputStream(file);
            boolean finArchivo = false;
            while (!finArchivo) {
                try {
                    comidas.add((Comida) fileInput.readObject());
                } catch (EOFException e) {
                    finArchivo = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
            fileInput.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Sin comidas.");
        }
    }

    public void salvarArchivo() {
        try {
            FileOutputStream file = new FileOutputStream("Comidas.dat");
            ObjectOutputStream fileOut = new ObjectOutputStream(file);
            for (int i = 0; i < comidas.size(); i++) {
                fileOut.writeObject(comidas.get(i));
            }
            fileOut.close();
            JOptionPane.showMessageDialog(null, "Las comidas fueron registradas.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Comidas no registradas.");
        }
    }

    //Para inicializar las comidas, luego borrar metodo.
    public void agregarComidas() {
        //8 comidas predefinidas
        Comida com0 = new Comida("Lomo Saltado", 12.5f);
        Comida com1 = new Comida("Arroz con Pollo", 10.0f);
        Comida com2 = new Comida("Ají de Gallina", 10.0f);
        Comida com3 = new Comida("Arroz Chaufa", 8.5f);
        Comida com4 = new Comida("Aeropuerto", 12.0f);
        Comida com5 = new Comida("Tallarín Saltado", 11.0f);
        Comida com6 = new Comida("Seco a la Norteña", 13.50f);
        Comida com7 = new Comida("Ceviche", 12.0f);

        comidas.add(com0);
        comidas.add(com1);
        comidas.add(com2);
        comidas.add(com3);
        comidas.add(com4);
        comidas.add(com5);
        comidas.add(com6);
        comidas.add(com7);

        salvarArchivo();
    }
}
