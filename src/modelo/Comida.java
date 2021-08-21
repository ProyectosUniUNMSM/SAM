package modelo;

/**
 *
 * @author AlexTprog
 */
public class Comida {

    String nombre;
    float precio;
    Ingrediente[] ingredientes;
    String img;

    public Comida(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Comida() {
    }

}
