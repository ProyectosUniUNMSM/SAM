package modelo;

import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author AlexTprog
 */
public class ListaPedido {

    private static ListaPedido listaPedido;
    private Pedido inicio;
    static int tamaño = 0;

    private ListaPedido() {
        this.inicio = null;
    }

    public static ListaPedido getListaPedido() {
        if (listaPedido == null) {
            listaPedido = new ListaPedido();
        }
        return listaPedido;
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
        nuevo.indice++;

        tamaño++;

    }

    public int size() {
        return tamaño;
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

    public Pedido buscar(int index) {
        Pedido aux = inicio;
        while (aux.sig != null) {
            if (aux.cliente.equals(index)) {
                return aux;
            }
            aux = aux.sig;
        }
        return aux;
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

    public ArrayList<Pedido> getPedidos() {
        ArrayList<Pedido> lista = new ArrayList<Pedido>();
        if (!isListaVacia()) {
            Pedido aux = inicio;
            while (aux != null) {
                lista.add(aux);
                aux = aux.sig;
            }
        }

        return lista;
    }

    public ArrayList<Pedido> getPedidosListos() {
        ArrayList<Pedido> lista = new ArrayList<Pedido>();
        if (!isListaVacia()) {
            Pedido aux = inicio;
            while (aux != null) {
                if (aux.estado == true) {
                    lista.add(aux);
                }
                aux = aux.sig;
            }
        }
        return lista;
    }

}
