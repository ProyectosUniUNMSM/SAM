package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author AlexTprog
 */
public class Comida implements Serializable {

    private String nombre;
    private float precio;
    private ArrayList<Ingrediente> ingredientes;
    private String img;

    public Comida(String nombre, float precio, String dir) {
        this.nombre = nombre;
        this.precio = precio;
        this.img = dir;
        this.ingredientes = new ArrayList<Ingrediente>();
    }

    public Comida(String nombre, float precio, ArrayList<Ingrediente> ingredientes, String img) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.img = img;
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

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public String getImg() {
        return img;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setIngrediente(Ingrediente ing) {
        this.ingredientes.add(ing);
    }

    public void setImg(String img) {
        this.img = img;
    }

}
