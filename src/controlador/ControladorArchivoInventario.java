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
import modelo.Inventario;

/**
 *
 * @author Carlos
 */
public class ControladorArchivoInventario {

    private ArrayList<Ingrediente> ingredientes;

    public ControladorArchivoInventario() {
        ingredientes = new ArrayList<Ingrediente>();

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
            cargarInventario();
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
            JOptionPane.showMessageDialog(null, "Ingredientes no registrados.");
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

    public void inicializarInventario() {
        Ingrediente ing1 = new Ingrediente("Lomo", "carnes", 10);
        Ingrediente ing2 = new Ingrediente("Arroz", "vegetales", 10);
        Ingrediente ing3 = new Ingrediente("papa", "vegetales", 10);
        Ingrediente ing4 = new Ingrediente("cebolla", "vegetales", 10);
        Ingrediente ing5 = new Ingrediente("gallina", "carnes", 10);
        Ingrediente ing6 = new Ingrediente("aji amarillo", "vegetales", 10);
        Ingrediente ing7 = new Ingrediente("pollo", "carnes", 10);
        Ingrediente ing8 = new Ingrediente("alverjas", "vegetales", 10);
        Ingrediente ing9 = new Ingrediente("zanahoria", "vegetales", 10);
        Ingrediente ing10 = new Ingrediente("huevo", "carnes", 10);
        Ingrediente ing11 = new Ingrediente("pimenton", "vegetales", 10);
        Ingrediente ing12 = new Ingrediente("fideos", "vegetales", 10);
        Ingrediente ing13 = new Ingrediente("res", "carnes", 10);
        Ingrediente ing14 = new Ingrediente("cebolla china", "vegetales", 10);
        Ingrediente ing15 = new Ingrediente("pesacado", "carnes", 10);
        Ingrediente ing16 = new Ingrediente("limones", "vegetales", 10);
        Ingrediente ing17 = new Ingrediente("camote", "vegetales", 10);

        ingredientes.add(ing1);
        ingredientes.add(ing2);
        ingredientes.add(ing3);
        ingredientes.add(ing4);
        ingredientes.add(ing5);
        ingredientes.add(ing6);
        ingredientes.add(ing7);
        ingredientes.add(ing8);
        ingredientes.add(ing9);
        ingredientes.add(ing10);
        ingredientes.add(ing11);
        ingredientes.add(ing12);
        ingredientes.add(ing13);
        ingredientes.add(ing14);
        ingredientes.add(ing15);
        ingredientes.add(ing16);
        ingredientes.add(ing17);
    }

    public void cargarInventario() {
        Inventario miInventario = Inventario.getInventario();
        for (Ingrediente i : this.ingredientes) {
            miInventario.addIngrediente(i);
        }
    }
}
