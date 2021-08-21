package modelo;

/**
 *
 * @author AlexTprog
 */
public class ListaPedido {

    Pedido inicio, fin, econtrado;

    public ListaPedido() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean isColaVacia() {
        if (inicio == null) {
            return true;
        }
        return false;
    }

    public void insertar(Comida comida, Cliente cliente) {
        Pedido nuevo = new Pedido(comida, cliente);
        nuevo.sig = null;

        if (isColaVacia()) {
            inicio = nuevo;
        } else {
            nuevo.sig = inicio;
            inicio = nuevo;
        }
    }

    public void pedidoListo(Boleta boleta, Pedido pedido) {
        Pedido aux;        
        boleta.pedidos.add(pedido);
        
    }

    public void eliminar(Pedido pedido) {
        Pedido aux = inicio;
        //Recorre la lista hasta encontrar pedido
        while (aux.sig != pedido && aux.sig != null) {
            aux = aux.sig;
        }
        //Elimina elemento de la lista
        if (pedido != null) {
            if (aux == pedido) {
                inicio = pedido.sig;
            } else {
                aux.sig = pedido.sig;
            }
        }

    }
}
