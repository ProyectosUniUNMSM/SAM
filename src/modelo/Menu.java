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
   public static void setLlenarComidas(Menu menu){
       
        Comida comida1 = new Comida("LomoSaltado", (float) 35.5);
        Comida comida2 = new Comida("Aji de Gallina", (float) 40.5);
        Comida comida3 = new Comida("Arroz con pollo", (float) 35.5);
        Comida comida4 = new Comida("Sopa Seca", (float) 35.5);
        
        menu.addComida(comida1);
        menu.addComida(comida2);
        menu.addComida(comida3);
        menu.addComida(comida4);
           
    }
     public float getComidaPrecioI(int indice ) {
          return comida[indice].getPrecio();
    }
    public String getComidaNombreI(int indice ) {
          return comida[indice].getNombre();
    }
}
