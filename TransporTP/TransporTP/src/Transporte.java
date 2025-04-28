import java.util.ArrayList;
import java.util.Objects;

public abstract class Transporte {

    protected ArrayList<Paquete> paquetes = new ArrayList<>();
    protected ArrayList<String> destinos = new ArrayList<>();

    protected Double capVolumen;
    protected Double capPeso;
    protected String nombre;

    public Transporte(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    //    public String AgregadoExitosamente(Paquete paquete) {
//
//        return "Paquete: " + paquete.toString() + "agregado exitosamente..";
//    }
//
//    public String NoSePudoAgregar(Paquete paquete) {
//
//        return "Paquete: " + paquete.toString() + "imposible de agregar..";
//    }
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


    protected abstract Double getPesoTotal();
}
