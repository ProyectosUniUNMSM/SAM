package modelo;

/**
 *
 * @author AlexTprog
 */
public class Inventario {

    Ingrediente[] ingredientes;
    int pos;

    public Inventario(int tmn) {
        this.ingredientes = new Ingrediente[tmn];
        this.pos = 0;
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

    public int buscarIngrediente(String buscar) {
        int posBuscada = -1;
        for (int i = 0; i < ingredientes.length; i++) {
            if (ingredientes[i].nombre.equalsIgnoreCase(buscar)) {
                return i;
            }
        }
        return posBuscada;
    }

    public void disIngrediente(int pos, int cantidad) {
        ingredientes[pos].disIngrediente(cantidad);
    }

    public void aumIngrediente(int pos, int cantidad) {
        ingredientes[pos].aumIngrediente(cantidad);
    }
}
