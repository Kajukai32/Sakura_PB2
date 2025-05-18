import java.util.Objects;

public class Paquete {

    private final Double altura;
    private final Double peso;
    private final Double ancho;
    private final Double profundidad;
    private final Destino destino;
    private final Long id;

    public Paquete(Double altura, Double peso, Double ancho, Double profundidad, Destino destino) {
        this.altura = altura;
        this.peso = peso;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.destino = destino;
        this.id = System.nanoTime();
    }

    public Double getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getAncho() {
        return ancho;
    }

    public Double getProfundidad() {
        return profundidad;
    }

    public Destino getDestino() {
        return destino;
    }

    public Long getId() {
        return id;
    }

    public Double getVolumen() {

        return getAltura() * getAncho() * getProfundidad();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Paquete paquete = (Paquete) o;
        return Objects.equals(altura, paquete.altura) && Objects.equals(peso, paquete.peso) && Objects.equals(ancho, paquete.ancho) && Objects.equals(profundidad, paquete.profundidad) && Objects.equals(destino, paquete.destino) && Objects.equals(id, paquete.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(altura, peso, ancho, profundidad, destino, id);
    }

    @Override
    public String toString() {
        return " Paquete {" +
                "altura=" + altura +
                ", peso=" + peso +
                ", ancho=" + ancho +
                ", profundidad=" + profundidad +
                ", destino='" + destino + '\'' +
                '}';
    }
}
