import java.util.Comparator;
import java.util.Objects;

public class Propietario{
    private final String nombre;
    private final Long dni;

    public Propietario(String nombre) {
        this.nombre = nombre;
        this.dni = System.currentTimeMillis();
    }

    public String getNombre() {
        return nombre;
    }

    public Long getDni() {
        return dni;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Propietario that = (Propietario) o;
        return Objects.equals(nombre.toLowerCase().trim(), that.nombre.toLowerCase().trim()) && Objects.equals(dni, that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase().trim(), dni);
    }
}
