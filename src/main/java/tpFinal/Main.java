package tpFinal;
import tpFinal.Models.Directivo;
import tpFinal.Models.Empleado.*;
import tpFinal.Models.Producto;
import tpFinal.Repositorios.EmpleadosRepository.UtileroRepository;
import tpFinal.Repositorios.ProductoRepository;
import tpFinal.Services.*;
import tpFinal.Services.DirectivoService;
import tpFinal.Utilities.CategoriaProducto;
import tpFinal.Utilities.Deporte;



import tpFinal.Models.Partido;
import tpFinal.Services.PartidoService;


public class Main {
    public static void main(String[] args) {


       /* TestRepository test = new TestRepository();

        //System.out.println("TEST AYUDANTE DE CAMPO");
        //test.testAyudanteDeCampo();
        //System.out.println("TEST DIRECTOR TECNICO");
        //test.testDirectorTecnico();
        //System.out.println("TEST JUGADOR");
        //test.testJugador();
        //System.out.println("TEST MEDICO");
        //test.testMedico();
        //System.out.println("TEST PERSONAL LIMPIEZA");
        //test.testPErsonalLimpieza();
       // System.out.println("TEST UTILERO");
        //test.testUtilero();
       // System.out.println("TEST DIRECTIVO");
        //test.testDirectivo();
        //System.out.println("TEST SOCIO");
        //test.testSocio();
    }*/

        ProductoService productoService = new ProductoService();

        Producto prod = new Producto("1", "REMERA", "REMERA", 6000f, CategoriaProducto.INDUMENTARIA);
        Producto prod2 = new Producto("2", "MEDIA", "MEDIA", 1600f, CategoriaProducto.INDUMENTARIA);

        productoService.agregar(prod);
        productoService.agregar(prod2);
        System.out.println(productoService.listar());


        PartidoService partidoService = new PartidoService();
        Partido nuevoPartido = new Partido("1234", "6/11/2023", "Basquet", "Lakers", "5");
        //partidoService.agregar(nuevoPartido);
        //partidoService.eliminar("1");
        partidoService.modificar(nuevoPartido);
        System.out.println(partidoService.listar());


    }
}