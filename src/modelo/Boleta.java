package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author AlexTprog
 */
public class Boleta {
    //Nodo de Lista Doblemente enlazada

    float precio;
    ArrayList<Pedido> pedidos;
    Cliente cliente;
    Date fecha;
    Boleta sig;

    public Boleta() {
        this.pedidos = new ArrayList<Pedido>();
        sig = this;
    }

}
