package modelo;

/**
 *
 * @author AlexTprog
 */
public class Pedido {

    //Nodo Pedido
    Comida comida;
    Boolean estado;
    Cliente cliente;
    Pedido sig;

    public Pedido(Comida comida, Cliente cliente) {
        this.comida = comida;
        this.cliente = cliente;
        this.estado = false;
    }

}
