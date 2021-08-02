
package sam;

import Controlador.ControladorMenu;
import Vista.Vista_Menu;

public class SAM {

    public static void main(String[] args) {
        Vista_Menu vista = new Vista_Menu();
        ControladorMenu abrir = new ControladorMenu(vista);
        abrir.iniciar();
    }

}
