/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sam;

import controlador.ControladorVentanaPrincipal;
import modelo.Caja;
import modelo.Comida;
import modelo.Ingrediente;
import modelo.Inventario;
import modelo.ListaPedido;
import modelo.Menu;
import vista.VentanaPrincipal;

/**
 *
 * @author AlexTprog
 */
public class SAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Menu miMenu = new Menu(10);
        Inventario miInventario = new Inventario(10);
        ListaPedido misPedidos = new ListaPedido();
        Caja miCaja = new Caja();

        VentanaPrincipal mainStart = new VentanaPrincipal();
        ControladorVentanaPrincipal controlaMain = new ControladorVentanaPrincipal(mainStart);
        controlaMain.inciar();

    }
}
