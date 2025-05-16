public class Paquete {

    private final Double altura;
    private final Double peso;
    private final Double ancho;
    private final Double profundidad;
    private final Destino destino;

    public Paquete(Double altura, Double peso, Double ancho, Double profundidad, Destino destino) {
        this.altura = altura;
        this.peso = peso;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.destino = destino;
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

    public Double getVolumen() {

        return getAltura() * getAncho() * getProfundidad();
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
