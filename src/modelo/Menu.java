package modelo;

/**
 *
 * @author AlexTprog
 */
public class Menu {

    public Comida[] comida;
    public int pos;

    public Menu(int tmn) {
        this.comida = new Comida[tmn];
        this.pos = 0;
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
