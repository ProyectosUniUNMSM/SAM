package modelo;

/**
 *
 * @author AlexTprog
 */
public class Ingrediente {

    int cantidad;
    String categoria;
    String nombre;

    public Ingrediente() {
    }

    public Ingrediente(String nombre, String categoria, int cantidad) {
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.nombre = nombre;
    }

    public void aumIngrediente(int cant) {
        this.cantidad += cant;
    }

    public void disIngrediente(int cant) {
        this.cantidad -= cant;
    }

    public void setCantidad(int tmn) {
        this.cantidad = tmn;
    }
}
