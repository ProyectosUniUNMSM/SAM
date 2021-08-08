package modelo;

/**
 *
 * @author AlexTprog
 */
public class Menu {

    Comida[] comida;
    private int pos = 0;

    public Menu(int tmn) {
        comida = new Comida[tmn];
    }

    public Menu() {
        comida = new Comida[20];
    }

    public void addComida(Comida c) {
        if (isFull()) {
            comida[pos] = c;
            pos++;
        } else {
            System.out.println("MENU LLENO");
        }
    }

    public boolean isFull() {
        if (pos == comida.length) {
            return true;
        }
        return false;
    }
}
