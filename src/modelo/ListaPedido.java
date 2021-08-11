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

    public void insertar(Comida comida, Cliente cliente) {
        Pedido nuevo = new Pedido(comida, cliente);
        nuevo.sig = null;

        if (isListaVacia()) {
            inicio = nuevo;
        } else {
            nuevo.sig = inicio;
            inicio = nuevo;
        }
    }

    public void eliminar(Comida comida, Cliente cliente) {
        Pedido aux = inicio;
        boolean band = false;
        //Recorre la lista hasta encontrar pedido
        while (aux != null && !band) {
            if (aux.cliente.dni.equalsIgnoreCase(cliente.dni)) {
                if (aux.comida.equals(comida)) {
                    band = true;
                }
            } else {
                aux = aux.sig;
            }
        }
        //Elimina elemento de la lista
        if (comida != null && cliente != null) {
            if (aux == pedido) {
                inicio = pedido.sig;
            } else {
                aux.sig = pedido.sig;
            }
        }
    }

    public Pedido obtenerPedidos(int n) {
        if (isListaVacia()) {
            return null;
        } else {
            Pedido aux = inicio;
            int contador = 0;
            while (contador < n && aux.sig != null) {
                aux = aux.sig;
                contador++;
            }
            if (contador != n) {
                return null;
            } else {
                return aux;
            }
        }
    }

    public void mostrar() {
        Pedido aux = inicio;
        while (aux != null) {
            System.out.println(aux);
            aux = aux.sig;
        }
    }

}
