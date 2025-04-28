public class Camion extends Transporte {

    public Camion(String nombre) {
        super(nombre);
        this.capPeso = 16000.0;
        this.capVolumen = 20.0;

    }

    @Override
    protected Boolean agregarPaquete(Paquete paquete) {
        if ((paquete.getVolumen() <= this.capVolumen) && ((paquete.getPeso() + getPesoTotal()) <= this.capPeso)) {
            if (!destinos.contains(paquete.getDestino())) {
                this.destinos.add(paquete.getDestino());
                return this.paquetes.add(paquete);
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
