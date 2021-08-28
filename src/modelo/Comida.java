package modelo;

import java.util.ArrayList;

/**
 *
 * @author AlexTprog
 */
public class Comida {

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

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }
    
    
    

    public Comida(String nombre, float precio, ArrayList<Ingrediente> ingredientes, String img) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.img = img;
    }

}
