package modelo;

import java.util.ArrayList;

/**
 *
 * @author AlexTprog
 */
public class Pedido {

    //Nodo Pedido
    public Comida comida;
    public Cliente cliente;
    public boolean estado;
    public Pedido sig;
    public int indice;

    public Pedido(Comida comida, Cliente cliente) {
        this.comida = comida;
        this.cliente = cliente;
        this.indice = 0;
        this.estado = false;
        this.sig = null;
    }

    public Pedido() {
    }

    public String getNombreComida() {
        return comida.getNombre();
    }

    public String getPeidoNombreComida() {

        return comida.getNombre();
    }

    public String getPedidoDniCliente() {

        return cliente.getDni();
    }

    public String getPedidoClienteNombre() {

        return cliente.getNombre();
    }

    public int getIndice() {
        return indice;
    }

    public String getAceptar() {
        return "";
    }

    public String getDniCliente() {
        return cliente.getDni();
    }

    public String getNombreCliente() {
        return cliente.getNombre();
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
//NO ME SALIO QUE DESCUENTE LOS INGREDIENTES xd : alex
//    public void descontarIngredientes() {
//        ArrayList<Ingrediente> temp = comida.getIngredientes();
//        for (Ingrediente i : temp) {
//            i.disIngrediente(1);
//        }
//    }

}
