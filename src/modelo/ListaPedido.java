package modelo;

import java.util.ArrayList;

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
        while (aux.sig != null && aux.sig != p) {
            aux = aux.sig;
        }
        if (p != null) {
            if (aux == p) {
                inicio = aux.sig;
            } else {
                aux.sig = p.sig;
            }
        }
    }

    public void limpiarLista() {

    }

    public ArrayList<Pedido> enivarPedidos(Cliente c) {
        ArrayList<Pedido> lista = new ArrayList<Pedido>();
        Pedido aux = inicio;
        while (aux.sig != null) {
            if (aux.cliente.equals(c)) {
                aux.estado = true;
                lista.add(aux);
            }
            aux = aux.sig;
        }
        return lista;
    }
}
