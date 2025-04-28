import java.util.ArrayList;

public class Empresa {


    public Empresa() {
    }

    private ArrayList<Transporte> transportes = new ArrayList<>();
    private ArrayList<Paquete> totalPaquetes = new ArrayList<>();

    public void agregarTransporte(Transporte t) {

        if (!transportes.contains(t)) {
            transportes.add(t);
            System.out.println("Caso " + t.getNombre() + ": Adicion de flota exitosa..");
        } else
            System.out.println("Caso " + t.getNombre() + ": Error en la adicion de flota, transporte con el mismo nombre ya existente..");

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

            if (t.agregarPaquete(paquete)) {
                System.out.println(AgregadoExitosamente(paquete) + " al transporte conocido como" + t.getNombre());
                break;

            } else {
                System.out.println(NoSePudoAgregar(paquete));
            }
        }
    }
}
