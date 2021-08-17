package modelo;

/**
 *
 * @author AlexTprog
 */
public class Pedido {

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
