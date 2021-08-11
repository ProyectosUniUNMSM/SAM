package modelo;

/**
 *
 * @author AlexTprog
 */
public class Pedido {

    //Nodo Pedido
    Comida comida;
    Cliente cliente;
    Pedido sig;

    public Pedido(Comida comida, Cliente cliente) {
        this.comida = comida;
        this.cliente = cliente;
        this.sig = null;
    }

}
