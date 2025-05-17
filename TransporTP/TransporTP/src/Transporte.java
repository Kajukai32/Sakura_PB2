import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public abstract class Transporte {

    protected ArrayList<Paquete> paquetes = new ArrayList<>();
    protected HashSet<Destino> destinos = new HashSet<>();
//    protected Set<Destino> destinos = new HashSet<>();

    protected Double capVolumen;
    protected Double capPeso;
    protected String nombre;
    protected Integer maxCiudades;

    public Transporte(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTotalDestinos() {
        return this.destinos.size();
    }

    protected void vaciarCarga() {

        for (Paquete paquete : paquetes) {
            System.out.println("Borrado: " + paquete.toString() + "\n");
        }
        paquetes.clear();
        System.out.println("Transporte sin carga...");
    }

    public Integer cantPaquetes() {
        return paquetes.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transporte that = (Transporte) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    protected abstract Boolean agregarPaquete(Paquete paquete);


    protected Double getPesoTotal() {
        Double cont = 0.0;
        for (Paquete p : this.paquetes) {
            cont += p.getPeso();
        }
        return cont;
    }

    protected Double getVolumenTotal() {
        Double cont = 0.0;
        for (Paquete p : this.paquetes) {
            cont += p.getVolumen();
        }
        return cont;
    }

    protected Boolean checkVolumen(Double p) {
        return (p <= this.capVolumen);
    }

    protected Boolean checkVolumen(Double p, Double volumenTotal) {
        return (p + volumenTotal <= this.capVolumen);
    }

    protected Boolean checkPeso(Double pesoTotal, Paquete p) {
        return ((p.getPeso() + pesoTotal) <= this.capPeso);
    }

    public Boolean checkDestino(Paquete p, HashSet<Destino> listaDestinosActual, Integer maxCiudades) {
        String ciudadPaquete;
        String ciudadLista;

        if (listaDestinosActual.isEmpty()) return true;

        for (Destino d : listaDestinosActual) {
            ciudadPaquete = p.getDestino().getCiudad().trim();
            ciudadLista = d.getCiudad().trim();
            if ((ciudadLista.equalsIgnoreCase(ciudadPaquete) || listaDestinosActual.size() < maxCiudades)) {
                return true;
            }
        }
        return false;
    }

}
