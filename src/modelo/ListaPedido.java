package modelo;

/**
 *
 * @author AlexTprog
 */
public class ListaPedido {

    Pedido inicio, econtrado;

    public ListaPedido() {
        this.inicio = null;
    }

    public boolean isListaVacia() {
        if (inicio == null) {
            return true;
        }
        return false;
    }

    public void addPedido(Comida comida, Cliente cliente) {
        Pedido nuevo = new Pedido(comida, cliente);
        nuevo.sig = null;

        if (isListaVacia()) {
            inicio = nuevo;
        } else {
            nuevo.sig = inicio;
            inicio = nuevo;
        }
    }

    public Pedido buscarPedido(Cliente c) {
        Pedido aux = inicio;
        while (aux.sig != null) {
            if (aux.cliente.equals(c)) {

                return aux;
            }
            aux = aux.sig;
        }
        return null;
    }

    public void mostrarPedido() {
        Pedido aux = inicio;
        while (aux != null) {
            System.out.println(aux);
            aux = aux.sig;
        }
    }

    public void eliminarPedido(Pedido p) {
        Pedido aux = inicio;
        while (aux != null && aux.sig != p) {

        }
    }
}
