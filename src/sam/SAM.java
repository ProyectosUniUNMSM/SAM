/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sam;

import controlador.ControladorArchivoInventario;
import controlador.ControladorArchivoMenu;
import controlador.ControladorCaja;
import controlador.ControladorVentanaPrincipal;
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

        //Ya no es necesario descomentarlo porque duplicaria los objetos(ingrediente)
//        ControladorArchivoInventario inv = new ControladorArchivoInventario();
//        ArrayList<Ingrediente> temp;
//        temp = inv.crearArrayList();
//        inv.leerArchivo(temp);
//        inv.inicializarInventario(temp);
//        inv.salvarArchivo(temp);
        //inv.inicializarInventario();
        //inv.salvarArchivo();
        ControladorArchivoInventario archivoInventario = new ControladorArchivoInventario();
        ControladorArchivoMenu archivoMenu = new ControladorArchivoMenu();
        ControladorCaja cc = new ControladorCaja();
        cc.leerArchivo();

        archivoInventario.cargarArchivo();
        archivoMenu.cargarArchivo();

        VentanaPrincipal ventana = new VentanaPrincipal();
        ControladorVentanaPrincipal control = new ControladorVentanaPrincipal(ventana);
        control.iniciar();
    }
}
