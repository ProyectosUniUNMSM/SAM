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

        Menu miMenu = Menu.getMenu();
        Inventario miInventario = Inventario.getInventario();
        ListaPedido misPedidos = ListaPedido.getListaPedido();
        Caja miCaja = Caja.getCaja();

        VentanaPrincipal ventana = new VentanaPrincipal();
        ControladorVentanaPrincipal control = new ControladorVentanaPrincipal(ventana);
        control.iniciar();
    }
}
