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
import modelo.Ingrediente;
import modelo.Inventario;
import modelo.Menu;

/**
 *
 * @author Carlos
 */
public class ControladorArchivoMenu {

//    private ArrayList<Comida> comidas;
//
//    public ControladorArchivoMenu() {
//        comidas = new ArrayList<Comida>();
//        leerArchivo();
//    }
    public void leerArchivo(ArrayList<Comida> a) {
        try {
            FileInputStream file = new FileInputStream("Comidas.dat");
            ObjectInputStream fileInput = new ObjectInputStream(file);
            boolean finArchivo = false;
            while (!finArchivo) {
                try {
                    a.add((Comida) fileInput.readObject());
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

    public void salvarArchivo(ArrayList<Comida> a) {
        try {
            FileOutputStream file = new FileOutputStream("Comidas.dat");
            ObjectOutputStream fileOut = new ObjectOutputStream(file);
            for (int i = 0; i < a.size(); i++) {
                fileOut.writeObject(a.get(i));
            }
            fileOut.close();
            JOptionPane.showMessageDialog(null, "Las comidas fueron registradas.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Comidas no registradas.");
        }
    }

//    public void cargarComidas(ArrayList<Comida> comidas) {
//        Menu miMenu = Menu.getMenu();
//        for (Comida i : this.comidas) {
//            miMenu.addComida(i);
//        }
//    }
    //Para inicializar las comidas, luego borrar metodo.
    public void inicializarMenu(ArrayList<Comida> a) {
        Inventario miInventario = Inventario.getInventario();

        // comidas predefinidas
        Comida com0 = new Comida("Lomo Saltado", 12.5f, "/imagenes/arrayComida/comida1.jpg");
        Comida com1 = new Comida("Ají de Gallina", 10.0f, "/imagenes/arrayComida/comida2.jpg");
        Comida com2 = new Comida("Arroz con Pollo", 10.0f, "/imagenes/arrayComida/comida3.jpg");
        Comida com3 = new Comida("Arroz Chaufa", 8.5f, "/imagenes/arrayComida/comida4.jpg");
        Comida com4 = new Comida("Aeropuerto", 12.0f, "/imagenes/arrayComida/comida5.jpg");
        Comida com5 = new Comida("Tallarín Saltado", 11.0f, "/imagenes/arrayComida/comida6.jpg");
        Comida com6 = new Comida("Seco a la Norteña", 13.50f, "/imagenes/arrayComida/comida7.jpg");
        Comida com7 = new Comida("Ceviche", 12.0f, "/imagenes/arrayComida/comida8.jpg");

        com0.agregarIngrediente(miInventario.buscarIngrediente("Lomo"));
        com0.agregarIngrediente(miInventario.buscarIngrediente("Arroz"));
        com0.agregarIngrediente(miInventario.buscarIngrediente("Papa"));
        com0.agregarIngrediente(miInventario.buscarIngrediente("Cebolla"));

        com1.agregarIngrediente(miInventario.buscarIngrediente("Gallina"));
        com1.agregarIngrediente(miInventario.buscarIngrediente("Aji amarillo"));
        com1.agregarIngrediente(miInventario.buscarIngrediente("Papa"));
        com1.agregarIngrediente(miInventario.buscarIngrediente("Arroz"));

        com2.agregarIngrediente(miInventario.buscarIngrediente("Arroz"));
        com2.agregarIngrediente(miInventario.buscarIngrediente("Pollo"));
        com2.agregarIngrediente(miInventario.buscarIngrediente("Alverjas"));
        com2.agregarIngrediente(miInventario.buscarIngrediente("Zanahoria"));

        com3.agregarIngrediente(miInventario.buscarIngrediente("Arroz"));
        com3.agregarIngrediente(miInventario.buscarIngrediente("Pollo"));
        com3.agregarIngrediente(miInventario.buscarIngrediente("Huevo"));
        com3.agregarIngrediente(miInventario.buscarIngrediente("Pimenton"));

        com4.agregarIngrediente(miInventario.buscarIngrediente("Pollo"));
        com4.agregarIngrediente(miInventario.buscarIngrediente("Arroz"));
        com4.agregarIngrediente(miInventario.buscarIngrediente("Huevo"));
        com4.agregarIngrediente(miInventario.buscarIngrediente("Fideos"));

        com5.agregarIngrediente(miInventario.buscarIngrediente("Fideos"));
        com5.agregarIngrediente(miInventario.buscarIngrediente("Res"));
        com5.agregarIngrediente(miInventario.buscarIngrediente("Cebolla China"));
        com5.agregarIngrediente(miInventario.buscarIngrediente("Tomate"));

        com6.agregarIngrediente(miInventario.buscarIngrediente("Res"));
        com6.agregarIngrediente(miInventario.buscarIngrediente("Alverjas"));
        com6.agregarIngrediente(miInventario.buscarIngrediente("Cebolla"));
        com6.agregarIngrediente(miInventario.buscarIngrediente("Arroz"));

        com7.agregarIngrediente(miInventario.buscarIngrediente("Pescado"));
        com7.agregarIngrediente(miInventario.buscarIngrediente("Cebolla"));
        com7.agregarIngrediente(miInventario.buscarIngrediente("Limones"));
        com7.agregarIngrediente(miInventario.buscarIngrediente("Camote"));

        a.add(com0);
        a.add(com1);
        a.add(com2);
        a.add(com3);
        a.add(com4);
        a.add(com5);
        a.add(com6);
        a.add(com7);

    }

    public ArrayList<Comida> crearArrayList() {
        ArrayList<Comida> a = new ArrayList<>();
        return a;
    }

    public void cargarArchivo() {
        Menu miMenu = Menu.getMenu();
        ArrayList<Comida> temp = crearArrayList();
        leerArchivo(temp);
        miMenu.cargarComidas(temp);
    }

    public void crearArchivo() {
        ArrayList<Comida> temp = crearArrayList();
        leerArchivo(temp);
        inicializarMenu(temp);
        salvarArchivo(temp);
    }
}
