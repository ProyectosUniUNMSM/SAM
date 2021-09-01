package modelo;

import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author AlexTprog
 */
public class ListaPedido {

    private static ListaPedido listaPedido;
    private Pedido inicio, econtrado;
    private Pedido[] pedidos;

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
            inicio.indice++;
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
    };
    //ingrediete   getcarcarnes
   public ArrayList<ListaPedido> getPedidos() {
        ArrayList<ListaPedido> listaInformacion = new ArrayList<>();
        int i = 0;
        while (pedidos[i] != null && i < pedidos.length) {
             if (pedidos[i].getAceptar().equalsIgnoreCase("")) {
                listaInformacion.add(pedidos[i]);
            }
            i++;
        }
        return listaInformacion;
    }
}
