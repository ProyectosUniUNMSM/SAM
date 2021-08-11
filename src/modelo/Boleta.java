package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author AlexTprog
 */
public class Boleta {

    //Nodo de Lista Doblemente enlazada    
    float monto;
    ArrayList<Pedido> pedidos;
    Cliente cliente;
    Date fecha;
    boolean estado;
    Boleta sig;

    //Atributo de clase
    static String formato = "dd/MMM/yyyy hh:mm a";

    public Boleta(Cliente cliente) {
        this.pedidos = new ArrayList<Pedido>();
        this.cliente = cliente;
        this.fecha = new Date();
        this.estado = false;
        this.sig = this;
    }

    public void calcMonto() {
        float aux = 0;
        for (Pedido temp : this.pedidos) {
            aux += temp.comida.precio;
        }
        this.monto = aux;
    }
}
