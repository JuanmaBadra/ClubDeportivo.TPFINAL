package tpFinal;

import tpFinal.Models.Empleado.PersonalLimpieza;
import tpFinal.Models.Socio;
import tpFinal.Repositorios.EmpleadosRepository.PersonalLimpiezaRepository;
import tpFinal.Repositorios.SociosRepository;
import tpFinal.Services.SocioService;
import tpFinal.Utilities.TestRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Socio nuevo = new Socio("Maximo", "Dotti", "38210372", "Modi", "Modi", "Modi", true);
        socioService.modificar(nuevo);
        System.out.println(socioService.listar());


    }
}