package modelo;

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
    public Comida getComida() {
        return comida;
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
    public String getAceptar(){
        return "";
    }
 


    public Cliente getCliente() {
        return cliente;
    }

    public boolean isEstado() {
        return estado;
    }

}
