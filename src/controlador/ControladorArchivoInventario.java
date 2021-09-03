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

//    private ArrayList<Ingrediente> ingredientes;
//
//    public ControladorArchivoInventario() {
//        this.ingredientes = new ArrayList<Ingrediente>();
//        ArrayList<Ingrediente> temp;
//        temp = crearArrayList();
//        leerArchivo(temp);
//        inicializarInventario(temp);
//        salvarArchivo(temp);
//    }
    ArrayList<Ingrediente> a = new ArrayList<Ingrediente>();
            
    public void leerArchivo() {
        try {
            FileInputStream file = new FileInputStream("ingredientes.dat");
            ObjectInputStream fileInput = new ObjectInputStream(file);
            boolean finArchivo = false;
            while (!finArchivo) {
                try {
                    a.add((Ingrediente) fileInput.readObject());
                } catch (EOFException e) {
                    finArchivo = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
            fileInput.close();
            cargarArchivo();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Sin ingredientes.");
        }
    }

    public void salvarArchivo() {
        try {
            FileOutputStream file = new FileOutputStream("ingredientes.dat");
            ObjectOutputStream fileOut = new ObjectOutputStream(file);
            Inventario inv = Inventario.getInventario();
            for (int i = 0; i < inv.getTamaño(); i++) {
                fileOut.writeObject(inv.getIngredientes()[i]);
            }
            fileOut.close();
            JOptionPane.showMessageDialog(null, "Los ingredientes fueron registrados.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ingredientes no registrados.");
        }
    }

    //Para inicializar las comidas, luego borrar metodo.
//    public void agregarIngredientes(String nom, String cat, int cant) {
//        Ingrediente i = new Ingrediente(nom, cat, cant);
//        i.aumIngrediente(cant);
//        crearArrayList().add(i);
//        salvarArchivo();
//    }
//
//    public void eliminarIngredientes(Ingrediente ing, String nom) {
//        int i = 0;
//        boolean flag = true;
//        while (i < crearArrayList().size()) {
//            if (ing.getNombre().equalsIgnoreCase(nom)) {
//                crearArrayList().remove(i);
//                salvarArchivo();
//                flag = false;
//            }
//        }
//    }
    public void inicializarInventario(ArrayList<Ingrediente> a) {
        Ingrediente ing1 = new Ingrediente("Lomo", "carnes", 10);
        Ingrediente ing2 = new Ingrediente("Arroz", "vegetales", 10);
        Ingrediente ing3 = new Ingrediente("Papa", "vegetales", 10);
        Ingrediente ing4 = new Ingrediente("Cebolla", "vegetales", 10);
        Ingrediente ing5 = new Ingrediente("Gallina", "carnes", 10);
        Ingrediente ing6 = new Ingrediente("Aji amarillo", "vegetales", 10);
        Ingrediente ing7 = new Ingrediente("Pollo", "carnes", 10);
        Ingrediente ing8 = new Ingrediente("Alverjas", "vegetales", 10);
        Ingrediente ing9 = new Ingrediente("Zanahoria", "vegetales", 10);
        Ingrediente ing10 = new Ingrediente("Huevo", "carnes", 10);
        Ingrediente ing11 = new Ingrediente("Pimenton", "vegetales", 10);
        Ingrediente ing12 = new Ingrediente("Fideos", "vegetales", 10);
        Ingrediente ing13 = new Ingrediente("Res", "carnes", 10);
        Ingrediente ing14 = new Ingrediente("Cebolla China", "vegetales", 10);
        Ingrediente ing15 = new Ingrediente("Pescado", "carnes", 10);
        Ingrediente ing16 = new Ingrediente("Limones", "vegetales", 10);
        Ingrediente ing17 = new Ingrediente("Camote", "vegetales", 10);
        Ingrediente ing18 = new Ingrediente("Tomate", "vegetales", 10);

        a.add(ing1);
        a.add(ing2);
        a.add(ing3);
        a.add(ing4);
        a.add(ing5);
        a.add(ing6);
        a.add(ing7);
        a.add(ing8);
        a.add(ing9);
        a.add(ing10);
        a.add(ing11);
        a.add(ing12);
        a.add(ing13);
        a.add(ing14);
        a.add(ing15);
        a.add(ing16);
        a.add(ing17);
        a.add(ing18);
    }

//    public void cargarInventario() {
//        Inventario miInventario = Inventario.getInventario();
//        for (Ingrediente i : this.crearArrayList()) {
//            miInventario.addIngrediente(i);
//        }
//    }
    public ArrayList<Ingrediente> crearArrayList() {
        ArrayList<Ingrediente> a = new ArrayList<>();
        return a;
    }
    /*
    public void crearArchivo() {
        ArrayList<Ingrediente> temp = crearArrayList();
        leerArchivo(temp);
        inicializarInventario(temp);
        salvarArchivo();
    }
*/

    public void cargarArchivo() {
        Inventario miInventario = Inventario.getInventario();
        miInventario.cargarInventario(a);
    }
}
