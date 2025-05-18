import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Empresa {


    public Empresa() {
    }

    private Set<Transporte> transportes = new HashSet<>();
    private ArrayList<Paquete> totalPaquetes = new ArrayList<>();

    public void agregarTransporte(Transporte t) {

        if (transportes.add(t)) {
            System.out.println("Caso " + t.getNombre() + ": Adicion de flota exitosa..");
        } else
            System.out.println("Caso " + t.getNombre() + ": Error en la adicion de flota, transporte con el mismo nombre e id ya existente..");

    }

    public Integer getCantPaquetes() {
        return this.totalPaquetes.size();
    }

    public String AgregadoExitosamente(Paquete paquete) {

        return "Paquete: " + paquete.toString() + "agregado exitosamente..";
    }

    public String NoSePudoAgregar(Paquete paquete) {

        return "Paquete: " + paquete.toString() + "imposible de agregar..";
    }

    public Integer getNumeroDeTransportes() {
        return transportes.size();
    }

    public void asignarPaquete(Paquete paquete) {

        for (Transporte t : transportes) {

            boolean estado = t.agregarPaquete(paquete);

            if (estado) {
                System.out.println(AgregadoExitosamente(paquete) + " al transporte conocido como" + t.getNombre());
                totalPaquetes.add(paquete);
                return;

            } else {
                System.out.println(NoSePudoAgregar(paquete));
            }
        }
    }
}
