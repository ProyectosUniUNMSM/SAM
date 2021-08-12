package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author AlexTprog
 */
public class Boleta {

    //Nodo de Lista Doblemente enlazada    
    public float monto;
    public ArrayList<Pedido> pedidos;
    public Cliente cliente;
    public Date fecha;
    public boolean estado;
    public Boleta sig;

    //Atributo de clase
    static String formato = "dd/MMM/yyyy hh:mm a";
    
    public Boleta(Cliente cliente) {
        this.pedidos = new ArrayList<Pedido>();
        this.cliente = cliente;
        this.fecha = new Date();
        this.estado = false;
        this.sig = this;
    }
    
    public float calcMonto() {
        float total = 0;        
        for (Pedido temp : this.pedidos) {
            total += temp.comida.precio;
        }
        this.monto = total;
        return total;
    }
    
    public void addPedido(Pedido p) {
        this.pedidos.add(p);
    }
}
