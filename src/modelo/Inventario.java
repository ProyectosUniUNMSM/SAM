package modelo;

import java.util.ArrayList;

/**
 *
 * @author AlexTprog
 */
public class Inventario {

    private static Inventario inventario;
    private Ingrediente[] ingredientes;
    private int pos;

    private Inventario(int tmn) {
        this.ingredientes = new Ingrediente[tmn];
        this.pos = 0;
    }

    public static Inventario getInventario() {
        if (inventario == null) {
            inventario = new Inventario(19);
        }
        return inventario;
    }

    public void addIngrediente(Ingrediente nuevo) {
        if (!isInventarioLleno()) {
            this.ingredientes[pos] = nuevo;
            pos++;
        } else {
            System.out.println("Inventario lleno.");
        }
    }

    public boolean isInventarioLleno() {
        if (pos > ingredientes.length) {
            return true;
        }
        return false;
    }

    public Ingrediente buscarIngrediente(String buscar) {
        Ingrediente encontrado = null;
        for (int i = 0; i < ingredientes.length - 1; i++) {
            if (ingredientes[i].getNombre().compareTo(buscar) == 0) {
                encontrado = ingredientes[i];
            }
        }
        return encontrado;
    }

    public void disIngrediente(int pos, int cantidad) {
        ingredientes[pos].disIngrediente(cantidad);
    }

    public void aumIngrediente(int pos, int cantidad) {
        ingredientes[pos].aumIngrediente(cantidad);
    }

    public void cargarInventario(ArrayList<Ingrediente> listaIngredientes) {
        for (Ingrediente temp : listaIngredientes) {
            addIngrediente(temp);
        }
    }

    public void mostrar() {
        int i = 0;
        while (ingredientes[i] != null && i < ingredientes.length) {
            System.out.println(ingredientes[i]);
            i++;
        }
    }

    public ArrayList<Ingrediente> getVegetales() {
        ArrayList<Ingrediente> listaVegetales = new ArrayList<>();
        int i = 0;
        while (ingredientes[i] != null && i < ingredientes.length) {
            if (ingredientes[i].getCategoria().equalsIgnoreCase("vegetales")) {
                listaVegetales.add(ingredientes[i]);
            }
            i++;
        }
        return listaVegetales;
    }

    public ArrayList<Ingrediente> getCarnes() {
        ArrayList<Ingrediente> listaCarnes = new ArrayList<>();
        int i = 0;
        while (ingredientes[i] != null && i < ingredientes.length) {
            if (ingredientes[i].getCategoria().equalsIgnoreCase("carnes")) {
                listaCarnes.add(ingredientes[i]);
            }
            i++;
        }
        return listaCarnes;
    }
      
}
