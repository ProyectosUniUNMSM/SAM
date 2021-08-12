package modelo;

import java.util.Objects;

/**
 *
 * @author AlexTprog
 */
public class Cliente {

    String nombre;
    String dni;

    public Cliente() {
    }

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

}
