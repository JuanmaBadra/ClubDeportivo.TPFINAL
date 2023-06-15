package tpFinal;

import tpFinal.Models.Empleado.PersonalLimpieza;
import tpFinal.Models.Socio;
import tpFinal.Repositorios.EmpleadosRepository.PersonalLimpiezaRepository;
import tpFinal.Services.SocioService;
import tpFinal.Utilities.TestRepository;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        TestRepository test = new TestRepository();

        //System.out.println("TEST AYUDANTE DE CAMPO");
        //test.testAyudanteDeCampo();
        //System.out.println("TEST DIRECTOR TECNICO");
        //test.testDirectorTecnico();
        //System.out.println("TEST JUGADOR");
        //test.testJugador();
        System.out.println("TEST MEDICO");
        test.testMedico();
        //System.out.println("TEST PERSONAL LIMPIEZA");
        //test.testPErsonalLimpieza();
        //System.out.println("TEST UTILERO");
        //test.testUtilero();
        System.out.println("TEST DIRECTIVO");
        test.testDirectivo();
        //System.out.println("TEST SOCIO");
        //test.testSocio();
    }*/
        SocioService socioService = new SocioService();
        System.out.println("******************************** Listando socios ********************************\n");
        System.out.println(socioService.listar());

    }
}