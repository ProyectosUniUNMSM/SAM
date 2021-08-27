package modelo;

/**
 *
 * @author AlexTprog
 */
public class Menu {

    private static Menu menu;
    private Comida[] comida;
    private int pos;

    private Menu(int tmn) {
        this.comida = new Comida[tmn];
        this.pos = 0;
    }

    public static Menu getMenu() {
        if (menu == null) {
            menu = new Menu(10);
        }
        return menu;
    }

    public void addComida(Comida nuevo) {
        if (!isFull()) {
            this.comida[pos] = nuevo;
            pos++;
        } else {
            System.out.println("MENU LLENO");
        }
    }

    public boolean isFull() {
        return pos > comida.length;
    }

    public void mostrar() {
        int i = 0;
        while (comida[i] != null && i < comida.length) {
            System.out.println(comida[i]);
            i++;
        }
    }
}
