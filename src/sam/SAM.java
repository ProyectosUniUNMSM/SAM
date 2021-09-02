/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sam;

import controlador.ControladorArchivoInventario;
import controlador.ControladorVentanaPrincipal;
import modelo.Caja;
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

        ControladorArchivoInventario inv = new ControladorArchivoInventario();
        inv.inicializarInventario();
        inv.salvarArchivo();
        /*
        VentanaPrincipal ventana = new VentanaPrincipal();
        ControladorVentanaPrincipal control = new ControladorVentanaPrincipal(ventana);
        control.iniciar();
         */
    }
}
