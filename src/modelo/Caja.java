package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

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

    public void addBoleta(Boleta boleta) {
        Boleta nuevo = boleta;
        if (!isCajaVacia()) {
            nuevo.sig = ultimo.sig;
            ultimo.sig = nuevo;
        } else {
            ultimo = nuevo;
        }
    }

    public void recibirPedido(Pedido pedido) {
        Boleta aux = ultimo;
        boolean encontrado = false;
        //Revisa si ya hay una boleta con el mismo cliente activa
        while (aux.sig != ultimo && !encontrado) {
            if (aux.cliente.equals(pedido.cliente) && aux.estado) {
                encontrado = true;
            } else {
                aux = aux.sig;
            }
        }
        //En caso encuentre una boleta activa añade el pedido
        if (encontrado) {
            aux.pedidos.add(pedido);
        } else {
            Boleta nueva = new Boleta(pedido.cliente);
            nueva.pedidos.add(pedido);
            addBoleta(nueva);
        }
    }

    public float generarBalanceDiario() {
        Boleta aux = ultimo;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date temp = new Date();
        float balance = 0;

        while (aux.sig != ultimo) {
            if (sdf.format(aux.fecha).equals(sdf.format(temp)) && aux.estado) {
                balance += aux.monto;
            }
        }
        return balance;
    }

}
