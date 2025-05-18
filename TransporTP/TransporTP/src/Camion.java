public class Camion extends Transporte {

    public Camion(String nombre) {
        super(nombre);
        this.capPeso = 16000.0;
        this.capVolumen = 20.0;
        this.maxCiudades = 1000;

    }

    @Override
    protected Boolean agregarPaquete(Paquete paquete) {
        if (checkVolumen(paquete.getVolumen(), this.getVolumenTotal()) && checkPeso(this.getPesoTotal(), paquete) && checkDestino(paquete, this.destinos, maxCiudades) && !checkPaqueteDuplicado(paquete, this.paquetes)) {
            this.destinos.add(paquete.getDestino());
            return this.paquetes.add(paquete);
        } else {
            if (!checkVolumen(paquete.getVolumen(), this.getVolumenTotal())) {
                System.out.println(this.getNombre() + ": " + paquete + "-> problemas con el volumen");
            }
            if (!checkPeso(this.getPesoTotal(), paquete)) {
                System.out.println(this.getNombre() + ": " + paquete + "-> paquete muy pesado");
            }
            if (!checkDestino(paquete, this.destinos, maxCiudades)) {
                System.out.println("problemas con el destino");
            }
            if (checkPaqueteDuplicado(paquete, this.paquetes)) {
                System.out.println(paquete + "  ->> paquete ya existente");
            }
        }
        return false;
    }

}
//•
//Abarca todas las cuidades necesarias.
//•
//Puede llevar hasta 20 m3 de carga y máximo de 16 toneladas.
//        Requerimientos.