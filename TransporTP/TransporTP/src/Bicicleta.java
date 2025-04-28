import java.util.Objects;

public class Bicicleta extends Transporte {


    public Bicicleta(String nombre) {
        super(nombre);
        this.capPeso = 15.0;
        this.capVolumen = 0.125;
    }

    @Override
    protected Boolean agregarPaquete(Paquete paquete) {
        if ((paquete.getVolumen() <= this.capVolumen) && ((paquete.getPeso() + getPesoTotal()) <= this.capPeso) && ((this.paquetes.size() + 1) < 3)
                && (this.destinos.isEmpty() || Objects.equals(this.destinos.get(0), paquete.getDestino()))) {
            this.destinos.add(paquete.getDestino());
            return this.paquetes.add(paquete);
        } else {
            if (paquete.getVolumen() > this.capVolumen) {
                System.out.println(this.getNombre()+ ": " + paquete.toString() + "-> paquete muy alto");
            }
            if ((paquete.getPeso() + getPesoTotal()) > this.capPeso) {
                System.out.println(this.getNombre() + ": paquete muy pesado");
            }
            if ((this.paquetes.size() + 1) >= 3) {
                System.out.println(this.getNombre() + ": limite de 2 paquetes alcanzado");
            }
            if (!this.destinos.isEmpty()) {
                if (!Objects.equals(this.destinos.get(0), paquete.getDestino())) {
                    System.out.println(this.getNombre() + ": Destino diferente al seteado previamente");
                }
            }


            return false;
        }

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
