import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestTransporTP {

    @Test
    public void crearBici() {

        Bicicleta bici1 = new Bicicleta("MiBici");

        Assertions.assertEquals("MiBici", bici1.getNombre());
    }

    @Test
    public void testearBici() {

        Bicicleta bici1 = new Bicicleta("MiBici");

        Destino destino1 = new Destino("Buenos Aires", "Bueras 123");
        Destino destino2 = new Destino("Buenos Aires", "Bueras 13");

        Paquete paquete1 = new Paquete(1.0, 2.0, 0.3, 0.12, destino1);
        Paquete paquete2 = new Paquete(1.0, 2.0, 0.3, 0.12, destino2);

        bici1.agregarPaquete(paquete1);
        bici1.agregarPaquete(paquete2);


        Assertions.assertEquals(2, bici1.cantPaquetes());
    }

    //Bicicleta:
//        •
//Se mueve dentro de la ciudad.
//        •
//Puede enviar dos paquetes de hasta 0.125 m3 y un máximo de 15 kg.
//        NOTA: Si no tengo destino, el primer paquete

//    @Test
//    public void crearAutomovil() {
//
//        Automovil auto1 = new Automovil("MiCoche");
//
//        Assertions.assertEquals("MiCoche", auto1.getNombre());
//    }
//
//
//    @Test
//    public void crearCamion() {
//
//        Automovil camion1 = new Automovil("MiCamion");
//
//        Assertions.assertEquals("MiCamion", camion1.getNombre());
//    }
//
//

//
//
//    @Test
//    public void biciCantPaquetes() {
//
//        Bicicleta bici1 = new Bicicleta("MiBici");
//        Paquete paquete1 = new Paquete(1.0, 2.0, 0.3, 0.12, "Mendoza");
//        Boolean confirmacion1 = bici1.agregarPaquete(paquete1);
//        bici1.vaciarCarga();
//
//        Assertions.assertEquals(0, bici1.cantPaquetes());
//    }
//
//    @Test
//    public void testDestinosAutomovil() {
//
//        Automovil auto1 = new Automovil("MiAuto");
//
//        Paquete paquete1 = new Paquete(1.0, 2.0, 0.3, 0.12, "Mendoza");
//        Paquete paquete2 = new Paquete(1.0, 2.0, 0.3, 0.12, "TierraDelFuego");
//        Paquete paquete3 = new Paquete(1.0, 2.0, 0.3, 0.12, "Usuhaia");
//        Paquete paquete4 = new Paquete(1.0, 2.0, 0.3, 0.12, "Bs As");
//
//        auto1.agregarPaquete(paquete1);
//        auto1.agregarPaquete(paquete2);
//        auto1.agregarPaquete(paquete3);
//        auto1.agregarPaquete(paquete4);
//
//        Assertions.assertEquals(3, auto1.cantPaquetes());
//    }
//
//    @Test
//    public void testProblemasConElPaqueteAutomovil() {
//
//        Automovil auto1 = new Automovil("MiAuto");
//
//        Paquete paquete1 = new Paquete(1.0, 2.0, 0.3, 0.12, "Mendoza");
//        Paquete paquete2 = new Paquete(1.0, 130000.0, 0.3, 0.12, "TierraDelFuego");
//        Paquete paquete3 = new Paquete(1000.0, 2.0, 0.3, 0.12, "Usuhaia");
//
//        auto1.agregarPaquete(paquete1);
//        auto1.agregarPaquete(paquete2);
//        auto1.agregarPaquete(paquete3);
//
//
//        Assertions.assertEquals(1, auto1.cantPaquetes());
//    }
//
//    @Test
//    public void testCamion() {
//
//        Camion camion1 = new Camion("MiAuto");
//
//        Paquete paquete1 = new Paquete(1.0, 2.0, 0.3, 0.12, "Mendoza");
//        Paquete paquete2 = new Paquete(1.0, 18880000.0, 0.3, 0.12, "TierraDelFuego");
//        Paquete paquete3 = new Paquete(1000.0, 2.0, 0.3, 0.12, "Usuhaia");
//
//        camion1.agregarPaquete(paquete1);
//        camion1.agregarPaquete(paquete2);
//        camion1.agregarPaquete(paquete3);
//
//
//        Assertions.assertEquals(1, camion1.cantPaquetes());
//    }
//
//    @Test
//    public void crearEmpresa() {
//
//        Empresa empresa1SA = new Empresa();
//        Automovil auto1 = new Automovil("MiCoche");
//        Automovil camion1 = new Automovil("MiCamion");
//
//        empresa1SA.agregarTransporte(camion1);
//        empresa1SA.agregarTransporte(auto1);
//
//        Assertions.assertEquals(2, empresa1SA.getNumeroDeTransportes());
//    }
//
//    @Test
//    public void testAsignarpaqueteEmpresa() {
//
//        Empresa empresa1SA = new Empresa();
//        Automovil auto1 = new Automovil("MiCoche");
//        Camion camion1 = new Camion("MiCamion");
//        Bicicleta bici1 = new Bicicleta("MiBici");
//
//        Paquete paquete1 = new Paquete(1.0, 2.0, 0.3, 0.12, "Mendoza");
//        Paquete paquete2 = new Paquete(1.0, 18.0, 0.3, 0.12, "TierraDelFuego");
//        Paquete paquete3 = new Paquete(0.7, 2.0, 0.3, 0.12, "Usuhaia");
//
//        empresa1SA.agregarTransporte(bici1);
//        empresa1SA.agregarTransporte(camion1);
//        empresa1SA.agregarTransporte(auto1);
//
//        empresa1SA.asignarPaquete(paquete1);
//
//
//        Assertions.assertEquals(1, empresa1SA.getCantPaquetes());
//    }

}
