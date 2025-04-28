import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTransporTP {

    @Test
    public void crearBici() {

        Bicicleta bici1 = new Bicicleta("MiBici");

        Assertions.assertEquals("MiBici", bici1.getNombre());
    }

    @Test
    public void crearAutomovil() {

        Automovil auto1 = new Automovil("MiCoche");

        Assertions.assertEquals("MiCoche", auto1.getNombre());
    }


    @Test
    public void crearCamion() {

        Automovil camion1 = new Automovil("MiCamion");

        Assertions.assertEquals("MiCamion", camion1.getNombre());
    }

    @Test
    public void crearEmpresa() {

        Empresa empresa1SA = new Empresa();
        Automovil auto1 = new Automovil("MiCoche");
        Automovil camion1 = new Automovil("MiCamion");

        empresa1SA.agregarTransporte(camion1);
        empresa1SA.agregarTransporte(auto1);
//        empresa1SA.agregarTransporte(auto1);

        Assertions.assertEquals(2, empresa1SA.getNumeroDeTransportes());
    }

    @Test
    public void testearBici() {

        Bicicleta bici1 = new Bicicleta("MiBici");
        Paquete paquete1 = new Paquete(1.0, 2.0, 0.3, 0.12, "Mendoza");
        Paquete paquete2 = new Paquete(1.0, 2.0, 0.3, 0.12, "Mendoza");

        bici1.agregarPaquete(paquete1);
        bici1.agregarPaquete(paquete2);



        Assertions.assertEquals(0, bici1.cantPaquetes());
    }


    @Test
    public void biciCantPaquetes() {

        Bicicleta bici1 = new Bicicleta("MiBici");
        Paquete paquete1 = new Paquete(1.0, 2.0, 0.3, 0.12, "Mendoza");
        Boolean confirmacion1 = bici1.agregarPaquete(paquete1);
        bici1.vaciarCarga();

        Assertions.assertEquals(0, bici1.cantPaquetes());
    }


}
