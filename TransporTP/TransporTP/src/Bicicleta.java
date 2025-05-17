import java.util.HashSet;


public class Bicicleta extends Transporte {


    public Bicicleta(String nombre) {
        super(nombre);
        this.capPeso = 15.0;
        this.capVolumen = 0.125;
        this.maxCiudades = 1;
    }

    @Override
    protected Boolean agregarPaquete(Paquete paquete) {
        if (checkVolumen(paquete.getVolumen()) && checkPeso(this.getPesoTotal(), paquete) &&
                ((this.paquetes.size() + 1) < 3) && checkDestino(paquete, this.destinos, this.maxCiudades)) {
            if (this.destinos.contains(paquete.getDestino())) {
                this.destinos.add(paquete.getDestino());
            }
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
            if (!checkDestino(paquete, this.destinos, this.maxCiudades)) {
                System.out.println("problemas con el destino");
            }

            return false;
        }

    }


}
//Bicicleta:
//        •
//Se mueve dentro de la ciudad.
//        •
//Puede enviar dos paquetes de hasta 0.125 m3 y un máximo de 15 kg.
//        NOTA: Si no tengo destino, el primer paquete me define el destino hacia dónde va la bicicleta.