import java.util.HashSet;


public class Bicicleta extends Transporte {


    public Bicicleta(String nombre) {
        super(nombre);
        this.capPeso = 15.0;
        this.capVolumen = 0.125;
    }

    @Override
    protected Boolean agregarPaquete(Paquete paquete) {
        if ((paquete.getVolumen() <= this.capVolumen) && ((paquete.getPeso() + getPesoTotal()) <= this.capPeso) && ((this.paquetes.size() + 1) < 3)
                && checkDestino(paquete, this.destinos)) {
            this.destinos.add(paquete.getDestino());
            return this.paquetes.add(paquete);
        } else {
            if (!(paquete.getVolumen() <= this.capVolumen)) {
                System.out.println("pasado de volumen");
            }
            if (!((paquete.getPeso() + getPesoTotal()) <= this.capPeso)) {
                System.out.println("psado de peso");
            }
            if (!((this.paquetes.size() + 1) < 3)) {
                System.out.println("demasiados paquetes");
            }
            if (!checkDestino(paquete, this.destinos)) {
                System.out.println("problemas con el destino");
            }

            return false;
        }

    }

    public Boolean checkDestino(Paquete p, HashSet<Destino> listaDestinosActual) {
        String ciudadPaquete;
        String ciudadLista;

        if (listaDestinosActual.isEmpty()) return true;

        for (Destino d : listaDestinosActual) {
            ciudadPaquete = p.getDestino().getCiudad().trim();
            ciudadLista = d.getCiudad().trim();
            if ((ciudadLista.equalsIgnoreCase(ciudadPaquete) && listaDestinosActual.size() < 2)) {
                return true;
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
//Bicicleta:
//        •
//Se mueve dentro de la ciudad.
//        •
//Puede enviar dos paquetes de hasta 0.125 m3 y un máximo de 15 kg.
//        NOTA: Si no tengo destino, el primer paquete me define el destino hacia dónde va la bicicleta.