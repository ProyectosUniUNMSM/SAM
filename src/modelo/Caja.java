package modelo;

/**
 *
 * @author AlexTprog
 */
public class Caja {

    Boleta ultimo;

    public Caja() {
        ultimo = null;
    }

    public boolean isCajaVacia() {
        return ultimo == null;
    }

    public void addBoleta(Cliente c) {
        Boleta nuevo = new Boleta(c);

        if (!isBoletaActiva(c)) {

            if (!isCajaVacia()) {
                ultimo = nuevo;
            } else {
                nuevo.sig = ultimo.sig;
                ultimo.sig = nuevo;
                ultimo = nuevo;
            }
        } else {
            System.out.println("Ya existe una boleta activa");
        }
    }

    public void addPedidoBoleta() {

    }

    public boolean isBoletaActiva(Cliente c) {
        Boleta aux = ultimo;
        boolean band = false;
        //Si el estado de la boleta es false, sigue activa
        while (aux.sig != ultimo && !band) {
            if (aux.cliente.equals(c) && !aux.estado) {
                band = true;
            }
            aux = aux.sig;
        }
        return band;
    }
}
