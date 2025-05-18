import java.util.Objects;

public class Destino {
    private String ciudad;
    private String alturaYCalle;

    public Destino(String ciudad, String alturaYCalle) {
        this.ciudad = ciudad;
        this.alturaYCalle = alturaYCalle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getAlturaYCalle() {
        return alturaYCalle;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Destino destino = (Destino) o;
        return Objects.equals(ciudad.trim().toLowerCase(), destino.ciudad.trim().toLowerCase())
                && Objects.equals(alturaYCalle.trim().toLowerCase(), destino.alturaYCalle.trim().toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(ciudad, alturaYCalle);
    }

    @Override
    public String toString() {
        return "Destino{" +
                "ciudad='" + ciudad + '\'' +
                ", alturaYCalle='" + alturaYCalle + '\'' +
                '}';
    }
}
