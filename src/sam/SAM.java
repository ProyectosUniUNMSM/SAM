/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sam;

import modelo.Cliente;
import modelo.Comida;
import modelo.ListaPedido;
import modelo.Pedido;

/**
 *
 * @author AlexTprog
 */
public class SAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comida pollo = new Comida();
        Cliente juan = new Cliente();
        Pedido nuevoPedido = new Pedido(pollo, juan);
        ListaPedido prueba = new ListaPedido();
        prueba.insertar(pollo, juan);
        prueba.insertar(pollo, juan);
        
        System.out.println(prueba);
        prueba.mostrar();
        prueba.eliminar(nuevoPedido);
        prueba.mostrar();
    }

}
