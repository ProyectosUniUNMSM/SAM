package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author AlexTprog
 */
public class Comida implements Serializable{

    public String nombre;
    public float precio;
    public ArrayList<Ingrediente> ingredientes;
    public String img;

    public Comida(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = new ArrayList<Ingrediente>();
    }

    public Comida() {
    }

    public void agregarIngrediente(Ingrediente i) {
        this.ingredientes.add(i);
    }

    public void mostrar() {
        for (Ingrediente i : ingredientes) {
            System.out.println(i);
        }
    }

}
