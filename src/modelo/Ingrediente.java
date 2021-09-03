package modelo;

import java.io.Serializable;

/**
 *
 * @author AlexTprog
 */
public class Ingrediente implements Serializable {

    private int cantidad;
    private String categoria;
    private String nombre;

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
        if(this.cantidad == 0){
            System.out.println("Imposible disminuir más");
        }else{
            this.cantidad -= cant;
        }
        
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
