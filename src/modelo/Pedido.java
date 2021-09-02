package modelo;

import java.io.Serializable;

/**
 *
 * @author AlexTprog
 */
public class Pedido implements Serializable{

    //Nodo Pedido
    public Comida comida;
    public Cliente cliente;
    public boolean estado;
    public Pedido sig;

    public Pedido(Comida comida, Cliente cliente) {
        this.comida = comida;
        this.cliente = cliente;
        this.estado = false;
        this.sig = null;
    }

}
