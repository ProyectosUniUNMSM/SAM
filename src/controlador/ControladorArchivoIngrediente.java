package controlador;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Ingrediente;

/**
 *
 * @author Carlos
 */
public class ControladorArchivoIngrediente {

    private ArrayList<Ingrediente> ingredientes;

    public ControladorArchivoIngrediente() {
        ingredientes = new ArrayList<Ingrediente>();
        leerArchivo();
    }

    public void leerArchivo() {
        try {
            FileInputStream file = new FileInputStream("ingredientes.dat");
            ObjectInputStream fileInput = new ObjectInputStream(file);
            boolean finArchivo = false;
            while (!finArchivo) {
                try {
                    ingredientes.add((Ingrediente) fileInput.readObject());
                } catch (EOFException e) {
                    finArchivo = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
            fileInput.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Sin ingredientes.");
        }
    }

    public void salvarArchivo() {
        try {
            FileOutputStream file = new FileOutputStream("ingredientes.dat");
            ObjectOutputStream fileOut = new ObjectOutputStream(file);
            for (int i = 0; i < ingredientes.size(); i++) {
                fileOut.writeObject(ingredientes.get(i));
            }
            fileOut.close();
            JOptionPane.showMessageDialog(null, "Los ingredientes fueron registrados.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ingredientes no registradas.");
        }
    }

    //Para inicializar las comidas, luego borrar metodo.
    public void agregarIngredientes(String nom, String cat, int cant) {
        Ingrediente i = new Ingrediente(nom, cat, cant);
        i.aumIngrediente(cant);
        ingredientes.add(i);
        salvarArchivo();
    }

    public void eliminarIngredientes(Ingrediente ing, String nom) {
        int i = 0;
        boolean flag = true;
        while (i < ingredientes.size()) {
            if (ing.getNombre().equalsIgnoreCase(nom)) {
                ingredientes.remove(i);
                salvarArchivo();
                flag = false;
            }
        }
    }
}
