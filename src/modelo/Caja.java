package modelo;

import java.util.ArrayList;

/**
 *
 * @author AlexTprog
 */
//Lista Circ de Boletas
public class Caja {

    private static Caja caja;
    private Boleta ultimo;
    private int tamaño;

    private Caja() {
        ultimo = null;
        tamaño = 0;
    }

    public static Caja getCaja() {
        if (caja == null) {
            caja = new Caja();
        }
        return caja;
    }

    public boolean isCajaVacia() {
        return ultimo == null;
    }

    public void addBoleta(Cliente c) {
        Boleta nuevo = new Boleta(c);

        if (isCajaVacia()) {
            ultimo = nuevo;
            tamaño++;

        } else {
            if (!isBoletaActiva(c)) {
                nuevo.sig = ultimo.sig;
                ultimo.sig = nuevo;
                tamaño++;
            } else {
                System.out.println("Ya Hay un Boleta Activa");
            }
        }

    }

    public void addPedidoBoleta(Pedido p) {
        if (isCajaVacia()) {
            addBoleta(p.cliente);
        }
        buscarBoleta(p.cliente).addPedido(p);
    }

    public boolean isBoletaActiva(Cliente c) {
        Boleta aux = ultimo;
        boolean band = false;
        //Si el estado de la boleta es false, sigue activa = no esta pagada
        while (aux.sig != ultimo && !band) {
            if (aux.cliente.equals(c) && !aux.estado) {
                band = true;
            }
            aux = aux.sig;
        }
        return band;
    }

    public Boleta buscarBoleta(Cliente c) {
        Boleta aux = ultimo.sig;
        do {
            if (aux.cliente.equals(c)) {
                return aux;
            }
            aux = aux.sig;
        } while (aux!= ultimo.sig);
        return null;
    }

    public float calcTotal() {
        float total = 0;
        Boleta aux = ultimo;
        while (aux.sig != ultimo) {
            aux.calcMonto();
            total += aux.monto;
            aux = aux.sig;
        }
        return total;
    }

    public void recibirPedido(ArrayList<Pedido> lista) {
        for (Pedido aux : lista) {
            if (aux != null) {
                addPedidoBoleta(aux);
            }
        }
    }

    public int getTamaño() {
        return tamaño;
    } 

    public Boleta getUltimo() {
        return ultimo;
    }
}
