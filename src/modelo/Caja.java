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

    public void addBoleta(Boleta nuevo) {
        if (isCajaVacia()) {
            ultimo = nuevo;
            tamaño++;

        } else {
            nuevo.sig = ultimo.sig;
            ultimo.sig = nuevo;
            ultimo = nuevo;
            tamaño++;
        }
    }

    public void addBoleta(Pedido p) {
        Boleta nuevo = new Boleta(p);

        if (isCajaVacia()) {
            ultimo = nuevo;
            tamaño++;
        } else {
            if (!isBoletaActiva(p.cliente)) {
                nuevo.sig = ultimo.sig;
                ultimo.sig = nuevo;
                ultimo = nuevo;
                tamaño++;
            } else {
                buscarBoleta(p.cliente).addPedido(p);
                System.out.println("Ya Hay un Boleta Activa");
            }
        }
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
        } while (aux != ultimo.sig);
        return aux;
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
//
//    public void recibirPedido(ArrayList<Pedido> lista) {
//        for (Pedido aux : lista) {
//            if (aux != null) {
//                addPedidoBoleta(aux);
//            }
//        }
//    }

    public int getTamaño() {
        return tamaño;
    }

    public Boleta getUltimo() {
        return ultimo;
    }

    public ArrayList<Boleta> getBoletas() {
        ArrayList<Boleta> temp = new ArrayList<>();
        Boleta aux = ultimo;

        if (!isCajaVacia()) {
            for (int i = 0; i < caja.getTamaño(); i++) {
                temp.add(aux);
                aux = aux.sig;
            }
        }
        return temp;
    }
}
