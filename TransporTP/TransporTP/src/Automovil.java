import java.util.HashSet;

public class Automovil extends Transporte {

    public Automovil(String nombre) {
        super(nombre);
        this.capPeso = 500.0;
        this.capVolumen = 2.0;
        this.maxCiudades = 3;

    }

    @Override
    protected Boolean agregarPaquete(Paquete paquete) {
        if (checkVolumen(paquete.getVolumen(), getVolumenTotal()) && checkPeso(this.getPesoTotal(), paquete)
                && checkDestino(paquete, this.destinos, this.maxCiudades)) {
            if (this.destinos.contains(paquete.getDestino())) {
                this.destinos.add(paquete.getDestino());
            }
            return this.paquetes.add(paquete);
        } else {
            if (!checkVolumen(paquete.getVolumen(), getVolumenTotal())) {
                System.out.println(this.getNombre() + ": " + paquete.toString() + "-> paquete muy alto");
            }
            if (!checkPeso(this.getPesoTotal(), paquete)) {
                System.out.println(this.getNombre() + ": " + paquete.toString() + "-> paquete muy pesado");
            }
            if (!checkDestino(paquete, this.destinos, 3)) {
                System.out.println(this.getNombre() + ": " + paquete.toString() + "-> Limite de (3) Ciudades alcanzado");
            }
        }
        return false;
    }


}
//Automóvil:
//        •
//Abarca hasta 3 ciudades. Los destinos no se pueden repetir.
//        •
//Puede llevar hasta 2m3 de carga y hasta 500kg.