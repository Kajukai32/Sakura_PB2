import java.util.Objects;

public class Automovil extends Transporte {

    public Automovil(String nombre) {
        super(nombre);
        this.capPeso = 500.0;
        this.capVolumen = 2.0;

    }

    @Override
    protected Boolean agregarPaquete(Paquete paquete) {
        if ((paquete.getVolumen() <= this.capVolumen) && ((paquete.getPeso() + getPesoTotal()) <= this.capPeso)
                && (this.destinos.contains(paquete.getDestino()) || this.destinos.size() < 3)) {
            this.destinos.add(paquete.getDestino());
            return this.paquetes.add(paquete);
        } else {
            if (paquete.getVolumen() > this.capVolumen) {
                System.out.println(this.getNombre() + ": " + paquete.toString() + "-> paquete muy alto");
            }
            if ((paquete.getPeso() + getPesoTotal()) > this.capPeso) {
                System.out.println(this.getNombre() + ": " + paquete.toString()+ "-> paquete muy pesado");
            }
            if (!this.destinos.contains(paquete.getDestino()) && this.destinos.size() >= 3) {
                System.out.println(this.getNombre() + ": " + paquete.toString()+ "-> Limite de (3) destinos alcanzado");
            }
        }
        return false;
    }

    @Override
    protected Double getPesoTotal() {
        Double cont = 0.0;
        for (Paquete p : this.paquetes) {
            cont += p.getPeso();
        }
        return cont;
    }
}
