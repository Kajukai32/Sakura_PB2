import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestTransporTP {

    @Test
    public void crearBici() {

        Bicicleta bici1 = new Bicicleta("MiBici");

        Assertions.assertEquals("MiBici", bici1.getNombre());
    }

    @Test
    public void testearBiciDestinos() {

        Bicicleta bici1 = new Bicicleta("MiBici");

        Destino destino1 = new Destino("Buenos Aires", "Bueras 123");
        Destino destino2 = new Destino("Buenos Aires", "Bueras 13");
        Destino destino4 = new Destino("Jujuy", "Ombu 57");

        Paquete paquete1 = new Paquete(2.0, 2.0, 0.3, 0.12, destino1);
        Paquete paquete2 = new Paquete(1.0, 2.0, 0.3, 0.12, destino2);
        Paquete paquete3 = new Paquete(1.0, 2.0, 0.3, 0.12, destino4);


        bici1.agregarPaquete(paquete1);
        bici1.agregarPaquete(paquete2);
        bici1.agregarPaquete(paquete3);


        Assertions.assertEquals(2, bici1.cantPaquetes());
    }

    @Test
    public void testearBiciPaquetes() {

        Bicicleta bici1 = new Bicicleta("MiBici");

        Destino destino1 = new Destino("Buenos Aires", "Bueras 123");
        Destino destino2 = new Destino("Buenos Aires", "Bueras 13");
        Destino destino4 = new Destino("Jujuy", "Ombu 57");

        Paquete paquete1 = new Paquete(2.0, 2.0, 0.3, 0.12, destino1);
        Paquete paquete2 = new Paquete(1.0, 2.0, 0.3, 0.12, destino2);
        Paquete paquete3 = new Paquete(1.0, 2.0, 0.3, 0.12, destino4);


        bici1.agregarPaquete(paquete1);
        bici1.agregarPaquete(paquete2);
        bici1.agregarPaquete(paquete2);
//        bici1.agregarPaquete(paquete3);
//        bici1.agregarPaquete(paquete3);


        Assertions.assertEquals(2, bici1.cantPaquetes());
    }


    @Test
    public void crearAutomovil() {

        Automovil auto1 = new Automovil("MiCoche");

        Assertions.assertEquals("MiCoche", auto1.getNombre());
    }

    @Test
    public void testProblemasConDestinoAutomovil() {

        Transporte auto1 = new Automovil("MiAuto");

        Destino destino1 = new Destino("Buenos Aires", "Bueras 123");
        Destino destino2 = new Destino("Tierra del Fuego", "San Martin 13");
        Destino destino3 = new Destino("Clorinda", "Urundel 587");
        Destino destino4 = new Destino("Clorinda", "Ombu 57");
        Destino destino5 = new Destino("Mendoza", "Triunvirato 57");

        Paquete paquete1 = new Paquete(1.0, 2.0, 0.3, 0.12, destino1);
        Paquete paquete2 = new Paquete(2.0, 13.0, 0.3, 0.12, destino2);
        Paquete paquete3 = new Paquete(3.0, 2.0, 0.3, 0.12, destino3);
        Paquete paquete4 = new Paquete(4.0, 2.0, 0.3, 0.12, destino4);
        Paquete paquete5 = new Paquete(4.0, 2.0, 0.3, 0.12, destino5);

        auto1.agregarPaquete(paquete1);
        auto1.agregarPaquete(paquete2);
        auto1.agregarPaquete(paquete3);
        auto1.agregarPaquete(paquete4);
        auto1.agregarPaquete(paquete5);


        Assertions.assertEquals(4, auto1.cantPaquetes());
    }

    @Test
    public void testProblemasConPaquetesAutomovil() {

        Transporte auto1 = new Automovil("MiAuto");

        Destino destino1 = new Destino("Buenos Aires", "Bueras 123");
        Destino destino2 = new Destino("Tierra del Fuego", "San Martin 13");
        Destino destino3 = new Destino("Clorinda", "Urundel 587");
        Destino destino4 = new Destino("Clorinda", "Ombu 57");
        Destino destino5 = new Destino("Mendoza", "Triunvirato 57");

        Paquete paquete1 = new Paquete(1.0, 2.0, 0.3, 0.12, destino1);
        Paquete paquete2 = new Paquete(2.0, 13.0, 0.3, 0.12, destino2);
        Paquete paquete3 = new Paquete(3.0, 2.0, 0.3, 0.12, destino3);
        Paquete paquete4 = new Paquete(4.0, 2.0, 0.3, 0.12, destino4);
        Paquete paquete5 = new Paquete(4.0, 2.0, 0.3, 0.12, destino5);

        auto1.agregarPaquete(paquete1);
        auto1.agregarPaquete(paquete2);
        auto1.agregarPaquete(paquete3);
        auto1.agregarPaquete(paquete4);
        auto1.agregarPaquete(paquete4);


        Assertions.assertEquals(4, auto1.cantPaquetes());
    }

    @Test
    public void crearCamion() {

        Automovil camion1 = new Automovil("MiCamion");

        Assertions.assertEquals("MiCamion", camion1.getNombre());
    }


    @Test
    public void testCamion() {

        Camion camion1 = new Camion("MiAuto");



        Destino destino1 = new Destino("Buenos Aires", "Bueras 123");
        Destino destino2 = new Destino("Tierra del Fuego", "San Martin 13");
        Destino destino3 = new Destino("Clorinda", "Urundel 587");
        Destino destino4 = new Destino("Clorinda", "Ombu 57");

        Paquete paquete1 = new Paquete(1.0, 2.0, 0.3, 0.12,destino1);
        Paquete paquete2 = new Paquete(1.0, 10.0, 0.3, 0.12, destino2);
        Paquete paquete3 = new Paquete(12.0, 2.0, 0.3, 0.12, destino3);
        Paquete paquete4 = new Paquete(12.0, 2.0, 0.3, 0.12, destino3);

        camion1.agregarPaquete(paquete1);
        camion1.agregarPaquete(paquete2);
        camion1.agregarPaquete(paquete3);
        camion1.agregarPaquete(paquete4);
        camion1.agregarPaquete(paquete4);


        Assertions.assertEquals(4, camion1.cantPaquetes());
    }




    @Test
    public void TestAdhesionDeFlota() {

        Empresa empresa1SA = new Empresa();
        Automovil auto1 = new Automovil("MiCoche");
        Transporte camion1 = new Automovil("MiCamion");

        empresa1SA.agregarTransporte(camion1);
        empresa1SA.agregarTransporte(auto1);
        empresa1SA.agregarTransporte(auto1);

        Assertions.assertEquals(2, empresa1SA.getNumeroDeTransportes());
    }

    @Test
    public void testAsignarpaqueteEmpresa() {

        Empresa empresa1SA = new Empresa();
        Automovil auto1 = new Automovil("MiCoche");
        Camion camion1 = new Camion("MiCamion");
        Bicicleta bici1 = new Bicicleta("MiBici");

        Destino destino1 = new Destino("Buenos Aires", "Bueras 123");
        Destino destino2 = new Destino("Tierra del Fuego", "San Martin 13");
        Destino destino3 = new Destino("Clorinda", "Urundel 587");
        Destino destino4 = new Destino("Clorinda", "Ombu 57");
        Destino destino5 = new Destino("Mendoza", "Triunvirato 57");

        Paquete paquete1 = new Paquete(1.0, 2.0, 0.3, 0.12, destino1);
        Paquete paquete2 = new Paquete(1.0, 18.0, 0.3, 0.12, destino2);
        Paquete paquete3 = new Paquete(0.7, 2.0, 0.3, 0.12, destino3);

        empresa1SA.agregarTransporte(bici1);
        empresa1SA.agregarTransporte(camion1);
        empresa1SA.agregarTransporte(auto1);

        empresa1SA.asignarPaquete(paquete1);


        Assertions.assertEquals(1, empresa1SA.getCantPaquetes());
    }

}
