/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sam;

import controlador.controladorPrincipal;
import modelo.Caja;
import modelo.Comida;
import modelo.Ingrediente;
import modelo.Inventario;
import modelo.ListaPedido;
import modelo.Menu;
import vista.principal;


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

        Ingrediente a = new Ingrediente("ingrediente a", "categoria a", 10);
        Ingrediente b = new Ingrediente("ingrediente b", "categoria b", 11);
        Ingrediente c = new Ingrediente("ingrediente c", "categoria c", 12);

        miInventario.addIngrediente(a);
        miInventario.addIngrediente(b);
        miInventario.addIngrediente(c);

        System.out.println("Inventario");
        miInventario.mostrar();

        Comida comida1 = new Comida("comida 1", 20);
        comida1.ingredientes.add(a);
        comida1.ingredientes.add(b);

        Comida comida2 = new Comida("comida 2", 30);
        comida2.ingredientes.add(a);
        comida2.ingredientes.add(c);

        
            principal mainStart = new principal();
            controladorPrincipal controlaMain = new controladorPrincipal(mainStart);
            controlaMain.inciar();
            
    }
}
